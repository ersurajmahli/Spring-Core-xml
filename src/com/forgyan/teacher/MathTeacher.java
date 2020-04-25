package com.forgyan.teacher;

import com.forgyan.coach.Coach;

public class MathTeacher implements Teacher{
	
	private Coach coach;
	
	public MathTeacher(Coach coach) {
		this.coach=coach;
	}
	
	@Override
	public String teach() {
		return "Spend 1 hrs in solving questions";
	}

	@Override
	public String train() {
		return coach.train();
	}
}
