/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.testpr.testmaven.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author cris
 */
public class Pet implements Serializable{
    
    private String petname;
    private String owner;
    private String species;
    private char gender;
    private Date birth;
    private Date death;
    
    public Pet(String pn, String o, String s, char g, Date b, Date d){
        petname = pn;
        owner = o;
        species = s;
        gender = g;
        birth = b;
        death = d;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getDeath() {
        return death;
    }

    public void setDeath(Date death) {
        this.death = death;
    }
    
    
    
}
