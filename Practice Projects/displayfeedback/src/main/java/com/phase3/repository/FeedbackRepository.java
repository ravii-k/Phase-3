package com.phase3.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.phase3.entity.Feedback;

@Repository
public interface FeedbackRepository extends CrudRepository<Feedback, Long>{

}
