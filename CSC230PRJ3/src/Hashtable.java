public class Hashtable {
    private int numBuckets;
    private Bucket[] data;
    private int numPlayers;

    public Hashtable(int s){
        numBuckets = s;
        data = new Bucket[s];
        numPlayers = 0;
    }

    public boolean isEmpty(){
        return numPlayers == 0;
    }

    public int getNumBuckets(){
        return numBuckets;
    }

    public void expandCapacity(){
        int newSize = 2 * numBuckets;
        while(!isPrime(newSize)){
            newSize++;
        }
        Bucket[] data2 = new Bucket[newSize];
        System.arraycopy(data, 0, data2, 0, data.length);
        data = data2;
    }

    public boolean isPrime(int n){
        for(int i = 2; i < Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public void insert(Player p){
        int index = p.hashCode() % numBuckets;
        if(data[index] == null){
            data[index] = new Bucket();
        }
        data[index].insert(p);
    }

    public void printHashTable(){
        for(int i = 0; i < numBuckets; i++){
            System.out.println("Bucket " + i + ": ");
            if(data[i] != null){
                data[i].printBucket();
            }
        }
    }
}
