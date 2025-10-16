/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matchingcardgame;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WinLose extends JFrame{
    
    
     JPanel mainpanel = new JPanel(new GridLayout(2, 1, 0, 5));
    JPanel iconpanel = new JPanel(new GridLayout(1, 3, 5, 0) );
    
    JLabel star1 = new JLabel();
    JLabel star2 = new JLabel();
    JLabel star3 = new JLabel();
    
    JLabel win = new JLabel("YOU WIN", JLabel.CENTER);
    JLabel lose = new JLabel("YOU LOSE", JLabel.CENTER);
    
    public WinLose(){
    
    mainpanel.setBackground(new Color(255, 252, 210));
    iconpanel.setBackground(new Color(255, 252, 210));
    
    
    star1.setIcon(new ImageIcon("normal-star.png"));
    star2.setIcon(new ImageIcon("normal-star.png"));
    star3.setIcon(new ImageIcon("dark-star.png"));
    
    star1.setSize(80, 80);
    star2.setSize(120, 120);
    star3.setSize(80, 80);
    
    
    iconpanel.add(star1);
    iconpanel.add(star2);
    iconpanel.add(star3);
    
    
    win.setFont(new Font("SansSerif", Font.BOLD, 40));
    win.setForeground(new Color(255, 51, 170));
    
    lose.setFont(new Font("SansSerif", Font.BOLD, 40));
    win.setForeground(new Color(120, 40, 150));
    
    //there will be an if condition to deside the winner&loser 
    
    mainpanel.add(iconpanel);
    mainpanel.add(win);
     
    add(mainpanel);
    }
    
    
  }
