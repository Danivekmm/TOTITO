package FRONTEND;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FRMJuegoTotito extends javax.swing.JFrame {

    public String TurnoX = "X";
    public String TurnoO = "O";
    
    public String Jugador1;
    public String Jugador2;
    

    JLabel[] arreglo = new JLabel[9];
    int matrizGanadora[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};//esta matriz ya definida es para declarar las posiciones en que se GANA                                                                                                              pueden ganar
    
    public boolean estado = true;//bandera para determinar el estado de la matriz
        
    public Integer turno = 1; //Cadena de los turnos, para saber cuantas veces se hace el turno
  

    public FRMJuegoTotito() {
    }

    public FRMJuegoTotito(String Jugador1, String Jugador2) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("TOTITO#");
        this.Jugador1 = Jugador1;
        this.Jugador2 = Jugador2;
        
        LBLjugador1.setText(Jugador1);
        LBLjugador2.setText(Jugador2);
        
        

        arreglo[0] = Posicion1;
        arreglo[1] = Posicion2;
        arreglo[2] = Posicion3;
        arreglo[3] = Posicion4;
        arreglo[4] = Posicion5;
        arreglo[5] = Posicion6;
        arreglo[6] = Posicion7;
        arreglo[7] = Posicion8;
        arreglo[8] = Posicion9;
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Posicion1 = new javax.swing.JLabel();
        Posicion2 = new javax.swing.JLabel();
        Posicion5 = new javax.swing.JLabel();
        Posicion6 = new javax.swing.JLabel();
        Posicion7 = new javax.swing.JLabel();
        Posicion9 = new javax.swing.JLabel();
        Posicion3 = new javax.swing.JLabel();
        Posicion8 = new javax.swing.JLabel();
        Posicion4 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        TituloTotito = new javax.swing.JLabel();
        LBLjugador1 = new javax.swing.JLabel();
        LBLjugador2 = new javax.swing.JLabel();
        LBLjugador3 = new javax.swing.JLabel();
        LBLjugador4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        Posicion1.setBackground(new java.awt.Color(255, 255, 255));
        Posicion1.setFont(Posicion1.getFont().deriveFont(Posicion1.getFont().getStyle() | java.awt.Font.BOLD, Posicion1.getFont().getSize()+73));
        Posicion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion1.setOpaque(true);
        Posicion1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion1MousePressed(evt);
            }
        });

        Posicion2.setBackground(new java.awt.Color(255, 255, 255));
        Posicion2.setFont(Posicion2.getFont().deriveFont(Posicion2.getFont().getStyle() | java.awt.Font.BOLD, Posicion2.getFont().getSize()+73));
        Posicion2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion2.setOpaque(true);
        Posicion2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion2MousePressed(evt);
            }
        });

        Posicion5.setBackground(new java.awt.Color(255, 255, 255));
        Posicion5.setFont(Posicion5.getFont().deriveFont(Posicion5.getFont().getStyle() | java.awt.Font.BOLD, Posicion5.getFont().getSize()+73));
        Posicion5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion5.setOpaque(true);
        Posicion5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion5MousePressed(evt);
            }
        });

        Posicion6.setBackground(new java.awt.Color(255, 255, 255));
        Posicion6.setFont(Posicion6.getFont().deriveFont(Posicion6.getFont().getStyle() | java.awt.Font.BOLD, Posicion6.getFont().getSize()+73));
        Posicion6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion6.setOpaque(true);
        Posicion6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion6MousePressed(evt);
            }
        });

        Posicion7.setBackground(new java.awt.Color(255, 255, 255));
        Posicion7.setFont(Posicion7.getFont().deriveFont(Posicion7.getFont().getStyle() | java.awt.Font.BOLD, Posicion7.getFont().getSize()+73));
        Posicion7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion7.setOpaque(true);
        Posicion7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion7MousePressed(evt);
            }
        });

        Posicion9.setBackground(new java.awt.Color(255, 255, 255));
        Posicion9.setFont(Posicion9.getFont().deriveFont(Posicion9.getFont().getStyle() | java.awt.Font.BOLD, Posicion9.getFont().getSize()+73));
        Posicion9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion9.setOpaque(true);
        Posicion9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion9MousePressed(evt);
            }
        });

        Posicion3.setBackground(new java.awt.Color(255, 255, 255));
        Posicion3.setFont(Posicion3.getFont().deriveFont(Posicion3.getFont().getStyle() | java.awt.Font.BOLD, Posicion3.getFont().getSize()+73));
        Posicion3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion3.setOpaque(true);
        Posicion3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion3MousePressed(evt);
            }
        });

        Posicion8.setBackground(new java.awt.Color(255, 255, 255));
        Posicion8.setFont(Posicion8.getFont().deriveFont(Posicion8.getFont().getStyle() | java.awt.Font.BOLD, Posicion8.getFont().getSize()+73));
        Posicion8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion8.setOpaque(true);
        Posicion8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion8MousePressed(evt);
            }
        });

        Posicion4.setBackground(new java.awt.Color(255, 255, 255));
        Posicion4.setFont(Posicion4.getFont().deriveFont(Posicion4.getFont().getStyle() | java.awt.Font.BOLD, Posicion4.getFont().getSize()+73));
        Posicion4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Posicion4.setOpaque(true);
        Posicion4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Posicion4MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Posicion4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Posicion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Posicion7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Posicion8, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(Posicion5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Posicion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Posicion9, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                    .addComponent(Posicion6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Posicion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Posicion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Posicion1, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(Posicion3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Posicion5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posicion4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Posicion6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Posicion9, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                    .addComponent(Posicion8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Posicion7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 102, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        TituloTotito.setBackground(new java.awt.Color(255, 255, 255));
        TituloTotito.setFont(TituloTotito.getFont().deriveFont((TituloTotito.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, TituloTotito.getFont().getSize()+88));
        TituloTotito.setForeground(new java.awt.Color(0, 153, 153));
        TituloTotito.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloTotito.setText("TOTITO");

        LBLjugador1.setBackground(new java.awt.Color(255, 255, 255));
        LBLjugador1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LBLjugador1.setForeground(new java.awt.Color(0, 102, 102));
        LBLjugador1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LBLjugador2.setBackground(new java.awt.Color(255, 255, 255));
        LBLjugador2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LBLjugador2.setForeground(new java.awt.Color(0, 102, 102));
        LBLjugador2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LBLjugador3.setBackground(new java.awt.Color(255, 255, 255));
        LBLjugador3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LBLjugador3.setForeground(new java.awt.Color(0, 102, 102));
        LBLjugador3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLjugador3.setText("X");

        LBLjugador4.setBackground(new java.awt.Color(255, 255, 255));
        LBLjugador4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LBLjugador4.setForeground(new java.awt.Color(0, 102, 102));
        LBLjugador4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LBLjugador4.setText("O");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(132, 132, 132))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLjugador2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(LBLjugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LBLjugador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(LBLjugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TituloTotito, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloTotito, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LBLjugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LBLjugador3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LBLjugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LBLjugador4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void Posicion1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion1MousePressed
        fncPresionar(1);
    }//GEN-LAST:event_Posicion1MousePressed

    private void Posicion2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion2MousePressed
        fncPresionar(2);
    }//GEN-LAST:event_Posicion2MousePressed

    private void Posicion3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion3MousePressed
        fncPresionar(3);
    }//GEN-LAST:event_Posicion3MousePressed

    private void Posicion4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion4MousePressed
        fncPresionar(4);
    }//GEN-LAST:event_Posicion4MousePressed

    private void Posicion5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion5MousePressed
        fncPresionar(5);
    }//GEN-LAST:event_Posicion5MousePressed

    private void Posicion6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion6MousePressed
        fncPresionar(6);
    }//GEN-LAST:event_Posicion6MousePressed

    private void Posicion7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion7MousePressed
        fncPresionar(7);
    }//GEN-LAST:event_Posicion7MousePressed

    private void Posicion8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion8MousePressed
        fncPresionar(8);
    }//GEN-LAST:event_Posicion8MousePressed

    private void Posicion9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Posicion9MousePressed
        fncPresionar(9);
    }//GEN-LAST:event_Posicion9MousePressed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.turno = 1;
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i].setText("");
            arreglo[i].setBackground(Color.white);
            estado = true;
        }

    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void fncPresionar(int casilla) {
        
           if(!arreglo[casilla - 1].getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Ya esta en uso");//muestra que ya se utiliza la casilla seleccionada
            
        }else{
            
        
        System.out.println(this.turno.toString());//para imprimir en consola lo que se está haciendo
        
        
        if (arreglo[casilla - 1].getText().equals("") && estado) {
            arreglo[casilla - 1].setText(TurnoX);
            fncCambiarTurno();
            fncComprobarGanador();
        }
        
        
        if (this.turno>9){
            JOptionPane.showMessageDialog(null,"E M P A T E");
            
            JOptionPane.showMessageDialog(null,"FIN DEL JUEGO");
            
            
        }
        
}
    }

    public void fncCambiarTurno() 
    {//inicia
        this.turno += 1;
        if (TurnoX.equals("X")) {
            TurnoX = "O";
            estado = true;
        } else {
            TurnoX = "X";
            estado = true;
        }
        
        
        
    }//termina
/*
**
** 
*/
public void fncComprobarGanador() 
    {//incio public fncComprobarGanador
        
        for (int i = 0; i < matrizGanadora.length; i++) 
        {//inicio for
            if (arreglo[matrizGanadora[i][0] - 1].getText().equals("X")
                    && arreglo[matrizGanadora[i][1] - 1].getText().equals("X")
                    && arreglo[matrizGanadora[i][2] - 1].getText().equals("X")) 
            {//inicia if
                arreglo[matrizGanadora[i][0] - 1].setBackground(Color.GREEN);
                arreglo[matrizGanadora[i][1] - 1].setBackground(Color.GREEN);
                arreglo[matrizGanadora[i][2] - 1].setBackground(Color.GREEN);
                JOptionPane.showMessageDialog(null,"Gano   "+Jugador1);
                JOptionPane.showMessageDialog(null,"FIN DEL JUEGO");
                estado = false;
                this.turno = 1;
                break;
                
            }/*fin else*/ 
            else if (arreglo[matrizGanadora[i][0] - 1].getText().equals("O")
                    && arreglo[matrizGanadora[i][1] - 1].getText().equals("O")
                    && arreglo[matrizGanadora[i][2] - 1].getText().equals("O")) 
            {//inicio else if
                arreglo[matrizGanadora[i][0] - 1].setBackground(Color.GREEN);
                arreglo[matrizGanadora[i][1] - 1].setBackground(Color.GREEN);
                arreglo[matrizGanadora[i][2] - 1].setBackground(Color.GREEN);
                JOptionPane.showMessageDialog(null,"Gano  "+Jugador2);
                JOptionPane.showMessageDialog(null,"FIN DEL JUEGO");
                 estado = false;
                 this.turno = 1;
                 break;
            }//fin else if
          
        }//fin for
    }//fin public fncComprobarGanador
    
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
            java.util.logging.Logger.getLogger(FRMJuegoTotito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMJuegoTotito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMJuegoTotito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMJuegoTotito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMJuegoTotito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LBLjugador1;
    private javax.swing.JLabel LBLjugador2;
    private javax.swing.JLabel LBLjugador3;
    private javax.swing.JLabel LBLjugador4;
    private javax.swing.JLabel Posicion1;
    private javax.swing.JLabel Posicion2;
    private javax.swing.JLabel Posicion3;
    private javax.swing.JLabel Posicion4;
    private javax.swing.JLabel Posicion5;
    private javax.swing.JLabel Posicion6;
    private javax.swing.JLabel Posicion7;
    private javax.swing.JLabel Posicion8;
    private javax.swing.JLabel Posicion9;
    private javax.swing.JLabel TituloTotito;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
