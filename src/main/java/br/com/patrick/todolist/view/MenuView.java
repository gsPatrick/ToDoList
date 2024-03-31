
package br.com.patrick.todolist.view;

import br.com.patrick.todolist.controller.MetodosTarefaController;
import br.com.patrick.todolist.model.MetodosTarefaModel;
import br.com.patrick.todolist.model.TarefasModel;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Patrick
 */
public class MenuView extends javax.swing.JFrame {
    
    private List<JLabel> titulo;
    private List<JLabel> descricao;
    private int indice;
    

        private MetodosTarefaController metodoscontroller;
         private MetodosTarefaModel metodosTarefaModel;

    public MenuView() {
        initComponents();

         metodosTarefaModel = new MetodosTarefaModel(); // Inicializa o modelo
         metodoscontroller = new MetodosTarefaController(metodosTarefaModel); // Instancia o controlador
         pegarDados(); // Chama a função para carregar os dados das tarefas
    
        
     
        
        titulo = new ArrayList<>();
        descricao = new ArrayList<>();
        indice = 0;
    }
    
    public void atualizarView() {
     pegarDados();
}
    
    public void removerCustomPanel(CustomPanel customPanel) {
    panelLista.remove(customPanel);
    panelLista.revalidate();
    panelLista.repaint();
}

   
    
public void pegarDados() {
    List<TarefasModel> tarefas = metodoscontroller.obterTodasTarefas();
    for (TarefasModel tarefa : tarefas) {
        int id = tarefa.getId();
        String titulo = tarefa.getTitulo();
        String descricao = tarefa.getDescricao();

        // Cria um novo CustomPanel com os parâmetros título, descrição, id e a referência do MenuView
        CustomPanel customPanel = new CustomPanel(this, id, titulo, descricao);

        // Adiciona o customPanel ao jPanel2
        panelLista.add(customPanel);
    }
}
    
public void criarListaDeContatos(String titulo, String descricao) {
       
    // Cria um novo CustomPanel com os parâmetros título e descrição
  //  CustomPanel customPanel = new CustomPanel(id,titulo, descricao);
    
    // Adiciona o customPanel ao jPanel2
  //  panelLista.add(customPanel);
    
  //  // Atualiza o jPanel2
  //  panelLista.revalidate();
   // panelLista.repaint();
}


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        panelLista = new javax.swing.JPanel();
        btnNotificação = new javax.swing.JButton();
        btnLupa = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(33, 33, 33));

        label3.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("Tarefas");

        jButton1.setBackground(new java.awt.Color(33, 33, 33));
        jButton1.setForeground(new java.awt.Color(33, 33, 33));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Patrick\\Desktop\\TrickMan\\Imagens\\Group 48095710.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setDefaultCapable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        panelLista.setBackground(new java.awt.Color(33, 33, 33));
        panelLista.setForeground(new java.awt.Color(40, 40, 40));
        panelLista.setFocusable(false);
        panelLista.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane2.setViewportView(panelLista);

        btnNotificação.setBackground(new java.awt.Color(33, 33, 33));
        btnNotificação.setIcon(new javax.swing.ImageIcon("C:\\Users\\Patrick\\Downloads\\bell.png")); // NOI18N
        btnNotificação.setBorder(null);
        btnNotificação.setBorderPainted(false);
        btnNotificação.setContentAreaFilled(false);
        btnNotificação.setDefaultCapable(false);
        btnNotificação.setFocusPainted(false);
        btnNotificação.setFocusable(false);
        btnNotificação.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNotificaçãoActionPerformed(evt);
            }
        });

        btnLupa.setBackground(new java.awt.Color(33, 33, 33));
        btnLupa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Patrick\\Downloads\\search.png")); // NOI18N
        btnLupa.setBorder(null);
        btnLupa.setBorderPainted(false);
        btnLupa.setContentAreaFilled(false);
        btnLupa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLupaActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(33, 33, 33));
        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(208, 204, 204));
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Patrick\\Desktop\\Design sem nome (4).png")); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setDefaultCapable(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Todolist");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLupa)
                        .addGap(18, 18, 18)
                        .addComponent(btnNotificação)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jButton5))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(btnLupa)
                        .addComponent(btnNotificação))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

     
         
         AdicionarTarefasView AdicionarTarefasView = new AdicionarTarefasView();
        AdicionarTarefasView.setVisible(true);
        this.dispose(); // Fecha a janela atual
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnNotificaçãoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNotificaçãoActionPerformed
        JOptionPane.showMessageDialog(this, "Essa Ferramenta sera adicionada em atualizações futuras, para mais informações falar com o desenvolvedor", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnNotificaçãoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnLupaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLupaActionPerformed
          JOptionPane.showMessageDialog(this, "Essa Ferramenta sera adicionada em atualizações futuras, para mais informações falar com o desenvolvedor", "Erro", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnLupaActionPerformed

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
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLupa;
    private javax.swing.JButton btnNotificação;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Label label3;
    private javax.swing.JPanel panelLista;
    // End of variables declaration//GEN-END:variables
}
