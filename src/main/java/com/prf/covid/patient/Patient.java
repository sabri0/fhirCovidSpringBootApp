package com.prf.covid.patient;

import java.time.LocalDate;

import java.util.List;

public class Patient {
    private Long identifier;
    private boolean active;
    private String name;
    private int telecom;
    private LocalDate birthDate;
    private String gender;
    private List link;

    public Patient() {
    }

    public Patient(Long identifier,
                   boolean active,
                   String name,
                   int telecom,
                   LocalDate birthDate,
                   String gender,
                   List link) {
        this.identifier = identifier;
        this.active = active;
        this.name = name;
        this.telecom = telecom;
        this.birthDate = birthDate;
        this.gender = gender;
        this.link = link;
    }

    public Patient(boolean active,
                   String name,
                   int telecom,
                   LocalDate birthDate,
                   String gender,
                   List link) {
        this.active = active;
        this.name = name;
        this.telecom = telecom;
        this.birthDate = birthDate;
        this.gender = gender;
        this.link = link;
    }



    public Long getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Long identifier) {
        this.identifier = identifier;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelecom() {
        return telecom;
    }

    public void setTelecom(int telecom) {
        this.telecom = telecom;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List getLink() {
        return link;
    }

    public void setLink(List link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "identifier=" + identifier +
                ", active=" + active +
                ", name='" + name + '\'' +
                ", telecom=" + telecom +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                ", link=" + link +
                '}';
    }
}
