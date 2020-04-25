package com.forgyan.teacher;

import com.forgyan.coach.Coach;

public class EnglishTeacher implements Teacher {
	
	private Coach coach;
	
	public EnglishTeacher() {
		System.out.println("EnglishTeacher : inside no-args constructor");
	}
	
	public void setCoach(Coach coach) {
		System.out.println("EnglishTeacher : inside setter method");
		this.coach=coach;
	}

	@Override
	public String teach() {
		return "Knowlede ofTense is Very important, for speaking english";
	}

	@Override
	public String train() {
		return coach.train();
	}

}
