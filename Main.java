class House {
    private double area;
    private int noOfFloors;
    private int numOfBedrooms;

    // Constructor
    public House(double area, int noOfFloors, int numOfBedrooms) {
        this.area = area;
        this.noOfFloors = noOfFloors;
        this.numOfBedrooms = numOfBedrooms;
    }

    // Getters and Setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }
}

class School {
    private double area;
    private int noOfFloors;
    private int numOfClassrooms;
    private String gradeLevel;

    // Constructor
    public School(double area, int noOfFloors, int numOfClassrooms, String gradeLevel) {
        this.area = area;
        this.noOfFloors = noOfFloors;
        this.numOfClassrooms = numOfClassrooms;
        this.gradeLevel = gradeLevel;
    }

    // Getters and Setters
    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNoOfFloors() {
        return noOfFloors;
    }

    public void setNoOfFloors(int noOfFloors) {
        this.noOfFloors = noOfFloors;
    }

    public int getNumOfClassrooms() {
        return numOfClassrooms;
    }

    public void setNumOfClassrooms(int numOfClassrooms) {
        this.numOfClassrooms = numOfClassrooms;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating objects of House and School classes
        House myHouse = new House(1500.0, 2, 3);
        School mySchool = new School(5000.0, 3, 20, "Middle");

        // Printing values
        System.out.println("House Details:");
        System.out.println("Area: " + myHouse.getArea() + " sq. ft.");
        System.out.println("Number of Floors: " + myHouse.getNoOfFloors());
        System.out.println("Number of Bedrooms: " + myHouse.getNumOfBedrooms());

        System.out.println("\nSchool Details:");
        System.out.println("Area: " + mySchool.getArea() + " sq. ft.");
        System.out.println("Number of Floors: " + mySchool.getNoOfFloors());
        System.out.println("Number of Classrooms: " + mySchool.getNumOfClassrooms());
        System.out.println("Grade Level: " + mySchool.getGradeLevel());
    }
}
