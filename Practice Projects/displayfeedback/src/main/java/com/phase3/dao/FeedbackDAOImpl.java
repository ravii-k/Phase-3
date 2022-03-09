package com.phase3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phase3.entity.Feedback;
import com.phase3.repository.FeedbackRepository;

@Service
public class FeedbackDAOImpl implements FeedbackDAO{
	@Autowired
	FeedbackRepository repo;

	@Override
	public boolean addFeedback(Feedback fb) {
		try {
			repo.save(fb);
			return true;
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean getFeedback(long fId) {
		try {
			repo.findById(fId);
			return true;
		}
		catch(Exception e) {
		return false;
		}
	}

	@Override
	public List<Feedback> getAllFeedback() {
		try {
			List<Feedback> allFeedback = (List<Feedback>)repo.findAll();
			return allFeedback;
		}catch(Exception e) {
			return null;
		}
	}

	
	
	

}
