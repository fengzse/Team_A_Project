package org.springframework.samples.petclinic.model;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import ch.qos.logback.core.joran.conditional.ElseAction;
import com.google.common.base.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

public class OwnerTest {
    Owner owner;


    public OwnerTest()
    {
        owner = new Owner();
    }


    @Test
    void testsetAddress() {
        String address = "Hedienstamsgata"; // Test code
        String expected = "Hedienstamsgata"; // Test code
        owner.setAddress(address);
        String actual = owner.getAddress(); //cut
        Assertions.assertEquals(expected,actual); // Assertion
    }

    @Test
    void testGetAddress() {
        String address = "Akkas Gata"; // Test code
        String expected = "Akkas Gata"; // Test code
        owner.setAddress(address);
        String actual = owner.getAddress(); //cut
        Assertions.assertEquals(expected,actual); // Assertion
    }

    @Test
    void testsetCity() {
        String city = "Gothenburg"; // Test code
        String expected = "Gothenburg"; // Test code
        owner.setCity(city);
        String actual = owner.getCity(); // cut
        Assertions.assertEquals(expected, actual); // Assertion
    }

    @Test
    void testgetCity(){
        String city = "Stockholm"; // Test code
        String expected = "Stockholm"; // Test code
        owner.setCity(city);
        String actual = owner.getCity(); // cut
        Assertions.assertEquals(expected,actual); // Assertion

    }
    @Test
    void testsetTelephone() {
        String telephone = "0737543234"; // Test code
        String expected = "0737543234"; // Test code
        owner.setTelephone(telephone);
        String actual = owner.getTelephone(); // cut
        Assertions.assertEquals(expected, actual); // Assertion
    }

    @Test
    void testgetTelephone() {
        String telephone = "0747543294"; // Test code
        String expected = "0747543294"; // Test code
        owner.setTelephone(telephone);
        String actual = owner.getTelephone(); // cut
        Assertions.assertEquals(expected, actual); // Assertion
    }


    @Test
    void testaddPet() {
        Pet pet = new Pet();
        pet.id =101;
        pet.setOwner(owner);
        pet.setName("Tommy");
        PetType pt = new PetType();
        pt.setName("Dog");
        pet.setType(pt);
        owner.addPet(pet);

        List<Pet> pts = owner.getPets();
        Pet expected = pts.get(0);
        Assertions.assertEquals(expected, pet);
    }

    @Test
    void testgetPets() {
        Pet pet = new Pet();
        pet.id =101;
        pet.setOwner(owner);
        pet.setName("Tommy");
        PetType pt = new PetType();
        pt.setName("Dog");
        pet.setType(pt);
        owner.addPet(pet);

        Pet pet2 = new Pet();
        pet2.id =101;
        pet2.setOwner(owner);
        pet2.setName("Munny");
        pt.setName("Cat");
        pet2.setType(pt);
        owner.addPet(pet2);

        List<Pet> pts = owner.getPets();

        Assertions.assertEquals(2, pts.size());
    }

    @Test
    void testgetPet() {
        Pet pet = new Pet();
        pet.id =101;
        pet.setOwner(owner);
        pet.setName("Tommy");
        PetType pt = new PetType();
        pt.setName("Dog");
        pet.setType(pt);
        owner.addPet(pet);
        Pet actual = pet;
        Pet expected = owner.getPet("Tommy");
            Assertions.assertEquals(expected,actual);
    }

    @Test
    void testgetPetNull() {
        Pet pet = new Pet();
        pet.id =101;
        pet.setOwner(owner);
        pet.setName("Tommy");
        PetType pt = new PetType();
        pt.setName("Dog");
        pet.setType(pt);
        owner.addPet(pet);
        Pet actual = null;
        Pet expected = owner.getPet("Bunty");
        Assertions.assertEquals(expected,actual);
    }


    @Test
    void testToString() {
        owner.id=101;
        owner.firstName = "Ram";
        owner.lastName ="patil";
        owner.setAddress("Akkasgata");
        owner.setCity("gothenburg");
        owner.setTelephone("0874634657");
        String actual1 = "[Owner@5e316c74 id = 101, new = false, lastName = 'patil', firstName = 'Ram', address = 'Akkasgata', city = 'gothenburg', telephone = '0874634657']";
        String actual = owner+"";
        String expected = owner.toString();
        Assertions.assertEquals(expected,actual);
    }
}





