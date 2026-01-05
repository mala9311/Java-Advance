import java.sql.*;
public class JDBC {
    public static void main(String[] args) {
        //Load Driver 2
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        // Create Connection 3
        String url = "jdbc:mysql://localhost:3306/COLLEGE";
        String user = "root";
        String password = "arch@18k";  
        Connection con = DriverManager.getConnection(url,user,password);
        //Create statement 4
        Statement stm = con.createStatement();
        //Execute Query 5
        String query = "INSERT INTO STUDENT VALUES(107,'ABC','12th',67,'pass')";
      // String query = "Update STUDENT set Rollno ='111', Name ='cde' where Rollno = '101'";
        stm.executeUpdate(query);
        // close connection 6
        con.close();
        // ##################  TO OUTPUT ON CONSOLE ###############
            System.out.println("Data Inserted");

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       

    }
    
}
