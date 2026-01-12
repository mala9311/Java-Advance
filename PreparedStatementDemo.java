import java.sql.*;
import java.util.Scanner;
public class preparedStatementDemo {
    public static final String url = "jdbc:mysql://localhost:3306/temp1";
    public static final String UserName = "root";
    public static final String Password = "arch@18k";

    public static void main(String[] args) {
        try{
        //Load Server 2
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Create Connection 3
        
        Connection con = DriverManager.getConnection(url,UserName,Password);
        //Create Statement 4
        String query = "INSERT INTO table1 VALUES(?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(query);

        //Execute Query 5
        pstmt.setInt(1, 105);
        pstmt.setString(2,"Miky");
        pstmt.setString(3,"12th");
        pstmt.executeUpdate();

        // close Connection 6
        con.close();
        System.out.println("Data Inserted Successfully");

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        
    }
    
}
