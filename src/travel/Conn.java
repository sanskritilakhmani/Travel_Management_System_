/*JDBC
Java Database Connectivity
Steps :> 
Register Driver Class
Create Connection
Create Statement
Execute Queries
Close Connection

*/

package travel;

import java.sql.*;
public class Conn { //JDBC
    Connection c;
    Statement s;
    public Conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///dbms","root","Saksham"); //Connection string which is stored in Connection interface Object.
            s=c.createStatement();
        }catch(Exception e){
            
        }
    }
    
}
