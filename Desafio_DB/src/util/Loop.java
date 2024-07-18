package util;

public class Loop {
    public boolean loopingLimiteChar (String nome, int limite){
        boolean tamanho = nome.length() <= limite && nome.length() > 0;
        return tamanho;
    }
    public boolean loopingNumjtf(String nume, int ref){
        try {
            int numC = 0;
            boolean numB = false, equalzero = false, all = false;
                
            numC = 0;
            for(int i = 0; i < nume.length(); i++){
                if(nume.charAt(i) >= '0' && nume.charAt(i) <= '9'){
                    numC ++;
                }
            }
            numB = numC <= ref;
            equalzero = Integer.parseInt(nume) > 0;
            all = numB && equalzero;
        
            return all;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public boolean loopingNumjftf(String nume, int numMax){
        int num = numMax, numC = 0, soma = 0;
        boolean numB = false;
                
        numC = 0;
        for(int i = 0; i < nume.length(); i++){
            if(nume.charAt(i) >= '0' && nume.charAt(i) <= '9'){
                numC ++;
                soma = Integer.parseInt("0" + nume.charAt(i)) + soma;
            }
        }
        numB = numC >= num && soma != 0;
        
        return numB;
    }
}
