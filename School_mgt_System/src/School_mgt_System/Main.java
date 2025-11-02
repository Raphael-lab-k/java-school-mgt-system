package School_mgt_System;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Teacher Lizzy = new Teacher(1,"Lizzy",500000);
        Teacher Raphael = new Teacher(2,"Raphael",800000);
        Teacher Mark = new Teacher(3,"Mark",700000);
        Teacher Jackson = new Teacher(4,"Jackson",600000);
        Teacher James = new Teacher(1,"James",580000);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Lizzy);
        teacherList.add(Raphael);
        teacherList.add(Mark);
        teacherList.add(Jackson);
        teacherList.add(James);

        Student Gift = new Student(1,"Gift",7,100000,500000);
        Student Junior = new Student(1,"Junior",7,100000,500000);
        Student Brown = new Student(1,"Brown",7,10,500000);
        Student Benedict = new Student(1,"Benedict",7,100000,500000);
        Student Julius = new Student(1,"Julius",7,100000,500000);
        Student Linus = new Student(1,"Linus",7,100000,500000);

        List<Student> studentList = new ArrayList<>();

        studentList.add(Gift);
        studentList.add(Julius);
        studentList.add(Junior);
        studentList.add(Benedict);
        studentList.add(Brown);
        studentList.add(Linus);

        School Bsu = new School(teacherList,studentList);


        Jackson.receiveSalary(Jackson.getSalary());
        Raphael.receiveSalary(Raphael.getSalary());
        Jackson.receiveSalary(Jackson.getSalary());
        Brown.payFee(10000);
        Julius.payFee(200000);
        Linus.payFee(500000);
        Benedict.payFee(10000000);


        System.out.println("BSU has earned Ush. "+ Bsu.getTotalMoneyEarned());

        System.out.println(Jackson);
        System.out.println(Linus);
    }
}














