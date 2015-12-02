
package dbHelper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;

/**
 *
 * @author Drake
 */
public class UpdateQuery {
    
    private Connection conn;
    
    public UpdateQuery()  {
        
        Properties props = new Properties(); //MWC
    InputStream instr =getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void doUpdate(Customer member) {
        
        try {
            String query = "UPDATE customers SET firstname = ?, lastname = ?, addr1 = ?, addr2 = ?, city = ?, state = ?, zip = ?, emailAddr = ?, age = ? WHERE custID = ?";
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setString(1, member.getfirstName());
            ps.setString(2, member.getlastName());
            ps.setString(3, member.getaddr1());
            ps.setString(4, member.getaddr2());
            ps.setString(5, member.getCity());
            ps.setString(6, member.getState());
            ps.setString(7, member.getZip());
            ps.setString(8, member.getEmailAddr());
            ps.setInt(9, member.getAge());
            ps.setInt(10, member.getcustID());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UpdateQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }
}
