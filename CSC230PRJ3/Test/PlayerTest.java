import org.junit.Test;

public class PlayerTest {
    @Test
    public void playerTest(){
        Player newPlayer = new Player("William", "Schaefer");
        System.out.println(newPlayer);
    }
    @Test
    public void playerCompare(){
        Player player1 = new Player("William", "Schaefer");
        Player player2 = new Player("William", "Schaefer");
        assert(player1.equals(player2));
    }

    @Test
    public void playerHash(){
        Player player1 = new Player("William", "Schaefer");
        assert player1.hashCode() == 1552;
    }

    @Test
    public void playerHash2(){
        Player player1 = new Player("William", "Schaefer");
        assert player1.hashCode2() == 4096;
    }
}
