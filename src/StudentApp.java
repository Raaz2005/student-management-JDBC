import java.util.Scanner;

public class StudentApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    Student s = new Student(id, name, age);

                    StudentDAO.addStudent(s);

                    break;

                case 2:

                    StudentDAO.viewStudents();

                    break;

                case 3:

                    System.out.print("Enter ID: ");
                    int sid = sc.nextInt();

                    StudentDAO.searchStudent(sid);

                    break;

                case 4:

                    System.out.print("Enter ID: ");
                    int uid = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter New Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter New Age: ");
                    int uage = sc.nextInt();

                    StudentDAO.updateStudent(uid, uname, uage);

                    break;

                case 5:

                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();

                    StudentDAO.deleteStudent(did);

                    break;

                case 6:

                    System.out.println("Thank You");
                    sc.close();
                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}