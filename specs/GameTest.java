import game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class GameTest {

  Game game;
  Deck deck;
  Player player1;
  Player player2;

  @Before
  public void before(){
    game = new Game();
    deck = new Deck();
    player1 = new Player ("Cookie");
    player2 = new Player("Martin");
  }

  @Test 
  public void canAddPlayer(){
    game.addPlayer(player1);
    assertEquals(1, game.playerCount());
  }

}