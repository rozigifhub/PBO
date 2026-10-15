package Jobsheet6.percobaan2;

public class ClassB extends ClassA {
    int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getNilaiZ(){
        System.out.println("Nilai z: " + z);
    }

    public void getJumlah(ClassA a){
        System.out.println("Jumlah: " + (a.getJumlahXY(a.x, a.y) + z));
    }
}
