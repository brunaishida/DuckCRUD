package presentation;

import domain.Duck;
import infrastructure.DuckRepository;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class DuckConstructor {

    Duck duck;

    DuckRepository repository;

    public void create(String name, int CPATOF, double weight, String dateOfBirth) {
        LocalDate date = LocalDate.parse(dateOfBirth);
        duck = new Duck(name, CPATOF, weight, date);
        repository.add(duck);
    }

    public Duck getById(UUID id) {
        return repository.getById(id);
    }

    public Duck getByCPATOF(int CPATOF) {
        return repository.getByCPATOF(CPATOF);
    }

    public Duck update(int CPATOF, String name, double weight, String dateOfBirth) {
        LocalDate date = LocalDate.parse(dateOfBirth);
        return repository.update(CPATOF, name, weight, date);
    }

    public void delete(int CPATOF) {
        repository.delete(CPATOF);
    }
}
