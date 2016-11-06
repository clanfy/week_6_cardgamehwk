package game;
import game.*;
import java.util.*;

public class Game {

  private ArrayList<Player> players = new ArrayList<Player>();
  private static ArrayList<Card> deck = new ArrayList<Card>();
  // private Winchecker winChecker = new WinChecker();

  public void buildDeck(){
    for (CardValue value : CardValue.values()) {
      for (SuitType suit : SuitType.values()){
        deck.add(new Card(suit, value));
      }
    }
    shuffleDeck();
  }

  public Game(){
    buildDeck();
  }

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }


  public void addPlayer(Player player){
    players.add(player);
  }

  public int playerCount(){
    return players.size();
  }

  public void deal(){
    for (Player player : this.players){

      player.setHand(deck.get(0), deck.get(1));

      deck.remove(0);
      deck.remove(0);
    }
  }


}