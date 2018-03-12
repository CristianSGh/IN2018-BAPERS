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
public class Event implements Serializable{
    
    private String petname;
    private Date eventdate;
    private String eventtype;
    private String remark;
    
    public Event(String pn, Date ed, String et, String r){
        petname = pn;
        eventdate = ed;
        eventtype = et;
        remark = r;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public Date getEventdate() {
        return eventdate;
    }

    public void setEventdate(Date eventdate) {
        this.eventdate = eventdate;
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
    
    
}
