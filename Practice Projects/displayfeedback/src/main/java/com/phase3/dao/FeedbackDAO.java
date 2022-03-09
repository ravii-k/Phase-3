package com.phase3.dao;

import java.util.List;

import com.phase3.entity.Feedback;

public interface FeedbackDAO {
	
	public boolean addFeedback(Feedback fb);
	public boolean getFeedback(long fId);
	public List<Feedback> getAllFeedback();
}
