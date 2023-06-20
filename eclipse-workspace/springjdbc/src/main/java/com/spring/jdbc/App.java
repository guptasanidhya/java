package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
        System.out.println( "Hello World!" );
//    	ApplicationContext context = new ClassPathXmlApplicationContext("/com/spring/jdbc/config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
//    	JdbcTemplate template =context.getBean("jdbcTemplate",JdbcTemplate.class);
//   
//    	String query = "insert into student(id,name,city) values(?,?,?)";
//    	int result=template.update(query,457,"sandy","sitm");
//    	System.out.println("number of records inserted  "+result);
//   
    	
    	StudentDao studentDao=context.getBean("studentDao",StudentDao.class);
//    	Student student = new Student();
//    	student.setId(666);
//    	student.setName("shanu");
//    	student.setCity("Lucknow");
//    	
//    	int result=studentDao.insert(student);
//    	System.out.println("number of records inserted  "+result);
//    	
    	
//    	Student student = new Student();
//    	student.setId(666);
//    	student.setName("sandy");
//    	student.setCity("Delhi");
//    	
//    	int result=studentDao.change(student);
//    	System.out.println("data changed"+result); 
    	
		
//		  int result = studentDao.delete(666);
//		  System.out.println("Row deleted "+result);
//		 
		/*
		 * Student student = studentDao.getStudent(456); System.out.println(student);
		 */
    	List<Student> students=studentDao.getAllStudents();
    	for(Student s : students) {
    		System.out.println(s);
    	}
    	
    }
}
