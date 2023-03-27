import java.util.*;

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }
}

//Problem: https://www.hackerrank.com/challenges/java-sort
public class JavaSort {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student(33, "Rumpa", 3.68));
        studentList.add(new Student(85, "Ashis", 3.85));
        studentList.add(new Student(56, "Samiha", 3.75));
        studentList.add(new Student(19, "Samara", 3.75));
        studentList.add(new Student(22, "Fahin", 3.76));

        studentList.sort((student1, student2) -> {
            if (student1.getCgpa() == student2.getCgpa()) {
                if (student1.getFname().equals(student2.getFname())) {
                    return Integer.compare(student1.getId(), student2.getId());
                } else {
                    return student1.getFname().compareTo(student2.getFname());
                }
            } else {
                return Double.compare(student2.getCgpa(), student1.getCgpa());
            }
        });

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }
    }
}