package game;
import game.*;
import java.util.*;

public class Game {

  private ArrayList<Player> players = new ArrayList<Player>();
  private static Deck deck = new Deck();
  // private Winchecker winChecker = new WinChecker();

  public void addPlayer(Player player){
    players.add(player);
  }

  public int playerCount(){
    return players.size();
  }



}