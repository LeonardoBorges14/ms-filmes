package com.iftm.ratingsdataservice.models;

import java.util.List;

public class UserRating {

	private List<Rating> useRating;
	
	public UserRating() {

	}

	public UserRating(List<Rating> useRating) {
		super();
		this.useRating = useRating;
	}

	public List<Rating> getUseRating() {
		return useRating;
	}

	public void setUseRating(List<Rating> useRating) {
		this.useRating = useRating;
	}
	

}
