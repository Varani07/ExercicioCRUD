package util;

import javax.swing.JOptionPane;

public class Validator {
    Loop loop = new Loop();
    public boolean pessoasInfo(String nome, String cpf){
        boolean ok = true;
        if(!loop.loopingLimiteChar(nome, 100)){
            ok = false;
            JOptionPane.showMessageDialog(null, "Nome inválido!");
        }else{
            if(!loop.loopingNumjftf(cpf, 11)){
                ok = false;
                JOptionPane.showMessageDialog(null, "Cpf inválido!");
            }
        }
        return ok;
    }
    public boolean enderecoInfo(String rua, String bairro, String cidade, String estado, String num, String cep){
        boolean ok = true;
        if(!loop.loopingLimiteChar(rua, 50)){
            ok = false;
            JOptionPane.showMessageDialog(null, "Rua inválida!");
        }else{
            if(!loop.loopingLimiteChar(bairro, 30)){
                ok = false;
                JOptionPane.showMessageDialog(null, "Bairro inválido!");
            }else{
                if(!loop.loopingLimiteChar(cidade, 50)){
                    ok = false;
                    JOptionPane.showMessageDialog(null, "Cidade inválida!");
                }else{
                    if(!loop.loopingLimiteChar(estado, 50)){
                        ok = false;
                        JOptionPane.showMessageDialog(null, "Estado inválido!");
                    }else{
                        if(!loop.loopingNumjtf(num, 6)){
                            ok = false;
                            JOptionPane.showMessageDialog(null, "Número residencial inválido!");
                        }else{
                            if(!loop.loopingNumjftf(cep, 8)){
                                ok = false;
                                JOptionPane.showMessageDialog(null, "Cep inválido!");
                            }
                        }
                    }
                }
            }
        }
        return ok;
    }
}
