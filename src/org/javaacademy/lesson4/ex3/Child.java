package org.javaacademy.lesson4.ex3;

import java.util.Objects;

public class Child {
    private String firstName;
    private String lastName;
    private int yearBirth;

    public Child(String firstName, String lastName, int yearBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearBirth = yearBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Child child = (Child) object;
        return Objects.equals(firstName, child.firstName) &&
               Objects.equals(lastName, child.lastName) &&
               Objects.equals(yearBirth, child.yearBirth);
    }

    @Override
    public int hashCode() {
        return 1;
    }
//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Child object)) {
//            return false;
//        }
//        return this.firstName.equals(object.firstName) &&
//               this.lastName.equals(object.lastName) &&
//               this.dateBirth.equals(object.dateBirth);
//    }


    @Override
    public String toString() {
        return "Child{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' +
               ", yearBirth=" + yearBirth + '}';
    }
}
