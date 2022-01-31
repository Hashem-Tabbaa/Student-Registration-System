package SRS;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Student extends Person{
    private static int MAX_CREDIT_HOURS = 18;
    private static int MIN_CREDIT_HOURS = 12;
    private Degree degree; //True if the Bachelor Degree, false if Master degree
    private Program program;
    private StudyingType studyingType;//True if Regular studying type, false if graduated studying type;
    private Set<Section> courses;
    private int creditHours;
    private Map<Section,Integer> grades;

    public Student(String name, School school, Degree degree, Program program, StudyingType studyingType) {
        super(name, school);
        this.courses = new HashSet<Section>();
        this.grades = new HashMap<Section,Integer>();
        this.degree = degree;
        this.program = program;
        this.studyingType = studyingType;
        this.creditHours = 0;
    }
    public void registerCourse(Section section){
        this.creditHours += section.getCourse().getCreditHours();
        if(this.creditHours > MAX_CREDIT_HOURS){
            System.out.println("Warning " +this.name+ ": You cannot register more than 18 credit hours for each semester");
            creditHours-=section.getCourse().getCreditHours();
            return;
        }
        this.courses.add(section);
        System.out.println(this.name + " has registered " +section.getCourse().getName()+ " course");
        if(this.creditHours < MIN_CREDIT_HOURS){
            System.out.println("Warning " +this.name+ ": You need to register more than the minimum credit hours (12 Hours). Your credit hours = "+this.creditHours);
        }
    }
    public void setGrade(Section section, int grade){
        this.grades.put(section, grade);
    }
    public void dropCourse(Section section){
        this.creditHours -= section.getCourse().getCreditHours();
        this.courses.remove(section);
    }
    public void changProgram(Program newProgram){
        this.program = newProgram;
    }
    public boolean makePayment(){
        System.out.println("Payment Has Been Done Successfully");
        return true;
    }
    public double calculateSemesterAverage(){
        double sum = 0;
        for(int grade : grades.values()){
            sum += grade;
        }
        double average = sum / grades.values().size();
        return average;
    }

    public Set<Section> getCourses() {
        return courses;
    }
    public int getCreditHours() {
        return creditHours;
    }

    @Override
    public String toString() {
        return "Student{" +
                "bachelorDegree=" + degree.getType() +
                ", studyingTypeRegular=" + studyingType.getType() +
                ", courses=" + courses +
                ", creditHours=" + creditHours +
                ", grades=" + grades.values() +
                '}';
    }
}
