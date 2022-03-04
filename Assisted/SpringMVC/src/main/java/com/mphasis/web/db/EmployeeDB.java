package com.mphasis.web.db;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mphasis.web.model.Employee;



@Repository
public class EmployeeDB {

	@Autowired
	private JdbcTemplate template;
	public long count()
	{

		String sql = "select count(*) from employee";
		return this.template.queryForObject(sql,Long.class);
	}	
// inserting the data 
public boolean insertEmployee(Employee emp)
{
	String sql = "insert into employee values(?,?,?,?)";
	try {
		this.template.update(sql, emp.getEmpid(),
		emp.getName(),emp.getSalary(),emp.getDept());
	}
	catch(DataAccessException e)
	{
		System.out.println("error");
		e.printStackTrace();
		return false;
	}
	return true;
	}
public Employee getEmployeeById(int id) {
	String sql = "select * from employee where empid = ?";
	//mapping the employee yable colum with employee class
	return this.template.queryForObject(sql, new EmpRowMapper(),id);
}
class EmpRowMapper implements RowMapper<Employee>
{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmpid(rs.getInt(1));
		e1.setName(rs.getString(2));
		e1.setSalary(rs.getDouble(3));
		e1.setDept(rs.getString(4));
		return e1;
	}
	
}


}