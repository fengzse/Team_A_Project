package org.springframework.samples.petclinic.model;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestVet {
    Vet vet;
    Specialty spec_1,spec_2,spec_3;

    @BeforeEach
    void setVet(){
        vet=new Vet();
        spec_1=new Specialty();
        spec_2=new Specialty();
        spec_3=new Specialty();
    }

    @AfterEach
    void clearVet(){
        vet.clearSpecialties();
    }

    @Test
    @DisplayName("When the set of specialities is empty")
    void getNullSpecialities(){
        vet.setSpecialtiesInternal(null);
        assertEquals(0,vet.getNrOfSpecialties());
    }

    @Test
    @DisplayName("Add specialities instances into Set specialities")
    void getSpecialities(){
        vet.addSpecialty(spec_1);
        assertEquals(1,vet.getNrOfSpecialties());
        vet.addSpecialty(spec_2);
        assertEquals(2,vet.getNrOfSpecialties());
        vet.addSpecialty(spec_3);
        assertEquals(3,vet.getNrOfSpecialties());
        Specialty spec_4=new Specialty();
        vet.addSpecialty(spec_4);
        assertEquals(4,vet.getNrOfSpecialties());
    }

    @Test
    @DisplayName("Create list of specialities containing set")
    void getListOfSpec(){
        spec_1.setName("Dentist");
        spec_2.setName("Health Care");
        spec_3.setName("Surgery");

        vet.addSpecialty(spec_1);
        vet.getSpecialties();
        assertEquals("Dentist",vet.getSpecialties().get(0).toString());

        vet.addSpecialty(spec_2);
        vet.addSpecialty(spec_3);
        vet.getSpecialties();
        assertEquals("Health Care",vet.getSpecialties().get(1).toString());
        assertEquals("Surgery",vet.getSpecialties().get(2).toString());
        assertEquals(3,vet.getSpecialties().size());
    }

    @Test
    @DisplayName("Clean the set and the list")
    void cleanSetAndList(){
        spec_1.setName("Dentist");
        spec_2.setName("Health Care");
        spec_3.setName("Surgery");

        vet.addSpecialty(spec_1);
        vet.getSpecialties();
        assertEquals("Dentist",vet.getSpecialties().get(0).toString());

        vet.addSpecialty(spec_2);
        vet.addSpecialty(spec_3);
        vet.getSpecialties();
        assertEquals("Health Care",vet.getSpecialties().get(1).toString());
        assertEquals("Surgery",vet.getSpecialties().get(2).toString());
        assertEquals(3,vet.getSpecialties().size());

        vet.clearSpecialties();
        assertEquals(0,vet.getNrOfSpecialties());
        vet.getSpecialties();
        assertEquals(0,vet.getSpecialties().size());
    }
}