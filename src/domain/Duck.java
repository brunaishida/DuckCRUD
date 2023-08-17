package domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Duck {

    public UUID id;
    public String name;
    public int CPATOF;
    public double weight;
    public LocalDate dateOfBirth;


    public Duck(String name, int CPATOF, double weight, LocalDate dateOfBirth) {
        this.id = UUID.randomUUID();
        this.CPATOF = CPATOF;
        this.name = name;
        this.weight = weight;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return String.format("domain.Duck: " + this.name + ", weight: " + this.weight + ", date of birth: " + this.dateOfBirth);
    }

}
