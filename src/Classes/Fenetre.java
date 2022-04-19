

package Classes;

import classes.Camion;
import classes.Moto;
import classes.Vehicule;
import classes.Voiture;
import com.sun.jdi.IntegerValue;
import java.io.File;  
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;



public class Fenetre extends javax.swing.JFrame {
    
     ArrayList<Vehicule> vehicules ;
     DefaultListModel modeleListe ;
     File fichier ;
     FileWriter fw ;
     PrintWriter pw ;        
            

    
    public Fenetre() {
        initComponents();
        vehicules = new ArrayList<>(); 
        modeleListe = new DefaultListModel();
        fichier = new File("fichier.veh");
         try {
             fichier = new File("fichier.veh");
             fw = new FileWriter(fichier);
              pw = new PrintWriter(fw);
         } catch (IOException ex) {
            ex.printStackTrace();
         }
       
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListVéhicules = new javax.swing.JList<>();
        btnAjouter = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();
        btnModifier = new javax.swing.JButton();
        btnEnregister = new javax.swing.JButton();
        btnFermer = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane2.setViewportView(ListVéhicules);

        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnSupprimer.setText("Supprimer");
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        btnModifier.setText("Modifier");
        btnModifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifierActionPerformed(evt);
            }
        });

        btnEnregister.setText("Enregister");
        btnEnregister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnregisterActionPerformed(evt);
            }
        });

        btnFermer.setText("Fermer");
        btnFermer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFermerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAjouter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSupprimer)
                        .addGap(75, 75, 75)
                        .addComponent(btnModifier)
                        .addGap(87, 87, 87)
                        .addComponent(btnEnregister)
                        .addGap(57, 57, 57)
                        .addComponent(btnFermer)
                        .addGap(65, 65, 65))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAjouter)
                    .addComponent(btnSupprimer)
                    .addComponent(btnModifier)
                    .addComponent(btnEnregister)
                    .addComponent(btnFermer))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFermerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFermerActionPerformed
      
        int choix = JOptionPane.showConfirmDialog(this, "Etez_vous sur de vouloir Sotir?", "Confiramtion",
                JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE);
        
        if(choix ==0) 
            System.exit(0);
    }//GEN-LAST:event_btnFermerActionPerformed

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
         Vehicule vehicule = null ;
        String marque , modele , inmatriculation ,  type  ;
       int nbrPorte , choix = 0 ;
       int viteseMax ;
       boolean remorque ;
       
       type = JOptionPane.showInputDialog(this, "Entrer le type de vehicule : voiture / Moto / Camion", "Type", JOptionPane.PLAIN_MESSAGE);
       
       if(type==null){
           
       }else if(type.equalsIgnoreCase("voiture")){
           marque =JOptionPane.showInputDialog(this , "Entrer la marque de vehicule " , "Marque " , JOptionPane.PLAIN_MESSAGE);
           modele = JOptionPane.showInputDialog(this, "Enter le modele des vhicules  " , "Modele" , JOptionPane.PLAIN_MESSAGE);
           inmatriculation = JOptionPane.showInputDialog(this, "Entrer la matriculation", "Matriculation", JOptionPane.PLAIN_MESSAGE);
           nbrPorte = Integer.parseInt(JOptionPane.showInputDialog(this, "Entrer le nombre de porte ", "NbrPorte", JOptionPane.PLAIN_MESSAGE));
           
           vehicule = new Voiture(marque, modele, inmatriculation, nbrPorte);
       }
           
       else if (type.equalsIgnoreCase("Moto")){
           marque =JOptionPane.showInputDialog(this , "Entrer la marque de vehicule " , "Marque " , JOptionPane.PLAIN_MESSAGE);
           modele = JOptionPane.showInputDialog(this, "Enter le modele des vhicules  " , "Modele" , JOptionPane.PLAIN_MESSAGE);
           inmatriculation = JOptionPane.showInputDialog(this, "Entrer la matriculation", "Matriculation", JOptionPane.PLAIN_MESSAGE);
           viteseMax = Integer.parseInt(JOptionPane.showInputDialog(this, "Entrer la vitesse maximale", "Max-vitesse", JOptionPane.PLAIN_MESSAGE));
           
           vehicule = new Moto(marque, modele, inmatriculation, viteseMax);

       }
       
       else if (type.equalsIgnoreCase("Camion")){
            marque =JOptionPane.showInputDialog(this , "Entrer la marque de vehicule " , "Marque " , JOptionPane.PLAIN_MESSAGE);
            modele = JOptionPane.showInputDialog(this, "Enter le modele des vhicules  " , "Modele" , JOptionPane.PLAIN_MESSAGE);
            inmatriculation = JOptionPane.showInputDialog(this, "Entrer la matriculation", "Matriculation", JOptionPane.PLAIN_MESSAGE);
          
               choix =  JOptionPane.showConfirmDialog(this, "le camion a-t-il un remorque", "Remorque", JOptionPane.YES_NO_OPTION);
         if(choix == 0)
             remorque = true ;
         else 
             remorque = false ;
           
         vehicule = new Camion(marque, modele, inmatriculation, remorque);
       }
       else{
           JOptionPane.showMessageDialog(this, "choix incorrecte ", "choix incorrecte", JOptionPane.OK_OPTION);
       }
           
        vehicules.add(vehicule);
        modeleListe.add(modeleListe.size(), vehicule);
       ListVéhicules.setModel(modeleListe);
        
        

              
        
       
       
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void btnEnregisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnregisterActionPerformed

        for(Vehicule v  : vehicules)
            pw.println();
        pw.close();
    }//GEN-LAST:event_btnEnregisterActionPerformed

    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed
      
        if(ListVéhicules.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "Selection une Vehicule a supprimé  ", "Pas du selection ", JOptionPane.ERROR_MESSAGE);
        }
        else {
            int indice = ListVéhicules.getSelectedIndex();
            modeleListe.remove(indice);
            ListVéhicules.remove(indice);
        }
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void btnModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifierActionPerformed
         String  marque , modele , inmatriculation   ;
         int nbrPorte , viteseMax ;
         int remorque = 0 ;
         
         if(ListVéhicules.isSelectionEmpty()){
             JOptionPane.showMessageDialog(this, "Selectionner une vehicule a modifier ", "Pas de vehicues selectionner ", JOptionPane.ERROR_MESSAGE);
         }
         else{
             int index = ListVéhicules.getSelectedIndex();
             Vehicule v = vehicules.get(index);
             
             
                 
             marque =JOptionPane.showInputDialog(this, "Modidfer la marque ", v.getMarque());
             v.setMarque(marque);
             modele =JOptionPane.showInputDialog(this, "Modidfer la marque ", v.getModele());
             v.setModele(modele);
             inmatriculation = JOptionPane.showInputDialog(this, "Modidfer la marque ", v.getInmatriculation());
             v.setInmatriculation(inmatriculation);
             
             if(v  instanceof Voiture ){
                 nbrPorte = Integer.valueOf(JOptionPane.showInputDialog(this, "chnager le nbre du porte ", ((Voiture) v).getNombrePortes()));
                 
                 ((Voiture) v).setNombrePortes(nbrPorte);
                    
             }
             else if (v instanceof Moto){
                 viteseMax = Integer.valueOf(JOptionPane.showInputDialog(this, "changer le vitesse maximale", ((Moto) v).getVitesseMax()));
                 ((Moto) v).setVitesseMax(viteseMax);
                 
                 
                 
         }else if(v instanceof Camion){
             //  return 0 (true)  ou 1(false)  
             remorque = JOptionPane.showConfirmDialog(this, "le camion a-t-il un remorque", "Remorque", JOptionPane.YES_NO_OPTION);
     
             boolean choix = true ;
             if (remorque==JOptionPane.NO_OPTION)choix=false ;
             ((Camion) v).setRemorque(choix);
                 
             
                }
         else{
             JOptionPane.showMessageDialog(this, "Errer Inconnu ", "Erreur", JOptionPane.ERROR_MESSAGE);
         }
                

            
         }

        
    }//GEN-LAST:event_btnModifierActionPerformed

    
    public static void main(String args[]) {
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            Fenetre   f =   new Fenetre();
            f.setVisible(true);
            f.setTitle("La Gestion d'un P arking");
            f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListVéhicules;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnEnregister;
    private javax.swing.JButton btnFermer;
    private javax.swing.JButton btnModifier;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
