package dao;

import com.mysql.cj.protocol.Resultset;
import java.sql.Connection;
import model.PessoaVO;
import persistencia.ConexaoBanco;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.ResultSet;
import model.EnderecoVO;

public class CadastroDAO {
    public void cadastrarPessoa(PessoaVO pvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO pessoas VALUES (null, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, pvo.getNome());
            pstm.setDate(2, pvo.getData_nasc());
            pstm.setString(3, pvo.getCpf());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public int getPessoaID(String cpf) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id FROM pessoas WHERE cpf = '" + cpf + "';";
            PreparedStatement pstm = con.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            int id = 0;
            while(rs.next()){
                id = rs.getInt("id");
            }
            pstm.close();
            return id;
        } catch (Exception e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void cadastrarEndereco(EnderecoVO evo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "INSERT INTO enderecos VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, evo.getRua());
            pstm.setInt(2, evo.getNumero());
            pstm.setString(3, evo.getBairro());
            pstm.setString(4, evo.getCidade());
            pstm.setString(5, evo.getEstado());
            pstm.setString(6, evo.getCep());
            pstm.setInt(7, evo.getId_p());
            pstm.setBoolean(8, evo.isEnd_p());
            
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public ResultSet getPessoas(){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id, nome FROM pessoas ORDER BY nome;";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public ResultSet getInfoPessoas(int id){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id, nome, data_nasc, cpf FROM pessoas WHERE id = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public ResultSet getEnderecos(int id){
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "SELECT id, rua, numero, bairro, cidade, estado, cep, endereco_principal FROM enderecos WHERE pessoa_id = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            return pstm.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    }
    public void alterarDadosP(int id, PessoaVO pvo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE pessoas SET nome = ?, data_nasc = ?, cpf = ? WHERE id = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, pvo.getNome());
            pstm.setDate(2, pvo.getData_nasc());
            pstm.setString(3, pvo.getCpf());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
    public void deletarP(int id) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "DELETE FROM pessoas WHERE id = " + id + ";", sc0 = "SET FOREIGN_KEY_CHECKS=0 ", sc1 = "SET FOREIGN_KEY_CHECKS=1 ";
            PreparedStatement pstm = con.prepareStatement(sql), pstm1 = con.prepareStatement(sc0), pstm2 = con.prepareStatement(sc1);
            
            pstm1.execute();
            pstm1.close();
            
            pstm.execute();
            pstm.close();
            
            pstm2.execute();
            pstm2.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Pessoa! " + e.getMessage());
        } finally {
            con.close();
        }
    }
    public void deletarEnd(int id) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "DELETE FROM enderecos WHERE pessoa_id = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException("Erro ao deletar Endereço! " + e.getMessage());
        } finally {
            con.close();
        }
    }
    public void atualizarEnd(int id) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE enderecos SET endereco_principal = 0 WHERE pessoa_id = " + id + " AND endereco_principal = 1;";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException();
        } finally {
            con.close();
        }
    }
    public void atualizarInfoEndereco(int id, EnderecoVO evo) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "UPDATE enderecos SET rua = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, cep = ?, endereco_principal = ? WHERE id = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            
            pstm.setString(1, evo.getRua());
            pstm.setInt(2, evo.getNumero());
            pstm.setString(3, evo.getBairro());
            pstm.setString(4, evo.getCidade());
            pstm.setString(5, evo.getEstado());
            pstm.setString(6, evo.getCep());
            pstm.setBoolean(7, evo.isEnd_p());
            
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException();
        } finally {
            con.close();
        }
    }
    public void deletarEndereco(int id) throws SQLException{
        Connection con = new ConexaoBanco().novaConexao();
        try {
            String sql = "DELETE FROM enderecos WHERE id = " + id + ";";
            PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
            pstm.close();
        } catch (SQLException e) {
            throw new SQLException(e.getMessage());
        } finally {
            con.close();
        }
    }
}
