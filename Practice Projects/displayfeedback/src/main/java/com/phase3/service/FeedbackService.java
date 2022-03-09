package com.phase3.service;

import java.util.List;

import com.phase3.entity.Feedback;

public interface FeedbackService {
	
	public boolean addFeedback(Feedback fb);
	public boolean getFeedback(long fId);
	public List<Feedback> getAllFeedback();
}
