package IteratorDados;
import SingletonBanco.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DAOLocatario {
    // CADASTRAR
    Connection con = ConexaoBanco.getConnection();
    public void cadastrar(Locatario locatario) { 
        PreparedStatement stmt = null;
        try {
                stmt = con.prepareStatement("INSERT INTO Locatario(CPF,NOME,TELEFONE,EMAIL) VALUES(?,?,?,?)");
                stmt.setString(1, locatario.getCpf());
                stmt.setString(2, locatario.getNome());
                stmt.setString(3, locatario.getTelefone());
                stmt.setString(4, locatario.getEmail());
                stmt.execute();
        } catch (SQLException ex) {System.out.println(ex);}
        finally {ConexaoBanco.closeConnection(con, stmt);}
    }
    // ALTERAR
    public void alterar(Locatario locatario) {
        PreparedStatement stmt = null;
        try {
                stmt = con.prepareStatement("UPDATE Locatario SET NOME = ?, TELEFONE = ?, EMAIL = ? WHERE CPF = ?");
                stmt.setString(1, locatario.getNome());
                stmt.setString(2, locatario.getTelefone());
                stmt.setString(3, locatario.getEmail());
                stmt.setString(4, locatario.getCpf());
                stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
    //LISTAR
    public Iterator<Locatario> listar() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Locatario> locatarios = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Locatario");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Locatario locatario = new Locatario();
                locatario.setCpf(rs.getString("CPF"));
                locatario.setNome(rs.getString("NOME"));
                locatario.setTelefone(rs.getString("TELEFONE"));
                locatario.setEmail(rs.getString("EMAIL"));
                locatarios.add(locatario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOLocatario.class.getName()).log(Level.SEVERE, null, ex);
        } finally {ConexaoBanco.closeConnection(con, stmt, rs);}
        return locatarios.iterator();
    }
}