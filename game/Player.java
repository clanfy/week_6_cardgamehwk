package game;
import game.*;
import java.util.*;

public class Player {

  private String name;
  private Card[] hand = new Card[2];

  public Player (String name){
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setHand(Card card1, Card card2){
    this.hand[0] = card1;
    this.hand[1] = card2;
  }

  public Card[] getHand(){
    return this.hand;
  }

  public void showHand(){
    return (this.hand[0] + this.hand[1]);
  }


}