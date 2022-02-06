package week3.day1.assignment2;
public class Student {
public void studentName() {
System.out.println("My Name is Supriya");
}

public void studentID() {
	System.out.println("The student ID is 14");
}
public void studentDepartment() {
	System.out.println("The student Department is BSC");
}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
 College colg = new College();
	 Department dept = new Department();
 Student Stud = new Student();
 colg.collegeCode();
 colg.collegeName();
 colg.collegeRank();
 dept.deptName();
 Stud.studentDepartment();
 Stud.studentID();
 Stud.studentName();
 
 
	}

}
