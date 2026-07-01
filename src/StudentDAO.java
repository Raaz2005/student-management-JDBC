import java.sql.*;

public class StudentDAO {

    public static void addStudent(Student student) {

        String query =
                "INSERT INTO students VALUES (?, ?, ?)";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps =
                        con.prepareStatement(query)
        ) {

            ps.setInt(1, student.getId());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());

            ps.executeUpdate();

            System.out.println("Student Added Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void viewStudents() {

        String query = "SELECT * FROM students";

        try (
                Connection con = DBConnection.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query)
        ) {

            while (rs.next()) {

                System.out.println(
                        "ID: " + rs.getInt("id")
                        + " Name: " + rs.getString("name")
                        + " Age: " + rs.getInt("age"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void searchStudent(int id) {

        String query =
                "SELECT * FROM students WHERE id=?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps =
                        con.prepareStatement(query)
        ) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println(
                        "ID: " + rs.getInt("id"));
                System.out.println(
                        "Name: " + rs.getString("name"));
                System.out.println(
                        "Age: " + rs.getInt("age"));

            } else {

                System.out.println(
                        "Student not found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void updateStudent(
            int id,
            String name,
            int age) {

        String query =
                "UPDATE students SET name=?, age=? WHERE id=?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps =
                        con.prepareStatement(query)
        ) {

            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setInt(3, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Updated Successfully.");
            else
                System.out.println("Student not found.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void deleteStudent(int id) {

        String query =
                "DELETE FROM students WHERE id=?";

        try (
                Connection con = DBConnection.getConnection();
                PreparedStatement ps =
                        con.prepareStatement(query)
        ) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0)
                System.out.println("Deleted Successfully.");
            else
                System.out.println("Student not found.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}