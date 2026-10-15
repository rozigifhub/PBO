package Jobsheet6.exercise;

public class TelevisiModern extends Televisi {
    private String displayMode;
    private String dvd;

    public TelevisiModern(String mrk, int channelCount){
        merek = mrk;
        jumlahChannel = channelCount;
    }

    public void gantiModusTampilan(String mode){
        displayMode = mode;
    }

    public void mainkanDVD(){
        if(dvd == null){
            System.out.println("Sedang memainkan DVD: kosong");
        } else {
            System.out.println("Sedang memainkan DVD: " + dvd);
        }
    }

    public void masukkanDVD(String dvdTitle){
        dvd = dvdTitle;
    }
}
