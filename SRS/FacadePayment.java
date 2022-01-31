package SRS;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class FacadePayment {
    public void registerAndPayFees(@NotNull Student student, Section section){
        if(!student.makePayment()){
            System.out.println("You need to pay your fees before registering courses");
            return;
        }
        student.registerCourse(section);
    }
}
