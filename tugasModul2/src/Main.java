import java.util.Scanner;

public class Main {
    private Book[] bookList;
    private User[] userStudent;
    private Scanner scanner;
    private final java.lang.String adminUsername = "admin";
    private final String adminPassword = "admin";

    public Main() {
        bookList = new Book[3]; // Assuming 3 books for simplicity
        userStudent = new User[3]; // Assuming 3 users for simplicity
        scanner = new Scanner(System.in);
    }

    public void menu() {
        System.out.println("Library System");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option (1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                menuStudent();
                break;
            case 2:
                loginAdmin();
                break;
            case 3:
                System.out.println("Thank you. Exiting program.");
                System.exit(0);
            default:
                System.out.println("Invalid option. Please choose again.");
                menu();
        }
    }

    public void menuStudent() {
        System.out.println("Student Dashboard");
        System.out.println("1. Display Books");
        System.out.println("2. Logout");
        System.out.print("Choose option (1-2): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                displayBooks();
                break;
            case 2:
                System.out.println("Logging out from student.");
                menu();
                break;
            default:
                System.out.println("Invalid option. Please choose again.");
                menuStudent();
        }
    }

    public void displayBooks() {
        System.out.println("List of Available Books:");
        System.out.println("No. || Id buku || Title || Author");
        for (Book book : bookList) {
            System.out.println(book.getId() + " || " + book.getTitle() + " || " + book.getAuthor());
        }
        System.out.println("Input Id buku yang ingin dipinjam (input 99 untuk back)");
        System.out.print("Input: ");
        int inputId = scanner.nextInt();
        if (inputId == 99) {
            menuStudent();
        }
        // Add logic to handle book borrowing
    }

    public void loginAdmin() {
        System.out.print("Enter your username : ");
        String username = scanner.next();
        System.out.print("Enter your password : ");
        String password = scanner.next();
        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            menuAdmin();
        } else {
            System.out.println("Invalid credentials for admin.");
            menu();
        }
    }

    public void menuAdmin() {
        System.out.println("Admin Dashboard");
        System.out.println("1. Add Student");
        System.out.println("2. Display Registered Students");
        System.out.println("3. Logout");
        System.out.print("Choose option (1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addStudent();
                break;
            case 2:
                displayStudents();
                break;
            case 3:
                System.out.println("Logging out from admin.");
                menu();
                break;
            default:
                System.out.println("Invalid option. Please choose again.");
                menuAdmin();
        }
    }

    public void addStudent() {
        scanner.nextLine(); // Consume newline
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student NIM: ");
        String nim = scanner.nextLine();
        while (nim.length() != 15) {
            System.out.println("NIM must be 15 characters long.");
            System.out.print("Enter student NIM: ");
            nim = scanner.nextLine();
        }
        System.out.print("Enter student faculty: ");
        String faculty = scanner.nextLine();
        System.out.print("Enter student program: ");
        String program = scanner.nextLine();

        // Find an empty slot in the userStudent array
        int index = 0;
        while (userStudent[index] != null && index < userStudent.length) {
            index++;
        }

        // Check if the userStudent array is full
        if (index == userStudent.length) {
            System.out.println("User storage is full. Cannot add more students.");
            menuAdmin(); // Return to admin menu
            return;
        }

        // Add the new student to the userStudent array
        userStudent[index] = new User(name, nim, faculty, program);
        System.out.println("Student successfully registered.");
        menuAdmin(); // Return to admin menu
    }

    public void displayStudents() {
        System.out.println("List of Registered Students:");
        for (User user : userStudent) {
            if (user != null) {
                System.out.println("Name: " + user.getName());
                System.out.println("Faculty: " + user.getFaculty());
                System.out.println("NIM: " + user.getNim());
                System.out.println("Program: " + user.getProgram());
            }
        }
        menuAdmin(); // Return to admin menu
    }

    public static void main(String[] args) {
        Main library = new Main();
        library.menu();
    }
}

class Book {
    private String title;
    private String author;
    private String id;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

class User {
    private String name;
    private String nim;
    private String faculty;
    private String program;

    public User(String name, String nim, String faculty, String program) {
        this.name = name;
        this.nim = nim;
        this.faculty = faculty;
        this.program = program;
    }

    public String getName() {
        return name;
    }

    public String getNim() {
        return nim;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getProgram() {
        return program;
    }
}
