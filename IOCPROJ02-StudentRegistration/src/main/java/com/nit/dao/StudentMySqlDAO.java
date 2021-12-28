package com.nit.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import com.nit.bo.StudentBo;

public class StudentMySqlDAO implements IStudentRedg {

	//DECLARE CLASS ELEMENT TO PRIVATE FOR ENCAPSULATION
	private DataSource ds;
	private static final String STUDENT_INSERT_QUERY="INSERT INTO STUDENT_TABLE(SNAME,SDEPT,MATH_MARK,SCIENCE_MARK,CS_MARK,TOTAL_MARK,AVG_MARK) VALUES(?,?,?,?,?,?,?)";

	//FOR THE INJECTING THE DATAsOURCE BY CONSTRUCTOR INJECTION
	public StudentMySqlDAO(DataSource ds) {
		System.out.println("Data source injected");
		this.ds = ds;
	}

	@Override
	public int insertStudent(StudentBo bo) throws Exception {
		int count=0;
		
		//create the connecion object from connection pooling
		try (Connection  con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(STUDENT_INSERT_QUERY)){
			
			//set the value  to the query
			if(ps!=null && con!=null) {
			ps.setString(1,bo.getSname());
			ps.setString(2,bo.getSdept());
			ps.setFloat(3,bo.getMathMark());
			ps.setFloat(4,bo.getScienceMark());
			ps.setFloat(5,bo.getCsMark());
			ps.setFloat(6,bo.getTotalMark());
			ps.setFloat(7,bo.getAvgMark());
			
			//execute teh query
			count=ps.executeUpdate();
			}
		} catch (Exception e) {
			throw e;
		}
		return count;
	}//insertStudent
}//class
