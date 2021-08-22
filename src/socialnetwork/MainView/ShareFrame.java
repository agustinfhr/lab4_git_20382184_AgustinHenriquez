
package socialnetwork.MainView;

import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import socialnetwork.clases.Usuario;
import socialnetwork.clases.Publicacion;


/**
 * Una clase para representar la interfaz de un share
 * 
 */
public class ShareFrame extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    
    public ShareFrame() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
        limpiarJList1();
        limpiarJList2();
        limpiarJList3();
        agregarDatosList1();
        agregarDatosList2();
        
    }

    ArrayList<String> nuevaListUsers = new ArrayList<>(); //Creamos lista vacia para ingresar a los usuarios dirigidos
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jList1.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 72, 660, 330));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 430, 156, 48));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Ingrese el ID de la publicacion a compartir:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 23));

        jButton9.setBackground(new java.awt.Color(255, 102, 102));
        jButton9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.jpg"))); // NOI18N
        jButton9.setText("Cancelar");
        jButton9.setFocusPainted(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono3.jpg"))); // NOI18N
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.jpg"))); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 610, 176, 53));

        jButton10.setBackground(new java.awt.Color(255, 102, 102));
        jButton10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.jpg"))); // NOI18N
        jButton10.setText("Dirigir usuario");
        jButton10.setFocusPainted(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono3.jpg"))); // NOI18N
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.jpg"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, 176, 53));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Usuarios registrados");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, 274, 34));

        jList2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jList2.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(jList2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 70, 223, 130));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Publicaciones disponibles");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 274, 40));

        jList3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jList3.setForeground(new java.awt.Color(102, 102, 102));
        jScrollPane3.setViewportView(jList3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 180, 140));

        jTextField2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(102, 102, 102));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 280, 176, 50));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Usuarios dirigidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, -1, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Ingrese usuario a compartir:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 230, 250, 40));

        jButton11.setBackground(new java.awt.Color(255, 102, 102));
        jButton11.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono.jpg"))); // NOI18N
        jButton11.setText("Compartir");
        jButton11.setFocusPainted(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono3.jpg"))); // NOI18N
        jButton11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icono2.jpg"))); // NOI18N
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 440, 176, 53));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 130, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 640, -1, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Boton Cancelar
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        setVisible(false);
        new MenuFrame().setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed
    
    //Boton Dirigir usuarios
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String userDest = jTextField2.getText();
        
        ArrayList<Usuario> listaUserDisponibles = MainFrame.sn.getUsuarios(); //ArrayList con los usuarios registrados en la red social
        
        Usuario u = new Usuario(userDest, null, 0, (ArrayList)null, (ArrayList)null, (ArrayList)null); //se crea un nuevo usuario para buscar ese usuario dirigido
           
        boolean encontrado = false; //verifica si se encontro al usuario dirigido

        for (Usuario u2 : listaUserDisponibles) { //se recorre la lista de usuario registrados en la red social
            if (u2.getNombre().equals(u.getNombre())) { //si el nombre del usuario dirigido coincide con un usuario registrado
                
                nuevaListUsers.add(u2.getNombre());
                agregarDatosList3();   
                ArrayList<Publicacion> publicacions = u2.getPublicaciones();
                System.out.printf("\n\n Usuarios dirigidos: \n " + nuevaListUsers.toString()); //se muestra en pantalla a la lista de usuario que fueron dirigidos
                encontrado = true;
            }
        }
        if (encontrado == false) {
            new UseNotFoundFrame().setVisible(true);
        }
    }//GEN-LAST:event_jButton10ActionPerformed
   
    //Boton Compartir
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int entrada1 = Integer.parseInt(jTextField1.getText());
        Usuario usuarioActivo = MainFrame.sn.getUsuarioActivo().get(0);
        usuarioActivo.share(MainFrame.sn, entrada1, nuevaListUsers);
        setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

   
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
            java.util.logging.Logger.getLogger(ShareFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShareFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShareFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShareFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShareFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
    public DefaultListModel limpiarJList1(){
        
        DefaultListModel modelo = new DefaultListModel();
        
        jList1.setModel(modelo);
        
        return modelo;

    }
    public DefaultListModel limpiarJList2(){
        
        DefaultListModel modelo = new DefaultListModel();
        
        jList2.setModel(modelo);
        
        return modelo;

    }
    public DefaultListModel limpiarJList3(){
        
        DefaultListModel modelo = new DefaultListModel();
        
        jList3.setModel(modelo);
        
        return modelo;

    }
    
    public DefaultListModel agregarDatosList1(){
            
        DefaultListModel modelo = (DefaultListModel) jList1.getModel();

        ArrayList<Publicacion> listaPublicaciones = MainFrame.sn.getPublicaciones(); //ArrayList con los usuarios registrados en la red social
        
        for (Publicacion Post : listaPublicaciones) { //se recorre la lista de usuario registrados en la red social
            
            int idPost = Post.getId();
            String contenido = Post.getContenido();
            String autor = Post.getAutor();
            String postString =  "ID: " + idPost + " | Autor: " + autor + " | Contenido: " + contenido;
            modelo.addElement(postString);
                    
        }
          
        return modelo;
    }    
    
    public DefaultListModel agregarDatosList2(){
            
        DefaultListModel modelo = (DefaultListModel) jList2.getModel();

        ArrayList<Usuario> listaUserDisponibles = MainFrame.sn.getUsuarios(); //ArrayList con los usuarios registrados en la red social
        
        for (Usuario u2 : listaUserDisponibles) { //se recorre la lista de usuario registrados en la red social
                
            modelo.addElement(u2.getNombre());
                    
        }
          
        return modelo;
    }    
    
    public DefaultListModel agregarDatosList3(){
            
        DefaultListModel modelo = (DefaultListModel) jList3.getModel();
            
        modelo.addElement(jTextField2.getText());
            
        return modelo;
    }
    
    
    class FondoPanel extends JPanel {
        
        private Image imagen;
        
        
        public void paint(Graphics g){
            
            imagen = new ImageIcon(getClass().getResource("/imagenes/postFondoBig.jpg")).getImage(); 
           
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
           
            setOpaque(false);
           
            super.paint(g);
        }
                
   }
    
    
}
