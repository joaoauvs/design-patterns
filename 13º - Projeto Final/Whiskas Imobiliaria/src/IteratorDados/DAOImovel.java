package IteratorDados;
import FabricaDeImoveis.Imovel;
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

public class DAOImovel{
    Connection con = ConexaoBanco.getConnection();
    // CADASTRAR
    public void cadastrar(Imovel imovel) {
        PreparedStatement stmt = null;
        try {
                stmt = con.prepareStatement("INSERT INTO Imoveis(TIPO,NOME,TAMANHO,VALORDOALUGUEL,VALORDEVENDA) VALUES(?,?,?,?,?)");
                stmt.setString(1, imovel.getTipo());
                stmt.setString(2, imovel.getNome());
                stmt.setString(3, imovel.getTamanho());
                stmt.setString(4, imovel.getValorDoAluguel());
                stmt.setString(5, imovel.getValorDeVenda());
                stmt.execute();
        } catch (SQLException ex) {System.out.println(ex);}
        finally {ConexaoBanco.closeConnection(con, stmt);}
    }
    // ALTERAR
    public void alterar(Imovel imovel) {
        PreparedStatement stmt = null;
        try {
                stmt = con.prepareStatement("UPDATE Imoveis SET TIPO = ?, TAMANHO = ?, VALORDOALUGUEL = ?, VALORDEVENDA  WHERE NOME = ?");
                stmt.setString(1, imovel.getTipo());
                stmt.setString(2, imovel.getTamanho());
                stmt.setString(3, imovel.getValorDoAluguel());
                stmt.setString(4, imovel.getValorDeVenda());
                stmt.setString(5, imovel.getNome());
                stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConexaoBanco.closeConnection(con, stmt);
        }
    }
    // LISTAR
    public Iterator<Imovel> listar() {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Imovel> imoveis = new ArrayList<>();
        try {
            stmt = con.prepareStatement("SELECT * FROM Imoveis");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Imovel imovel = new Imovel() {};
                imovel.setTipo(rs.getString("TIPO"));
                imovel.setNome(rs.getString("NOME"));
                imovel.setTamanho(rs.getString("TAMANHO"));
                imovel.setValorDoAluguel(rs.getString("VALORDOALUGUEL"));
                imovel.setValorDeVenda(rs.getString("VALORDEVENDA"));
                imoveis.add(imovel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOImovel.class.getName()).log(Level.SEVERE, null, ex);
        } finally {ConexaoBanco.closeConnection(con, stmt, rs);}
        return imoveis.iterator();
    }
}