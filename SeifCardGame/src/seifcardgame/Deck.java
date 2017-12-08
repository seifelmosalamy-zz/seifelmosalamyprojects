
package seifcardgame;

/**
 *
 * @author seifelmosalamy
 */
import java.awt.Graphics;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import static seifcardgame.Card.CLUBS;
import static seifcardgame.Card.DIAMONDS;
import static seifcardgame.Card.HEARTS;
import static seifcardgame.Card.ImageNameNew;
import static seifcardgame.Card.SPADES;
import static seifcardgame.Deck.deck;
import sun.java2d.pipe.DrawImage;
//import seifcardgame.TarneebGame;

public class Deck extends JFrame {
private JLabel labelDeck ; 
public String SpadesDirectoryPath = "/Users/seifelmosalamy/Desktop/AymanTarneeb/Cards/Spades/" , ClubsDirectoryPath ="/Users/seifelmosalamy/Desktop/AymanTarneeb/Cards/Clubs/" ,
        HeartDirectoryPath = "/Users/seifelmosalamy/Desktop/AymanTarneeb/Cards/Hearts/" , DiamondsDirectoryPath = "/Users/seifelmosalamy/Desktop/AymanTarneeb/Cards/Diamonds/"
         ; 


   JLabel[] Jlabels = new JLabel[52];
    public static  Card[] deck;
    private int cardsUsed;
   
  /*  public Deck(boolean includeJokers ) {
        if (includeJokers)
            deck = new Card[54];
    
        else*/
     public Deck() throws IOException{
            deck = new Card[52];
        int cardCt = 0; // How many cards have been created.
        for ( int suit = 0; suit <= 3; suit++ ) {
            for ( int value = 1; value <= 13; value++ ) {
                
                 
                deck[cardCt] = new Card(value,suit);
                cardCt++;
            }
        }
                cardsUsed = 0;
        
        for ( int s = 0; s <= 3; s++ ) {
            for ( int v = 1; v <= 13; v++ ) {
                
                //spades
                 if(deck[s].getSuit() == SPADES && deck[s].getValue() == 1)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"ace_of_spades.png";
                 }
                 if(deck[s].getSuit() == SPADES && deck[s].getValue() == 2)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"2_of_spades.png";
                 }
                 if(deck[s].getSuit() == SPADES && deck[s].getValue() == 3)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"3.png";
                 } 
                 if(deck[s].getSuit() == SPADES && deck[s].getValue() == 4)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"4_of_spades.png";
                 }
                  if(deck[s].getSuit() == SPADES && deck[s].getValue() == 5)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"5_of_spades.png";
                 }
                 if(deck[s].getSuit() == SPADES && deck[s].getValue() == 6)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"6_of_spades.png";
                 }
              
                if(deck[s].getSuit() == SPADES && deck[s].getValue() == 7)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"7_of_spades.png";
                 }
                 if(deck[s].getSuit() == SPADES && deck[s].getValue() == 8)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"8_of_spades.png";
                 }
                  if(deck[s].getSuit() == SPADES && deck[s].getValue() == 9)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"9_of_spades.png";
                 }
                   if(deck[s].getSuit() == SPADES && deck[s].getValue() == 9)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"9_of_spades.png";
                 }
                    if(deck[s].getSuit() == SPADES && deck[s].getValue() == 10)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"10_of_spades.png";
                 }
                     if(deck[s].getSuit() == SPADES && deck[s].getValue() == 11)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"jack_of_spades.png";
                 }
                      if(deck[s].getSuit() == SPADES && deck[s].getValue() == 12)
                 {
                    ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"queen_of_spades.png";
                 }
                           if(deck[s].getSuit() == SPADES && deck[s].getValue() == 13)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = SpadesDirectoryPath +"king_of_spades.png";
                 }
                           
                           
                     //Hearts
                     
                     
                     
                     
                             if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 1)
                 {
                     ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"ace_of_hearts.png";
                 }
                    if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 2)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"2_of_hearts.png";
                 }
                          if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 3)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"3_of_hearts.png";
                 }
                      
                           if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 4)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"4_of_hearts.png";
                 }
                                 if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 5)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"5_of_hearts.png";
                 }
                                          if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 6)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"6_of_hearts.png";
                 }
                   
                                if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 7)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"7_of_hearts.png";
                 }
                     if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 8)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"8_of_hearts.png";
                 }
                       if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 9)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"9_of_hearts.png";
                 }
                    if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 10)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"10_of_hearts.png";
                 }
                   if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 11)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"jack_of_hearts.png";
                 }
                  if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 12)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"queen_of_hearts.png";
                 }
                      if(deck[s].getSuit() == HEARTS && deck[s].getValue() == 13)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = HeartDirectoryPath +"king_of_hearts.png";
                 }        
                      
                      
                      //Clubs 
                      
                      
                      
                         if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 1)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"ace_of_clubs.png";
                 } 
                         
                    if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 2)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"2_of_clubs.png";
                 }      
                      if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 3)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"3_of_clubs.png";
                 }    
                         if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 4)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"4_of_hearts.png";
                 } 
                       if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 5)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"5_of_clubs.png";
                 }      
                    
                          if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 6)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"6_of_clubs.png";
                 }
                             if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 7)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"7_of_clubs.png";
                 } 
                                       if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 8)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"8_of_clubs.png";
                 }
                                                 if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 9)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"9_of_clubs.png";
                 }           if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 10)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"10_of_clubs.png";
                 }           if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 11)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"jack_of_clubs.png";
                 } 
                           if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 12)
                 {
                  ImageNameNew = null ;  deck[s].ImageNameNew = ClubsDirectoryPath +"queen_of_clubs.png";
                 } 
                                     if(deck[s].getSuit() == CLUBS && deck[s].getValue() == 13)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = ClubsDirectoryPath +"king_of_clubs.png";
                 } 
                                     
                                     //Diamonds 
                   
                          if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 1)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"ace_of_diamonds.png";
                 }                  
                                     
                              if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 2)
                 {
                  ImageNameNew = null ;  deck[s].ImageNameNew = DiamondsDirectoryPath +"2_of_diamonds.png";
                 }  
                                         if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 3)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"3_of_diamonds.png";
                 } 
                              if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 4)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"4_of_diamonds.png";
                 }      
                              if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 5)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"5_of_diamonds.png";
                 } 
                             if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 6)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"6_of_diamonds.png";
                 } 
                             if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 7)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"7_of_diamonds.png";
                 } 
                             if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 8)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"8_of_diamonds.png";
                 } 
                                if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 9)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"9_of_diamonds.png";
                 } 
                                  if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 10)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"10_of_diamonds.png";
                 } 
                                             if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 11)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"jack_of_diamonds.png";
                 } 
           if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 12)
                 {
                  ImageNameNew = null ;  deck[s].ImageNameNew = DiamondsDirectoryPath +"queen_of_diamonds.png";
                 }     
                    if(deck[s].getSuit() == DIAMONDS && deck[s].getValue() == 13)
                 {ImageNameNew = null ;
                    deck[s].ImageNameNew = DiamondsDirectoryPath +"king_of_diamonds.png";
                 }   
            }
            
            
        }
        

            
        
        shuffle();
       labelDeck = new JLabel();
       GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
        
        setSize(env.getMaximumWindowBounds().width, env.getMaximumWindowBounds().height);
        
      labelDeck.addMouseListener(new MouseWatcher());
         JPanel panel = new JPanel();
         panel.setSize(1600,1000);
        // setVisible(true);
         //add(panel);
         int ctr1;
        for ( int i = 0 ; i <52 ; i++ )
        {
            
           labelDeck.setIcon(new ImageIcon(deck[i].ImageNameNew));  
           //panel.add(labelDeck);
          add(labelDeck); 
        
            
            setTitle("The Bank Game ");
       
    }
        JLabel lbl = new JLabel ();
        //lbl.setIcon(new ImageIcon(deck[30].ImageNameNew));
        add(lbl);
     }
         
     

    

   
    public void shuffle() {
        for ( int i = deck.length-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }
    public int cardsLeft() {
        return deck.length - cardsUsed;
    }

  
    public Card dealCard() {
        if (cardsUsed == deck.length)
            throw new IllegalStateException("No cards are left in the deck.");
        cardsUsed++;
        return deck[cardsUsed - 1];
       
    }

    
    public boolean hasJokers() {
        return (deck.length == 54);
    }

    
    private class MouseWatcher implements MouseListener { 

        @Override
        public void mouseClicked(MouseEvent e) {
            labelDeck.setBounds(0,0,200,200);
        }

        @Override
        public void mousePressed(MouseEvent e) {
       
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
        
        
        
        // TODO add your handling code here:
    } 
@Override
    public void paint (Graphics g)
         
        {
            super.paint(g);
            try
        {
            BufferedImage img = ImageIO.read(new File (deck[1].ImageNameNew) );
            g.drawImage(img, 1600, 11, null);}catch(IOException  e){}
        }
} 