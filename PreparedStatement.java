import java.sql.*;
public class PreparedStatement {
    public static void main(String[] args) {
        try {
             Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/temp1";
        String Username = "root";
        String password ="arch@18k";
        Connection con = DriverManager.getConnection(url,Username,password);
        Statement stm =con.createStatement();
        String query ="INSERT INTO table1 VALUES(111,'ASK','11TH')";
        stm.executeQuery(query);
        con.close();
        System.out.println("DATA INSERTED");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
       

    }
    
}
