package Viikko2.StudentList.web;



import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import Viikko2.StudentList.domain.Student;

@Controller
public class StudentController {
	
	ArrayList<Student> students = new ArrayList<>();
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String lisStudents(Model model) {
		
		
		Student student1 = new Student("Kate", "Cole");
		Student student2 = new Student("Dan", "Brown");
		Student student3 = new Student("Mike", "Mars");
		
		students.add(student1);
		students.add(student2);
		students.add(student3);
		
		model.addAttribute("students", students);
		return "hello";
	}

}