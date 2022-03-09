package com.phase3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.dao.FeedbackDAO;
import com.phase3.entity.Feedback;

@Service
public class FeedbackServiceImpl implements FeedbackService{
	
	@Autowired
	FeedbackDAO dao;

	@Override
	public boolean addFeedback(Feedback fb) {
		if(dao.addFeedback(fb)) {
			return true;
		}
		return false;
	}

	@Override
	public boolean getFeedback(long fId) {
		if(dao.getFeedback(fId)) {
			return true;
		}
		return false;
	}

	@Override
	public List<Feedback> getAllFeedback() {
		if(dao.getAllFeedback() != null) {
			return dao.getAllFeedback();
		}
		return null;
	}

	

}
