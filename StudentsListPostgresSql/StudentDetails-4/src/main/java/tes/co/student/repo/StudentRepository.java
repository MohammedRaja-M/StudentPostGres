package tes.co.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tes.co.student.Student;

	@Repository
	public interface StudentRepository extends JpaRepository<Student , Integer>{
		
}
