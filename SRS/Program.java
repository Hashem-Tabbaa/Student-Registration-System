package SRS;

import java.util.HashSet;
import java.util.Set;

public class Program {
    private Set<Course> courses;
    private int id;
    private String name;
    private String abbreviation;
    private static int programsIDs = 0;

    public Program(String name, String abbreviation) {
        this.id = ++programsIDs;
        courses = new HashSet<Course>();
        this.id = id;
        this.name = name;
        this.abbreviation = abbreviation;
    }

    public Set<Course> getCourses() {
        return courses;
    }
    public void addCourse(Course newCourse){
        this.courses.add(newCourse);
    }
    public void deleteCourse(Course deletedCourse){
        this.courses.remove(deletedCourse);
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAbbreviation() {
        return abbreviation;
    }
    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }
    @Override
    public String toString() {
        return "Program{" +
                "courses=" + courses +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                '}';
    }
}
