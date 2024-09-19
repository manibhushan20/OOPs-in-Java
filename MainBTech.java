import BTech.StudentBTech;

public class MainBTech {
    public static void main(String[] args) {
        int[] studentMarks = {85, 90, 78, 92, 88}; // Example marks for five subjects

        StudentBTech student = new StudentBTech("John Doe", 12345, studentMarks);
        student.display();

        int totalMarks = 0;
        for (int mark : studentMarks) {
            totalMarks += mark;
        }

        double percentage = ((double) totalMarks / (studentMarks.length * 100)) * 100; // Calculating the percentage

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
    }
}