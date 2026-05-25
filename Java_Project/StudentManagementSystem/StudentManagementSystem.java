import java.util.ArrayList;
import java.util.Scanner;

// Main class
public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("\n---- Student Management System ----");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = getValidInt("");

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    updateStudent();
                    break;
                case 5:
                    deleteStudent();
                    break;
                case 6:
                    System.out.println("Exiting application... Thank you!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    // Number Format Validation
    static int getValidInt(String message) {
        while (true) {
            if (!message.isEmpty()) {
                System.out.print(message);
            }
            String input = sc.nextLine();
            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter numbers only.");
            }
        }
    }

    // Unique ID Check
    static boolean isIdExists(int id) {
        for (Student s : students) {
            if (s.id == id) {
                return true;
            }
        }
        return false;
    }

    // ---------- Add Student ----------
    static void addStudent() {
        int id;

        while (true) {
            id = getValidInt("Enter Student ID: ");
            if (isIdExists(id)) {
                System.out.println("This ID already exists! Please enter a unique ID.");
            } else {
                break;
            }
        }

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int age = getValidInt("Enter Student Age: ");

        students.add(new Student(id, name, age));
        System.out.println("Student added successfully!");
    }

    // ---------- View Students ----------
    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\nID\tName\tAge");
        for (Student s : students) {
            System.out.println(s.id + "\t" + s.name + "\t" + s.age);
        }
    }

    // ---------- Search Student ----------
    static void searchStudent() {
        int id = getValidInt("Enter Student ID to search: ");

        for (Student s : students) {
            if (s.id == id) {
                System.out.println("\nStudent Found:");
                System.out.println("ID   : " + s.id);
                System.out.println("Name : " + s.name);
                System.out.println("Age  : " + s.age);
                return;
            }
        }

        System.out.println("Student ID not found!");
    }

    // ---------- Update Student ----------
    static void updateStudent() {
        int id = getValidInt("Enter Student ID to update: ");

        for (Student s : students) {
            if (s.id == id) {

                System.out.print("Enter new name: ");
                s.name = sc.nextLine();

                s.age = getValidInt("Enter new age: ");

                System.out.println("Student updated successfully!");
                return;
            }
        }

        System.out.println("Student ID not found. Update failed!");
    }

    // ---------- Delete Student ----------
    static void deleteStudent() {
        int id = getValidInt("Enter Student ID to delete: ");

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).id == id) {
                students.remove(i);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student ID not found. Delete failed!");
    }
}


// Student class
class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}

