package proeficiencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author matheus
 */
public class Tela_Visualizar_ListeningPrimeiroAno1 extends javax.swing.JFrame {
    String[] questoes_do_professor= new String [5];//São as questoes que o professor vai digitar
    String alternativas []= new String [20]; //São as alternativas que o professor vai dar
    
    public Tela_Visualizar_ListeningPrimeiroAno1() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Grupo_Resposta_1 = new javax.swing.ButtonGroup();
        Grupo_Resposta_2 = new javax.swing.ButtonGroup();
        Grupo_Resposta_3 = new javax.swing.ButtonGroup();
        Grupo_Resposta_4 = new javax.swing.ButtonGroup();
        Grupo_Resposta_5 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        numero1 = new javax.swing.JLabel();
        numero2 = new javax.swing.JLabel();
        numero3 = new javax.swing.JLabel();
        numero4 = new javax.swing.JLabel();
        numero5 = new javax.swing.JLabel();
        R_1_1 = new javax.swing.JRadioButton();
        R_1_2 = new javax.swing.JRadioButton();
        R_1_3 = new javax.swing.JRadioButton();
        R_1_4 = new javax.swing.JRadioButton();
        R_2_1 = new javax.swing.JRadioButton();
        R_2_2 = new javax.swing.JRadioButton();
        R_2_3 = new javax.swing.JRadioButton();
        R_2_4 = new javax.swing.JRadioButton();
        R_3_1 = new javax.swing.JRadioButton();
        R_3_2 = new javax.swing.JRadioButton();
        R_3_3 = new javax.swing.JRadioButton();
        R_3_4 = new javax.swing.JRadioButton();
        R_4_1 = new javax.swing.JRadioButton();
        R_4_2 = new javax.swing.JRadioButton();
        R_4_3 = new javax.swing.JRadioButton();
        R_4_4 = new javax.swing.JRadioButton();
        R_5_1 = new javax.swing.JRadioButton();
        R_5_2 = new javax.swing.JRadioButton();
        R_5_3 = new javax.swing.JRadioButton();
        R_5_4 = new javax.swing.JRadioButton();
        botaoFinalizar = new javax.swing.JButton();
        q1 = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Listening 1° ano");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Check the best option according to the audio.");

        numero1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero1.setText("1) ");

        numero2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero2.setText("2)");

        numero3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero3.setText("3)");

        numero4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero4.setText("4)");

        numero5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero5.setText("5)");

        Grupo_Resposta_1.add(R_1_1);
        R_1_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_1_1.setText("Carregando");

        Grupo_Resposta_1.add(R_1_2);
        R_1_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_1_2.setText("Carregando");

        Grupo_Resposta_1.add(R_1_3);
        R_1_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_1_3.setText("Carregando");

        Grupo_Resposta_1.add(R_1_4);
        R_1_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_1_4.setText("Carregando");

        Grupo_Resposta_2.add(R_2_1);
        R_2_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_2_1.setText("Carregando");

        Grupo_Resposta_2.add(R_2_2);
        R_2_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_2_2.setText("Carregando");

        Grupo_Resposta_2.add(R_2_3);
        R_2_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_2_3.setText("Carregando");

        Grupo_Resposta_2.add(R_2_4);
        R_2_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_2_4.setText("Carregando");

        Grupo_Resposta_3.add(R_3_1);
        R_3_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_3_1.setText("Carregando");

        Grupo_Resposta_3.add(R_3_2);
        R_3_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_3_2.setText("Carregando");

        Grupo_Resposta_3.add(R_3_3);
        R_3_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_3_3.setText("Carregando");

        Grupo_Resposta_3.add(R_3_4);
        R_3_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_3_4.setText("Carregando");

        Grupo_Resposta_4.add(R_4_1);
        R_4_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_4_1.setText("Carregando");

        Grupo_Resposta_4.add(R_4_2);
        R_4_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_4_2.setText("Carregando");

        Grupo_Resposta_4.add(R_4_3);
        R_4_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_4_3.setText("Carregando");

        Grupo_Resposta_4.add(R_4_4);
        R_4_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_4_4.setText("Carregando");

        Grupo_Resposta_5.add(R_5_1);
        R_5_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_5_1.setText("Carregando");

        Grupo_Resposta_5.add(R_5_2);
        R_5_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_5_2.setText("Carregando");

        Grupo_Resposta_5.add(R_5_3);
        R_5_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_5_3.setText("Carregando");

        Grupo_Resposta_5.add(R_5_4);
        R_5_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_5_4.setText("Carregando");

        botaoFinalizar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        botaoFinalizar.setText("Finalizar");
        botaoFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFinalizarActionPerformed(evt);
            }
        });

        q1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q1.setText("Carregando");

        q2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q2.setText("Carregando");

        q3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q3.setText("Carregando");

        q4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q4.setText("Carregando");

        q5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q5.setText("Carregando");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(R_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_5_2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_5_3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_5_4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_2_4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_2_2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R_2_1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(numero1)
                            .addGap(6, 6, 6)
                            .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(numero2)
                            .addGap(6, 6, 6)
                            .addComponent(q2))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(numero3)
                            .addGap(6, 6, 6)
                            .addComponent(q3))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(numero4)
                            .addGap(6, 6, 6)
                            .addComponent(q4))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(botaoFinalizar))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(R_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(R_1_3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(R_1_2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(R_1_1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(R_5_1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(numero5)
                                    .addGap(6, 6, 6)
                                    .addComponent(q5))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero1)
                    .addComponent(q1))
                .addGap(6, 6, 6)
                .addComponent(R_1_1)
                .addGap(6, 6, 6)
                .addComponent(R_1_2)
                .addGap(6, 6, 6)
                .addComponent(R_1_3)
                .addGap(6, 6, 6)
                .addComponent(R_1_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero2)
                    .addComponent(q2))
                .addGap(12, 12, 12)
                .addComponent(R_2_1)
                .addGap(6, 6, 6)
                .addComponent(R_2_2)
                .addGap(6, 6, 6)
                .addComponent(R_2_3)
                .addGap(6, 6, 6)
                .addComponent(R_2_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero3)
                    .addComponent(q3))
                .addGap(12, 12, 12)
                .addComponent(R_3_1)
                .addGap(6, 6, 6)
                .addComponent(R_3_2)
                .addGap(6, 6, 6)
                .addComponent(R_3_3)
                .addGap(6, 6, 6)
                .addComponent(R_3_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero4)
                    .addComponent(q4))
                .addGap(6, 6, 6)
                .addComponent(R_4_1)
                .addGap(6, 6, 6)
                .addComponent(R_4_2)
                .addGap(6, 6, 6)
                .addComponent(R_4_3)
                .addGap(6, 6, 6)
                .addComponent(R_4_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numero5)
                    .addComponent(q5))
                .addGap(12, 12, 12)
                .addComponent(R_5_1)
                .addGap(6, 6, 6)
                .addComponent(R_5_2)
                .addGap(6, 6, 6)
                .addComponent(R_5_3)
                .addGap(6, 6, 6)
                .addComponent(R_5_4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoFinalizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            pegar_bd();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Visualizar_ListeningPrimeiroAno1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened
    private void pegar_bd() throws SQLException{
        Connection bd;
        int cont=0,cont2=0;
        String query;
        bd = Tela_Inicial.getConnection();
        query = "SELECT * FROM tb_listening_primeiro_ano";
        PreparedStatement preparedStmt = bd.prepareStatement(query);
        preparedStmt = bd.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery();
        while(rs.next()){ 
            if(cont<5){
                questoes_do_professor[cont]=rs.getString("questoe_enunciados_respostas");
                cont++;
            }
            else if(cont>=5 && cont<25){
                alternativas[cont2]=rs.getString("questoe_enunciados_respostas");
                cont2++;
                cont++;
            }
        }
        rs.close();
        preparedStmt.close();
        Tela_Inicial.closeConnection(bd);
        organizar_questoes();
    }
    private void organizar_questoes(){
        q1.setText(questoes_do_professor[0]);
        q2.setText(questoes_do_professor[1]);
        q3.setText(questoes_do_professor[2]);
        q4.setText(questoes_do_professor[3]);
        q5.setText(questoes_do_professor[4]);
        
        R_1_1.setText(alternativas[0]);
        R_1_2.setText(alternativas[1]);
        R_1_3.setText(alternativas[2]);
        R_1_4.setText(alternativas[3]);
        
        R_2_1.setText(alternativas[4]);
        R_2_2.setText(alternativas[5]);
        R_2_3.setText(alternativas[6]);
        R_2_4.setText(alternativas[7]);
        
        R_3_1.setText(alternativas[8]);
        R_3_2.setText(alternativas[9]);
        R_3_3.setText(alternativas[10]);
        R_3_4.setText(alternativas[11]);
        
        R_4_1.setText(alternativas[12]);
        R_4_2.setText(alternativas[13]);
        R_4_3.setText(alternativas[14]);
        R_4_4.setText(alternativas[15]);
        
        R_5_1.setText(alternativas[16]);
        R_5_2.setText(alternativas[17]);
        R_5_3.setText(alternativas[18]);
        R_5_4.setText(alternativas[19]); 
    }
    private void botaoFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFinalizarActionPerformed
        Tela_Editar_PrimeiroAno abrir = new Tela_Editar_PrimeiroAno();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botaoFinalizarActionPerformed


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
            java.util.logging.Logger.getLogger(Tela_Visualizar_ListeningPrimeiroAno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Visualizar_ListeningPrimeiroAno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Visualizar_ListeningPrimeiroAno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Visualizar_ListeningPrimeiroAno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Visualizar_ListeningPrimeiroAno1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Grupo_Resposta_1;
    private javax.swing.ButtonGroup Grupo_Resposta_2;
    private javax.swing.ButtonGroup Grupo_Resposta_3;
    private javax.swing.ButtonGroup Grupo_Resposta_4;
    private javax.swing.ButtonGroup Grupo_Resposta_5;
    private javax.swing.JRadioButton R_1_1;
    private javax.swing.JRadioButton R_1_2;
    private javax.swing.JRadioButton R_1_3;
    private javax.swing.JRadioButton R_1_4;
    private javax.swing.JRadioButton R_2_1;
    private javax.swing.JRadioButton R_2_2;
    private javax.swing.JRadioButton R_2_3;
    private javax.swing.JRadioButton R_2_4;
    private javax.swing.JRadioButton R_3_1;
    private javax.swing.JRadioButton R_3_2;
    private javax.swing.JRadioButton R_3_3;
    private javax.swing.JRadioButton R_3_4;
    private javax.swing.JRadioButton R_4_1;
    private javax.swing.JRadioButton R_4_2;
    private javax.swing.JRadioButton R_4_3;
    private javax.swing.JRadioButton R_4_4;
    private javax.swing.JRadioButton R_5_1;
    private javax.swing.JRadioButton R_5_2;
    private javax.swing.JRadioButton R_5_3;
    private javax.swing.JRadioButton R_5_4;
    private javax.swing.JButton botaoFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel numero1;
    private javax.swing.JLabel numero2;
    private javax.swing.JLabel numero3;
    private javax.swing.JLabel numero4;
    private javax.swing.JLabel numero5;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    // End of variables declaration//GEN-END:variables

}