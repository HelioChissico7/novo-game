
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MenuComponent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import static java.awt.image.ImageObserver.WIDTH;
import static java.lang.Thread.sleep;
import java.time.Duration;
import java.util.Random;
import static java.util.concurrent.ThreadLocalRandom.current;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.RotateTransition;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import transicao.Transition;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Helio Chissico
 */
public class JogoCarro extends JFrame implements MouseListener{
    Transition transicao = new Transition();
    public boolean clicado = false; 
  
    Random randomico;
    
    JLabel lCarro1 = new JLabel (new ImageIcon(getClass().getResource("corona13.png")));
    JLabel lCarro2 = new JLabel(new ImageIcon(getClass().getResource("corona9.png")));
    JLabel lCarro3 = new JLabel(new ImageIcon(getClass().getResource("corona14.png")));
     JLabel lCarro4 = new JLabel(new ImageIcon(getClass().getResource("corona15.png")));
     JLabel lCarro5 = new JLabel(new ImageIcon(getClass().getResource("corona32_1.png")));
     JLabel lCarro6 = new JLabel(new ImageIcon(getClass().getResource("corona35.png")));
     JLabel fundo = new JLabel( new ImageIcon(getClass().getResource("fundo.jpg")));
     JLabel lCarro7=new JLabel(new ImageIcon(getClass().getResource("corona36.png")));
     JLabel lCarro8=new JLabel(new ImageIcon(getClass().getResource("corona35.png")));
     JLabel lCarro9=new JLabel(new ImageIcon(getClass().getResource("corona34.png")));
     JLabel lCarro10=new JLabel(new ImageIcon(getClass().getResource("corona33.png")));
     JLabel lCarro11=new JLabel(new ImageIcon(getClass().getResource("corona32_1.png")));
     JLabel lCarro12=new JLabel(new ImageIcon(getClass().getResource("corona32.png")));
     JLabel lCarro13 = new JLabel(new ImageIcon(getClass().getResource("corona31.png")));
     JLabel lCarro14 = new JLabel(new ImageIcon(getClass().getResource("corona30.png")));
     JLabel lCarro15 = new JLabel(new ImageIcon(getClass().getResource("photo2.png")));
    
      public static int x;
      public static int y;
    
    public JogoCarro(){
        this.randomico = new Random();
        editarJanela();
      new Movimento().start();
      new Movimentar().start();
      new Movimento2().start();
      new Moviment03().start();
      new Moviment04().start();
      new Moviment05().start();
      new Moviment06().start();
      new Moviment07().start();
      new Moviment08().start();
      new Moviment09().start();
      new Moviment010().start();
      
           

   
    }
    
    public void editarJanela(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640,480);
        setLocationRelativeTo(null);
       setVisible(true);
        setLayout(null);
        int x = 1540;
        int y = 780;
        int width = (int)(Math.random()*1000);
        int height = (int)(Math.random()*800);
        addMouseListener(this);
          
        lCarro1.setBounds(x,y,width,height);
        lCarro2.setBounds(x,y,width,height);
        lCarro3.setBounds(x,y,width,height);
        lCarro4.setBounds(x,y,width,height);
        lCarro5.setBounds(x,y,width,height);
        lCarro6.setBounds(x,y,width,height);
        lCarro7.setBounds(x,y, width,height);
        lCarro8.setBounds(x,y, width,height);
        lCarro9.setBounds(x,y, width,height);
        lCarro10.setBounds(x,y,width,height);
        lCarro11.setBounds(x,y,width,height);
        lCarro12.setBounds(x,y,width,height);
        lCarro13.setBounds(x,y, width,height);
        lCarro14.setBounds(x,y,width,height);
        lCarro15.setBounds(x,y,width,height);
        
        fundo.setBounds(0,0,1500,700);
        add(lCarro1);
        add(lCarro2);
        add(lCarro3);
        add(lCarro4);
        add(lCarro5);
        add(lCarro6);
        add(lCarro7);
        add(lCarro8);
        add(lCarro9);
        add(lCarro10);
        add(lCarro11);
        add(lCarro12);
        add(lCarro13);
        add(lCarro14);
        add(lCarro15);
        add(fundo);
       
    }

    
    
public class Movimento extends Thread{
    
    public void run(){
      int x=0;
      
        while(true){
           
            int m = lCarro2.getLocation().y;
            int v = lCarro3.getLocation().y;
            int q = lCarro4.getLocation().y;
            int r = lCarro6.getLocation().y;

            x++;
            try {
                sleep(4);
            } catch (InterruptedException ex) {
            }
      
             
            if(x>getWidth()){
                x=new Random().nextInt();
             m= (int)(Math.random()*600);
            lCarro2.setBounds(lCarro2.getX()+50,new Random().nextInt(), 100, 200);
            }
            lCarro2.setLocation(x,m);
            
            if(x>getWidth()){
                x=new Random().nextInt();
             v= (int)(Math.random()*600);
            lCarro3.setBounds(lCarro3.getX()+50,new Random().nextInt(), 100, 200);
            }
            lCarro3.setLocation(x,v);
            
          if(x <-100){
                x=new Random().nextInt();
                q= (int)(Math.random()*600);
                lCarro4.setBounds(lCarro4.getX()+4, new Random().nextInt(), 200, 100);
              
            }
            lCarro4.setLocation(x,q);
             if(x>getWidth()){
                  x=0;
                 r= (int)(Math.random()*600);
                  lCarro6.setBounds(lCarro6.getX()+50, new Random().nextInt(), 200, 100);
              }
              lCarro6.setLocation(x, r);
           }
        }
            
        
    }

  public class Movimentar extends Thread{
      public void run(){
          int x=0;
          while(true){
            int y = lCarro5.getLocation().y;

             int w = lCarro1.getLocation().y; 
            
              x++;
              try {
                  sleep(3);
              } catch (InterruptedException ex) {
              }
                 if(x>getWidth()){
                   
                  x= new Random().nextInt();
                  y= (int)(Math.random()*600);
              lCarro5.setBounds(lCarro5.getX()+50, new Random().nextInt(), 100, 200);
           
              }
              lCarro5.setLocation(x, y); 
              
                if(x>getWidth()){
                  x= 0;
                  w= (int)(Math.random()*600);
                  
            lCarro1.setBounds(lCarro1.getX()+50,new Random().nextInt(), 100, 200);
              }
            lCarro1.setLocation(x, w);
            
          }
      }
  }
 
  public class Movimento2 extends Thread{
      public void run(){
             int x =0;
          while(true){
           
              int p = lCarro7.getLocation().y;
                 x++;
              try {
                  sleep(2);
              } catch (InterruptedException ex) {
              }
               if(x>getWidth()){
                    x=0;
               p= (int)(Math.random()*600);
               
               lCarro7.setBounds(lCarro7.getX()+50, new Random().nextInt(), 200, 100);
               
             }
               lCarro7.setLocation(x,p);
          } 
      }  
  }
        public class Moviment03 extends Thread{
            public void run(){
                int x=0;
                while(true){
                     int a = lCarro8.getLocation().y; 
                     x++;
                    try {
                        sleep(3);
                    } catch (InterruptedException ex) {
                    }
                    if(x>getWidth()){
                  x= 0;
                  a= (int)(Math.random()*600);
                  
            lCarro8.setBounds(lCarro8.getX()+50,new Random().nextInt(), 200, 100);
              }
            lCarro8.setLocation(x, a);
                }
            }
        }
         public class Moviment04 extends Thread{
            public void run(){
                int x=0;
                while(true){
                    int b = lCarro9.getLocation().y; 
                     x++;
                    try {
                        sleep(6);
                    } catch (InterruptedException ex) {
                    }
                     if(x>getWidth()){
                  x= 0;
                 b= (int)(Math.random()*600);
                  
            lCarro9.setBounds(lCarro9.getX()+50,new Random().nextInt(), 200, 100);
              }
            lCarro9.setLocation(x, b);
                }
            }
        }
          public class Moviment05 extends Thread{
            public void run(){
                int x=0;
                while(true){
                    int c = lCarro10.getLocation().y; 
                     x++;
                    try {
                        sleep(3);
                    } catch (InterruptedException ex) {
                    }
                    if(x>getWidth()){
                  x= 0;
                 c= (int)(Math.random()*600);
                  
            lCarro10.setBounds(lCarro10.getX()+50,new Random().nextInt(), 200, 100);
              }
            lCarro10.setLocation(x, c);
                }
            }
        }
           public class Moviment06 extends Thread{
            public void run(){
                int x=0;
                while(true){
                    int d = lCarro11.getLocation().y; 
                     x++;
                    try {
                        sleep(5);
                    } catch (InterruptedException ex) {
                    }
                    if(x>getWidth()){
                  x= 0;
                  d= (int)(Math.random()*600);
                  
            lCarro11.setBounds(lCarro11.getX()+50,new Random().nextInt(), 200, 100);
              }
            lCarro11.setLocation(x, d);
                }
            }
        } 
           public class Moviment07 extends Thread{
            public void run(){
                int x=0;
                while(true){
                    int e = lCarro12.getLocation().y; 
                     x++;
                    try {
                        sleep(6);
                    } catch (InterruptedException ex) {
                    }
                     if(x>getWidth()){
                  x= 0;
                  e= (int)(Math.random()*600);
                  
            lCarro12.setBounds(lCarro12.getX()+50,new Random().nextInt(), 200, 100);
              }
            lCarro12.setLocation(x, e);
                }
            }
        }
            public class Moviment08 extends Thread{
            public void run(){
                int x=0;
                while(true){
                    int f = lCarro13.getLocation().y; 
                     x++;
                    try {
                        sleep(7);
                    } catch (InterruptedException ex) {
                    }
                     if(x>getWidth()){
                  x= 0;
                  f= (int)(Math.random()*600);
            lCarro13.setBounds(lCarro13.getX()+50,new Random().nextInt(), 200, 100);
              }
            lCarro13.setLocation(x, f);
                }
            }
        }
             public class Moviment09 extends Thread{
                 public void mousePress(){
                     if(clicado=true){
                         lCarro14.remove(lCarro14);
                     }
                 }
            public void run(){
                int x=0;
                while(true){
                   int g = lCarro14.getLocation().y; 
                     x++; 
                    try {
                        sleep(12);
                    } catch (InterruptedException ex) {
                    }
                    if(x>getWidth()){
                  x= 0;
                g= (int)(Math.random()*600);
                  
            lCarro14.setBounds(lCarro14.getX()+50,new Random().nextInt(), 200, 100);
              }
            lCarro14.setLocation(x, g);
                }
            }
        }
              public class Moviment010 extends Thread{
                  public  int rotacao =0;
                  int h = lCarro15.getLocation().y; 
            public void run(){
              
                int x=0;
                while(true){
                     
                     x++;
                    try {
                        sleep(10);
                    } catch (InterruptedException ex) {
                    }
                    if(x>getWidth()){
                  x= 0;
                 h= (int)(Math.random()*600);
                  
            lCarro15.setBounds(lCarro15.getX()+50,new Random().nextInt(), 200, 100);
           
              }
            lCarro15.setLocation(x, h);
          
                }
                
            }
            
                
            
              
            
        }
      
   
        
         public static void main(String[] args) {
        new JogoCarro();
        
    }
  
@Override
    public void mousePressed(MouseEvent e) {
        if(clicado=true){
            lCarro15.remove(this);
           // x.getX();
           // y.getY();
            
        }
        
    }

   
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

  

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
    
    
}
