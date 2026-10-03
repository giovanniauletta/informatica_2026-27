import java.util.Random;
public class Dado {
    private int facce;
    public Dado(){
        this.facce = 6;
    }
    public Dado(int n){
        if (n < 2 || n == 3){
            this.facce = 6;
        } else {
            this.facce = n;
        }
    }
    public Dado(Dado d){
        this.facce = d.facce;
    }
    public int lancia(){
        Random r = new Random();
        return r.nextInt(facce) + 1;
    }
    @Override
    public String toString(){
        return "Dado con " + facce + " facce";
    }
}
