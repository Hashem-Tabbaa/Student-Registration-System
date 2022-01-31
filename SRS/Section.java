package SRS;

public class Section {
    private Instructor instructor;
    private int sectionNumber;
    private Course course;

    public Section(Instructor instructor, int sectionNumber, Course course) {
        this.instructor = instructor;
        this.sectionNumber = sectionNumber;
        this.course = course;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Section{" +
                "instructor=" + instructor.getName() +
                ", sectionNumber=" + sectionNumber +
                ", course=" + course.getName() +
                '}';
    }
}
