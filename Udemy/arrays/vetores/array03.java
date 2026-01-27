package arrays.vetores;
import arrays.entities.Student;

import java.util.Arrays;

public class array03 {
    public static void main(String[] args) {

        Student students[] = new Student[3];
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;


        s1.rollno = 1;
        s1.name = "Navin";
        s1.marks = 88;

        s2.rollno = 2;
        s2.name = "Harsh";
        s2.marks = 67;

        s3.rollno = 3;
        s3.name = "Kiran";
        s3.marks = 97;

        // ForEach
        for(Student ArrayStdent : students){
            System.out.println(ArrayStdent.toString());
        }
    }
}
