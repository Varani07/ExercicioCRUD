package services;

public class ServiceFactory {
    private static CadastroService cserv = new CadastroService();
    
    public static CadastroService getCadastroService(){
        return cserv;
    }
}
