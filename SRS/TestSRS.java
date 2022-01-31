package SRS;

import org.w3c.dom.ls.LSOutput;

import java.awt.geom.FlatteningPathIterator;
import java.util.*;

public class TestSRS {
    public static <course1, course2> void main(String[] args) {
        //Create University
        University university = University.getInstance();
        //Creating schools and programs
        //IT school
        School IT = new School("School Of Computing & Informatics", "IT");

        Program CS = new Program("Computer Science", "CS");
        Program CYS = new Program("Cybersecurity", "CYS");
        Program DS = new Program("Data Science", "DS");
        IT.AddProgram(CS);
        IT.AddProgram(DS);
        IT.AddProgram(CYS);
        //ENG school
        School ENG = new School("School Of Engineering Technology", "ENG");
        Program ELENG = new Program("Electrical Engineering", "ELENG");
        Program ENENG = new Program("Energy Engineering", "ENENG");
        ENG.AddProgram(ELENG);
        ENG.AddProgram(ENENG);

        //Testing schools and programs
//        System.out.println(IT);
//        System.out.println(ENG);
        //add schools to university
        university.addSchool(IT);
        university.addSchool(ENG);
        //Degrees Bachelor and Master and studying types
        Degree bachelor = new Degree("Bachelor");
        Degree Master = new Degree("Master");
        StudyingType regular = new StudyingType("Regular");
        StudyingType graduated = new StudyingType("Graduated");

        //Creating instructors, students, and courses
        Instructor instructor1 = new Instructor("Hamza", IT, 2000);
        Instructor instructor2 = new Instructor("Omar", IT, 2000);

        Course course1 = new Course("Advanced Programming", 3,CS);
        Course course2 = new Course("Prototyping", 3,CS);
        Course course5 = new Course("Programming", 3,CS);
        Course course6 = new Course("Data Structures & Algorithm", 3,CS);
        Course course3 = new Course("Math for Computing", 3, CS);
        Course course4 = new Course("Application Development", 3,CS);
        Course course7 = new Course("Database Design & Development", 3,CS);

        Student student1 = new Student("Hashem Altabbaa",IT,bachelor, CS,regular);
        Student student2 = new Student("Omar Hasan", IT, bachelor,CYS,graduated);

//        Create sections for the classes
        Section s1 = new Section(instructor1,1,course1);
        Section s2 = new Section(instructor2,5,course2);
        Section s3 = new Section(instructor1,3,course3);
        Section s4 = new Section(instructor2,2,course4);
        Section s5 = new Section(instructor1,5,course5);
        Section s6 = new Section(instructor2,7,course6);
        Section s7 = new Section(instructor1,3,course7);
//        Student1 registering courses
        FacadePayment facade = new FacadePayment();
        //registering 21 hours but the student can only register 18 hours maximum
        facade.registerAndPayFees(student1,s1);
        facade.registerAndPayFees(student1,s2);
        facade.registerAndPayFees(student1,s3);
        facade.registerAndPayFees(student1,s4);
        facade.registerAndPayFees(student1,s5);
        facade.registerAndPayFees(student1,s6);
        facade.registerAndPayFees(student1,s7);
//        System.out.println(student1.getCourses());
        System.out.println("Student1 credit hours for this semester = "+student1.getCreditHours()); //18 hours
//        instructor1 assigning student1 grades
        instructor1.assignGrade(student1,s1,90);
        instructor1.assignGrade(student1,s2,95);
        instructor1.assignGrade(student1,s6,80);
        instructor1.assignGrade(student1,s5,85);

        System.out.println(student1);

        student1.dropCourse(s4);// dropping the Application Development course
        student1.dropCourse(s3);// dropping the Math for Computing course
        System.out.println(student1.getCourses());//Print courses after dropping application development and MFC

        System.out.println(student1.getCreditHours());// credit hours are now 12

        System.out.println(student1.calculateSemesterAverage());

    }
}
