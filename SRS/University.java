package SRS;

import java.util.HashSet;
import java.util.Set;

public class University {
    private String name;
    private Set<School> schools = new HashSet<>();
    private static University instance = null;
    private University(){
        this.name = "AlHussein Technical University";
    }
    public static University getInstance(){
        if(instance == null)
            return instance = new University();
        return instance;
    }
    public void addSchool(School school){
        this.schools.add(school);
    }

}
