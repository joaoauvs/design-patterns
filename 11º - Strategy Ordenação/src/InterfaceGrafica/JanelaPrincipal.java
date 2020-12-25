package InterfaceGrafica;
import javax.swing.JOptionPane;
import ClasseDeDados.Aluno;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Persistencia.OrdenarNome;
import Persistencia.OrdenarSobrenome;
import Persistencia.OrdenarCursoNome;
import Persistencia.OrdenarEnfaseNome;
import Persistencia.OrdenarSituacaoCursoNome;
import Persistencia.OrdenarCursoEnfaseNome;
import Persistencia.AlunoPersistenciaTemplateMethod;

public class JanelaPrincipal extends javax.swing.JFrame {

    public JanelaPrincipal() {
        initComponents();
        //setExtendedState(MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableGridAlunos = new javax.swing.JTable();
        ButtonNome = new javax.swing.JToggleButton();
        ButtonSobrenome = new javax.swing.JButton();
        ButtonCursoeNome = new javax.swing.JButton();
        ButtonSituacaoCursoNome = new javax.swing.JButton();
        ButtonEnfaseENome = new javax.swing.JButton();
        ButtonCursoEnfaseNome = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LISTA DE ALUNOS");
        setFocusCycleRoot(false);

        jTableGridAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NOME", "CURSO", "SITUAÇÃO", "ENFASE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableGridAlunos);
        if (jTableGridAlunos.getColumnModel().getColumnCount() > 0) {
            jTableGridAlunos.getColumnModel().getColumn(0).setPreferredWidth(270);
        }

        ButtonNome.setText("NOME");
        ButtonNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNomeActionPerformed(evt);
            }
        });

        ButtonSobrenome.setText("SOBRENOME");
        ButtonSobrenome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSobrenomeActionPerformed(evt);
            }
        });

        ButtonCursoeNome.setText("CURSO E NOME");
        ButtonCursoeNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCursoeNomeActionPerformed(evt);
            }
        });

        ButtonSituacaoCursoNome.setText("SITUAÇÃO, CURSO E NOME");
        ButtonSituacaoCursoNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSituacaoCursoNomeActionPerformed(evt);
            }
        });

        ButtonEnfaseENome.setText("ENFASE E NOME");
        ButtonEnfaseENome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEnfaseENomeActionPerformed(evt);
            }
        });

        ButtonCursoEnfaseNome.setText("CURSO, ENFASE E NOME");
        ButtonCursoEnfaseNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCursoEnfaseNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ButtonSituacaoCursoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonEnfaseENome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonCursoeNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonSobrenome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonCursoEnfaseNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCursoeNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonEnfaseENome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonSituacaoCursoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ButtonCursoEnfaseNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        setSize(new java.awt.Dimension(844, 462));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void imprimirNaGrid(ArrayList<Aluno> dados){
        try{
            DefaultTableModel model =  (DefaultTableModel) jTableGridAlunos.getModel();
            model.setNumRows(0);
            int pos = 0;
            while(pos < dados.size()){
                String[] linha = new String[4];
                Aluno obj = dados.get(pos);
                linha[0]= obj.getNome();
                linha[1]= obj.getCurso();
                linha[2]= obj.getSituacao();
                linha[3]= obj.getEnfase();
                model.addRow(linha);
                pos++;
            }
        }catch(Exception erro){JOptionPane.showMessageDialog(rootPane, erro);}
    }
    private void ButtonNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNomeActionPerformed
        try{
        String nome = "C://Users//joaoa//Google Drive//- Faculdade 2020//TECNOLOGIA DE CONSTRUÇÃO DE SOFTWARE - Eugênio//11º - Strategy Ordenação//src//Arquivo/RelatorioDasEnfases.csv";
        Strategy ordenadoNome = new OrdenarNome();
        AlunoPersistenciaTemplateMethod objeto = new AlunoPersistenciaTemplateMethod(nome,ordenadoNome);
        imprimirNaGrid(objeto.listagem());
        }catch(Exception erro){JOptionPane.showMessageDialog(rootPane, erro);}
    }//GEN-LAST:event_ButtonNomeActionPerformed

    private void ButtonSobrenomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSobrenomeActionPerformed
        try{
        String sobrenome = "C://Users//joaoa//Google Drive//- Faculdade 2020//TECNOLOGIA DE CONSTRUÇÃO DE SOFTWARE - Eugênio//11º - Strategy Ordenação//src//Arquivo/RelatorioDasEnfases.csv";
        Strategy ordenadoSobrenome = new OrdenarSobrenome();
        AlunoPersistenciaTemplateMethod objeto = new AlunoPersistenciaTemplateMethod(sobrenome,ordenadoSobrenome);
        imprimirNaGrid(objeto.listagem());
        }catch(Exception erro){JOptionPane.showMessageDialog(rootPane, erro);}
    }//GEN-LAST:event_ButtonSobrenomeActionPerformed

    private void ButtonCursoeNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCursoeNomeActionPerformed
        try{
        String curso = "C://Users//joaoa//Google Drive//- Faculdade 2020//TECNOLOGIA DE CONSTRUÇÃO DE SOFTWARE - Eugênio//11º - Strategy Ordenação//src//Arquivo/RelatorioDasEnfases.csv";
        Strategy ordenadoCursoeNome = new OrdenarCursoNome();
        AlunoPersistenciaTemplateMethod objeto = new AlunoPersistenciaTemplateMethod(curso,ordenadoCursoeNome);
        imprimirNaGrid(objeto.listagem());
        }catch(Exception erro){JOptionPane.showMessageDialog(rootPane, erro);}
    }//GEN-LAST:event_ButtonCursoeNomeActionPerformed

    private void ButtonEnfaseENomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEnfaseENomeActionPerformed
        try{
        String enfase = "C://Users//joaoa//Google Drive//- Faculdade 2020//TECNOLOGIA DE CONSTRUÇÃO DE SOFTWARE - Eugênio//11º - Strategy Ordenação//src//Arquivo/RelatorioDasEnfases.csv";
        Strategy ordenadoEnfaseeNome = new OrdenarEnfaseNome();
        AlunoPersistenciaTemplateMethod objeto = new AlunoPersistenciaTemplateMethod(enfase,ordenadoEnfaseeNome);
        imprimirNaGrid(objeto.listagem());
        }catch(Exception erro){JOptionPane.showMessageDialog(rootPane, erro);}
    }//GEN-LAST:event_ButtonEnfaseENomeActionPerformed

    private void ButtonSituacaoCursoNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSituacaoCursoNomeActionPerformed
        try{
        String situacao = "C://Users//joaoa//Google Drive//- Faculdade 2020//TECNOLOGIA DE CONSTRUÇÃO DE SOFTWARE - Eugênio//11º - Strategy Ordenação//src//Arquivo/RelatorioDasEnfases.csv";
        Strategy ordenadoSituacaoCursoNome = new OrdenarSituacaoCursoNome();
        AlunoPersistenciaTemplateMethod objeto = new AlunoPersistenciaTemplateMethod(situacao,ordenadoSituacaoCursoNome);
        imprimirNaGrid(objeto.listagem());
        }catch(Exception erro){JOptionPane.showMessageDialog(rootPane, erro);}
    }//GEN-LAST:event_ButtonSituacaoCursoNomeActionPerformed

    private void ButtonCursoEnfaseNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCursoEnfaseNomeActionPerformed
        try{
        String curso = "C://Users//joaoa//Google Drive//- Faculdade 2020//TECNOLOGIA DE CONSTRUÇÃO DE SOFTWARE - Eugênio//11º - Strategy Ordenação//src//Arquivo/RelatorioDasEnfases.csv";
        Strategy ordenadoCursoEnfaseNome = new OrdenarCursoEnfaseNome();
        AlunoPersistenciaTemplateMethod objeto = new AlunoPersistenciaTemplateMethod(curso,ordenadoCursoEnfaseNome);
        imprimirNaGrid(objeto.listagem());
        }catch(Exception erro){JOptionPane.showMessageDialog(rootPane, erro);}
    }//GEN-LAST:event_ButtonCursoEnfaseNomeActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCursoEnfaseNome;
    private javax.swing.JButton ButtonCursoeNome;
    private javax.swing.JButton ButtonEnfaseENome;
    private javax.swing.JToggleButton ButtonNome;
    private javax.swing.JButton ButtonSituacaoCursoNome;
    private javax.swing.JButton ButtonSobrenome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableGridAlunos;
    // End of variables declaration//GEN-END:variables
}