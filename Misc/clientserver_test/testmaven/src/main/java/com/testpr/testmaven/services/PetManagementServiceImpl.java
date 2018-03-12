/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testpr.testmaven.services;

import com.testpr.testmaven.domain.Pet;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author cris
 */

@Stateless
public class PetManagementServiceImpl implements PetManagementService{

    @Override
    public List<Pet> findAllPets() {
        ArrayList<Pet> pets = new ArrayList<>();
        Pet p1 = new Pet("Fluffy", "Harold", "cat", 'f', Date.from(LocalDate.of(1993, Month.FEBRUARY, 04).atStartOfDay().toInstant(ZoneOffset.UTC)), null);
        pets.add(p1);
        return pets;
    }

    @Override
    public String sayHi() {
        return "Hi.";
    }
    
    
    
}
