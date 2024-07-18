package view;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import services.CadastroService;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.EnderecoVO;
import model.PessoaVO;
import util.CalcularIdade;
import util.DataVerify;
import util.Validator;

public class GUIVisualizar extends javax.swing.JFrame {
    DataVerify dv = new DataVerify();
    CalcularIdade idade = new CalcularIdade();
    Validator v = new Validator();

    public GUIVisualizar() {
        initComponents();
        preencher_Pessoas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDados = new javax.swing.JTable();
        jcbPessoas = new javax.swing.JComboBox<>();
        jbtnInfo = new javax.swing.JButton();
        jbtnLimpar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jbtnPreencherTab = new javax.swing.JButton();
        jtfID = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jftfData = new javax.swing.JFormattedTextField();
        jftfCpf = new javax.swing.JFormattedTextField();
        jbtnAlterarDados = new javax.swing.JButton();
        jtfIdade = new javax.swing.JTextField();
        jbtnDeletar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jtfRua = new javax.swing.JTextField();
        jtfBairro = new javax.swing.JTextField();
        jtfCidade = new javax.swing.JTextField();
        jtfEstado = new javax.swing.JTextField();
        jtfNum = new javax.swing.JTextField();
        jftfCep = new javax.swing.JFormattedTextField();
        jbtnAlterarDadosEndereco = new javax.swing.JButton();
        jbtnDeletarEndereco = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jtfIDEndereco = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jbtnAdc = new javax.swing.JButton();
        jbtnLimparEndereco1 = new javax.swing.JButton();
        jrPrincipal = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        close.setBackground(new java.awt.Color(255, 0, 0));
        close.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        close.setText("X");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Visualizar Informações");

        jtDados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Rua", "Número", "Bairro", "Cidade", "Estado", "CEP", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtDados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtDadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtDados);

        jcbPessoas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jbtnInfo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnInfo.setText("Informações");
        jbtnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInfoActionPerformed(evt);
            }
        });

        jbtnLimpar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnLimpar.setText("Limpar");
        jbtnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");
        jLabel2.setToolTipText("");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel3.setText("Data de Nascimento:");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel4.setText("ID:");
        jLabel4.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel5.setText("CPF:");
        jLabel5.setToolTipText("");

        jbtnPreencherTab.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnPreencherTab.setText("Preencher Tabela");
        jbtnPreencherTab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPreencherTabActionPerformed(evt);
            }
        });

        jtfID.setEditable(false);
        jtfID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfID.setFocusable(false);

        jtfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        try {
            jftfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftfData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jftfDataKeyReleased(evt);
            }
        });

        try {
            jftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbtnAlterarDados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnAlterarDados.setText("Alterar Dados");
        jbtnAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarDadosActionPerformed(evt);
            }
        });

        jtfIdade.setEditable(false);
        jtfIdade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfIdade.setFocusable(false);

        jbtnDeletar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnDeletar.setText("Deletar Pessoa");
        jbtnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel6.setText("Rua:");
        jLabel6.setToolTipText("");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel7.setText("Número:");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel8.setText("Bairro:");
        jLabel8.setToolTipText("");

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel9.setText("Cidade:");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel10.setText("Estado:");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel11.setText("CEP:");
        jLabel11.setToolTipText("");

        jtfRua.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtfBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtfCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtfEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jtfNum.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        try {
            jftfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jbtnAlterarDadosEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnAlterarDadosEndereco.setText("Alterar Dados");
        jbtnAlterarDadosEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAlterarDadosEnderecoActionPerformed(evt);
            }
        });

        jbtnDeletarEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnDeletarEndereco.setText("Deletar Dados");
        jbtnDeletarEndereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeletarEnderecoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel12.setText("ID:");
        jLabel12.setToolTipText("");

        jtfIDEndereco.setEditable(false);
        jtfIDEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jtfIDEndereco.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel13.setText("Endereço Principal:");
        jLabel13.setToolTipText("");

        jbtnAdc.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnAdc.setText("Adicionar");
        jbtnAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdcActionPerformed(evt);
            }
        });

        jbtnLimparEndereco1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jbtnLimparEndereco1.setText("Limpar");
        jbtnLimparEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLimparEndereco1ActionPerformed(evt);
            }
        });

        jrPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jrPrincipalMouseClicked(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("(Clique em um valor da tabela para selecionar seus campos)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbtnAlterarDadosEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbtnAdc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jbtnDeletarEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jbtnLimparEndereco1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jftfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jtfNum, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfIDEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrPrincipal))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 9, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(close))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jbtnAlterarDados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnDeletar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jcbPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jbtnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jbtnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbtnPreencherTab)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(close)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnInfo)
                    .addComponent(jbtnLimpar)
                    .addComponent(jbtnPreencherTab))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jftfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAlterarDados)
                    .addComponent(jbtnDeletar))
                .addGap(9, 9, 9)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jtfIDEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jrPrincipal))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jtfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(jtfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jftfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAdc)
                    .addComponent(jbtnLimparEndereco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jtfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnAlterarDadosEndereco)
                    .addComponent(jbtnDeletarEndereco))
                .addGap(29, 29, 29))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void preencher_Pessoas(){
        DefaultComboBoxModel dcbm = new DefaultComboBoxModel();
        dcbm.removeAllElements();
        jcbPessoas.setModel(dcbm);
        CadastroService cs = services.ServiceFactory.getCadastroService();
        try {
            ResultSet rs = cs.getPessoas();
            while(rs.next()){
                jcbPessoas.addItem(rs.getInt("id") + " - " + rs.getString("nome").toUpperCase());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher ComboBox! " + e.getMessage());
        }
    }
    
    public void preencher_Info_Pessoas(){
        CadastroService cs = services.ServiceFactory.getCadastroService();
        String [] id_r = jcbPessoas.getSelectedItem().toString().split(" - ");
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        int id = Integer.parseInt(id_r[0]);
        try {
            ResultSet rs = cs.getInfoPessoas(id);
            while(rs.next()){
                jtfID.setText(Integer.toString(rs.getInt("id")));
                jtfNome.setText(rs.getString("nome"));
                if(rs.getDate("data_nasc") != null){
                    jftfData.setText(dv.DateSQLtoUtil(rs.getDate("data_nasc")));
                    jtfIdade.setText(Integer.toString(idade.Calculo(df.parse(jftfData.getText()))));
                }
                jftfCpf.setText(rs.getString("cpf"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher informações! " + e.getMessage());
        }
    }
    
    public void limpar(){
        jtfID.setText(null);
        jtfNome.setText(null);
        jftfData.setText(null);
        jtfIdade.setText(null);
        jftfCpf.setText(null);
    }
    
    public void preencher_Tabela(){
        CadastroService cs = services.ServiceFactory.getCadastroService();
        try {
            ResultSet rs = cs.getEnderecos(Integer.parseInt(jtfID.getText()));
            DefaultTableModel dtm = (DefaultTableModel) jtDados.getModel();
            int column = 0, row = 1;
            
            while(rs.next()){
                dtm.setNumRows(row);
                
                String tipo = "";
                if(rs.getBoolean("endereco_principal")){
                    tipo = "principal";
                }else{
                    tipo = "secundário";
                }
                
                jtDados.setValueAt(rs.getInt("id"), column, 0);
                jtDados.setValueAt(rs.getString("rua"), column, 1);
                jtDados.setValueAt(rs.getInt("numero"), column, 2);
                jtDados.setValueAt(rs.getString("bairro"), column, 3);
                jtDados.setValueAt(rs.getString("cidade"), column, 4);
                jtDados.setValueAt(rs.getString("estado"), column, 5);
                jtDados.setValueAt(rs.getString("cep"), column, 6);
                jtDados.setValueAt(tipo, column, 7);
                
                row++;
                column++;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao preencher tabela! " + e.getMessage());
        }
    }
    
    public void alterar_DadosP(){
        boolean tudo_ok = true, com_Data = true;
        tudo_ok = v.pessoasInfo(jtfNome.getText(), jftfCpf.getText());
        if(!jtfIdade.getText().isBlank()){
            if(Integer.parseInt(jtfIdade.getText()) < 0 || Integer.parseInt(jtfIdade.getText()) > 150){
                tudo_ok = false;
            }
        }else{
            com_Data = false;
        }
        if(tudo_ok){
            try {
                SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                PessoaVO pvo = new PessoaVO();
                pvo.setNome(jtfNome.getText());
                if(com_Data){
                    pvo.setData_nasc(dv.convertDatatosql(df.parse(jftfData.getText())));
                }
                pvo.setCpf(jftfCpf.getText());
                
                CadastroService cserv = services.ServiceFactory.getCadastroService();
                cserv.alterarDadosP(Integer.parseInt(jtfID.getText()), pvo);
                
                JOptionPane.showMessageDialog(null, "Informações atualizadas com Sucesso!");
                limpar();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro! Revise suas informações.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Informações Inválidas! Preencha corretamente e tente novamente.");
        }
    }
    
    public void deletar(){
        CadastroService cs = services.ServiceFactory.getCadastroService();
        try {
            int id = Integer.parseInt(jtfID.getText());
            cs.deletarP(id);
            cs.deletarEnd(id);
            JOptionPane.showMessageDialog(null, "Pessoa deletada com sucesso!");
            limpar();
            preencher_Pessoas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void adicionar_Endereco(){
        EnderecoVO evo = new EnderecoVO();
        try {
            CadastroService cs = services.ServiceFactory.getCadastroService();
            
            evo.setRua(jtfRua.getText());
            evo.setNumero(Integer.parseInt(jtfNum.getText()));
            evo.setBairro(jtfBairro.getText());
            evo.setCidade(jtfCidade.getText());
            evo.setEstado(jtfEstado.getText());
            evo.setCep(jftfCep.getText());
            evo.setId_p(Integer.parseInt(jtfID.getText()));
            
            if(jrPrincipal.isSelected()){
                evo.setEnd_p(true);
                cs.atualizarEnd(Integer.parseInt(jtfID.getText()));
            }else{
                evo.setEnd_p(false);
            }
            
            cs.cadastrarEndereco(evo);
            
            limpar_Endereco();
            JOptionPane.showMessageDialog(null, "Novo endereço cadastrado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void get_Info_Endereco(){
        jtfIDEndereco.setText(jtDados.getValueAt(jtDados.getSelectedRow(), 0).toString());
        jtfRua.setText((String) jtDados.getValueAt(jtDados.getSelectedRow(), 1));
        jtfNum.setText(jtDados.getValueAt(jtDados.getSelectedRow(), 2).toString());
        jtfBairro.setText((String) jtDados.getValueAt(jtDados.getSelectedRow(), 3));
        jtfCidade.setText((String) jtDados.getValueAt(jtDados.getSelectedRow(), 4));
        jtfEstado.setText((String) jtDados.getValueAt(jtDados.getSelectedRow(), 5));
        jftfCep.setText((String) jtDados.getValueAt(jtDados.getSelectedRow(), 6));
        if(jtDados.getValueAt(jtDados.getSelectedRow(), 7).equals("principal")){
            jrPrincipal.setSelected(true);
            jrPrincipal.setEnabled(false);
        }else{
            jrPrincipal.setSelected(false);
            jrPrincipal.setEnabled(true);
        }
    }
    
    public void limpar_Endereco(){
        jtfIDEndereco.setText(null);
        jtfRua.setText(null);
        jtfBairro.setText(null);
        jtfNum.setText(null);
        jtfCidade.setText(null);
        jtfEstado.setText(null);
        jftfCep.setText(null);
        if(jrPrincipal.isSelected()){
            jrPrincipal.setSelected(false);
        }
        if(!jrPrincipal.isEnabled()){
            jrPrincipal.setEnabled(true);
        }
    }
    
    public void alterar_Dados_Endereco(){
        EnderecoVO evo = new EnderecoVO();
        try {
            CadastroService cs = services.ServiceFactory.getCadastroService();
            
            evo.setRua(jtfRua.getText());
            evo.setNumero(Integer.parseInt(jtfNum.getText()));
            evo.setBairro(jtfBairro.getText());
            evo.setCidade(jtfCidade.getText());
            evo.setEstado(jtfEstado.getText());
            evo.setCep(jftfCep.getText());
            
            if(jrPrincipal.isSelected()){
                evo.setEnd_p(true);
                cs.atualizarEnd(Integer.parseInt(jtfID.getText()));
            }else{
                evo.setEnd_p(false);
            }
            
            cs.atualizarInfoEndereco(Integer.parseInt(jtfIDEndereco.getText()), evo);
            
            limpar_Endereco();
            JOptionPane.showMessageDialog(null, "Endereço atualizado com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void deletar_End(){
        try {
            CadastroService cs = services.ServiceFactory.getCadastroService();
            cs.deletarEndereco(Integer.parseInt(jtfIDEndereco.getText()));
            limpar_Endereco();
            JOptionPane.showMessageDialog(null, "Endereço deletado com sucesso!");
        } catch (Exception e) {
        }
    }
    
    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        GUIPrincipal gp = new GUIPrincipal();
        dispose();
        gp.setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void jbtnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInfoActionPerformed
        preencher_Info_Pessoas();
        limpar_Endereco();
        DefaultTableModel dtm = (DefaultTableModel) jtDados.getModel();
        dtm.setRowCount(1);
        jtDados.setModel(dtm);
    }//GEN-LAST:event_jbtnInfoActionPerformed

    private void jftfDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jftfDataKeyReleased
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try {
            jtfIdade.setText(Integer.toString(idade.Calculo(df.parse(jftfData.getText()))));
        } catch (Exception e) {
        }
        if(evt.getKeyCode() == KeyEvent.VK_BACK_SPACE){
            jtfIdade.setText(null);
            jftfData.setText(null);
        }
    }//GEN-LAST:event_jftfDataKeyReleased

    private void jbtnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jbtnLimparActionPerformed

    private void jbtnPreencherTabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPreencherTabActionPerformed
        if(!jtfID.getText().isBlank()){
            preencher_Tabela();
        }else{
            JOptionPane.showMessageDialog(null, "Primeiro selecione uma pessoa!");
        }
    }//GEN-LAST:event_jbtnPreencherTabActionPerformed

    private void jbtnAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarDadosActionPerformed
        if(!jtfID.getText().isBlank()){
            alterar_DadosP();
        }
    }//GEN-LAST:event_jbtnAlterarDadosActionPerformed

    private void jbtnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarActionPerformed
        if(!jtfID.getText().isBlank()){
            if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja deletar esta pessoa?", "AVISO!", JOptionPane.WARNING_MESSAGE) == JOptionPane.YES_OPTION){
                deletar();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Primeiro selecione uma pessoa!");
        }
    }//GEN-LAST:event_jbtnDeletarActionPerformed

    private void jbtnAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdcActionPerformed
        if(jtfID.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Selecione uma pessoa antes!");
        }else{
            if(!jtfIDEndereco.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "Limpe os campos do endereço antes!");
            }else{
                boolean ok = true;
                ok = v.enderecoInfo(jtfRua.getText(), jtfBairro.getText(), jtfCidade.getText(), jtfEstado.getText(), jtfNum.getText(), jftfCep.getText());
                if(ok){
                    adicionar_Endereco();
                }
            }
        }
    }//GEN-LAST:event_jbtnAdcActionPerformed

    private void jtDadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDadosMouseClicked
        get_Info_Endereco();
    }//GEN-LAST:event_jtDadosMouseClicked

    private void jrPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jrPrincipalMouseClicked
        if(!jrPrincipal.isEnabled()){
            JOptionPane.showMessageDialog(null, "Você precisa ter pelo menos um endereço principal! Ação inválida.");
        }
    }//GEN-LAST:event_jrPrincipalMouseClicked

    private void jbtnLimparEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLimparEndereco1ActionPerformed
        limpar_Endereco();
    }//GEN-LAST:event_jbtnLimparEndereco1ActionPerformed

    private void jbtnAlterarDadosEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAlterarDadosEnderecoActionPerformed
        if(jtfIDEndereco.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Selecione um endereço para alterar clicando na tabela.");
        }else{
            boolean ok = v.enderecoInfo(jtfRua.getText(), jtfBairro.getText(), jtfCidade.getText(), jtfEstado.getText(), jtfNum.getText(), jftfCep.getText());
            if(ok){
                alterar_Dados_Endereco();
            }
        }
    }//GEN-LAST:event_jbtnAlterarDadosEnderecoActionPerformed

    private void jbtnDeletarEnderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeletarEnderecoActionPerformed
        if(jtfIDEndereco.getText().isBlank()){
            JOptionPane.showMessageDialog(null, "Selecione um endereço para deletar clicando na tabela.");
        }else{
            if(jrPrincipal.isSelected()){
                JOptionPane.showMessageDialog(null, "Não é possível deletar seu endereço principal.");
            }else{
                deletar_End();
            }
        }
    }//GEN-LAST:event_jbtnDeletarEnderecoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIVisualizar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnAdc;
    private javax.swing.JButton jbtnAlterarDados;
    private javax.swing.JButton jbtnAlterarDadosEndereco;
    private javax.swing.JButton jbtnDeletar;
    private javax.swing.JButton jbtnDeletarEndereco;
    private javax.swing.JButton jbtnInfo;
    private javax.swing.JButton jbtnLimpar;
    private javax.swing.JButton jbtnLimparEndereco1;
    private javax.swing.JButton jbtnPreencherTab;
    private javax.swing.JComboBox<String> jcbPessoas;
    private javax.swing.JFormattedTextField jftfCep;
    private javax.swing.JFormattedTextField jftfCpf;
    private javax.swing.JFormattedTextField jftfData;
    private javax.swing.JRadioButton jrPrincipal;
    private javax.swing.JTable jtDados;
    private javax.swing.JTextField jtfBairro;
    private javax.swing.JTextField jtfCidade;
    private javax.swing.JTextField jtfEstado;
    private javax.swing.JTextField jtfID;
    private javax.swing.JTextField jtfIDEndereco;
    private javax.swing.JTextField jtfIdade;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JTextField jtfNum;
    private javax.swing.JTextField jtfRua;
    // End of variables declaration//GEN-END:variables
}
