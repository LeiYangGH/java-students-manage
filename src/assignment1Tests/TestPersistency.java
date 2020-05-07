package assignment1Tests;

import assignment1.Address;
import assignment1.Course;
import assignment1.Student;
import assignment1.StudentStorage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPersistency {

    Collection<Student> students;
    Student student1;
    Student student2;
    Course course;
    Address address;
    String saveFileName = "students.dat";
    File saveFile = new File(saveFileName);
    StudentStorage storage;


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

        this.student1 = new Student();
        this.student1.setAddress(this.address);
        this.student1.setCourse(this.course);
        this.student1.setDob(LocalDate.now());
        this.student1.setFirstname("Jinping");
        this.student1.setSurname("Xi");
        this.student1.setDob(LocalDate.now());
        this.student1.setId("01");

        try {
            this.student2 = this.student1.clone();
            this.student2.setId("02");
            //can set other different properties
            //...
            this.students = new ArrayList<Student>(Arrays.asList(student1, student2));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        storage = new StudentStorage();
    }


    @Test
    void testPersistentStudents() {
        try {
            storage.save(this.students, this.saveFile);
            Collection<Student> studentsCollection = storage.load(this.saveFile);
            ArrayList<Student> loadedStudents = new ArrayList<Student>(studentsCollection);
            assertEquals(this.student1, loadedStudents.get(0));
            assertEquals(this.student2, loadedStudents.get(1));
            assertEquals(loadedStudents.get(1).getId(), "02");

            assertEquals(loadedStudents.get(0).getAddress(), loadedStudents.get(1).getAddress());
            assertEquals(loadedStudents.get(0).getCourse(), loadedStudents.get(1).getCourse());
            assertFalse(loadedStudents.get(0).getAddress() == loadedStudents.get(1).getAddress());
            assertTrue(loadedStudents.get(0).getCourse() == loadedStudents.get(1).getCourse());

        } catch (IOException e) {
            e.printStackTrace();
            assertTrue(false);
        }
    }

    @Test
    void testSaveInvalidFile() {
        assertThrows(IOException.class, () -> {
            this.storage.save(this.students, "*!()@$%");
        });
    }

    @Test
    void testLoadInvalidFile() {
        this.saveFile.delete();
        assertThrows(IOException.class, () -> {
            this.storage.load(this.saveFile);
        });
    }

    @AfterEach
    void tearDown() {
        this.saveFile.delete();
    }
}
