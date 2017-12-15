package com.primary.beans;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	@NotNull(message="姓名不能为空")
	@Size(min=3,max=6,message="姓名长度应在{min}-{max}个字符")
	private String name;
	
	@NotNull(message="成绩不能为空")
	@Min(value=0,message="成绩不能小于{value}")
	@Max(value=100,message="成绩不能大于{value}")
	private double score;
	
	@Pattern(regexp="^1[34578]\\d{9}$",message="手机号格式错误")
	private String phonenumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + ", phonenumber=" + phonenumber + "]";
	}
}