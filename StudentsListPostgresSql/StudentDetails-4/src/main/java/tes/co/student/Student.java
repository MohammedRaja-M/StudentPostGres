package tes.co.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Student {
	@Id
	@Column(name="id")
	private int id;

	    @Column(name="name")
	    private String name;

	    @Column(name="age")
	    private int age;

	    @Column(name="email")
	    private String email;
	    
	    public int getId() { 
	    	return id; 
	    }
				
			

}
