package infrastructure;

import domain.Duck;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class DuckRepository {

    List<Duck> ducks;

    public void add (Duck duck) {
        ducks.add(duck);
    }

    public Duck getById (UUID id) {
        return (Duck) ducks.stream().filter(duck -> duck.id == id);
    }

    public Duck getByCPATOF (int CPATOF) {
        return (Duck) ducks.stream().filter(duck -> duck.CPATOF == CPATOF);
    }

    public Duck update (int CPATOF, String name, double weight, LocalDate dateOfBirth) {
        Duck duck = getByCPATOF(CPATOF);
        duck.name = name;
        duck.weight = weight;
        duck.dateOfBirth = dateOfBirth;
        return duck;
    }

    public void delete (int CPATOF) {
        Duck duck = getByCPATOF(CPATOF);
        ducks.remove(duck);
    }
}
