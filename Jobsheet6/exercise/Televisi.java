package Jobsheet6.exercise;

public class Televisi {
    public String merek;
    public int jumlahChannel;
    private int channelAktif = 1;

    public Televisi(){

    }

    public void pindahChannel(int newChannel){
        if(newChannel > 0 && newChannel <= jumlahChannel){
            channelAktif = newChannel;
        } else {
            System.out.println("Channel tidak tersedia");
        }
    }

    public int getChannelAktif(){
        return channelAktif;
    }
}
