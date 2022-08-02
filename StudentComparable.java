import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Student implements  Comparable<Student>{
private int stid;
private String stname;
private String course;

    public Student(int stid, String stname, String course) {
        this.stid = stid;
        this.stname = stname;
        this.course = course;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stid=" + stid +
                ", stname='" + stname + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
     public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student sobj = (Student) o;
        return stid == sobj.stid;
    }


    @Override
    public int hashCode() {
        return Objects.hash(stid, stname, course);
    }

    @Override
    public int compareTo(Student sobj) {
        return this.stid-sobj.stid;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1010, "Rajeev", "Java"));
        students.add(new Student(110, "Deepak", "Cpp"));
        students.add(new Student(120, "Swami", "Python"));
        System.out.println("Students (Before Sorting) : " + students);

        // This will use the `compareTo()` method of the `Student` class to compare two students and sort them.
        Collections.sort(students);

        System.out.println("\nStudents (After Sorting) : " + students);
    }
}



