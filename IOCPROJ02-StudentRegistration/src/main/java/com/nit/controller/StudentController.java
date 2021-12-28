package com.nit.controller;

import com.nit.dto.StudentDTO;
import com.nit.service.IStudentService;
import com.nit.service.StudentServiceImpl;
import com.nit.vo.StudentVO;

public class StudentController {
	private IStudentService service;

	public StudentController(IStudentService service) {
		this.service = service;
	}

	public String processStudentDetails(StudentVO vo) throws Exception {

		//Convetrt the vo to dao
		StudentDTO dto=new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setSdept(vo.getSdept());
		dto.setMathMark(Float.parseFloat(vo.getMathMark()));
		dto.setScienceMark(Float.parseFloat(vo.getScienceMark()));
		dto.setCsMark(Float.parseFloat(vo.getCsMark()));

		String display=service.registerStudentDetails(dto);
		return display;
	}

}
