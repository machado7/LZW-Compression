package proyectofinal;

import java.awt.HeadlessException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author OSCAR
 */
public class readFile extends javax.swing.JFrame {

    /**
     * Creates new form readFile
     */
    String key = "sRJkFJ4FfD6M";

    public readFile() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/icon.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar2 = new javax.swing.JToolBar();
        unzipBtn = new javax.swing.JButton();
        decryptBtn = new javax.swing.JButton();
        fileSource = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Read File");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jToolBar2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        unzipBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/EXTRACT.png"))); // NOI18N
        unzipBtn.setText("Descomprimir");
        unzipBtn.setToolTipText("Descomprimir");
        unzipBtn.setFocusable(false);
        unzipBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        unzipBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        unzipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unzipBtnActionPerformed(evt);
            }
        });
        jToolBar2.add(unzipBtn);

        decryptBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UNLOCK.png"))); // NOI18N
        decryptBtn.setText("Descrifrar");
        decryptBtn.setToolTipText("Descrifrar");
        decryptBtn.setFocusable(false);
        decryptBtn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        decryptBtn.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        decryptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decryptBtnActionPerformed(evt);
            }
        });
        jToolBar2.add(decryptBtn);

        jMenu1.setText("File");

        jMenuItem2.setText("Descomprimir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Descrifrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Descifrar y Descomprimir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Help");

        jMenuItem5.setText("About");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fileSource, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fileSource, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 26, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void decypherData() throws Throwable {

        JFileChooser chooser = new JFileChooser();

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Solo archivos Encryptados(EC) ", "ec");
        chooser.setFileFilter(filter);

        int result = chooser.showOpenDialog(this);

        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File fileName = chooser.getSelectedFile();
        String filePath = fileName.getAbsolutePath();

        System.out.println("\nFinal filepath : " + filePath);

        try {
            FileInputStream fis = new FileInputStream(filePath);
            FileOutputStream fos = new FileOutputStream(filePath.replace(".ec", ""));
            DESEncryptDecrypt.decrypt(key, fis, fos);
            JOptionPane.showMessageDialog(this, "Se descifro el archivo.");
        } catch (FileNotFoundException e) {
        }
        System.out.println("Decrypted.");
    }

    //Descompresion de el archivo ODEMA utilizando el algoritmo LZW
    public void decompressData() {
        LZWDecompression lzw = new LZWDecompression();
        JFileChooser chooser = new JFileChooser();

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Solo archivos Comprimidos(Compressed)", "compressed");
        chooser.setFileFilter(filter);

        int result = chooser.showOpenDialog(this);

        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File fileName = chooser.getSelectedFile();
        String filepath = fileName.getAbsolutePath();

        try {
            Scanner input = new Scanner(filepath);
            String str = input.nextLine();
            File file = new File(str);
            Scanner fileScanner = new Scanner(file);

            String line = "";
            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                System.out.println("Contents of your file being decompressed: \n"
                        + line);
            }
            lzw.LZW_Decompress(str);
            JOptionPane.showMessageDialog(this, "El archivo " + fileName + " se descomprimio.");
        } catch (IOException | HeadlessException e) {
            System.out.println("File Not Found.");
        }
        System.out.println("File Decompressed");
    }

    //Descompresion de el archivo ODEMA utilizando el algoritmo LZW
    public void decompressDecypherData() throws Throwable {
        LZWDecompression lzw = new LZWDecompression();
        JFileChooser chooser = new JFileChooser();

        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Solo archivos Comprimidos(Compressed)-Encryptados(EC) ", "ec");
        chooser.setFileFilter(filter);

        int result = chooser.showOpenDialog(this);

        if (result != JFileChooser.APPROVE_OPTION) {
            return;
        }
        File fileName = chooser.getSelectedFile();
        String filePath = fileName.getAbsolutePath();

        System.out.println("\nFinal filepath : " + filePath);

        FileInputStream fis = new FileInputStream(filePath);
        FileOutputStream fos = new FileOutputStream(filePath.replace(".ec", ""));
        DESEncryptDecrypt.decrypt(key, fis, fos);
        System.out.println("File Decrypted...");

        String dFilepath = filePath.replace(".ec", "");
        System.out.println("\nFinal filepath : " + dFilepath);

        try {
            Scanner input = new Scanner(dFilepath);
            String str = input.nextLine();
            File file = new File(str);
            Scanner fileScanner = new Scanner(file);

            String line = "";
            while (fileScanner.hasNext()) {
                line = fileScanner.nextLine();
                System.out.println("Contents of your file being decompressed: \n"
                        + line);
            }
            lzw.LZW_Decompress(str);
            JOptionPane.showMessageDialog(this, "Se descomprimio y se descifro el archivo.");
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("File Not Found.");
        }
        File cd = new File(dFilepath);
        cd.delete();
        System.out.println("File Decyphered and Decompressed");
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void decryptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decryptBtnActionPerformed
        String[] buttons = {"Descifrar", "Descomprimir y Desencriptar", "Cancelar"};

        int rc = JOptionPane.showOptionDialog(null, "Que desea hacer?", "",
                JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[0]);
        System.out.println(rc);
        switch (rc) {
            case 0: {
                JOptionPane.showMessageDialog(this, "Dependiendo de el archivo, esto puede tardar mas unos minutos.\nPor favor espere....", "Guardar Archivo", JOptionPane.PLAIN_MESSAGE);
                try {
                    decypherData();
                } catch (Throwable ex) {
                    Logger.getLogger(readFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 1: {
                try {
                    JOptionPane.showMessageDialog(this, "Dependiendo de el archivo, esto puede tardar mas de unos minutos.\nPor favor espere....", "Encriptar Archivo", JOptionPane.PLAIN_MESSAGE);
                    decompressDecypherData();
                } catch (Throwable ex) {
                    Logger.getLogger(createFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            break;
            case 2:
                break;
        }

    }//GEN-LAST:event_decryptBtnActionPerformed

    private void unzipBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unzipBtnActionPerformed
        decompressData();
    }//GEN-LAST:event_unzipBtnActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        String[] buttons = {"Salir", "Regregar al Menu", "Cancelar"};
        int rc = JOptionPane.showOptionDialog(null, "Desea salir?", "Alerta",
                JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[0]);
        System.out.println(rc);
        switch (rc) {
            case 0:
                System.exit(0);
                break;
            case 1:
                this.dispose();
                menu menu = new menu();
                menu.setVisible(true);
                break;
            case 2:
                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                break;
        }
    }//GEN-LAST:event_formWindowClosing

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        decompressData();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            decypherData();
        } catch (Throwable ex) {
            Logger.getLogger(readFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try {
            decompressDecypherData();
        } catch (Throwable ex) {
            Logger.getLogger(readFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
        menu menu = new menu();
        menu.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        about a = new about();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

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
            java.util.logging.Logger.getLogger(readFile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(readFile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(readFile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(readFile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new readFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton decryptBtn;
    private javax.swing.JLabel fileSource;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JButton unzipBtn;
    // End of variables declaration//GEN-END:variables
}
