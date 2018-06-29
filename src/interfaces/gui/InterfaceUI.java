/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.DefaultCaret;
import legentrolls.Mapa;

/**
 *
 * @author JV
 */
public class InterfaceUI extends javax.swing.JFrame {
        private Font customFont;
        private static InterfaceUI interfaceUI;
        private static Mapa mapa;
        private static int tempoContador;
        private int complemento;
        private boolean travaThread = false;

    public int getComplemento() {
        return complemento;
    }

    public void setComplemento(int complemento) {
        this.complemento = complemento;
    }

    public boolean isTravaThread() {
        return travaThread;
    }

    public void setTravaThread(boolean travaThread) {
        this.travaThread = travaThread;
    }
        
        
        
        
        public InterfaceUI(Mapa map) {
                this.mapa = map;
                configurarVisualWindows();
                configurarFontePersonalizada();
                initComponents();
                DefaultCaret caret = (DefaultCaret)saidaTextArea.getCaret();
                caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
        }
        
        public static synchronized InterfaceUI getInstance(){
                if(interfaceUI == null){
                        interfaceUI = new InterfaceUI(mapa);
                }
                return interfaceUI;
        }
        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        widgetPanel = new javax.swing.JPanel();
        itemPanel = new javax.swing.JPanel();
        salaPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        salaAtualLabel = new javax.swing.JLabel();
        contadorPanel = new javax.swing.JPanel();
        contador = new javax.swing.JLabel();
        itemsPanel = new javax.swing.JPanel();
        goldPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        goldLabel = new javax.swing.JLabel();
        diamPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        diamLabel = new javax.swing.JLabel();
        machadosPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        machadosLabel = new javax.swing.JLabel();
        pocoesPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pocoesLabel = new javax.swing.JLabel();
        chavesPanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        chavesLabel = new javax.swing.JLabel();
        saidaPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        saidaTextArea = new javax.swing.JTextArea();
        entradaPanel = new javax.swing.JPanel();
        entradaTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                interfaceWindowOpened(evt);
            }
        });

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
            .addGap(0, 382, Short.MAX_VALUE)
        );
        itemPanelLayout.setVerticalGroup(
            itemPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        salaPanel.setBackground(new java.awt.Color(0, 0, 0));
        salaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 0));
        jLabel7.setText("Sala Atual:");

        salaAtualLabel.setFont(customFont);
        salaAtualLabel.setForeground(new java.awt.Color(0, 255, 0));
        salaAtualLabel.setText("0");

        javax.swing.GroupLayout salaPanelLayout = new javax.swing.GroupLayout(salaPanel);
        salaPanel.setLayout(salaPanelLayout);
        salaPanelLayout.setHorizontalGroup(
            salaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
            .addComponent(salaAtualLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
        );
        salaPanelLayout.setVerticalGroup(
            salaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(salaPanelLayout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salaAtualLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE))
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
                .addComponent(contador, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
        );
        contadorPanelLayout.setVerticalGroup(
            contadorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
        );

        itemsPanel.setBackground(new java.awt.Color(0, 0, 0));
        itemsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        itemsPanel.setForeground(new java.awt.Color(0, 255, 0));

        goldPanel.setBackground(new java.awt.Color(0, 0, 0));
        goldPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        goldPanel.setForeground(new java.awt.Color(0, 255, 0));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 0));
        jLabel2.setText("Gold:");

        goldLabel.setFont(customFont);
        goldLabel.setForeground(new java.awt.Color(0, 255, 0));
        goldLabel.setText("0");

        javax.swing.GroupLayout goldPanelLayout = new javax.swing.GroupLayout(goldPanel);
        goldPanel.setLayout(goldPanelLayout);
        goldPanelLayout.setHorizontalGroup(
            goldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(goldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
        );
        goldPanelLayout.setVerticalGroup(
            goldPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(goldPanelLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(goldLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
        );

        diamPanel.setBackground(new java.awt.Color(0, 0, 0));
        diamPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        diamPanel.setForeground(new java.awt.Color(0, 255, 0));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 0));
        jLabel3.setText("Diamantes:");

        diamLabel.setFont(customFont);
        diamLabel.setForeground(new java.awt.Color(0, 255, 0));
        diamLabel.setText("0");

        javax.swing.GroupLayout diamPanelLayout = new javax.swing.GroupLayout(diamPanel);
        diamPanel.setLayout(diamPanelLayout);
        diamPanelLayout.setHorizontalGroup(
            diamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
            .addComponent(diamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        diamPanelLayout.setVerticalGroup(
            diamPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diamPanelLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diamLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        machadosPanel.setBackground(new java.awt.Color(0, 0, 0));
        machadosPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        machadosPanel.setForeground(new java.awt.Color(0, 255, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 0));
        jLabel4.setText("Machados:");

        machadosLabel.setFont(customFont);
        machadosLabel.setForeground(new java.awt.Color(0, 255, 0));
        machadosLabel.setText("0");

        javax.swing.GroupLayout machadosPanelLayout = new javax.swing.GroupLayout(machadosPanel);
        machadosPanel.setLayout(machadosPanelLayout);
        machadosPanelLayout.setHorizontalGroup(
            machadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
            .addComponent(machadosLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        machadosPanelLayout.setVerticalGroup(
            machadosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(machadosPanelLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(machadosLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pocoesPanel.setBackground(new java.awt.Color(0, 0, 0));
        pocoesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        pocoesPanel.setForeground(new java.awt.Color(0, 255, 0));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 0));
        jLabel5.setText("Poções:");

        pocoesLabel.setFont(customFont);
        pocoesLabel.setForeground(new java.awt.Color(0, 255, 0));
        pocoesLabel.setText("0");

        javax.swing.GroupLayout pocoesPanelLayout = new javax.swing.GroupLayout(pocoesPanel);
        pocoesPanel.setLayout(pocoesPanelLayout);
        pocoesPanelLayout.setHorizontalGroup(
            pocoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
            .addComponent(pocoesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pocoesPanelLayout.setVerticalGroup(
            pocoesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pocoesPanelLayout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pocoesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chavesPanel.setBackground(new java.awt.Color(0, 0, 0));
        chavesPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 0)));
        chavesPanel.setForeground(new java.awt.Color(0, 255, 0));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 0));
        jLabel6.setText("Chaves:");

        chavesLabel.setFont(customFont);
        chavesLabel.setForeground(new java.awt.Color(0, 255, 0));
        chavesLabel.setText("0");

        javax.swing.GroupLayout chavesPanelLayout = new javax.swing.GroupLayout(chavesPanel);
        chavesPanel.setLayout(chavesPanelLayout);
        chavesPanelLayout.setHorizontalGroup(
            chavesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(chavesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        chavesPanelLayout.setVerticalGroup(
            chavesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chavesPanelLayout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chavesLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout itemsPanelLayout = new javax.swing.GroupLayout(itemsPanel);
        itemsPanel.setLayout(itemsPanelLayout);
        itemsPanelLayout.setHorizontalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addComponent(goldPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(diamPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addComponent(machadosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pocoesPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chavesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        itemsPanelLayout.setVerticalGroup(
            itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(itemsPanelLayout.createSequentialGroup()
                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(goldPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(diamPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(itemsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pocoesPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(machadosPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chavesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout widgetPanelLayout = new javax.swing.GroupLayout(widgetPanel);
        widgetPanel.setLayout(widgetPanelLayout);
        widgetPanelLayout.setHorizontalGroup(
            widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(widgetPanelLayout.createSequentialGroup()
                .addGap(392, 392, 392)
                .addComponent(itemsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(widgetPanelLayout.createSequentialGroup()
                    .addComponent(itemPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 405, Short.MAX_VALUE)
                    .addGroup(widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(contadorPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        widgetPanelLayout.setVerticalGroup(
            widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(itemsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(widgetPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(itemPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(widgetPanelLayout.createSequentialGroup()
                    .addComponent(salaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(contadorPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        saidaPanel.setBackground(new java.awt.Color(0, 0, 0));
        saidaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));
        saidaPanel.setForeground(new java.awt.Color(0, 255, 0));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);

        saidaTextArea.setEditable(false);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );

        entradaPanel.setBackground(new java.awt.Color(0, 0, 0));
        entradaPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 0), 1, true));
        entradaPanel.setForeground(new java.awt.Color(0, 255, 0));

        entradaTextField.setBackground(new java.awt.Color(0, 0, 0));
        entradaTextField.setForeground(new java.awt.Color(0, 255, 0));
        entradaTextField.setBorder(null);
        entradaTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                entradaTextFieldKeyPressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setForeground(new java.awt.Color(0, 255, 0));
        jLabel1.setText(" $ ");

        javax.swing.GroupLayout entradaPanelLayout = new javax.swing.GroupLayout(entradaPanel);
        entradaPanel.setLayout(entradaPanelLayout);
        entradaPanelLayout.setHorizontalGroup(
            entradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(entradaPanelLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 940, Short.MAX_VALUE))
            .addGroup(entradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, entradaPanelLayout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(entradaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 942, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        entradaPanelLayout.setVerticalGroup(
            entradaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
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
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saidaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(entradaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(widgetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(widgetPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saidaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(entradaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private void entradaTextFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_entradaTextFieldKeyPressed
                if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
                        String comando = InterfaceUI.getInstance().entradaTextField.getText();
                        InterfaceUI.getInstance().escreverSaida(comando);
                        mapa.idCmd(comando);
                        InterfaceUI.getInstance().entradaTextField.setText("");
                        
                 }
        }//GEN-LAST:event_entradaTextFieldKeyPressed

        private void interfaceWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_interfaceWindowOpened
                entradaTextField.requestFocus();
        }//GEN-LAST:event_interfaceWindowOpened

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
        
        public void zerarContador(){
            InterfaceUI.getInstance().setTravaThread(false);
        }
        
        public static void atualizarStatus(){
            InterfaceUI.getInstance().goldLabel.setText(Integer.toString(mapa.getPlayer().getBag().getQtdeOuro()));
            InterfaceUI.getInstance().diamLabel.setText(Integer.toString(mapa.getPlayer().getBag().getQtdeDiam()));
            InterfaceUI.getInstance().salaAtualLabel.setText(Integer.toString(mapa.getPlayer().getPosicao()));
            InterfaceUI.getInstance().machadosLabel.setText(Integer.toString(mapa.getPlayer().getBag().getMachado()));
            InterfaceUI.getInstance().pocoesLabel.setText(Integer.toString(mapa.getPlayer().getBag().getQtdePocao()));
            InterfaceUI.getInstance().chavesLabel.setText(Integer.toString(mapa.getPlayer().getBag().getQtdeChave()));
            InterfaceUI.getInstance().validate();
        }
        
           public static void alterarContador(int tempoDeResposta) {
                tempoContador = tempoDeResposta;
                InterfaceUI.getInstance().setTravaThread(true);
                /*
                new Thread() {
                    @Override
                    public void run() {
                    */
                        while (tempoContador > 0 && InterfaceUI.getInstance().isTravaThread()) {
                            //InterfaceUI.getInstance().escreverSaida(InterfaceUI.getInstance().isTravaThread()+"");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                
                            }
                            tempoContador -= 1000;
                            if (tempoContador / 1000 > 5) {
                                InterfaceUI.getInstance().contador.setForeground(Color.yellow);
                            } else {
                                InterfaceUI.getInstance().contador.setForeground(Color.red);
                            }
                            String num = "" ;
                            if(tempoContador / 1000 < 10){
                                num = "0"+tempoContador/1000;
                            }else{
                                num = ""+tempoContador/1000;
                            }
                            InterfaceUI.getInstance().contador.setText("00:"+num);
                        }
                        
                        InterfaceUI.getInstance().contador.setForeground(Color.green);
                        InterfaceUI.getInstance().contador.setText("00:00");
                        InterfaceUI.getInstance().validate();
                        //escreverSaida("entrouuuuuuu ");
                        
                   // }
                //}.start();
            }
        
        public void iniciarUI() {
            java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                            InterfaceUI interfaceUI = InterfaceUI.getInstance();
                            interfaceUI.setTitle("LegenTrolls");
                            interfaceUI.setResizable(false);
                            interfaceUI.setVisible(true);
                    }
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel chavesLabel;
    public javax.swing.JPanel chavesPanel;
    public javax.swing.JLabel contador;
    private javax.swing.JPanel contadorPanel;
    public javax.swing.JLabel diamLabel;
    public javax.swing.JPanel diamPanel;
    private javax.swing.JPanel entradaPanel;
    public javax.swing.JTextField entradaTextField;
    public javax.swing.JLabel goldLabel;
    public javax.swing.JPanel goldPanel;
    public javax.swing.JPanel itemPanel;
    private javax.swing.JPanel itemsPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel machadosLabel;
    public javax.swing.JPanel machadosPanel;
    private javax.swing.JPanel mainPanel;
    public javax.swing.JLabel pocoesLabel;
    public javax.swing.JPanel pocoesPanel;
    public javax.swing.JPanel saidaPanel;
    public javax.swing.JTextArea saidaTextArea;
    public javax.swing.JLabel salaAtualLabel;
    public javax.swing.JPanel salaPanel;
    private javax.swing.JPanel widgetPanel;
    // End of variables declaration//GEN-END:variables
}
