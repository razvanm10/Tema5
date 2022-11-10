package cerinta;

import animal_type.AnimalType;
import model.Animal;
import repository.Repository;

import javax.management.InvalidAttributeValueException;
import java.util.List;

public class Cerinta {


    public String cerintaRaport(AnimalType type) {
        return Repository.zooOne.getReport(type);
    }

    public List<Animal> cerintaListaAnimal(AnimalType type) throws InvalidAttributeValueException {
        return Repository.zooOne.getSpecificTypeOfAnimal(type);
    }
}
