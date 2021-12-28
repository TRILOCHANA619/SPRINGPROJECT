package com.nit.bo;

public class StudentBo {
	private String sno; 
	private String sname;
	private String sdept;
	private Float mathMark;
	private Float scienceMark;
	private Float csMark;
	private Float totalMark;
	private  Float avgMark;

	public float getTotalMark() {
		return totalMark;
	}
	public void setTotalMark(Float totalMark) {
		this.totalMark = totalMark;
	}
	public float getAvgMark() {
		return avgMark;
	}
	public void setAvgMark(Float avgMark) {
		this.avgMark = avgMark;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSdept() {
		return sdept;
	}
	public void setSdept(String sdept) {
		this.sdept = sdept;
	}
	public float getMathMark() {
		return mathMark;
	}
	public void setMathMark(Float mathMark) {
		this.mathMark = mathMark;
	}
	public float getScienceMark() {
		return scienceMark;
	}
	public void setScienceMark(Float scienceMark) {
		this.scienceMark = scienceMark;
	}
	public float getCsMark() {
		return csMark;
	}
	public void setCsMark(Float csMark) {
		this.csMark = csMark;
	}

}
