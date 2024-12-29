package org.example.cims.beans;

import java.util.Objects;

public class Case {

    private String date;
    private String place;
    private String typeOfCrime;
    private String victims;
    private String description;
    private String suspect;

    public Case() {
    }

    public Case(String date, String place, String typeOfCrime, String victims, String description, String suspect) {
        this.date = date;
        this.place = place;
        this.typeOfCrime = typeOfCrime;
        this.victims = victims;
        this.description = description;
        this.suspect = suspect;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTypeOfCrime() {
        return typeOfCrime;
    }

    public void setTypeOfCrime(String typeOfCrime) {
        this.typeOfCrime = typeOfCrime;
    }

    public String getVictims() {
        return victims;
    }

    public void setVictims(String victims) {
        this.victims = victims;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSuspect() {
        return suspect;
    }

    public void setSuspect(String suspect) {
        this.suspect = suspect;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Case aCase = (Case) o;
        return Objects.equals(date, aCase.date) && Objects.equals(place, aCase.place) && Objects.equals(typeOfCrime, aCase.typeOfCrime) && Objects.equals(victims, aCase.victims) && Objects.equals(description, aCase.description) && Objects.equals(suspect, aCase.suspect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, place, typeOfCrime, victims, description, suspect);
    }

    @Override
    public String toString() {
        return "Case{" +
                "date='" + date + '\'' +
                ", place='" + place + '\'' +
                ", typeOfCrime='" + typeOfCrime + '\'' +
                ", victims='" + victims + '\'' +
                ", description='" + description + '\'' +
                ", suspect='" + suspect + '\'' +
                '}';
    }
}
