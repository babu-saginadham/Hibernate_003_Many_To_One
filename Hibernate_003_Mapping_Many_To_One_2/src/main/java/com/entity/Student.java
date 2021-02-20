package com.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT")
public class Student {

	@Id
    @Column(name = "std_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int std_id;
 
    @Column(name = "name")
    private String name;
    
    @Column(name = "user_email")
    private String user_email;
 
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="std_add_id")
    private Address address;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "std_marks_id")
    private List<Marks> marks;
    
    /**
     * +----------+------+----------+----------------+--------------+
| marks_id | mark | sub_name | student_std_id | 
+----------+------+----------+----------------+--------------+
|        1 |   45 | Math     |              1 |  
|        2 |   78 | Physics  |              1 | 
+----------+------+----------+----------------+-


     * @return
     */

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Marks> getMarks() {
		return marks;
	}

	public void setMarks(List<Marks> marks) {
		this.marks = marks;
	}
    
    
}
