package SRS;

public class StudyingType {
    String type;

    public StudyingType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "StudyingType{" +
                "type='" + type + '\'' +
                '}';
    }
}
