import java.util.Date;

public class Duck {

    private String name;
    private double weight;
    private Date dateOfBirth;

    Duck (String name, double weight, Date dateOfBirth) {
        this.name = name;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("Duck: " + name + ", weight: " + weight + ", date of birth: " +dateOfBirth);
    }

}
