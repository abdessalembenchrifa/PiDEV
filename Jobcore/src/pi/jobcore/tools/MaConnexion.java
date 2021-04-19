
package pi.jobcore.tools;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MaConnexion {
    
    private String url="jdbc:mysql://localhost:3308/pijava";
    private String user="root";
    private String pwd="";
    private Connection cnx;
    private static MaConnexion ct;
    


    
    
    private MaConnexion() {
        try {
            cnx=DriverManager.getConnection(url,user,pwd);
            System.out.println("Connexion etablie");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
   public static MaConnexion getInstance(){
       
       if(ct==null)
           ct=new MaConnexion();
       return ct;
   }
   public Connection getCnx() {
       return cnx;
    }
    
    
    
    
}
