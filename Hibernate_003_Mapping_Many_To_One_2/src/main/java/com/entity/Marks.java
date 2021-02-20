package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "MARKS")
public class Marks {

	@Id
    @Column(name = "marks_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int marks_id;
	
	@Column(name = "sub_name")
	private String sub_name;
	
	@Column(name = "mark")
	private int mark;
	
	@ManyToOne(fetch = FetchType.LAZY)
    private Student student;

	public int getMarks_id() {
		return marks_id;
	}

	public void setMarks_id(int marks_id) {
		this.marks_id = marks_id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
