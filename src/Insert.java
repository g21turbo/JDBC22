// 1. import
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Insert {

    public static void main(String[] args) throws Exception {

        // 2. Load and Register the driver
        String url = "jdbc:mysql://localhost:3306/employees";
        String uname = "root";
        String pass = "root";
        String query = "INSERT INTO employees.employeeinfo VALUES (4, 'Stephanie', 'Wells', '555-321-5432', 'Associate', '03-22-1992')";

        // 3. Create the connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);

        // 4. Create a statement
        Statement st = con.createStatement();

        // 5. Execute the query
        int count = st.executeUpdate(query); // DDL, DML, DQL

        // 6. Process the results
        System.out.println(count + "row/s affected");


        // 7. Close
        st.close();
        con.close();

    }

}
