// import java.sql.*;
// public class PreparedStatement {
//     public static void main(String[] args) {
//         try {
//             //Load Driver 2
//              Class.forName("com.mysql.cj.jdbc.Driver");
//              //create connection 3
//         String url = "jdbc:mysql://localhost:3306/temp1";
//         String Username = "root";
//         String password ="arch@18k";
//         Connection con = DriverManager.getConnection(url,Username,password);
//         // create statement 4
//         PreparedStatement pstmt = con.prepareStatement("INSERT INTO table1 VALUES(?,?,?)");
        
//         //excecute query 5
//         // pstmt.setInt(1,1111);
//          pstmt.setString(111,"miky");
//         pstmt.executeUpdate();
//         // close connection 6
//         con.close();
//         System.out.println("DATA INSERTED");
            
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         }
       

//     }
    
// }
import java.sql.*;

public class PreparedStatementDemo {
    public static void main(String[] args) {
        try {
            // 1. Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create Connection
            String url = "jdbc:mysql://localhost:3306/temp1";
            String username = "root";
            String password = "arch@18k";
            Connection con = DriverManager.getConnection(url, username, password);

            // 3. Create PreparedStatement
            PreparedStatement pstmt =
                    con.prepareStatement("INSERT INTO table1 VALUES(?,?,?)");

            // 4. Set values
            pstmt.setInt(1, 111);
            pstmt.setString(2, "miky");
            pstmt.setString(3, "11th");

            // 5. Execute
            pstmt.executeUpdate();

            // 6. Close connection
            con.close();

            System.out.println("DATA INSERTED SUCCESSFULLY");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
