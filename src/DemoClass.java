// 1. import
import java.sql.*;

public class DemoClass {

        /*
            1. import ---> java.sql.*
            2. load and register the driver ---> com.mysql.jdbc.Driver
            3. Create connection ---> Connection
            4. Create a statement ---> Statement
            5. Execute the query ->
            6. Process the results ->
            7. Close
        */

    public static void main(String[] args) throws Exception {

        // 2. Load and Register the driver
        String url = "jdbc:mysql://localhost:3306/employees";
        String uname = "root";
        String pass = "root";
        String query = "SELECT * FROM employees.employeeinfo";

        // 3. Create the connection
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, uname, pass);

        // 4. Create a statement
        Statement st = con.createStatement();

        // 5. Execute the query
        ResultSet resultSet = st.executeQuery(query);

        // 6. Process the results
        String employeeData = "";
        while (resultSet.next()) {
            employeeData = resultSet.getString(1) + " : " +
                           resultSet.getString(2) + " : " +
                           resultSet.getString(3) + " : " +
                           resultSet.getString(4) + " : " +
                           resultSet.getString(5) + " : " +
                           resultSet.getString(6);
            System.out.println(employeeData);
        }

        // 7. Close
        st.close();
        con.close();

    }
}
