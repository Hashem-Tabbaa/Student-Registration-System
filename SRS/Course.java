package SRS;

public class Course {
    private int id;
    private String name;
    private int creditHours;
    private static int coursesIDs = 0;

    public Course(String name, int creditHours, Program program) {
        this.name = name;
        this.creditHours = creditHours;
        this.id = ++coursesIDs;
        program.addCourse(this);
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

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", creditHours=" + creditHours +
                '}';
    }
}
