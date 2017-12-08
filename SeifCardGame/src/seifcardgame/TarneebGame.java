/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package seifcardgame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayman
 *//*
public class TarneebGame extends JFrame implements MouseMotionListener
{
   
    ArrayList <PlayingCard> Card=new ArrayList<PlayingCard>();
   public static String DirectoryPath="/Users/seifelmosalamy/Desktop/AymanTarneeb/Cards";
    //ArrayList<JLabel> ArrayOfLabel=new ArrayList<JLabel>();
    JLabel XCor=new JLabel("XCor");
    JLabel YCor=new JLabel("YCor");
    
    public TarneebGame()
    {
        setTitle("seif Ver 1.0");
        GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        setSize(env.getMaximumWindowBounds().width, env.getMaximumWindowBounds().height);
       
        setLayout(null);
       XCor.setBounds(10,840,120,30);
       YCor.setBounds(130,840,120,30);
        add(XCor);
        add(YCor);
    
        //setLayout(new FlowLayout());
        int x=0;
        int y=10;
        
        for (int i=0;i<52;i++)
        {
            
        }
       Card.add(p);
            JLabel j=new JLabel();
            j.setIcon(new ImageIcon(new ImageIcon(Card.get(0).ImageName).getImage().getScaledInstance(240, 320, Image.SCALE_DEFAULT)));
            add(j);
            j.addMouseMotionListener(this);
            j.setBounds(x,y, 240, 320);
       //   p.Holder=j;
            //x+=240;
             
           // add(p.Holder);
           
        }
        
        addMouseMotionListener(this);
       
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        XCor.setText(""+e.getX());
        YCor.setText(""+e.getXOnScreen());
        for (PlayingCard p:Card)
        {
        if (p.Holder.equals(e.getSource()))
        {
            //JOptionPane.showMessageDialog(null, "Label 0");
           // int i=Cards.indexOf(e.getSource());
            p.Holder.setBounds(e.getXOnScreen()-10,e.getYOnScreen()-20, 240, 320);
           // XCor.setText(""+p.Value);
            
        }
        }
        
      
        //System.out.println("E"+e.getSource().toString());
    }

    @Override
    public void mouseMoved(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

}
*/