package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDog(){
        Dog expected = new Dog(null, null, 0);
        Integer id = expected.getId();

        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(id);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveDog(){
        Dog expected = new Dog(null, null, 0);
        DogHouse.add(expected);
        Integer id = expected.getId();

        DogHouse.remove(id);
        Dog actual = DogHouse.getDogById(id);

        Assert.assertNull(actual);
    }

    @Test
    public void testRemoveDogByDog(){
        Dog expected = new Dog(null, null, 0);
        DogHouse.add(expected);
        Integer id = expected.getId();

        DogHouse.remove(expected);

        Dog actual = DogHouse.getDogById(id);

        Assert.assertNull(actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        Dog expected = new Dog(null, null, 0);
        DogHouse.add(expected);
        Integer id = expected.getId();

        DogHouse.getDogById(id);

        Dog actual = DogHouse.getDogById(id);

        Assert.assertEquals(expected, actual);
    }
}
