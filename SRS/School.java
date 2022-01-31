package SRS;

import java.util.HashSet;
import java.util.Set;

public class School {
    private int id;
    protected String name;
    protected String abbreviation;
    protected Set<Program> programs = new HashSet<Program>();
    private static int schoolID = 0;

    protected School(String name, String abbreviation){
        this.id = ++schoolID;
        this.abbreviation = abbreviation;
        this.name = name;
    }

    void AddProgram(Program program){
        this.programs.add(program);
    };
    void setAbbreviation(String abbreviation){
        this.abbreviation = abbreviation;
    };
    void setName(String name){
        this.name = name;
    };
    void setPrograms(HashSet<Program> programs){
        this.programs = programs;
    };

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public Set<Program> getPrograms() {
        return programs;
    }

    @Override
    public String toString() {
        return "School{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", programs=" + programs +
                '}';
    }
}