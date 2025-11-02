package School_mgt_System;

import java.util.List;

public class School {

    private List<Teacher> teacher;
    private List<Student> student;

    private static   int totalMoneyEarned;
    private  static int  totalMoneySpent;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teacher = teacher;
        this.student = student;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }
//return the list of teacher
        public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }
    public void addTeacher(Teacher teacher){
        teacher.add(teacher);
    }
// the list of students in school
    public List<Student> getStudent() {
        return student;
    }
    public void addStudent(Student student){
        student.add(student);
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    /*
    update the money that is spent by the school which
    is the salary to its teacher only .
    no other purpose than that.
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
