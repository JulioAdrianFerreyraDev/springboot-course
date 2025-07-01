package com.luv2code.cruddemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Entity class representing a Student.
 * 
 * <p>This class is mapped to the "student" table in the database using JPA annotations.
 * It contains fields for the student's id, first name, last name, and email address.
 * </p>
 * 
 * <ul>
 *   <li>{@code id} - The primary key for the student entity, auto-generated.</li>
 *   <li>{@code firstName} - The student's first name.</li>
 *   <li>{@code lastName} - The student's last name.</li>
 *   <li>{@code email} - The student's email address.</li>
 * </ul>
 * 
 * <p>Includes constructors for creating new Student instances, as well as standard
 * getters and setters for each field. Overrides {@code toString()} for a string
 * representation of the student object.</p>
 * 
 * @author Your Name
 */
@Entity
@Table(name="student")
public class Student {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    // define constructors
    public Student() {

    }

    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    // define getters/setters

    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the student.
     *
     * @param id the unique identifier to set
     */
    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    // define toString() method

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
