package com.nit.service;

import com.nit.bo.StudentBo;
import com.nit.dao.IStudentRedg;
import com.nit.dto.StudentDTO;

public class StudentServiceImpl implements IStudentService {

	private IStudentRedg dao;
	
	//constructor injection for injectiong the dao classes
	public StudentServiceImpl(IStudentRedg dao) {
		this.dao = dao;
	}
	
	@Override
	public String registerStudentDetails(StudentDTO dto) throws Exception {
		
		float totalMark=dto.getMathMark()+dto.getScienceMark()+dto.getCsMark();
		float avgMark=totalMark/3;
		
		//transfer th data from dto to bo
		StudentBo bo=new StudentBo();
		bo.setSname(dto.getSname());
		bo.setSdept(dto.getSdept());
		bo.setMathMark(dto.getMathMark());
		bo.setScienceMark(dto.getScienceMark());
		bo.setCsMark(dto.getCsMark());
		bo.setTotalMark(totalMark);
		bo.setAvgMark(avgMark);
		
		//sending  the bo object to dao for execution
		int result=dao.insertStudent(bo);
		return result==1? "Student registered successifully":"student registration filed";
	}//register details

	

}
