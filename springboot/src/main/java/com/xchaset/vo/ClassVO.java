package com.xchaset.vo;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
/**
 * 
 * @author xiaozhaoming
 *
 */
public class ClassVO {

	
	@NotNull(message="用户名不能为空")
	private String classId;
	
	private String className;
	
	@NotNull
	private Integer studentCount;
	
	private String classRoom;
	
	private List<StudentVO> studentList;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public Integer getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(Integer studentCount) {
		this.studentCount = studentCount;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public List<StudentVO> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<StudentVO> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "ClassVO [classId=" + classId + ", className=" + className + ", studentCount=" + studentCount
				+ ", classRoom=" + classRoom + ", studentList=" + studentList + "]";
	}


	
}
