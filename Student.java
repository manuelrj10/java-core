public class Student {
    // Private fields: The "Capsule"
    private String studentId;
    private String name;
    private int marks;
    private boolean resultPublished;

    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        this.marks = 0;
        this.resultPublished = false;
    }

    // Business Logic Method: setMarks
    public void setMarks(int marks) {
        // Rule 1: Protection against modification after publication
        if (this.resultPublished) {
            System.out.println("Error: Cannot modify marks. Results have already been published.");
            return;
        }

        // Rule 2: Value constraints
        if (marks < 0 || marks > 100) {
            System.out.println("Error: Marks must be between 0 and 100.");
            return;
        }

        this.marks = marks;
        System.out.println("Marks updated successfully for " + name);
    }

    // Method to lock the state
    public void publishResult() {
        this.resultPublished = true;
        System.out.println("Result published for ID: " + studentId + ". Marks are now locked.");
    }

    public void displayStudent() {
        System.out.println("--- Student Record ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Status: " + (resultPublished ? "PUBLISHED" + " (Locked)" : "DRAFT"));
        System.out.println("----------------------");
    }
}