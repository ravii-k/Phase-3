package com.phase3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.phase3.entity.Feedback;

@Controller
public class FeedbackController {
	
	@GetMapping("/feedback")
	public ModelAndView addNewFeedback() {
		Feedback fb = new Feedback();
		return new ModelAndView("enterfeedback", "form", fb);
	}
}
