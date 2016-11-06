import game.*;
import static org.junit.Assert.*;
import org.junit.*;

public class PlayerTest {

  Player player;

  @Before
  public void before(){
    player = new Player ("Keith");
    // Player player2 = new Player("Zsolt");
  }

  @Test
  public void testPlayerHasName(){
    assertEquals("Keith", player.getName());
  }

}