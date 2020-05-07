package assignment1Tests;


import static org.junit.jupiter.api.Assertions.*;

import assignment1.Address;
import assignment1.Course;
import org.junit.jupiter.api.*;

import assignment1.Student;

import java.time.LocalDate;

public class TestCloningStudents {

    Student student;
    Course course;
    Address address;

    @BeforeEach
    void setup() {
        this.address = new Address();
        this.address.setHouseNumber(123);
        this.address.setPostCode("123456");
        this.address.setStreet("ChangAn");
        this.address.setTown("ChaoYang");

        this.course = new Course();
        this.course.setName("Java");
        this.course.setNumber("01");

        this.student = new Student();
        this.student.setAddress(this.address);
        this.student.setCourse(this.course);
        this.student.setDob(LocalDate.now());
        this.student.setFirstname("Jinping");
        this.student.setSurname("Xi");
        this.student.setDob(LocalDate.now());
    }


    @Test
    void testClone() {
        try {
            Student other = this.student.clone();

            assertEquals(this.student.getDob(), other.getDob());
            assertEquals(this.student.getFirstname(), other.getFirstname());
            assertEquals(this.student.getId(), other.getId());
            assertEquals(this.student.getSurname(), other.getSurname());

            assertEquals(this.student.getAddress(), other.getAddress());
            assertEquals(this.student.getCourse(), other.getCourse());
            assertFalse(this.student.getAddress() == other.getAddress());
            assertTrue(this.student.getCourse() == other.getCourse());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }

    @AfterEach
    void tearDown() {

    }

}

