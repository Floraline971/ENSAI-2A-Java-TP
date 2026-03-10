package fr.ensai.library;

import java.util.ArrayList;

/**
 * Represents a student.
 */
public class Student {

    // Attributes
    private String name;
    private int age;
    private int academicYear;
    private boolean isClassDelegate;

    /**
     * Constructs a new Student object.
     */
    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        this.name = name;
        this.age = age;
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }
}
