import game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

  Player player1;
  Player player2;
  Card card1;
  Card card2;

  @Before
  public void before(){
    player1 = new Player ("Cookie");
    player2 = new Player("Martin");
    card1 = new Card(SuitType.HEARTS, CardValue.SIX);
    card2 = new Card(SuitType.DIAMONDS, CardValue.TWO);
    player1.setHand(card1, card2);
  }

  @Test
  public void PlayerHasName(){
    assertEquals("Cookie", player1.getName());
  }

// player 2 has not had .setHand called on it, assert null checks that null has been returned
  @Test 
  public void handStartsEmpty(){
    assertNull(player2.getHand()[0]);
  }

  @Test
  public void canSetHand(){
    assertEquals(card2, player1.getHand()[1]);
  }

  @Test
  public void canShowHand(){

    assertEquals("SIX of HEARTS, TWO of DIAMONDS", player1.showHand());
  }

}