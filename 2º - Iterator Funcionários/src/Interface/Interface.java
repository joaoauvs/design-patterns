package Interface;
import EstruturasDeDados.Pilha;
import EstruturasDeDados.Fila;
import EstruturasDeDados.Array;
import Iterator.Funcionarios;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

public class Interface extends javax.swing.JFrame {
    
    public Interface() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BFila = new javax.swing.JButton();
        BArray = new javax.swing.JButton();
        BPilha = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Blimpar = new javax.swing.JButton();

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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BFila.setText("Fila");
        BFila.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFilaActionPerformed(evt);
            }
        });

        BArray.setText("Array");
        BArray.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArrayActionPerformed(evt);
            }
        });

        BPilha.setText("Pilha");
        BPilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPilhaActionPerformed(evt);
            }
        });

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NOME", "DEPARTAMENTO", "SALÁRIO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabela);

        Blimpar.setText("Limpar");
        Blimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BFila)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BArray)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BPilha)
                        .addGap(176, 176, 176)
                        .addComponent(Blimpar))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BFila, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BArray)
                    .addComponent(BPilha)
                    .addComponent(Blimpar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void imprimirDadosNaGrid(Iterator iterator){
        String ColunaA,ColunaB,ColunaC;
        DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
        while(iterator.hasNext()){
                Funcionarios objetoAluno = (Funcionarios)iterator.next();
                ColunaA=objetoAluno.getNome();
                ColunaB=objetoAluno.getDepartamento();
                ColunaC=objetoAluno.getSalario();
                model.addRow(new String[]{ColunaA,ColunaB,ColunaC});
            }
    }
    private void BArrayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArrayActionPerformed
       //array
        Array array = new Array();
        imprimirDadosNaGrid(array.LerArray());
    }//GEN-LAST:event_BArrayActionPerformed

    private void BFilaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFilaActionPerformed
        //fila
        Fila fila = new Fila();
        imprimirDadosNaGrid(fila.LerFila());
    }//GEN-LAST:event_BFilaActionPerformed

    private void BPilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPilhaActionPerformed
       //Pilha
       Pilha pilha = new Pilha();
       imprimirDadosNaGrid(pilha.LerPilha());
    }//GEN-LAST:event_BPilhaActionPerformed

    private void BlimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlimparActionPerformed
       DefaultTableModel model = (DefaultTableModel) Tabela.getModel();
       model.setNumRows(0);
        
    }//GEN-LAST:event_BlimparActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Interface().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BArray;
    private javax.swing.JButton BFila;
    private javax.swing.JButton BPilha;
    private javax.swing.JButton Blimpar;
    private javax.swing.JTable Tabela;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
