package game;
import game.*;
import java.util.*;

public class Card {

  private SuitType suit;
  private CardValue cardValue;

  public Card(SuitType suit, CardValue cardValue) {
    this.suit = suit;
    this.cardValue = cardValue;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public void setSuit(SuitType suit){
    this.suit = suit;
  }

  public CardValue getCardValue(){
    return this.cardValue;
  }

  public void setCardValue(CardValue cardValue){
    this.cardValue = cardValue;
  }

  public String showCard(){
    return this.cardValue.toString() + " of " + this.suit.toString();
  }
}

