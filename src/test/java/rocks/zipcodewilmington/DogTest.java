package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorDog(){
        String expectedName = "Jerry Lee";
        Date expectedDate =  new Date();
        Integer expectedId = 1994;

        Dog dog = new Dog(expectedName, expectedDate, expectedId);

        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
        Assert.assertEquals(expectedId, actualId);


    }

    @Test
    public void speakTest(){
        String expected = "bark!";

        Dog dog = new Dog();

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest(){
        Date expected = new Date();

        Dog dog = new Dog();

      dog.setBirthDate(expected);

      Date actual = dog.getBirthDate();

      Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest(){
        Food food = new Food();
        Dog dog = new Dog();

        int initialMealsEaten = dog.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;

        dog.eat(food);
        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getIdTest(){
        Dog dog = new Dog();
        Integer expected = dog.getId();

        Integer actual = dog.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void animalInheritanceTest(){
        Dog dog = new Dog();

        boolean comparison = dog instanceof Animal;

        Assert.assertTrue(comparison);


    }

    @Test
    public void mammalInheritanceTest(){
        Dog dog = new Dog();

        boolean comparison = dog instanceof Mammal;

        Assert.assertTrue(comparison);


    }
}
