package BTech;

public class StudentBTech {
    private String name;
    private int rollNo;
    private int[] marks;

    public StudentBTech(String name, int rollNo, int[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks in five subjects:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Total Marks: " + calculateTotalMarks());
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
    
    private int calculateTotalMarks() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return totalMarks;
    }
    
    private double calculatePercentage() {
        return ((double) calculateTotalMarks() / (marks.length * 100)) * 100;
    }
}