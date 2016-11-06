package game;
import game.*;
import java.util.*;

public class Deck {

  private static ArrayList<Card> deck = new ArrayList<Card>();

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