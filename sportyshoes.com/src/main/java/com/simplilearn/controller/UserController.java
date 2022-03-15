
package com.simplilearn.controller;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.simplilearn.dao.ProductDAO;
import com.simplilearn.dao.UserDAO;
import com.simplilearn.entity.Product;
import com.simplilearn.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {


	@Autowired
	private ProductDAO productDAO;
	
	// inject  
	@Autowired
	private UserDAO userDAO;

	@GetMapping("/myaccount")
	public String myaccount(Model theModel, HttpServletRequest request) {
		
		HttpSession session = request.getSession(true);
		User currentUser = (User) session.getAttribute("currentUser");

 

		// add the products to the model
		theModel.addAttribute("currentUser", currentUser);

		return "myaccount";
	}
	
	
	@PostMapping("/updateAcount")
	public String updateAcount(HttpServletRequest request, 
			@RequestParam("username") String username,
			@RequestParam("age") String age,
			@RequestParam("password") String password , Model theModel
			) {
		
		HttpSession session = request.getSession(true);
		User currentUser = (User) session.getAttribute("currentUser");
		System.out.println(currentUser.toString());
		
		currentUser.setUsername(username);
		currentUser.setAge(Integer.parseInt(age));
		currentUser.setPassword(password);
		
		theModel.addAttribute("currentUser", currentUser); 
		userDAO.saveUser(currentUser);

		return "myaccount";
	}

}
