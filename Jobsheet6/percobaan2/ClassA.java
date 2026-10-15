package Jobsheet6.percobaan2;

public class ClassA {
    int x;
    int y;

    public void getNilai(){
        System.out.println("Nilai x: " + x);
        System.out.println("Nilai y: " + y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getJumlahXY(int x, int y){
        return x + y;
    }
}
