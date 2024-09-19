class Student {
    private int studentID;
    private String name;
    private double annualTuitionFee;

    // Constructor requiring ID number and name
    public Student(int studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    // Getters and setters for fields
    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualTuitionFee() {
        return annualTuitionFee;
    }

    public void setAnnualTuitionFee(double annualTuitionFee) {
        this.annualTuitionFee = annualTuitionFee;
    }
}

class UndergraduateStudent extends Student {
    public UndergraduateStudent(int studentID, String name) {
        super(studentID, name);
        setTuition(40000);
    }

    public void setTuition(double semesterFee) {
        setAnnualTuitionFee(semesterFee * 2); // Two semesters in a year
    }
}

class GraduateStudent extends Student {
    public GraduateStudent(int studentID, String name) {
        super(studentID, name);
        setTuition(30000);
    }

    public void setTuition(double semesterFee) {
        setAnnualTuitionFee(semesterFee * 2); // Two semesters in a year
    }
}

class ResearchScholar extends Student {
    public ResearchScholar(int studentID, String name) {
        super(studentID, name);
        setTuition(15000);
    }

    public void setTuition(double semesterFee) {
        setAnnualTuitionFee(semesterFee * 2); // Two semesters in a year
    }
}

public class StudentClassses {
    public static void main(String[] args) {
        // Creating an array of at least six objects for demonstration
        Student[] students = new Student[6];
        students[0] = new UndergraduateStudent(1, "John");
        students[1] = new UndergraduateStudent(2, "Alice");
        students[2] = new GraduateStudent(3, "Bob");
        students[3] = new GraduateStudent(4, "Eve");
        students[4] = new ResearchScholar(5, "Mike");
        students[5] = new ResearchScholar(6, "Sara");

        // Displaying student information
        for (int i=0;i<6;i++) {
            System.out.println("Student ID: " + students[i].getStudentID());
            System.out.println("Name: " + students[i].getName());
            System.out.println("Annual Tuition Fee: " + students[i].getAnnualTuitionFee());
            System.out.println();
        }
    }
}
