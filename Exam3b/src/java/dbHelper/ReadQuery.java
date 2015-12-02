
package dbHelper;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Customer;


public class ReadQuery {
    private Connection conn;
    private ResultSet results;
    
    
    public ReadQuery(){
    Properties props = new Properties(); //MWC
    InputStream instr =getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead(){
    
        try {
            String query = "Select * from customers";
            
            PreparedStatement ps = conn.prepareStatement(query);
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
            
    public String getHTMLtable(){
    
        String table ="";

        table += "<table>";
                table += "<tr>";
                    table += "<th>custID</th>";
                    table += "<th>firstName</th>";
                    table += "<th>lastName</th>";
                    table += "<th>addr1</th>";
                    table += "<th>addr2</th>";
                    table += "<th>city</th>";
                    table += "<th>state</th>";
                    table += "<th>zip</th>";
                    table += "<th>emailAddr</th>";
                    table += "<th>age</th>";
                table += "</tr>";
 
        try {
            while(this.results.next()){
                
                Customer Members = new Customer();
                Members.setcustID(this.results.getInt("custID"));
                Members.setfirstName(this.results.getString("firstName"));
                Members.setlastName(this.results.getString("lastName"));
                Members.setaddr1(this.results.getString("addr1"));
                Members.setaddr2(this.results.getString("addr2"));
                Members.setCity(this.results.getString("city"));
                Members.setState(this.results.getString("state"));
                Members.setZip(this.results.getString("zip"));
                Members.setEmailAddr(this.results.getString("emailAddr"));
                Members.setAge(this.results.getInt("age"));

                
                table += "<tr>";
                
                table += "<td>";
                table += Members.getcustID();
                table += "</td>";
                
                table += "<td>";
                table += Members.getfirstName();
                table += "</td>";
                
                table += "<td>";
                table += Members.getlastName();
                table += "</td>";
                
                
                table += "<td>";
                table += Members.getaddr1();
                table += "</td>";
                
                
                table += "<td>";
                table += Members.getaddr2();
                table += "</td>";
                
                table += "<td>";
                table += Members.getCity();
                table += "</td>";
                
                table += "<td>";
                table += Members.getState();
                table += "</td>";
                
                table += "<td>";
                table += Members.getZip();
                table += "</td>";
                
                table += "<td>";
                table += Members.getEmailAddr();
                table += "</td>";
                
                table += "<td>";
                table += Members.getAge();
                table += "</td>";
                
                table += "<td id='delete'>";
                table += "<a href=update?memberID=" + Members.getcustID() + "> Update </a>"+"<a href=delete?memberID=" + Members.getcustID() + "> Delete </a>";
                table += "</td>";
                
                table += "</tr>";
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        table += "</table>";  
        
               return table;        
    }
}
