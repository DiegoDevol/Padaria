
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home(String nome, String nivel) {
        initComponents();
        textoNome.setText(nome);
        Textonivel.setText(nivel);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        Janela = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        textoNome = new javax.swing.JLabel();
        Textonivel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Painel1 = new javax.swing.JPanel();
        Img_Vendas = new javax.swing.JLabel();
        Vendas_Label = new javax.swing.JLabel();
        Painel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Painel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        setBackground(new java.awt.Color(102, 102, 102));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Diego Devol");

        textoNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoNome.setText("Aqui vai o nome do Usuário");

        Textonivel.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        Textonivel.setText("Nivel");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel1.setText("-");

        Painel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Painel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Painel1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Painel1MouseMoved(evt);
            }
        });
        Painel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Painel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Painel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Painel1MouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                Painel1MouseReleased(evt);
            }
        });

        Img_Vendas.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Projeto-Padaria\\IMG\\LOGO-VENDAS.png")); // NOI18N
        Img_Vendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Img_Vendas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Img_VendasMouseMoved(evt);
            }
        });
        Img_Vendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Img_VendasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Img_VendasMouseEntered(evt);
            }
        });

        Vendas_Label.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Vendas_Label.setText("VENDAS");
        Vendas_Label.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Vendas_Label.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Vendas_LabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Vendas_LabelMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout Painel1Layout = new javax.swing.GroupLayout(Painel1);
        Painel1.setLayout(Painel1Layout);
        Painel1Layout.setHorizontalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Img_Vendas, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Painel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Vendas_Label)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        Painel1Layout.setVerticalGroup(
            Painel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Img_Vendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Vendas_Label)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Painel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Painel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Painel2MouseMoved(evt);
            }
        });
        Painel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Painel2MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("PRODUTOS");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel3MouseMoved(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Projeto-Padaria\\IMG\\LOGO-PRODUTOS.png")); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Painel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(23, 23, 23))
        );

        Painel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Painel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                Painel3MouseMoved(evt);
            }
        });
        Painel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Painel3MouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("CAIXA");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\diego.amorim\\Desktop\\PROJETOS\\MY\\PADARIA\\Projeto-Padaria\\IMG\\LOGO-CAIXA.png")); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel6MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout Painel3Layout = new javax.swing.GroupLayout(Painel3);
        Painel3.setLayout(Painel3Layout);
        Painel3Layout.setHorizontalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel3Layout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addGroup(Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Painel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5))
                    .addComponent(jLabel6))
                .addGap(24, 24, 24))
        );
        Painel3Layout.setVerticalGroup(
            Painel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Painel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(22, 22, 22))
        );

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("PONTOS ");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setText("FUNCIONÁRIOS");

        javax.swing.GroupLayout JanelaLayout = new javax.swing.GroupLayout(Janela);
        Janela.setLayout(JanelaLayout);
        JanelaLayout.setHorizontalGroup(
            JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JanelaLayout.createSequentialGroup()
                .addGap(0, 175, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(175, 175, 175))
            .addGroup(JanelaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(Painel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(Painel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Painel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(JanelaLayout.createSequentialGroup()
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(textoNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Textonivel))
                    .addGroup(JanelaLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel7)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JanelaLayout.setVerticalGroup(
            JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JanelaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoNome)
                    .addComponent(jLabel1)
                    .addComponent(Textonivel))
                .addGap(48, 48, 48)
                .addGroup(JanelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Painel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Painel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 117, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(0, 0, 0)
                .addComponent(jLabel8)
                .addGap(34, 34, 34)
                .addComponent(jLabel4))
        );

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jMenuItem1.setText("Fechar Caixa");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        sair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu1.add(sair);

        jMenuBar1.add(jMenu1);
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Janela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Janela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
          dispose();
      new Caixa(textoNome.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
      
     int trocaUsuario = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja trocar de usúario ?", "Atenção!", JOptionPane.YES_NO_OPTION);
    if (trocaUsuario == JOptionPane.YES_OPTION){
       dispose();
       new Login().setVisible(true);
    } 
                
    }//GEN-LAST:event_sairActionPerformed

    
    private void Img_VendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Img_VendasMouseClicked
       
         dispose();
        try {
            new NovasVendas(textoNome.getText() , Textonivel.getText()).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_Img_VendasMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         dispose();
     
            new NovosProdutos(textoNome.getText() , Textonivel.getText()).setVisible(true);
       
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
      dispose();
      new Caixa(textoNome.getText() , Textonivel.getText()).setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void Vendas_LabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vendas_LabelMouseClicked
      dispose();
        try {
            new NovasVendas(textoNome.getText() , Textonivel.getText()).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Vendas_LabelMouseClicked

    private void Painel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel1MouseClicked
        dispose();
        try {
            new NovasVendas(textoNome.getText() , Textonivel.getText()).setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Painel1MouseClicked

    private void Painel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel1MouseEntered
      
    }//GEN-LAST:event_Painel1MouseEntered

    private void Painel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel1MouseExited
       Painel1.setBackground(Janela.getBackground());
    }//GEN-LAST:event_Painel1MouseExited

    private void Painel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel1MouseReleased
      
    }//GEN-LAST:event_Painel1MouseReleased

    private void Painel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel1MouseMoved
       Painel1.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_Painel1MouseMoved

    private void Painel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel1MouseDragged
    
    }//GEN-LAST:event_Painel1MouseDragged

    private void Vendas_LabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Vendas_LabelMouseEntered
        Painel1.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_Vendas_LabelMouseEntered

    private void Img_VendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Img_VendasMouseEntered
      
    }//GEN-LAST:event_Img_VendasMouseEntered

    private void Img_VendasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Img_VendasMouseMoved
        Painel1.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_Img_VendasMouseMoved

    private void Painel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel2MouseMoved
       Painel2.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_Painel2MouseMoved

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        Painel2.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseMoved
        Painel2.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_jLabel3MouseMoved

    private void Painel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel2MouseExited
       Painel2.setBackground(Janela.getBackground());
    }//GEN-LAST:event_Painel2MouseExited

    private void jLabel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseMoved
       Painel3.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_jLabel6MouseMoved

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
       Painel3.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void Painel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel3MouseMoved
       Painel3.setBackground(new Color(0,102,51));
    }//GEN-LAST:event_Painel3MouseMoved

    private void Painel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Painel3MouseExited
        Painel3.setBackground(Janela.getBackground());
    }//GEN-LAST:event_Painel3MouseExited

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Img_Vendas;
    private javax.swing.JPanel Janela;
    private javax.swing.JPanel Painel1;
    private javax.swing.JPanel Painel2;
    private javax.swing.JPanel Painel3;
    private javax.swing.JLabel Textonivel;
    private javax.swing.JLabel Vendas_Label;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem sair;
    private javax.swing.JLabel textoNome;
    // End of variables declaration//GEN-END:variables


}