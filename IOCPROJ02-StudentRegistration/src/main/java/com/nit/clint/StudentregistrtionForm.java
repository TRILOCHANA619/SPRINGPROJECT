package com.nit.clint;

import java.util.Scanner;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nit.controller.StudentController;
import com.nit.vo.StudentVO;

public class StudentregistrtionForm {

	public static void main(String[] args) {
		//create IOC cointainer
		DefaultListableBeanFactory factory=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nit/cfgs/applicationContext.xml");
		
		//geet controller object
		
		StudentController scontroller=factory.getBean("controller", StudentController.class);
		//read the data from end user
		Scanner scn=new Scanner(System.in);
		StudentVO vo=new StudentVO();
		System.out.println("Enter the Student Name :: ");
		vo.setSname(scn.nextLine());
		System.out.println("Enter the Student Department Name :: ");
		vo.setSdept(scn.nextLine());
		System.out.println("Enter the Mathmatic mark :: ");
		vo.setMathMark(scn.nextLine());
		System.out.println("Enter the Science mark :: ");
		vo.setScienceMark(scn.nextLine());
		System.out.println("Enter the Computer Science mark :: ");
		vo.setCsMark(scn.nextLine());
		
		//send the  object to controller
		try {
			String result=scontroller.processStudentDetails(vo);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("Internal Problem :: "+e.getMessage());
			e.printStackTrace();
			
		}
	}

}
