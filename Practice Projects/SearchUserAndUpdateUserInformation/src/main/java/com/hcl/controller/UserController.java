package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.entity.User;
import com.hcl.service.ServiceInterface;

@Controller
@RequestMapping

public class UserController {
	
	@Autowired
	private ServiceInterface service;
	
	@GetMapping("/search")
	public String searchPage(ModelMap model) {
		return "search";	
	}
	
	@PostMapping("/search")
	public String showUser(ModelMap model, @RequestParam int id) {
		if(id<8 || id > 10) {
			model.put("errorMessage", "Invalid id");
			return "search";
		}
		User user = service.getUser(id);
		model.put("user", user);
		return "redirect:/user-detail/" + id;
	}
	
	
	@GetMapping("/user-detail/{id}")
	public String userDetail(@PathVariable("id") int id, ModelMap model) {
		User user = service.getUser(id);
		model.put("user", user);
		return "userinfo";
	}

	@GetMapping("/update-user")
	public String updateUserShow(ModelMap model, @RequestParam int id) {
		User user = service.getUser(id);
		model.put("user", user);
		return "edit";
	}
	
	
	@PostMapping("/update-user")
	public String updateUser(ModelMap model, User user) {	
		user= service.updateUser(user);
		return "redirect:/user-detail/"+user.getId();
	}
	
	
	
}
