package mainy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menuy {

    private static Map<String, AccountDetails> clientAccounts = new HashMap<>();
    private static Map<String, AccountDetails> instructorAccounts = new HashMap<>();
    private static boolean isAdminLoggedIn = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect your role:");
            System.out.println("1. Admin");
            System.out.println("2. Instructor");
            System.out.println("3. Client");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    adminLogin(scanner);
                    break;
                case 2:
                    instructorLogin(scanner);
                    break;
                case 3:
                    clientLogin(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Admin Login
    private static void adminLogin(Scanner scanner) {
        System.out.println("\nPlease login as Admin.");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if ("yara".equals(username) && "yara123".equals(password)) {
            isAdminLoggedIn = true;
            System.out.println("Admin logged in successfully.");
            adminFeatures(scanner);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Instructor Login
    private static void instructorLogin(Scanner scanner) {
        System.out.println("\nPlease login as Instructor.");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if ("mohamad".equals(email) && "mohamad123".equals(password)) {
            isAdminLoggedIn = true;
            System.out.println("Admin logged in successfully.");
            instructorFeatures(scanner);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Client Login
    private static void clientLogin(Scanner scanner) {
        System.out.println("\nPlease login as Client.");
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if ("zainab".equals(email) && "zainab123".equals(password)) {
            isAdminLoggedIn = true;
            System.out.println("Admin logged in successfully.");
            clientFeatures(scanner);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Admin Features
    private static void adminFeatures(Scanner scanner) {
        while (true) {
            System.out.println("\nAdmin Features Menu:");
            System.out.println("1. User Management");
            System.out.println("2. Program Monitoring");
            System.out.println("3. Content Management");
            System.out.println("4. Subscription Management");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    userManagement(scanner);
                    break;
                case 2:
                  //programMonitoring(scanner);
                    break;
                case 3:
                 //contentManagement(scanner);
                    break;
                case 4:
                  //subscriptionManagement(scanner);
                    break;
                case 5:
                    isAdminLoggedIn = false;
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Instructor Features
    private static Map<String, List<String>> instructorCourses = new HashMap<>();

    private static void instructorFeatures(Scanner scanner) {
        String currentInstructorEmail = ""; 
        while (true) {
            System.out.println("\nInstructor Features Menu:");
            System.out.println("1. View My Courses");
            System.out.println("2. Add New Course");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    viewInstructorCourses(currentInstructorEmail);
                    break;
                case 2:
                    addInstructorCourse(scanner, currentInstructorEmail);
                    break;
                case 3:
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // عرض الدورات للمدرب الحالي
    private static void viewInstructorCourses(String instructorEmail) {
        List<String> courses = instructorCourses.getOrDefault(instructorEmail, new ArrayList<>());

        if (courses.isEmpty()) {
            System.out.println("You have not added any courses yet.");
        } else {
            System.out.println("\nYour Courses:");
            for (int i = 0; i < courses.size(); i++) {
                System.out.println((i + 1) + ". " + courses.get(i));
            }
        }
    }

    private static void addInstructorCourse(Scanner scanner, String instructorEmail) {
        System.out.print("Enter the course name: ");
        String courseName = scanner.nextLine();
        
        System.out.print("Enter Program Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Duration: ");
        String duration = scanner.nextLine();
        System.out.print("Enter Difficulty Level: ");
        String difficulty = scanner.nextLine();
        System.out.print("Enter Goals: ");
        String goals = scanner.nextLine();

        instructorCourses.putIfAbsent(instructorEmail, new ArrayList<>());
        String courseDetails = "Title: " + title + " | Duration: " + duration + " | Difficulty: " + difficulty + " | Goals: " + goals;
        instructorCourses.get(instructorEmail).add(courseName + " - " + courseDetails);

        System.out.println("Course added successfully.");
    }
          private static void userManagement3(Scanner scanner) {
            while (true) {
                System.out.println("\n--- User Management ---");
                System.out.println("1. Add Client");
                System.out.println("2. Update Client");
                System.out.println("3. Deactivate Client");
                System.out.println("4. Add Instructor");
                System.out.println("5. Update Instructor");
                System.out.println("6. Deactivate Instructor");
                System.out.println("7. Return to Admin Menu");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        addClient(scanner);
                        break;
                    case 2:
                        updateClient(scanner);
                        break;
                    case 3:
                        deactivateClient(scanner);
                        break;
                    case 4:
                        addInstructor(scanner);
                        break;
                    case 5:
                        updateInstructor(scanner);
                        break;
                    case 6:
                        deactivateInstructor(scanner);
                        break;
                    case 7:
                        return; 
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        
          }
        private static void addClient3(Scanner scanner) {
            System.out.print("Enter client name: ");
            String name = scanner.nextLine();
            System.out.print("Enter client email: ");
            String email = scanner.nextLine();
            System.out.print("Enter client password: ");
            String password = scanner.nextLine();

            AccountDetails newClient = new AccountDetails(name, email, password);
            clientAccounts.put(email, newClient);
            System.out.println("Client added successfully.");
        }


        private static void updateClient3(Scanner scanner) {
            System.out.print("Enter client email to update: ");
            String clientEmailToUpdate = scanner.nextLine();

            if (clientAccounts.containsKey(clientEmailToUpdate)) {
                System.out.print("Enter new name: ");
                String newNameForClient = scanner.nextLine();
                System.out.print("Enter new password: ");
                String newPasswordForClient = scanner.nextLine();

                AccountDetails updatedClient = new AccountDetails(newNameForClient, clientEmailToUpdate, newPasswordForClient);
                clientAccounts.put(clientEmailToUpdate, updatedClient);

                System.out.println("Client account updated.");
            } else {
                System.out.println("Client not found.");
            }
        }

        private static void deactivateClient3(Scanner scanner) {
            System.out.print("Enter client email to deactivate: ");
            String clientEmailToDeactivate = scanner.nextLine();

            if (clientAccounts.containsKey(clientEmailToDeactivate)) {
                clientAccounts.remove(clientEmailToDeactivate);
                System.out.println("Client account deactivated.");
            } else {
                System.out.println("Client not found.");
            }
        }

        private static void addInstructor3S(Scanner scanner)
 {
            if (instructorAccounts == null) {
                instructorAccounts = new HashMap<>();
            }

            System.out.print("Enter instructor name: ");
            String name = scanner.nextLine();
            System.out.print("Enter instructor email: ");
            String email = scanner.nextLine();
            System.out.print("Enter instructor password: ");
            String password = scanner.nextLine();

            AccountDetails newInstructor = new AccountDetails(name, email, password);
            instructorAccounts.put(email, newInstructor);
            System.out.println("Instructor added successfully.");
        }

        private static void updateInstructor3(Scanner scanner)
 {
            System.out.print("Enter instructor email to update: ");
            String instructorEmailToUpdate = scanner.nextLine();

            if (instructorAccounts.containsKey(instructorEmailToUpdate)) {
                System.out.print("Enter new name: ");
                String newNameForInstructor = scanner.nextLine();
                System.out.print("Enter new password: ");
                String newPasswordForInstructor = scanner.nextLine();

                AccountDetails updatedInstructor = new AccountDetails(newNameForInstructor, instructorEmailToUpdate, newPasswordForInstructor);
                instructorAccounts.put(instructorEmailToUpdate, updatedInstructor);

                System.out.println("Instructor account updated.");
            } else {
                System.out.println("Instructor not found.");
            }
        }

        private static void deactivateInstructor3(Scanner scanner) {
            System.out.print("Enter instructor email to deactivate: ");
            String instructorEmailToDeactivate = scanner.nextLine();

            if (instructorAccounts.containsKey(instructorEmailToDeactivate)) {
                instructorAccounts.remove(instructorEmailToDeactivate);
                System.out.println("Instructor account deactivated.");
            } else {
                System.out.println("Instructor not found.");
            }
        }
    

    

    // Client Features
        private static void clientFeatures(Scanner scanner) {
            while (true) {
                System.out.println("\nClient Features Menu:");
                System.out.println("1. Create Profile");
                System.out.println("2. Update Profile");
                System.out.println("3. Enter Weight");
                System.out.println("4. Enter BMI");
                System.out.println("5. Log Attendance");
                System.out.println("6. Add Milestone");
                System.out.println("7. Award Badge");
                System.out.println("8. Submit Review");
                System.out.println("9. View All Reviews");
                System.out.println("10. Submit Improvement Suggestion");
                System.out.println("11. View Improvement Suggestions");
                System.out.println("12. Exit to Main Menu");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); 

                switch (choice) {
                    case 1:
                        System.out.print("Enter username: ");
                        String username = scanner.nextLine();
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter age: ");
                        int age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter fitness goals: ");
                        String goals = scanner.nextLine();
                        System.out.println("Profile created for: " + username);
                        break;
                    case 2:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter new name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter new age: ");
                        age = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter new fitness goals: ");
                        goals = scanner.nextLine();
                        System.out.println("Profile updated for: " + username);
                        break;
                    case 3:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter weight (kg): ");
                        int weight = scanner.nextInt();
                        System.out.println("Weight recorded for " + username + ": " + weight + " kg");
                        break;
                    case 4:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter BMI: ");
                        double bmi = scanner.nextDouble();
                        System.out.println("BMI recorded for " + username + ": " + bmi);
                        break;
                    case 5:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter program name: ");
                        String program = scanner.nextLine();
                        System.out.println("Attendance logged for " + username + " in program: " + program);
                        break;
                    case 6:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter milestone: ");
                        String milestone = scanner.nextLine();
                        System.out.println("Milestone added for " + username + ": " + milestone);
                        break;
                    case 7:
                        System.out.print("Enter username: ");
                        username = scanner.nextLine();
                        System.out.print("Enter badge: ");
                        String badge = scanner.nextLine();
                        System.out.println("Badge awarded to " + username + ": " + badge);
                        break;
                    case 8:
                        System.out.print("Enter review text: ");
                        String review = scanner.nextLine();
                        System.out.println("Review submitted: " + review);
                        break;
                    case 9:
                        System.out.println("Displaying all reviews...");
                        break;
                    case 10:
                        System.out.print("Enter suggestion: ");
                        String suggestion = scanner.nextLine();
                        System.out.println("Improvement suggestion submitted: " + suggestion);
                        break;
                    case 11:
                        System.out.println("Displaying improvement suggestions...");
                        break;
                    case 12:
                        System.out.println("Returning to Main Menu...");
                        return; 
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

    private static void userManagement(Scanner scanner) {
        while (true) {
            System.out.println("\n--- User Management ---");
            System.out.println("1. Add Client");
            System.out.println("2. Update Client");
            System.out.println("3. Deactivate Client");
            System.out.println("4. Add Instructor");
            System.out.println("5. Update Instructor");
            System.out.println("6. Deactivate Instructor");
            System.out.println("7. Return to Admin Menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    addClient(scanner);
                    break;
                case 2:
                    updateClient(scanner);
                    break;
                case 3:
                    deactivateClient(scanner);
                    break;
                case 4:
                    addInstructor(scanner);
                    break;
                case 5:
                    updateInstructor(scanner);
                    break;
                case 6:
                    deactivateInstructor(scanner);
                    break;
                case 7:
                    return; 
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addClient(Scanner scanner) {
        System.out.print("Enter client name: ");
        String name = scanner.nextLine();
        System.out.print("Enter client email: ");
        String email = scanner.nextLine();
        System.out.print("Enter client password: ");
        String password = scanner.nextLine();

        AccountDetails newClient = new AccountDetails(name, email, password);
        clientAccounts.put(email, newClient);
        System.out.println("Client added successfully.");
    }

    private static void updateClient(Scanner scanner) {
        System.out.print("Enter client email to update: ");
        String clientEmailToUpdate = scanner.nextLine();

        if (clientAccounts.containsKey(clientEmailToUpdate)) {
            System.out.print("Enter new name: ");
            String newNameForClient = scanner.nextLine();
            System.out.print("Enter new password: ");
            String newPasswordForClient = scanner.nextLine();

            AccountDetails updatedClient = new AccountDetails(newNameForClient, clientEmailToUpdate, newPasswordForClient);
            clientAccounts.put(clientEmailToUpdate, updatedClient);

            System.out.println("Client account updated.");
        } else {
            System.out.println("Client not found.");
        }
    }

    private static void deactivateClient(Scanner scanner) {
        System.out.print("Enter client email to deactivate: ");
        String clientEmailToDeactivate = scanner.nextLine();

        if (clientAccounts.containsKey(clientEmailToDeactivate)) {
            clientAccounts.remove(clientEmailToDeactivate);
            System.out.println("Client account deactivated.");
        } else {
            System.out.println("Client not found.");
        }
    }

    private static void addInstructor(Scanner scanner) {
        if (instructorAccounts == null) {
            instructorAccounts = new HashMap<>();
        }

        System.out.print("Enter instructor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter instructor email: ");
        String email = scanner.nextLine();
        System.out.print("Enter instructor password: ");
        String password = scanner.nextLine();

        AccountDetails newInstructor = new AccountDetails(name, email, password);
        instructorAccounts.put(email, newInstructor);
        System.out.println("Instructor added successfully.");
    }

    private static void updateInstructor(Scanner scanner) {
        System.out.print("Enter instructor email to update: ");
        String instructorEmailToUpdate = scanner.nextLine();

        if (instructorAccounts.containsKey(instructorEmailToUpdate)) {
            System.out.print("Enter new name: ");
            String newNameForInstructor = scanner.nextLine();
            System.out.print("Enter new password: ");
            String newPasswordForInstructor = scanner.nextLine();

            AccountDetails updatedInstructor = new AccountDetails(newNameForInstructor, instructorEmailToUpdate, newPasswordForInstructor);
            instructorAccounts.put(instructorEmailToUpdate, updatedInstructor);

            System.out.println("Instructor account updated.");
        } else {
            System.out.println("Instructor not found.");
        }
    }

    private static void deactivateInstructor(Scanner scanner) {
        System.out.print("Enter instructor email to deactivate: ");
        String instructorEmailToDeactivate = scanner.nextLine();

        if (instructorAccounts.containsKey(instructorEmailToDeactivate)) {
            instructorAccounts.remove(instructorEmailToDeactivate);
            System.out.println("Instructor account deactivated.");
        } else {
            System.out.println("Instructor not found.");
        }
    }
}


// Class to store account details
class AccountDetails {
    private String name;
    private String email;
    private String password;

    public AccountDetails(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
