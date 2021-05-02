public class Bucket {
    public static class Node {
        private Player player;
        private Node next;
        public Node(Player player, Node next){
            this.player = player;
            this.next = next;
        }
    }
    private Node head;
    private int length;

    public Bucket() {
        head = null;
        length = 0;
    }

    public void insert(Player p){
        head = new Node(p, head);
        length++;
    }

    public Player find(String first, String last){
        Node current = head;
        Player p = new Player(first, last);
        while(current != null && !current.player.equals(p)){
            current = current.next;
        }
        if(current == null){
            return null;
        }
        return current.player;
    }

    public void printBucket(){
        Node current = head;
        while(current != null){
            System.out.println(current.player);
            current = current.next;
        }
    }
}
