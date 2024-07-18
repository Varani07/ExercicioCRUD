package services;

import dao.CadastroDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.EnderecoVO;
import model.PessoaVO;

public class CadastroService {
    CadastroDAO cdao = dao.DAOFactory.getCadastrarDAO();
    
    public void cadastrarPessoa(PessoaVO pvo) throws SQLException{
        cdao.cadastrarPessoa(pvo);
    }
    public int getPessoaID(String cpf) throws SQLException{
        return cdao.getPessoaID(cpf);
    }
    public void cadastrarEndereco(EnderecoVO evo) throws SQLException{
        cdao.cadastrarEndereco(evo);
    }
    public ResultSet getPessoas(){
        return cdao.getPessoas();
    }
    public ResultSet getInfoPessoas(int id){
        return cdao.getInfoPessoas(id);
    }
    public ResultSet getEnderecos(int id){
        return cdao.getEnderecos(id);
    }
    public void alterarDadosP(int id, PessoaVO pvo) throws SQLException{
        cdao.alterarDadosP(id, pvo);
    }
    public void deletarP(int id) throws SQLException{
        cdao.deletarP(id);
    }
    public void deletarEnd(int id) throws SQLException{
        cdao.deletarEnd(id);
    }
    public void atualizarEnd(int id) throws SQLException{
        cdao.atualizarEnd(id);
    }
    public void atualizarInfoEndereco(int id, EnderecoVO evo) throws SQLException{
        cdao.atualizarInfoEndereco(id, evo);
    }
    public void deletarEndereco(int id) throws SQLException{
        cdao.deletarEndereco(id);
    }
}
