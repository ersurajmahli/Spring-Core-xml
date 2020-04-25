package com.forgyan.teacher;

import com.forgyan.coach.Coach;

public class ScienceTeacher implements Teacher {
	
	private Coach coach;
	
	 public ScienceTeacher(Coach coach) {
		this.coach = coach;
	}

	@Override
	public String teach() {
		return "Chemistry, Biology & Physics is part of Science";
	}

	@Override
	public String train() {
		return coach.train();
	}

}
