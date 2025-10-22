package SingletonBanco;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexaoBanco {
    public static Connection getConnection(){
        try {
             String dbPath = System.getProperty("user.dir") + "/Banco_de_Dados.db";
             return DriverManager.getConnection("jdbc:sqlite:" + dbPath);
        }catch(SQLException excecao) {throw new RuntimeException(excecao);}
    }
    
    public static void closeConnection(Connection con) {
        try {
            if (con != null) {con.close();}
        }catch (SQLException ex) {Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);}
    }

    public static void closeConnection(Connection con, PreparedStatement stmt) {
        closeConnection(con);
        try {
            if (stmt != null) {stmt.close();}
        }catch (SQLException ex) {Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);}
    }

    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs) {
        closeConnection(con, stmt);
        try {
            if (rs != null) {rs.close();}
        }catch (SQLException ex) {Logger.getLogger(ConexaoBanco.class.getName()).log(Level.SEVERE, null, ex);}
    }
}