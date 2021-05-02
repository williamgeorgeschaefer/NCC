public class Player {
    private String first;
    private String last;
    private int remainingFouls;

    public Player(String f, String l) {
        first = f;
        last = l;
        remainingFouls = 3;
    }

    public String getFirst(){
        return first;
    }

    public String getLast(){
        return last;
    }

    public int getRemainingFouls(){
        return remainingFouls;
    }

    public String toString(){
        return first + " " + last + " " + remainingFouls;
    }

    public int hashCode(){
        int sum = 0;
        int length = getFirst().length() + getLast().length() + 1;
        for(int i = 0; i < length; i++){
            sum += this.toString().charAt(i);
        }
        return sum;
    }

    public int hashCode2(){
        int length = getFirst().length() + getLast().length() + 1;
        int lengthCube = (int) Math.pow(length, 3);
        return lengthCube;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        else if(!(o instanceof Player)){
            return false;
        }
        Player p1 = (Player) o;
        return this.getFirst().equals(p1.getFirst()) && this.getLast().equals(p1.getLast());
    }

    public boolean assignFoul(){
        this.remainingFouls--;
        return this.isDisqualified();
    }

    public boolean isDisqualified(){
        return this.remainingFouls == 0;
    }
}
