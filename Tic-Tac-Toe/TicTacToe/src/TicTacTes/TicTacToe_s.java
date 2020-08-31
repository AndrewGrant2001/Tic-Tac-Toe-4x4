package TicTacTes;

import java.awt.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
* File Name:	TicTacToe
* Programmer:	Andrew Grant
* Date:		May 3, 2019
* Description:	This programs allows you to play Tic Tac Toe while keeping track
*               of wins by both and cats games. It has a queen background image 
*               (I really like chess). 
 */
public class TicTacToe_s extends javax.swing.JFrame {
    //creating the starting letter
    private String startGame = "X";
    
    //creating variables for game score
    int xCount = 0;
    int oCount = 0;
    int tiescount = 0;
    int ties = 0;
    
    //creating array to be used for winning formations
    int[][] check = new int[4][4];

    //setting the background image
    ImageIcon a = new ImageIcon(getClass().getResource("/TicTacTes/queen.jpg"));
        
    /**
     * Creates new form TicTacToe_s
     */
    public TicTacToe_s() {
        initComponents();
        
        //setting the size of the board
        setSize(1300,600);
        
        //setting the screen to the centre
        setLocationRelativeTo(null);
        
        //setting the background image
        but1.setIcon(a);
        but2.setIcon(a);
        but3.setIcon(a);
        but4.setIcon(a);
        but5.setIcon(a);
        but6.setIcon(a);
        but7.setIcon(a);
        but8.setIcon(a);
        but9.setIcon(a);
        but10.setIcon(a);
        but11.setIcon(a);
        but12.setIcon(a);
        but13.setIcon(a);
        but14.setIcon(a);
        but15.setIcon(a);
        but16.setIcon(a);
    }

    //method to set game score
    private void gameScore()
    {
        lbl_XPoints.setText(String.valueOf(xCount));
        lbl_OPoints.setText(String.valueOf(oCount));
    }
    
    //method to choose the next player
    private void choose_a_Player()
    {
        //if statemnt to choose player
        if(startGame.equalsIgnoreCase("X"))
        {
            startGame = "O";
        }
        else
        {
            startGame = "X";
        }
    }
    
    //method to find if person has won game
    private void winningGame()
    {
        //getting the array information for each button
        int b1 = check[0][0];
        int b2 = check[0][1];
        int b3 = check[0][2];
        int b4 = check[0][3];
        int b5 = check[1][0];
        int b6 = check[1][1];
        int b7 = check[1][2];
        int b8 = check[1][3];
        int b9 = check[2][0];
        int b10 = check[2][1];
        int b11 = check[2][2];
        int b12 = check[2][3];
        int b13 = check[3][0];
        int b14 = check[3][1];
        int b15 = check[3][2];
        int b16 = check[3][3];
        
        //if statement to find winning formation
        //displaying winning message
        //adding to the score and outputting it
        //disabling buttons to prevent errors
        if (b1 == 1 && b2 == 1 && b3 == 1 && b4 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b1 == 2 && b2 == 2 && b3 == 2 && b4 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b5 == 1 && b6 == 1 && b7 == 1 && b8 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b5 == 2 && b6 == 2 && b7 == 2 && b8 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b9 == 1 && b10 == 1 && b11 == 1 && b12 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b9 == 2 && b10 == 2 && b11 == 2 && b12 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b13 == 1 && b14 == 1 && b15 == 1 && b16 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b13 == 2 && b14 == 2 && b15 == 2 && b16 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b1 == 1 && b5 == 1 && b9 == 1 && b13 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b1 == 2 && b5 == 2 && b9 == 2 && b13 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b2 == 1 && b6 == 1 && b10 == 1 && b14 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b2 == 2 && b6 == 2 && b10 == 2 && b14 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b3 == 1 && b7 == 1 && b11 == 1 && b15 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b3 == 2 && b7 == 2 && b11 == 2 && b15 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b4 == 1 && b8 == 1 && b12 == 1 && b16 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b4 == 2 && b8 == 2 && b12 == 2 && b16 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b1 == 1 && b6 == 1 && b11 == 1 && b16 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b1 == 2 && b6 == 2 && b11 == 2 && b16 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b4 == 1 && b7 == 1 && b10 == 1 && b13 == 1)
        {
            JOptionPane.showMessageDialog(this, "Player X wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
        else if (b4 == 2 && b7 == 2 && b10 == 2 && b13 == 2)
        {
            JOptionPane.showMessageDialog(this, "Player O wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount++;
            gameScore();
            but1.setEnabled(false);
            but2.setEnabled(false);
            but3.setEnabled(false);
            but4.setEnabled(false);
            but5.setEnabled(false);
            but6.setEnabled(false);
            but7.setEnabled(false);
            but8.setEnabled(false);
            but9.setEnabled(false);
            but10.setEnabled(false);
            but11.setEnabled(false);
            but12.setEnabled(false);
            but13.setEnabled(false);
            but14.setEnabled(false);
            but15.setEnabled(false);
            but16.setEnabled(false);
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        but1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        but2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        but3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        but4 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        lblPlayerX = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lbl_XPoints = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        but5 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        but6 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        but7 = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        but8 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        lblPlayerO = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        lbl_OPoints = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        but9 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        but10 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        but11 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        but12 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        lblCatsGame = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        lbl_CatsPoints = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        but13 = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        but14 = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        but15 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();
        but16 = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        btnReset = new javax.swing.JButton();
        jPanel26 = new javax.swing.JPanel();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic Tac Toe");

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 100)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tic Tac Toe");
        jPanel1.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.GridLayout(4, 6, 2, 2));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.BorderLayout());

        but1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but1ActionPerformed(evt);
            }
        });
        jPanel3.add(but1, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new java.awt.BorderLayout());

        but2.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but2ActionPerformed(evt);
            }
        });
        jPanel4.add(but2, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        but3.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but3ActionPerformed(evt);
            }
        });
        jPanel5.add(but3, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        but4.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but4ActionPerformed(evt);
            }
        });
        jPanel6.add(but4, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        lblPlayerX.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblPlayerX.setText("Player X:");
        jPanel7.add(lblPlayerX, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        lbl_XPoints.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbl_XPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_XPoints.setText("0");
        jPanel8.add(lbl_XPoints, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new java.awt.BorderLayout());

        but5.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but5ActionPerformed(evt);
            }
        });
        jPanel9.add(but5, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new java.awt.BorderLayout());

        but6.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but6ActionPerformed(evt);
            }
        });
        jPanel10.add(but6, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new java.awt.BorderLayout());

        but7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but7ActionPerformed(evt);
            }
        });
        jPanel11.add(but7, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new java.awt.BorderLayout());

        but8.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but8ActionPerformed(evt);
            }
        });
        jPanel12.add(but8, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel12);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new java.awt.BorderLayout());

        lblPlayerO.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblPlayerO.setText("Player O:");
        jPanel13.add(lblPlayerO, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setLayout(new java.awt.BorderLayout());

        lbl_OPoints.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbl_OPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_OPoints.setText("0");
        jPanel14.add(lbl_OPoints, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel14);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setLayout(new java.awt.BorderLayout());

        but9.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but9ActionPerformed(evt);
            }
        });
        jPanel15.add(but9, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel15);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setLayout(new java.awt.BorderLayout());

        but10.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but10ActionPerformed(evt);
            }
        });
        jPanel16.add(but10, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new java.awt.BorderLayout());

        but11.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but11ActionPerformed(evt);
            }
        });
        jPanel17.add(but11, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel17);

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));
        jPanel18.setLayout(new java.awt.BorderLayout());

        but12.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but12ActionPerformed(evt);
            }
        });
        jPanel18.add(but12, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel18);

        jPanel19.setBackground(new java.awt.Color(255, 255, 255));
        jPanel19.setLayout(new java.awt.BorderLayout());

        lblCatsGame.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lblCatsGame.setText("Cats:");
        jPanel19.add(lblCatsGame, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel19);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setLayout(new java.awt.BorderLayout());

        lbl_CatsPoints.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        lbl_CatsPoints.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_CatsPoints.setText("0");
        jPanel20.add(lbl_CatsPoints, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel20);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setLayout(new java.awt.BorderLayout());

        but13.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but13ActionPerformed(evt);
            }
        });
        jPanel21.add(but13, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel21);

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));
        jPanel22.setLayout(new java.awt.BorderLayout());

        but14.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but14ActionPerformed(evt);
            }
        });
        jPanel22.add(but14, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel22);

        jPanel23.setBackground(new java.awt.Color(255, 255, 255));
        jPanel23.setLayout(new java.awt.BorderLayout());

        but15.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but15ActionPerformed(evt);
            }
        });
        jPanel23.add(but15, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel23);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));
        jPanel24.setLayout(new java.awt.BorderLayout());

        but16.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        but16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but16ActionPerformed(evt);
            }
        });
        jPanel24.add(but16, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel24);

        jPanel25.setBackground(new java.awt.Color(255, 255, 255));
        jPanel25.setLayout(new java.awt.BorderLayout());

        btnReset.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel25.add(btnReset, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel25);

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new java.awt.BorderLayout());

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel26.add(btnExit, java.awt.BorderLayout.CENTER);

        jPanel2.add(jPanel26);

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //creating a frame for winning and exit moments
    private JFrame frame;
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
    //creating the frame for exit
    frame = new JFrame("Exit");

    //if statement to find winner and display
    if (xCount > oCount)
    {
        if(JOptionPane.showConfirmDialog(frame, "Player X Wins!", "Tic Tac Toe",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION);{}
    }
    else if (oCount > xCount)
    {
        if(JOptionPane.showConfirmDialog(frame, "Player O Wins!", "Tic Tac Toe",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION);{}
    }
    else if (oCount == xCount)
    {
        if(JOptionPane.showConfirmDialog(frame, "Tie Game", "Tic Tac Toe",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION); {}
    }

    //confirming the exit button
    if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe",
        JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
    } 
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
    //reseting the icon to the original background
        but1.setIcon(a);
        but2.setIcon(a);
        but3.setIcon(a);
        but4.setIcon(a);
        but5.setIcon(a);
        but6.setIcon(a);
        but7.setIcon(a);
        but8.setIcon(a);
        but9.setIcon(a);
        but10.setIcon(a);
        but11.setIcon(a);
        but12.setIcon(a);
        but13.setIcon(a);
        but14.setIcon(a);
        but15.setIcon(a);
        but16.setIcon(a);
        
        //reseting the text of the buttons
        but1.setText(null);
        but2.setText(null);
        but3.setText(null);
        but4.setText(null);
        but5.setText(null);
        but6.setText(null);
        but7.setText(null);
        but8.setText(null);
        but9.setText(null);
        but10.setText(null);
        but11.setText(null);
        but12.setText(null);
        but13.setText(null);
        but14.setText(null);
        but15.setText(null);
        but16.setText(null);
        
        //reseting the button colours
        but1.setBackground(Color.LIGHT_GRAY);
        but2.setBackground(Color.LIGHT_GRAY);
        but3.setBackground(Color.LIGHT_GRAY);
        but4.setBackground(Color.LIGHT_GRAY);
        but5.setBackground(Color.LIGHT_GRAY);
        but6.setBackground(Color.LIGHT_GRAY);
        but7.setBackground(Color.LIGHT_GRAY);
        but8.setBackground(Color.LIGHT_GRAY);  
        but9.setBackground(Color.LIGHT_GRAY);
        but10.setBackground(Color.LIGHT_GRAY);
        but11.setBackground(Color.LIGHT_GRAY);
        but12.setBackground(Color.LIGHT_GRAY);
        but13.setBackground(Color.LIGHT_GRAY);
        but14.setBackground(Color.LIGHT_GRAY);
        but15.setBackground(Color.LIGHT_GRAY);
        but16.setBackground(Color.LIGHT_GRAY);
           
        //reenabling the tic tac toe board buttons
        but1.setEnabled(true);
        but2.setEnabled(true);
        but3.setEnabled(true);
        but4.setEnabled(true);
        but5.setEnabled(true);
        but6.setEnabled(true);
        but7.setEnabled(true);
        but8.setEnabled(true);
        but9.setEnabled(true);
        but10.setEnabled(true);
        but11.setEnabled(true);
        but12.setEnabled(true);
        but13.setEnabled(true);
        but14.setEnabled(true);
        but15.setEnabled(true);
        but16.setEnabled(true);
        
        //if statement to track cats games    
        if ((check[0][0] == 1 || check[0][0] == 2) && 
            (check[0][1] == 1 || check[0][1] == 2) && 
            (check[0][2] == 1 || check[0][2] == 2) && 
            (check[0][3] == 1 || check[0][3] == 2) &&
            (check[1][0] == 1 || check[1][0] == 2) && 
            (check[1][1] == 1 || check[1][1] == 2) && 
            (check[1][2] == 1 || check[1][2] == 2) && 
            (check[2][0] == 1 || check[2][0] == 2) && 
            (check[2][1] == 1 || check[2][1] == 2) && 
            (check[2][2] == 1 || check[2][2] == 2) && 
            (check[2][3] == 1 || check[2][3] == 2) && 
            (check[1][3] == 1 || check[1][3] == 2) && 
            (check[3][0] == 1 || check[3][0] == 2) && 
            (check[3][1] == 1 || check[3][1] == 2) && 
            (check[3][2] == 1 || check[3][2] == 2) && 
            (check[3][3] == 1 || check[3][3] == 2))
        {
            //adding the cats game
            ties++;
            lbl_CatsPoints.setText("" + ties);
        }
        
        //clearing the information in the array
        check[0][0] = 0;
        check[0][1] = 0;
        check[0][2] = 0;
        check[0][3] = 0;
        check[1][0] = 0;
        check[1][1] = 0;
        check[1][2] = 0;
        check[1][3] = 0;
        check[2][0] = 0;
        check[2][1] = 0;
        check[2][2] = 0;
        check[2][3] = 0;
        check[3][0] = 0;
        check[3][1] = 0;
        check[3][2] = 0;
        check[3][3] = 0;
    }//GEN-LAST:event_btnResetActionPerformed

    private void but1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but1ActionPerformed
    //clearing the icon
    but1.setIcon(null);

    //setting the button text for X or O
    but1.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but1.setForeground(Color.GREEN);
        check[0][0] = 1;
    }
    else
    {
        but1.setForeground(Color.BLUE);
        check[0][0] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but1.setEnabled(false);
    }//GEN-LAST:event_but1ActionPerformed

    private void but2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but2ActionPerformed
    //clearing the icon
    but2.setIcon(null);

    //setting the button text for X or O
    but2.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but2.setForeground(Color.GREEN);
        check[0][1] = 1;
    }
    else
    {
        but2.setForeground(Color.BLUE);
        check[0][1] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but2.setEnabled(false);
    }//GEN-LAST:event_but2ActionPerformed

    private void but3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but3ActionPerformed
    //clearing the icon
    but3.setIcon(null);

    //setting the button text for X or O
    but3.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but3.setForeground(Color.GREEN);
        check[0][2] = 1;
    }
    else
    {
        but3.setForeground(Color.BLUE);
        check[0][2] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but3.setEnabled(false);
    }//GEN-LAST:event_but3ActionPerformed

    private void but4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but4ActionPerformed
    //clearing the icon
    but4.setIcon(null);

    //setting the button text for X or O
    but4.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but4.setForeground(Color.GREEN);
        check[0][3] = 1;
    }
    else
    {
        but4.setForeground(Color.BLUE);
        check[0][3] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but4.setEnabled(false);
    }//GEN-LAST:event_but4ActionPerformed

    private void but5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but5ActionPerformed
    //clearing the icon
    but5.setIcon(null);

    //setting the button text for X or O
    but5.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but5.setForeground(Color.GREEN);
        check[1][0] = 1;
    }
    else
    {
        but5.setForeground(Color.BLUE);
        check[1][0] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but5.setEnabled(false);
    }//GEN-LAST:event_but5ActionPerformed

    private void but6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but6ActionPerformed
    //clearing the icon
    but6.setIcon(null);

    //setting the button text for X or O
    but6.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but6.setForeground(Color.GREEN);
        check[1][1] = 1;
    }
    else
    {
        but6.setForeground(Color.BLUE);
        check[1][1] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but6.setEnabled(false);
    }//GEN-LAST:event_but6ActionPerformed

    private void but7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but7ActionPerformed
    //clearing the icon
    but7.setIcon(null);

    //setting the button text for X or O
    but7.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but7.setForeground(Color.GREEN);
        check[1][2] = 1;
    }
    else
    {
        but7.setForeground(Color.BLUE);
        check[1][2] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but7.setEnabled(false);
    }//GEN-LAST:event_but7ActionPerformed

    private void but8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but8ActionPerformed
    //clearing the icon
    but8.setIcon(null);

    //setting the button text for X or O
    but8.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but8.setForeground(Color.GREEN);
        check[1][3] = 1;
    }
    else
    {
        but8.setForeground(Color.BLUE);
        check[1][3] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but8.setEnabled(false);
    }//GEN-LAST:event_but8ActionPerformed

    private void but9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but9ActionPerformed
    //clearing the icon
    but9.setIcon(null);

    //setting the button text for X or O
    but9.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but9.setForeground(Color.GREEN);
        check[2][0] = 1;
    }
    else
    {
        but9.setForeground(Color.BLUE);
        check[2][0] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but9.setEnabled(false);
    }//GEN-LAST:event_but9ActionPerformed

    private void but10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but10ActionPerformed
    //clearing the icon
    but10.setIcon(null);

    //setting the button text for X or O
    but10.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but10.setForeground(Color.GREEN);
        check[2][1] = 1;
    }
    else
    {
        but10.setForeground(Color.BLUE);
        check[2][1] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but10.setEnabled(false);
    }//GEN-LAST:event_but10ActionPerformed

    private void but11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but11ActionPerformed
    //clearing the icon
    but11.setIcon(null);

    //setting the button text for X or O
    but11.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but11.setForeground(Color.GREEN);
        check[2][2] = 1;
    }
    else
    {
        but11.setForeground(Color.BLUE);
        check[2][2] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but11.setEnabled(false);
    }//GEN-LAST:event_but11ActionPerformed

    private void but12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but12ActionPerformed
    //clearing the icon
    but12.setIcon(null);

    //setting the button text for X or O
    but12.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but12.setForeground(Color.GREEN);
        check[2][3] = 1;
    }
    else
    {
        but12.setForeground(Color.BLUE);
        check[2][3] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but12.setEnabled(false);
    }//GEN-LAST:event_but12ActionPerformed

    private void but13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but13ActionPerformed
    //clearing the icon
    but13.setIcon(null);

    //setting the button text for X or O
    but13.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but13.setForeground(Color.GREEN);
        check[3][0] = 1;
    }
    else
    {
        but13.setForeground(Color.BLUE);
        check[3][0] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but13.setEnabled(false);
    }//GEN-LAST:event_but13ActionPerformed

    private void but14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but14ActionPerformed
     //clearing the icon
    but14.setIcon(null);

    //setting the button text for X or O
    but14.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but14.setForeground(Color.GREEN);
        check[3][1] = 1;
    }
    else
    {
        but14.setForeground(Color.BLUE);
        check[3][1] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but14.setEnabled(false);
    }//GEN-LAST:event_but14ActionPerformed

    private void but15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but15ActionPerformed
    //clearing the icon
    but15.setIcon(null);

    //setting the button text for X or O
    but15.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but15.setForeground(Color.GREEN);
        check[3][2] = 1;
    }
    else
    {
        but15.setForeground(Color.BLUE);
        check[3][2] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but15.setEnabled(false);
    }//GEN-LAST:event_but15ActionPerformed

    private void but16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but16ActionPerformed
    //clearing the icon
    but16.setIcon(null);

    //setting the button text for X or O
    but16.setText(startGame);

    //if statement to set array information and color of text
    if(startGame.equalsIgnoreCase("X"))
    {
        but16.setForeground(Color.GREEN);
        check[3][3] = 1;
    }
    else
    {
        but16.setForeground(Color.BLUE);
        check[3][3] = 2;
    }

    //running through both methods
    choose_a_Player();
    winningGame();

    //disabling the button until reset
    but16.setEnabled(false);
    }//GEN-LAST:event_but16ActionPerformed

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
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe_s.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacToe_s().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton but1;
    private javax.swing.JButton but10;
    private javax.swing.JButton but11;
    private javax.swing.JButton but12;
    private javax.swing.JButton but13;
    private javax.swing.JButton but14;
    private javax.swing.JButton but15;
    private javax.swing.JButton but16;
    private javax.swing.JButton but2;
    private javax.swing.JButton but3;
    private javax.swing.JButton but4;
    private javax.swing.JButton but5;
    private javax.swing.JButton but6;
    private javax.swing.JButton but7;
    private javax.swing.JButton but8;
    private javax.swing.JButton but9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblCatsGame;
    private javax.swing.JLabel lblPlayerO;
    private javax.swing.JLabel lblPlayerX;
    private javax.swing.JLabel lbl_CatsPoints;
    private javax.swing.JLabel lbl_OPoints;
    private javax.swing.JLabel lbl_XPoints;
    // End of variables declaration//GEN-END:variables
}
