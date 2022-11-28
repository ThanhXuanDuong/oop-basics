package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void testEquals() {
        assertEquals(new Student("Helen",2.3f,"324456"),new Student("Helen",2.3f,"324456"));
    }
}