package Interface;
import FabricaDeImoveis.Imovel;
import IteratorDados.DAOImovel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class TelaImoveis extends javax.swing.JFrame {
    /*Creates new form TelaImoveis*/
    public TelaImoveis() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) tb_Imoveis.getModel();
        tb_Imoveis.setRowSorter(new TableRowSorter(modelo));
        atualizarTabela();
    }
    List<Imovel> Imoveis = new ArrayList<>();
    public void atualizarTabela(){
        DefaultTableModel modelo = (DefaultTableModel) tb_Imoveis.getModel();
        modelo.setNumRows(0);
        DAOImovel dao = new DAOImovel();
        Iterator<Imovel> it = dao.listar(); 
        while(it.hasNext()){
            Imovel imovel = it.next();
            modelo.addRow(new Object[]{
                imovel.getTipo(),
                imovel.getNome(),
                imovel.getTamanho(),
                imovel.getValorDoAluguel(),
                imovel.getValorDeVenda()
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Imoveis = new javax.swing.JTable();
        jVoltar = new javax.swing.JButton();
        jAlterar = new javax.swing.JButton();
        jCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        ComboBox_tipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JFormattedTextField();
        jTextField3 = new javax.swing.JFormattedTextField();
        jTextField4 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IMÓVEIS");

        tb_Imoveis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TIPO", "NOME", "TAMANHO", "VALOR DE ALUGUEL", "VALOR DE VENDA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Imoveis.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tb_Imoveis);
        if (tb_Imoveis.getColumnModel().getColumnCount() > 0) {
            tb_Imoveis.getColumnModel().getColumn(0).setResizable(false);
            tb_Imoveis.getColumnModel().getColumn(1).setResizable(false);
            tb_Imoveis.getColumnModel().getColumn(1).setPreferredWidth(260);
            tb_Imoveis.getColumnModel().getColumn(2).setResizable(false);
            tb_Imoveis.getColumnModel().getColumn(3).setResizable(false);
            tb_Imoveis.getColumnModel().getColumn(4).setResizable(false);
        }

        jVoltar.setText("VOLTAR");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        jAlterar.setText("ALTERAR");
        jAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAlterarActionPerformed(evt);
            }
        });

        jCadastrar.setText("CADASTRAR");
        jCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCadastrarActionPerformed(evt);
            }
        });

        jLabel1.setText("TIPO:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        ComboBox_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "< SELECIONE UMA DAS OPÇÕES >", "APARTAMENTO", "CASA" }));
        ComboBox_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_tipoActionPerformed(evt);
            }
        });

        jLabel2.setText("NOME DO IMÓVEL:");

        jLabel3.setText("TAMANHO:");

        jLabel4.setText("VALOR ALUGUEL:");

        jLabel5.setText("VALOR DE VENDA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComboBox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboBox_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jVoltarActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void ComboBox_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_tipoActionPerformed

    private void jCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCadastrarActionPerformed
        Imovel imoveis = new Imovel(){}; // ESTÁ ERRADO TEM QUE ARRUMAR
        try {
            String tipo = ComboBox_tipo.getSelectedItem().toString();
            imoveis.setTipo(tipo);
            imoveis.setNome(jTextField1.getText());
            imoveis.setTamanho(jTextField2.getText()+" M²");
            imoveis.setValorDoAluguel("R$ "+jTextField3.getText());
            imoveis.setValorDeVenda("R$ "+jTextField4.getText());
            // FAZENDO A VALIDAÇÃO DOS DADOS
            if ((ComboBox_tipo.getSelectedItem().equals("< SELECIONE UMA DAS OPÇÕES >")) || (jTextField1.getText().isEmpty()) || (jTextField2.getText().isEmpty()) || (jTextField3.getText().isEmpty()) || (jTextField4.getText().isEmpty())) {JOptionPane.showMessageDialog(null, "OS CAMPOS NÃO PODEM RETORNAR EM BRANCO!");}
            else {
                // instanciando a classe PersistenciaLocatario do pacote dao e criando seu objeto dao
                DAOImovel dao = new DAOImovel();
                dao.cadastrar(imoveis);
                atualizarTabela();
                JOptionPane.showMessageDialog(null, jTextField1.getText()+"\nCADASTRADO COM SUCESSO!");
                
                // APAGA OS DADOS PREENCHIDOS NOS CAMPOS DE TEXTO
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
                // APAGA OS DADOS PREENCHIDOS NOS CAMPOS DE TEXTO
        } catch (Exception e) {JOptionPane.showMessageDialog(this, "Erro a cadastrar","Erro",JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_jCadastrarActionPerformed

    private void jAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAlterarActionPerformed
        Imovel imoveis = new Imovel(){}; // ESTÁ ERRADO TEM QUE ARRUMAR
        try {
            String tipo = ComboBox_tipo.getSelectedItem().toString();
            imoveis.setTipo(tipo);
            imoveis.setNome(jTextField1.getText());
            imoveis.setTamanho(jTextField2.getText()+" M²");
            imoveis.setValorDoAluguel("R$ "+jTextField3.getText());
            imoveis.setValorDeVenda("R$ "+jTextField4.getText());
             // fazendo a validação dos dados
            if ((ComboBox_tipo.getSelectedItem().equals("< SELECIONE UMA DAS OPÇÕES >") || jTextField1.getText().isEmpty()) || (jTextField2.getText().isEmpty()) || (jTextField3.getText().isEmpty()) || (jTextField4.getText().isEmpty())) {JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");}
            else {
                // instanciando a classe LocatarioPersistencia do pacote dao e criando seu objeto dao
                DAOImovel dao = new DAOImovel();
                dao.alterar(imoveis);
                atualizarTabela();
                JOptionPane.showMessageDialog(null, jTextField1.getText()+"\nALTERADO COM SUCESSO!");
                // APAGA OS DADOS PREENCHIDOS NOS CAMPOS DE TEXTO
                jTextField1.setText("");
                jTextField2.setText("");
                jTextField3.setText("");
                jTextField4.setText("");
            }
        } catch (Exception e) {JOptionPane.showMessageDialog(this, "Erro a cadastrar","Erro",JOptionPane.INFORMATION_MESSAGE);}
    }//GEN-LAST:event_jAlterarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaImoveis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaImoveis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox_tipo;
    private javax.swing.JButton jAlterar;
    private javax.swing.JButton jCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JFormattedTextField jTextField2;
    private javax.swing.JFormattedTextField jTextField3;
    private javax.swing.JFormattedTextField jTextField4;
    private javax.swing.JButton jVoltar;
    private javax.swing.JTable tb_Imoveis;
    // End of variables declaration//GEN-END:variables
}
