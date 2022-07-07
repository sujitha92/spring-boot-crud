package com.student.SpringDemo;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}
	
	//this data will be persisted when application will be up
	@PostConstruct
	public void saveStudents() {
		studentRepository.saveAll(List.of(new Student("Sujitha", "Sujitha@gmail.com", LocalDate.of(1992, 5, 27)),
				new Student("Pradeep", "pradeep@gmail.com", LocalDate.of(1992, 8, 3))));
	}



	public void addNewStudent(Student student) {
		
		Optional<Student> studentOptional=studentRepository.findStudentByEmail(student.getEmail());
		if(studentOptional.isPresent()) {
			System.out.println("Email Taken!!");
		}else {
			studentRepository.save(student);
		}
		
		
	}

	public void deleteStudent(Long id) {
		if(studentRepository.existsById(id)) {
			studentRepository.deleteById(id);
		}else
			System.out.println("Student does not exist!!");
		
	}


	@Transactional
	public void updateStudent(Long id, String name) {
		if(studentRepository.existsById(id)) {
			Optional<Student> s=studentRepository.findById(id);
			s.get().setName(name);
		}else
			System.out.println("Student does not exist!!");	
	}
}
