package SRS;

public class Degree {
    private String type;

    public Degree(String type) {
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
        return "Degree{" +
                "type='" + type + '\'' +
                '}';
    }
}
