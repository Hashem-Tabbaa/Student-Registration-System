package SRS;

public abstract class Person {
    protected int id;
    protected String name;
    protected School school;
    private static int personsIDs = 0;

    public Person(String name, School school) {
        this.id = ++personsIDs;
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", school=" + school.getAbbreviation() +
                '}';
    }
}


