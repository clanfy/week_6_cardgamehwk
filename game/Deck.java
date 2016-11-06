package game;
import game.*;
import java.util.*;

public class Deck {

  private static ArrayList<Card> deck = new ArrayList<Card>();

  // public Deck(){
  //   deck = new ArrayList<Card>();
  // }

  // public void buildDeck(){
  //   for (int i = 0; i < 13; i++) {
  //     CardValue cardValue = CardValue.values()[i];
  //     for (int s = 0; s < 4; s++) {
  //       Card card = new Card (SuitType.values()[s],cardValue);
  //       deck.add(card);
  //     }
  //   }
  // }

  public void buildDeck(){
    for (CardValue value : CardValue.values()) {
      for (SuitType suit : SuitType.values()){
        deck.add(new Card(suit, value));
      }
    }
    shuffleDeck();
  }

  public Deck(){
    buildDeck();
  }

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }



}