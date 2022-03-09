package com.phase3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.phase3.entity.Feedback;
import com.phase3.service.FeedbackService;

@Controller
public class FeedbackRESTController {
	
	@Autowired
	FeedbackService fService;
	
	
	@PostMapping("/feedback")
	public String newFeedback(Feedback fb) {
		if(fService.addFeedback(fb)) {
			return "redirect:/listfeedback";
		}
		return "/errors";
	}
	
	@GetMapping("/listfeedback")
	public ModelAndView listFeedback() {
		List<Feedback> allFeedback = fService.getAllFeedback();
		return new ModelAndView("feedback", "feedbacklist", allFeedback);
	}

}
