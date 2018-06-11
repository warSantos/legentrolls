/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.gui;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author JV
 */
public class InterfaceUI extends javax.swing.JFrame {
        private Font customFont;
        private static InterfaceUI interfaceUI;
        
        public InterfaceUI() {
                configurarVisualWindows();
                configurarFontePersonalizada();
                initComponents();
        }
        
        public static synchronized InterfaceUI getInstance(){
                if(interfaceUI == null){
                        interfaceUI = new InterfaceUI();
                }
                return interfaceUI;
        }
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                mainPanel = new javax.swing.JPanel();
                widgetPanel = new javax.swing.JPanel();
                itemPanel = new javax.swing.JPanel();
                goldPanel = new javax.swing.JPanel();
                contadorPanel = new javax.swing.JPanel();
                contador = new javax.swing.JLabel();
                saidaPanel = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                saidaTextArea = new javax.swing.JTextArea();
                entradaPanel = new javax.swing.JPanel();
                entradaTextField = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(0, 0, 0));

                mainPanel.setBackground(new java.awt.Color(0, 0, 0));
                mainPanel.setForeground(new java.awt.Color(0, 255, 0));

                widgetPanel.setBackground(new java.awt.Color(0, 0, 0));
                widgetPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
                widgetPanel.setForeground(new java.awt.Color(0, 255, 0));

                itemPanel.setBackground(new java.awt.Color(0, 0, 0));
                itemPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));

                javax.swing.GroupLayout itemPanelLayout = new javax.swing.GroupLayout(itemPanel);
                itemPanel.setLayout(itemPanelLayout);
                itemPanelLayout.setHorizontalGroup(
                        itemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 243, Short.MAX_VALUE)
                );
                itemPanelLayout.setVerticalGroup(
                        itemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 78, Short.MAX_VALUE)
                );

                goldPanel.setBackground(new java.awt.Color(0, 0, 0));
                goldPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));

                javax.swing.GroupLayout goldPanelLayout = new javax.swing.GroupLayout(goldPanel);
                goldPanel.setLayout(goldPanelLayout);
                goldPanelLayout.setHorizontalGroup(
                        goldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 455, Short.MAX_VALUE)
                );
                goldPanelLayout.setVerticalGroup(
                        goldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 78, Short.MAX_VALUE)
                );

                contadorPanel.setBackground(new java.awt.Color(0, 0, 0));
                contadorPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));

                contador.setBackground(new java.awt.Color(0, 0, 0));
                contador.setFont(customFont);
                contador.setForeground(new java.awt.Color(0, 255, 0));

                javax.swing.GroupLayout contadorPanelLayout = new javax.swing.GroupLayout(contadorPanel);
                contadorPanel.setLayout(contadorPanelLayout);
                contadorPanelLayout.setHorizontalGroup(
                        contadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contadorPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(contador, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                );
                contadorPanelLayout.setVerticalGroup(
                        contadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(contador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                );

                javax.swing.GroupLayout widgetPanelLayout = new javax.swing.GroupLayout(widgetPanel);
                widgetPanel.setLayout(widgetPanelLayout);
                widgetPanelLayout.setHorizontalGroup(
                        widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 856, Short.MAX_VALUE)
                        .addGroup(widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(widgetPanelLayout.createSequentialGroup()
                                        .addComponent(itemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(goldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(contadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                );
                widgetPanelLayout.setVerticalGroup(
                        widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 80, Short.MAX_VALUE)
                        .addGroup(widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(itemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(goldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(contadorPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                saidaPanel.setBackground(new java.awt.Color(0, 0, 0));
                saidaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));
                saidaPanel.setForeground(new java.awt.Color(0, 255, 0));

                jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
                jScrollPane1.setBorder(null);

                saidaTextArea.setBackground(new java.awt.Color(0, 0, 0));
                saidaTextArea.setColumns(20);
                saidaTextArea.setForeground(new java.awt.Color(0, 255, 0));
                saidaTextArea.setRows(5);
                saidaTextArea.setBorder(null);
                jScrollPane1.setViewportView(saidaTextArea);

                javax.swing.GroupLayout saidaPanelLayout = new javax.swing.GroupLayout(saidaPanel);
                saidaPanel.setLayout(saidaPanelLayout);
                saidaPanelLayout.setHorizontalGroup(
                        saidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                );
                saidaPanelLayout.setVerticalGroup(
                        saidaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
                );

                entradaPanel.setBackground(new java.awt.Color(0, 0, 0));
                entradaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));
                entradaPanel.setForeground(new java.awt.Color(0, 255, 0));

                entradaTextField.setBackground(new java.awt.Color(0, 0, 0));
                entradaTextField.setForeground(new java.awt.Color(0, 255, 0));
                entradaTextField.setText(">");
                entradaTextField.setBorder(null);

                javax.swing.GroupLayout entradaPanelLayout = new javax.swing.GroupLayout(entradaPanel);
                entradaPanel.setLayout(entradaPanelLayout);
                entradaPanelLayout.setHorizontalGroup(
                        entradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 858, Short.MAX_VALUE)
                        .addGroup(entradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(entradaPanelLayout.createSequentialGroup()
                                        .addComponent(entradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 837, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                );
                entradaPanelLayout.setVerticalGroup(
                        entradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 25, Short.MAX_VALUE)
                        .addGroup(entradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entradaPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(entradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                );

                javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
                mainPanel.setLayout(mainPanelLayout);
                mainPanelLayout.setHorizontalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(saidaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(widgetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(entradaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                mainPanelLayout.setVerticalGroup(
                        mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(mainPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(widgetPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saidaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(entradaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void configurarVisualWindows(){
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                                if ("Windows".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {

                } catch (InstantiationException ex) {

                } catch (IllegalAccessException ex) {

                } catch (javax.swing.UnsupportedLookAndFeelException ex) {

                }
        }
        
        private void configurarFontePersonalizada(){
                customFont = null;
            try {
                    //create the font to use. Specify the size!
                    String path = System.getProperty("user.dir") +"/src/interfaces/font/DS-DIGI.TTF";
                    customFont = Font.createFont(Font.TRUETYPE_FONT, new File(path)).deriveFont(60f);
                    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    //register the font
                    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File(path)));
            } catch (IOException e) {
                    System.err.println("Erro ao abrir arquivo de fonte.\nPrograma encerrado.");
                    System.exit(0);
            } catch(FontFormatException e) {
                     System.err.println("Erro ao ler arquivo de fonte.\nPrograma encerrado.");
                    System.exit(0);
            }
        }
        
        public static void escreverSaida(String texto){
                InterfaceUI.getInstance().saidaTextArea.append(texto+"\n");
        }
        
        public void iniciarUI() {
            java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                            InterfaceUI interfaceUI = InterfaceUI.getInstance();
                            interfaceUI.setTitle("LegenTrolls");
                            interfaceUI.setVisible(true);
                    }
            });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        public javax.swing.JLabel contador;
        private javax.swing.JPanel contadorPanel;
        private javax.swing.JPanel entradaPanel;
        public javax.swing.JTextField entradaTextField;
        public javax.swing.JPanel goldPanel;
        public javax.swing.JPanel itemPanel;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JPanel mainPanel;
        public javax.swing.JPanel saidaPanel;
        public javax.swing.JTextArea saidaTextArea;
        private javax.swing.JPanel widgetPanel;
        // End of variables declaration//GEN-END:variables
}
