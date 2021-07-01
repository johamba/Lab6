package edu.mum.cs.cs425.demos.studentrecordsmgmtapp;

import edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model.Student;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;


public class MyStudentRecordsMgmtApp
{

//    s1: studentId:110001, name:Dave, dateOfAdmission:11/18/1951
//    s2: studentId:110002, name:Anna, dateOfAdmission:12/07/1990
//    s3: studentId:110003, name:Erica, dateOfAdmission:01/31/1974
//    s4: studentId:110004, name:Carlos, dateOfAdmission:08/22/2009
//    s5: studentId:110005, name:Bob, dateOfAdmission:03/05/1990

    static void printListOfStudents(Student[] students){
        Arrays.stream(students)
                .sorted(Comparator.comparing(Student::getName)).forEach(System.out::println);

    }

    static void getListOfPlatinumAlumniStudents(Student[] students){
        Arrays.stream(students)
                .filter(x -> (LocalDate.now().getYear() - x.getDateOfAdmission().getYear()) >= 30)
                .sorted(Comparator.comparing(Student::getDateOfAdmission).reversed()).forEach(System.out::println);

    }

    public static void main( String[] args )
    {
        Student s1 = new Student(110001,"Dave", LocalDate.of(1951,11,18));
        Student s2 = new Student(110002,"Anna", LocalDate.of(1990,07,12));
        Student s3 = new Student(110003,"Erica", LocalDate.of(1974,01,31));
        Student s4 = new Student(110004,"Carlos", LocalDate.of(2009,8,22));
        Student s5 = new Student(110005,"Bob", LocalDate.of(1990,03,05));

        Student[] students = new Student[]{s1,s2,s3,s4,s5};

        printListOfStudents(students);
        System.out.println("Aluminai Only");
        getListOfPlatinumAlumniStudents(students);

    }
}
