/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proeficiencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static proeficiencia.Tela_Inicial.closeConnection;
import static proeficiencia.Tela_Inicial.getConnection;

/**
 *
 * @author mathe
 */
public class Tela_Visualizar_Reading_Questoes_PrimeiroAno1 extends javax.swing.JFrame {
    String[] enunciados= new String [5];//São as questoes que o professor vai digitar
    String alternativas []= new String [20]; //São as alternativas que o professor vai dar
    /**
     * Creates new form Reading_Questoes_PrimeiroAno
     */
    public Tela_Visualizar_Reading_Questoes_PrimeiroAno1() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        painel_de_guias = new javax.swing.JTabbedPane();
        Texto = new javax.swing.JPanel();
        linha1 = new javax.swing.JLabel();
        linha2 = new javax.swing.JLabel();
        linha3 = new javax.swing.JLabel();
        linha4 = new javax.swing.JLabel();
        linha5 = new javax.swing.JLabel();
        linha6 = new javax.swing.JLabel();
        linha7 = new javax.swing.JLabel();
        linha8 = new javax.swing.JLabel();
        linha9 = new javax.swing.JLabel();
        linha10 = new javax.swing.JLabel();
        linha11 = new javax.swing.JLabel();
        linha12 = new javax.swing.JLabel();
        linha13 = new javax.swing.JLabel();
        linha14 = new javax.swing.JLabel();
        linha15 = new javax.swing.JLabel();
        linha16 = new javax.swing.JLabel();
        enunciado = new javax.swing.JLabel();
        Questões = new javax.swing.JPanel();
        R_5_3 = new javax.swing.JRadioButton();
        R_5_4 = new javax.swing.JRadioButton();
        numero4 = new javax.swing.JLabel();
        terminar = new javax.swing.JButton();
        numero5 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        R_1_1 = new javax.swing.JRadioButton();
        q2 = new javax.swing.JLabel();
        R_1_2 = new javax.swing.JRadioButton();
        q3 = new javax.swing.JLabel();
        R_1_3 = new javax.swing.JRadioButton();
        q4 = new javax.swing.JLabel();
        R_1_4 = new javax.swing.JRadioButton();
        q5 = new javax.swing.JLabel();
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
        jLabel3 = new javax.swing.JLabel();
        R_5_1 = new javax.swing.JRadioButton();
        numero1 = new javax.swing.JLabel();
        R_5_2 = new javax.swing.JRadioButton();
        numero2 = new javax.swing.JLabel();
        numero3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        linha1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        linha1.setText("Carregando");

        linha2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha2.setText("Carregando");

        linha3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha3.setText("Carregando");

        linha4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha4.setText("Carregando");

        linha5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha5.setText("Carregando");

        linha6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha6.setText("Carregando");

        linha7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha7.setText("Carregando");

        linha8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha8.setText("Carregando");

        linha9.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha9.setText("Carregando");

        linha10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha10.setText("Carregando");

        linha11.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha11.setText("Carregando");

        linha12.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha12.setText("Carregando");

        linha13.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha13.setText("Carregando");

        linha14.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha14.setText("Carregando");

        linha15.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha15.setText("Carregando");

        linha16.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        linha16.setText("Carregando");

        enunciado.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        enunciado.setText("Carregando");

        javax.swing.GroupLayout TextoLayout = new javax.swing.GroupLayout(Texto);
        Texto.setLayout(TextoLayout);
        TextoLayout.setHorizontalGroup(
            TextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TextoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(linha12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextoLayout.createSequentialGroup()
                        .addGroup(TextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(linha16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(linha13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TextoLayout.createSequentialGroup()
                                .addGroup(TextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(linha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha8, javax.swing.GroupLayout.DEFAULT_SIZE, 1649, Short.MAX_VALUE)
                                    .addComponent(linha9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(linha15, javax.swing.GroupLayout.PREFERRED_SIZE, 1636, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 17, Short.MAX_VALUE))
                            .addComponent(linha14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(TextoLayout.createSequentialGroup()
                        .addComponent(enunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 1649, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        TextoLayout.setVerticalGroup(
            TextoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TextoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(enunciado)
                .addGap(28, 28, 28)
                .addComponent(linha1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(linha16)
                .addContainerGap())
        );

        painel_de_guias.addTab("Texto", Texto);

        Questões.setMaximumSize(new java.awt.Dimension(32767, 672));
        Questões.setPreferredSize(new java.awt.Dimension(0, 0));

        buttonGroup5.add(R_5_3);
        R_5_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_5_3.setText("Carregando");

        buttonGroup5.add(R_5_4);
        R_5_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_5_4.setText("Carregando");

        numero4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero4.setText("4)");

        terminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        terminar.setText("Terminar");
        terminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminarActionPerformed(evt);
            }
        });

        numero5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero5.setText("5)");

        q1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q1.setText("Carregando");

        buttonGroup1.add(R_1_1);
        R_1_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_1_1.setText("Carregando");

        q2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q2.setText("Carregando");

        buttonGroup1.add(R_1_2);
        R_1_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_1_2.setText("Carregando");

        q3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q3.setText("Carregando");

        buttonGroup1.add(R_1_3);
        R_1_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_1_3.setText("Carregando");

        q4.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q4.setText("Carregando");

        buttonGroup1.add(R_1_4);
        R_1_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_1_4.setText("Carregando");

        q5.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        q5.setText("Carregando");

        buttonGroup2.add(R_2_1);
        R_2_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_2_1.setText("Carregando");

        buttonGroup2.add(R_2_2);
        R_2_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_2_2.setText("Carregando");

        buttonGroup2.add(R_2_3);
        R_2_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_2_3.setText("Carregando");

        buttonGroup2.add(R_2_4);
        R_2_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_2_4.setText("Carregando");

        buttonGroup3.add(R_3_1);
        R_3_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_3_1.setText("Carregando");

        buttonGroup3.add(R_3_2);
        R_3_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_3_2.setText("Carregando");

        buttonGroup3.add(R_3_3);
        R_3_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_3_3.setText("Carregando");

        buttonGroup3.add(R_3_4);
        R_3_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_3_4.setText("Carregando");

        buttonGroup4.add(R_4_1);
        R_4_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_4_1.setText("Carregando");

        buttonGroup4.add(R_4_2);
        R_4_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_4_2.setText("Carregando");

        buttonGroup4.add(R_4_3);
        R_4_3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_4_3.setText("Carregando");

        buttonGroup4.add(R_4_4);
        R_4_4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_4_4.setText("Carregando");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Check the best option according to the text.");

        buttonGroup5.add(R_5_1);
        R_5_1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_5_1.setText("Carregando");

        numero1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero1.setText("1) ");

        buttonGroup5.add(R_5_2);
        R_5_2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        R_5_2.setText("Carregando");

        numero2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero2.setText("2)");

        numero3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        numero3.setText("3)");

        javax.swing.GroupLayout QuestõesLayout = new javax.swing.GroupLayout(Questões);
        Questões.setLayout(QuestõesLayout);
        QuestõesLayout.setHorizontalGroup(
            QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QuestõesLayout.createSequentialGroup()
                .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, QuestõesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(QuestõesLayout.createSequentialGroup()
                                    .addComponent(numero1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(q1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(R_1_1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(R_1_4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(R_1_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R_1_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(QuestõesLayout.createSequentialGroup()
                                    .addComponent(numero2)
                                    .addGap(6, 6, 6)
                                    .addComponent(q2))
                                .addComponent(R_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(R_2_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R_2_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(R_2_4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R_5_1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R_5_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R_5_4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(R_5_2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(QuestõesLayout.createSequentialGroup()
                                .addComponent(numero4)
                                .addGap(6, 6, 6)
                                .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(R_4_1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_4_2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_4_3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_4_4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(QuestõesLayout.createSequentialGroup()
                                .addComponent(numero5)
                                .addGap(6, 6, 6)
                                .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, QuestõesLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3))
                    .addGroup(QuestõesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QuestõesLayout.createSequentialGroup()
                                .addComponent(numero3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(q3))
                            .addComponent(R_3_2, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(R_3_1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(QuestõesLayout.createSequentialGroup()
                                .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(R_3_3, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(R_3_4, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(terminar)))))
                .addGap(258, 258, 258))
        );
        QuestõesLayout.setVerticalGroup(
            QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuestõesLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(QuestõesLayout.createSequentialGroup()
                        .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero1)
                            .addComponent(q1))
                        .addGap(6, 6, 6)
                        .addComponent(R_1_1)
                        .addGap(6, 6, 6)
                        .addComponent(R_1_2)
                        .addGap(6, 6, 6)
                        .addComponent(R_1_3)
                        .addGap(6, 6, 6)
                        .addComponent(R_1_4))
                    .addGroup(QuestõesLayout.createSequentialGroup()
                        .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero4)
                            .addComponent(q4))
                        .addGap(6, 6, 6)
                        .addComponent(R_4_1)
                        .addGap(6, 6, 6)
                        .addComponent(R_4_2)
                        .addGap(6, 6, 6)
                        .addComponent(R_4_3)
                        .addGap(6, 6, 6)
                        .addComponent(R_4_4)))
                .addGap(12, 12, 12)
                .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QuestõesLayout.createSequentialGroup()
                        .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero2)
                            .addComponent(q2))
                        .addGap(12, 12, 12)
                        .addComponent(R_2_1)
                        .addGap(6, 6, 6)
                        .addComponent(R_2_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R_2_3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R_2_4))
                    .addGroup(QuestõesLayout.createSequentialGroup()
                        .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numero5)
                            .addComponent(q5))
                        .addGap(12, 12, 12)
                        .addComponent(R_5_1)
                        .addGap(6, 6, 6)
                        .addComponent(R_5_2)
                        .addGap(6, 6, 6)
                        .addComponent(R_5_3)
                        .addGap(6, 6, 6)
                        .addComponent(R_5_4)))
                .addGap(18, 18, 18)
                .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(QuestõesLayout.createSequentialGroup()
                        .addGroup(QuestõesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(q3)
                            .addComponent(numero3))
                        .addGap(12, 12, 12)
                        .addComponent(R_3_1)
                        .addGap(6, 6, 6)
                        .addComponent(R_3_2)
                        .addGap(6, 6, 6)
                        .addComponent(R_3_3)
                        .addGap(6, 6, 6)
                        .addComponent(R_3_4))
                    .addComponent(terminar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        painel_de_guias.addTab("Questões", Questões);

        getContentPane().add(painel_de_guias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1680, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void terminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminarActionPerformed
        Tela_Editar_Reading_PrimeiroAno abrir = new Tela_Editar_Reading_PrimeiroAno();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_terminarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            carregar_texto();
        } catch (SQLException ex) {
            Logger.getLogger(Tela_Visualizar_Reading_Questoes_PrimeiroAno1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened
    private void carregar_texto() throws SQLException{
        String textos[]= new String [17];
        Connection bd = Tela_Inicial.getConnection();
        int cont=0;
        String query;

        query = "SELECT * FROM tb_reading_texto_primeiro_ano";
        PreparedStatement preparedStmt = bd.prepareStatement(query);
        preparedStmt = bd.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery();
        while(rs.next()){ 
            textos[cont]=rs.getString("texto");
            cont++;
        }
        rs.close();
        preparedStmt.close();
        closeConnection(bd);      
        

        enunciado.setText(textos[0]);
        linha1.setText(textos[1]);
        linha2.setText(textos[2]);
        linha3.setText(textos[3]);
        linha4.setText(textos[4]);
        linha5.setText(textos[5]);
        linha6.setText(textos[6]);
        linha7.setText(textos[7]);
        linha8.setText(textos[8]);
        linha9.setText(textos[9]);
        linha10.setText(textos[10]);
        linha11.setText(textos[11]);
        linha12.setText(textos[12]);
        linha13.setText(textos[13]);
        linha14.setText(textos[14]);
        linha15.setText(textos[15]);
        linha16.setText(textos[16]);
        carregar_questoes();
    }
    private void carregar_questoes() throws SQLException{
        Connection bd = Tela_Inicial.getConnection();
        int cont=0,cont2=0;
        String query;
        bd = getConnection();
        query = "SELECT * FROM tb_readind_questoes_primeiro_ano";
        PreparedStatement preparedStmt = bd.prepareStatement(query);
        preparedStmt = bd.prepareStatement(query);
        ResultSet rs = preparedStmt.executeQuery();
         while(rs.next()){ 
             if(cont<5){
                 enunciados[cont]=rs.getString("questoes");
                 cont++;
             }
             else if(cont>4 && cont2<20){
                 
                 alternativas[cont2]=rs.getString("questoes");
                 cont2++;
             }
         }
         rs.close();
         preparedStmt.close();
         closeConnection(bd);

        
        q1.setText(enunciados[0]);
        q2.setText(enunciados[1]);
        q3.setText(enunciados[2]);
        q4.setText(enunciados[3]);
        q5.setText(enunciados[4]);
        
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
            java.util.logging.Logger.getLogger(Tela_Visualizar_Reading_Questoes_PrimeiroAno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Visualizar_Reading_Questoes_PrimeiroAno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Visualizar_Reading_Questoes_PrimeiroAno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Visualizar_Reading_Questoes_PrimeiroAno1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Tela_Visualizar_Reading_Questoes_PrimeiroAno1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Questões;
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
    private javax.swing.JPanel Texto;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JLabel enunciado;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel linha1;
    private javax.swing.JLabel linha10;
    private javax.swing.JLabel linha11;
    private javax.swing.JLabel linha12;
    private javax.swing.JLabel linha13;
    private javax.swing.JLabel linha14;
    private javax.swing.JLabel linha15;
    private javax.swing.JLabel linha16;
    private javax.swing.JLabel linha2;
    private javax.swing.JLabel linha3;
    private javax.swing.JLabel linha4;
    private javax.swing.JLabel linha5;
    private javax.swing.JLabel linha6;
    private javax.swing.JLabel linha7;
    private javax.swing.JLabel linha8;
    private javax.swing.JLabel linha9;
    private javax.swing.JLabel numero1;
    private javax.swing.JLabel numero2;
    private javax.swing.JLabel numero3;
    private javax.swing.JLabel numero4;
    private javax.swing.JLabel numero5;
    private javax.swing.JTabbedPane painel_de_guias;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JButton terminar;
    // End of variables declaration//GEN-END:variables
}