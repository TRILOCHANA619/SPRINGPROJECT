package com.nit.dto;

public class StudentDTO {	
		private String sno; 
		private String sname;
		private String sdept;
		private Float mathMark;
		private Float scienceMark;
		private Float csMark;

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
		public Float getMathMark() {
			return mathMark;
		}
		public void setMathMark(Float mathMark) {
			this.mathMark = mathMark;
		}
		public Float getScienceMark() {
			return scienceMark;
		}
		public void setScienceMark(Float scienceMark) {
			this.scienceMark = scienceMark;
		}
		public Float getCsMark() {
			return csMark;
		}
		public void setCsMark(Float csMark) {
			this.csMark = csMark;
		}
	}
