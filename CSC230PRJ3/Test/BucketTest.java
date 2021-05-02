import org.junit.Test;

public class BucketTest {

    @Test
    public void printTest(){
        Bucket myBucket = new Bucket();
        Player p1 = new Player("William", "Schaefer");
        Player p2 = new Player("James", "Pecoraro");
        Player p3 = new Player("Milo", "Pecoraro");
        Player p4 = new Player("Luna", "Pecoraro");
        myBucket.insert(p1);
        myBucket.insert(p2);
        myBucket.insert(p3);
        myBucket.insert(p4);
        myBucket.printBucket();
    }

    @Test
    public void findTest(){
        Bucket myBucket = new Bucket();
        Player p1 = new Player("William", "Schaefer");
        Player p2 = new Player("James", "Pecoraro");
        Player p3 = new Player("Milo", "Pecoraro");
        Player p4 = new Player("Luna", "Pecoraro");
        myBucket.insert(p1);
        myBucket.insert(p2);
        myBucket.insert(p3);
        myBucket.insert(p4);
        assert myBucket.find("Elizabeth", "Pecoraro") == null;
        assert myBucket.find("James", "Pecoraro") == p2;
    }

    @Test
    public void disqualificationTest(){
        Bucket myBucket = new Bucket();
        Player p1 = new Player("William", "Schaefer");
        myBucket.insert(p1);
        p1.assignFoul();
        assert p1.isDisqualified() == false;
        p1.assignFoul();
        assert p1.isDisqualified() == false;
        p1.assignFoul();
        assert p1.isDisqualified() == true;
    }
}
