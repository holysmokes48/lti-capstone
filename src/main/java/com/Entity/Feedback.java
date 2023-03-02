package com.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "food_feedback")
@Data
public class Feedback {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedbackId;
	private String description;
	private String type; 		//food rating or vendor rating
	private int rating;
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Feedback(int feedbackId, String description, String type, int rating) {
		super();
		this.feedbackId = feedbackId;
		this.description = description;
		this.type = type;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", description=" + description + ", type=" + type + ", rating="
				+ rating + "]";
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
	
}
