package dao;

public class DAOFactory {
    private static CadastroDAO cdao = new CadastroDAO();
    
    public static CadastroDAO getCadastrarDAO(){
        return cdao;
    }
}
