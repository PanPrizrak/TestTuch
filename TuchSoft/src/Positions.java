public class Positions {
    private int position;
    private int k;

    public Positions() {
    }

    public Positions(int position, int k) {
        this.position = position;
        this.k = k;
    }

    public void setPisitions(int position, int k){
        this.position = position;
        this.k = k;
    }

    public int getPosition() {
        return position;
    }

    public int getK() {
        return k;
    }
}
