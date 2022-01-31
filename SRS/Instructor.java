package SRS;

public class Instructor extends Person{
    private double salary;

    public Instructor(String name, School school, double salary) {
        super(name, school);
        this.salary = salary;
    }
    public void assignGrade(Student student, Section section, int grade){
        student.setGrade(section,grade);
    }

    @Override
    public String toString() {
        return  super.toString();
    }
}
