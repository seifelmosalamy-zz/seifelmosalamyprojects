/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seifcardgame;
import java.io.IOException;
import static java.lang.System.exit;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author seifelmosalamy
 */
public class SeifCardGame extends JFrame {
          public static  JOptionPane jop = new JOptionPane();
    
    public static Scanner sc = new Scanner(System.in);
   
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException { 
        /*TarneebGame p=new TarneebGame();
        p.setVisible(true);
        p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);*/
        
          //  Deck deck = new Deck();
            
            //deck.setVisible(true);
        // TODO code application logic here
   
        

            JOptionPane jop = new JOptionPane();
      
  
   
        jop.showMessageDialog(null,"This program lets you play the simple card game,HighLow.  A card is dealt from a deck of cards.\n "
                + "You have to predict whether the next card will be \nhigher or lower. "
                + " Your score in the game is the\n number of correct predictions you make before \n you guess wrong.");
      
      
      
      int gamesPlayed = 0;     
      int sumOfScores = 0;    
      double averageScore;    
                               
      String playAgain;       
                               
      
      do {
         int scoreThisGame;        
         scoreThisGame = play();  
         sumOfScores += scoreThisGame;
         gamesPlayed++;
         playAgain = jop.showInputDialog(null,"Play again? ");
        
      } while (playAgain.equals("Y" ) || playAgain.equals("y"));
      
      averageScore = ((double)sumOfScores) / gamesPlayed;
      
     
      jop.showMessageDialog(null,"You played " + gamesPlayed + " games.");
   jop.showMessageDialog(null,"Your average score was " + averageScore);
   
   }  
   

  

   private static int play() throws IOException {
   
      Deck deck = new Deck();  
      
      Card currentCard;  
      Card nextCard;  

      int correctGuesses ;  
      char guess;   
      
      deck.shuffle();  
char s = 0;
      correctGuesses = 0;
      currentCard = deck.dealCard();
     jop.showMessageDialog(null, "The first card is the " + currentCard);
      
      while (true) {  
          try{
         
         
          s = (jop.showInputDialog("Will the next card be higher (H) or lower (L)?  ")).charAt(0);
          }catch(NullPointerException e )
          {
             exit(0);
          }
         do {
             guess = s;
             guess = Character.toUpperCase(guess);
             if (guess != 'H' && guess != 'L') 
                System.out.print("Please respond with H or L:  ");
         } while (guess != 'H' && guess != 'L');
         
  
         
         nextCard = deck.dealCard();
         jop.showMessageDialog(null,"The next card is " + nextCard);
         
        
         
         if (nextCard.getValue() == currentCard.getValue()) {
               jop.showMessageDialog(null,"The value is the same as the previous card.");
            jop.showMessageDialog(null,"You lose on ties.  Sorry!");
            break;           }
         else if (nextCard.getValue() > currentCard.getValue()) {
            if (guess == 'H') {
                jop.showMessageDialog(null,"Your prediction was correct.");
                correctGuesses++;
            }
            else {
                jop.showMessageDialog(null,"Your prediction was incorrect.");
                break;  
            }
         }
         else {  // nextCard is lower
            if (guess == 'L') {
                jop.showMessageDialog(null,"Your prediction was correct.");
                correctGuesses++;
                break;  
            }
         }
         
        
         
         currentCard = nextCard;
       

         jop.showMessageDialog(null,"The card is " + currentCard);
         
      } 
      
   
      jop.showMessageDialog(null,"The game is over. You made " + correctGuesses  +  " correct predictions.");
     
   
      
      return correctGuesses;
      
   }  
   

}
        
        


    
    

