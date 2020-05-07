package assignment1;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Student implements Serializable {
    private String surname;
    private String firstname;
    private String id;
    private LocalDate dob;
    private Course course;
    private Address address;

    public String getSurname() {
        return surname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDob() {
        return dob;
    }

    public Course getCourse() {
        return course;
    }

    public Address getAddress() {
        return address;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(surname, student.surname) &&
                Objects.equals(firstname, student.firstname) &&
                Objects.equals(id, student.id) &&
                Objects.equals(dob, student.dob) &&
                Objects.equals(course, student.course) &&
                Objects.equals(address, student.address);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student result = (Student) super.clone();
        if (this.address != null) {
            result.address = (Address) this.address.clone();
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, firstname, id, dob, course, address);
    }
}
