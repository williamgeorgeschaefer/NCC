import org.junit.Test;

public class HashtableTest {

    @Test
    public void insertTest(){
        Hashtable myTable = new Hashtable(11);
        Player p1 = new Player("William", "Schaefer");
        Player p2 = new Player("James", "Pecoraro");
        Player p3 = new Player("Milo", "Pecoraro");
        Player p4 = new Player("Luna", "Pecoraro");
        myTable.insert(p1);
        myTable.insert(p2);
        myTable.insert(p3);
        myTable.insert(p4);
        myTable.printHashTable();
    }
}
