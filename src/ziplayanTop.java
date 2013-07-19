import javax.swing.*;   
import java.awt.*;   
    
class ziplayanTop extends JFrame   
{   
  
  public ziplayanTop()
  {
      
      setResizable(false);   
      setSize(400,430);   
    
      top top1 = new top();   
      top top2 = new top();   
      top top3 = new top();   
      top top4 = new top();
      
      top1.add(top2);  
      top2.add(top3);
      top3.add(top4);
      getContentPane().add(top1);   
      setVisible(true);   
      
      Thread x = new Thread(top1);
      Thread y = new Thread(top2);
      Thread z = new Thread(top3);
      Thread w= new Thread(top4);
      x.start();
      y.start();
      z.start();
      w.start();
    }
  public static void main(String[] args)   
  {   
     new ziplayanTop();   
     
  }   
}

