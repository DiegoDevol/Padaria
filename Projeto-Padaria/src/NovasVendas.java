
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class NovasVendas extends javax.swing.JFrame {

    /**
     * Creates new form NovasVendas
     */
    public NovasVendas(String nome, String nivel) throws IOException {
        initComponents();
        valor.setText("0");
        TextName.setText(nome);
        Textonivel.setText(nivel);
        CodigoBarra.requestFocus();
        
    }
    private DefaultListModel model = new DefaultListModel();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TextName = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Estoque = new javax.swing.JLabel();
        Produto = new javax.swing.JLabel();
        PrimeiroPreco = new javax.swing.JLabel();
        Preco = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        CodigoBarra = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Quantidade = new javax.swing.JTextField();
        Avancar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Produtos = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Precos = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Estoques = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        valor = new javax.swing.JLabel();
        caixa = new javax.swing.JLabel();
        cpf = new javax.swing.JLabel();
        Tcpf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        JLista = new javax.swing.JList<>();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Finalizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Pago = new javax.swing.JTextField();
        BTroco = new javax.swing.JButton();
        Troco = new javax.swing.JLabel();
        Textonivel = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        TextName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        TextName.setText("Nome do Operador");

        Estoque.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        Produto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        PrimeiroPreco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        Preco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Vendas"));

        jLabel4.setBackground(new java.awt.Color(153, 153, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Código de Barras");

        CodigoBarra.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        CodigoBarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoBarraActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Quantidade");
        jLabel3.setToolTipText("");

        Quantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        Avancar.setBackground(new java.awt.Color(153, 153, 255));
        Avancar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Avancar.setText("Avançar");
        Avancar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvancarActionPerformed(evt);
            }
        });

        Produtos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Produtos.setText("Produtos");

        Precos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Precos.setText("Preço");

        Estoques.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Estoques.setText("Estoque");

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        valor.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        valor.setText("Valor");

        caixa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        caixa.setText("0");

        cpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cpf.setText("CPF");

        Tcpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Projeto-Padaria\\src\\img\\ICON-PRODUTOS.png")); // NOI18N
        jLabel11.setToolTipText("");

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Projeto-Padaria\\src\\img\\ICON-ESTOQUE.png")); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Projeto-Padaria\\src\\img\\ICON-VALOR.png")); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Projeto-Padaria\\src\\img\\ICON-PRECO.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(46, 46, 46))
                            .addComponent(jLabel11)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addComponent(jLabel14)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Precos)
                            .addComponent(Estoques)
                            .addComponent(Produtos))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Tcpf)
                            .addComponent(CodigoBarra)
                            .addComponent(Quantidade)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(Avancar)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cpf))
                                .addGap(0, 152, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(52, 52, 52)
                        .addComponent(valor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(caixa)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(cpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tcpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CodigoBarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Quantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(Avancar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addGap(16, 16, 16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(Produtos))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(Estoques))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(Precos))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel16))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(valor)
                                    .addComponent(caixa))))
                        .addContainerGap(45, Short.MAX_VALUE))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Produtos"));

        Lista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(Lista);
        if (Lista.getColumnModel().getColumnCount() > 0) {
            Lista.getColumnModel().getColumn(0).setResizable(false);
            Lista.getColumnModel().getColumn(1).setResizable(false);
            Lista.getColumnModel().getColumn(2).setResizable(false);
        }

        JLista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(JLista);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 748, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Pagamento"));

        Finalizar.setBackground(new java.awt.Color(153, 153, 255));
        Finalizar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Finalizar.setText("Finalizar");
        Finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Pago Pelo Cliente");

        Pago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        BTroco.setBackground(new java.awt.Color(153, 153, 255));
        BTroco.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        BTroco.setText("Troco");
        BTroco.setToolTipText("");
        BTroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTrocoActionPerformed(evt);
            }
        });

        Troco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Troco.setText("Troco");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(BTroco))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Troco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Finalizar))
                    .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(221, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Troco)
                    .addComponent(Finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        Textonivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Textonivel.setText("nivel");
        Textonivel.setToolTipText("");

        jLabel15.setText("jLabel15");

        jMenuBar1.setBackground(new java.awt.Color(153, 153, 255));

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem1.setText("Início");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jMenuItem2.setText("Produtos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextName)
                            .addComponent(Textonivel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addGap(24, 24, 24)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Produto)
                            .addComponent(jLabel9)
                            .addComponent(Preco)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(437, 437, 437)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(362, 362, 362)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(801, 801, 801)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(PrimeiroPreco)
                                                .addComponent(Estoque))))))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(208, 208, 208))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(83, 83, 83)
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, 0)
                                        .addComponent(Produto)
                                        .addGap(0, 0, 0)
                                        .addComponent(Preco))
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TextName, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Textonivel))
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(51, 51, 51)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PrimeiroPreco)
                            .addComponent(Estoque))
                        .addGap(78, 78, 78))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        dispose();
        new Home(TextName.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        dispose();
        new NovosProdutos(TextName.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void AvancarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvancarActionPerformed
       
       valor.setText(String.valueOf(0));
        
              try{
                
           try{
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(NovosProdutos.class.getName()).log(Level.SEVERE, null, ex);     
           }
          
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_padaria", "root", "060100");
          PreparedStatement stmt = null;
          stmt = con.prepareStatement("SELECT Nome, Preco, Quantidade FROM produtos where CodigoBarra = ?");
           if (CodigoBarra.getText().trim().equals("") && Quantidade.getText().trim().equals("")) {
                JOptionPane.showMessageDialog(null, "Preencha algo no campo do nome do produto");
            } else {
          stmt.setString(1, CodigoBarra.getText());
            
          ResultSet rs = null;
          rs = stmt.executeQuery();
          
          while (rs.next() ) {
              
              Produtos.setText(rs.getString("Nome"));
              Precos.setText(rs.getString("Preco"));
              Estoques.setText(rs.getString("Quantidade"));
              
         }
          
          rs.close();
          stmt.close();
          con.close();
           }
           
                   if(Integer.parseInt(Estoques.getText()) <= 5){
            JOptionPane.showMessageDialog(null, "ATENÇÃO!! PEÇA ACABANDO NO ESTOQUE");
        } else if (Integer.parseInt(Estoques.getText()) <= 1){
            JOptionPane.showMessageDialog(null, "PRODUTO SEM UNIDADES NO ESTOQUE!!!");
        }
              
     
         
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERROO!!");
            throw new RuntimeException("Erro na conexão com o banco", erro);
        }
              
               //ATUALIZANDO O VALOR
        Double valor2 = Double.parseDouble(valor.getText());
        Double soma = (Double.parseDouble(Precos.getText()) * Integer.parseInt(Quantidade.getText()));
        valor.setText("" + (soma + valor2));
                   
        
        //ADICIONANDO NA TABELA
        String nomes = Produtos.getText();
        String qntd = Quantidade.getText();
        String Preco = valor.getText();
        
        DefaultTableModel Tabela = (DefaultTableModel) Lista.getModel();
          
        Tabela.addRow(new String[]{nomes, qntd, Preco});
             
        
        
        
        //ATUALIZANDO O CAIXA DIÁRIO
      Double caixaDiario = Double.parseDouble(valor.getText()) + Double.parseDouble(caixa.getText());
         caixa.setText(String.valueOf(caixaDiario));
              
              CodigoBarra.setText("");
              Quantidade.setText("");
              CodigoBarra.requestFocus();
              cpf.setText("");
              
              JLista.setModel(model);
        
        model.addElement(Tcpf.getText());
              
        
        try {
            FileWriter fw = new FileWriter("teste.txt");
            PrintWriter pw = new PrintWriter(fw);
            pw.print(this.Tcpf.getText() + " " + Produtos.getText() + " " + Quantidade.getText() + " " + valor.getText());
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(NovasVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }//GEN-LAST:event_AvancarActionPerformed

    private void BTrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTrocoActionPerformed
     
       double troco = Double.parseDouble(Pago.getText()) - Double.parseDouble(valor.getText());
       Troco.setText("" + troco);
        
    }//GEN-LAST:event_BTrocoActionPerformed

    private void FinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarActionPerformed

            JLista.removeAll();
                             try{
                 
           try{
               Class.forName("com.mysql.jdbc.Driver");
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(NovosProdutos.class.getName()).log(Level.SEVERE, null, ex);     
           }
          Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_padaria", "root", "060100");
          PreparedStatement stmt = null;
          stmt = con.prepareStatement("UPDATE produtos SET Quantidade = ? where CodigoBarra = ?");
           
          { 
          int testando = Integer.parseInt(Estoques.getText()) - Integer.parseInt(Quantidade.getText());
          
          stmt.setString(1, String.valueOf(testando));
          stmt.setString(2, CodigoBarra.getText());
          
          Produtos.setText("");
          CodigoBarra.setText("");
          Quantidade.setText("");
          Precos.setText("");
          Estoques.setText("");
          valor.setText("");
          Pago.setText("");
          Troco.setText("");
           
          
          
          stmt.executeUpdate();

                stmt.close();
                con.close();
           }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ERROO!!");
            throw new RuntimeException("Erro na conexão com o banco", erro);
        }
                             
        

            
           
           try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NovosProdutos.class.getName()).log(Level.SEVERE, null, ex);
            }
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_padaria", "root", "060100");
            PreparedStatement stmt = null;
            stmt = con.prepareStatement("UPDATE caixa_diario SET valor = ?");
            {
                stmt.setString(1, caixa.getText());
 
                stmt.executeUpdate();

                stmt.close();
                con.close();
            }
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Produto não atualizado");
            throw new RuntimeException("Erro na conexão com o banco", erro);
        }
           
            
           
           
    }//GEN-LAST:event_FinalizarActionPerformed

    private void CodigoBarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoBarraActionPerformed
 
    }//GEN-LAST:event_CodigoBarraActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avancar;
    private javax.swing.JButton BTroco;
    private javax.swing.JTextField CodigoBarra;
    private javax.swing.JLabel Estoque;
    private javax.swing.JLabel Estoques;
    private javax.swing.JButton Finalizar;
    private javax.swing.JList<String> JLista;
    private javax.swing.JTable Lista;
    private javax.swing.JTextField Pago;
    private javax.swing.JLabel Preco;
    private javax.swing.JLabel Precos;
    private javax.swing.JLabel PrimeiroPreco;
    private javax.swing.JLabel Produto;
    private javax.swing.JLabel Produtos;
    private javax.swing.JTextField Quantidade;
    private javax.swing.JTextField Tcpf;
    private javax.swing.JLabel TextName;
    private javax.swing.JLabel Textonivel;
    private javax.swing.JLabel Troco;
    private javax.swing.JLabel caixa;
    private javax.swing.JLabel cpf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel valor;
    // End of variables declaration//GEN-END:variables


}
