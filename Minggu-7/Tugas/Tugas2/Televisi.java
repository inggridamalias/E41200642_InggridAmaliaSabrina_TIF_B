/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author inggridamaliasabrina
 */
public class Televisi extends User {

    public String Deskripsi;
    public int jumlahChannel;
    public String[] semuaChannel;
    public String[] channelFavorit;
    public int Volume;
    public int ChannelAktif;

    public Televisi() {
        Deskripsi = "Inggrid belum membeli TV";
        if (jumlahChannel == 0) {
            System.out.println("Belum ada channel yang diset!");
        }
    }

    public void Televisi(String deskripsi) {
        this.Deskripsi = deskripsi;
        if (jumlahChannel == 0) {
            System.out.println("Belum ada channel yang diset!");
        }
    }

    public Televisi(String deskripsi, int jumlahchannel) {
        this.Deskripsi = deskripsi;
        this.jumlahChannel = jumlahchannel;
    }

    public String getDeskripsi() {
        return Deskripsi;
    }

    public void setChannelAktif(int channelAktif) {
        if (channelAktif < 10) {
            System.out.println("Pindah channel ke : " + semuaChannel[channelAktif]);
        } else {
            System.out.println("Channel yang Anda inginkan belum diset");
        }
    }

    public void setVolume(int volume) {
        this.Volume = volume;
        System.out.println("Intensitas volume sekarang : " + Volume);
    }

    public int getVolume() {
        return Volume;
    }

    public void setChannels(String[] semuachannel) {
        if (semuachannel.length > 10) {
            System.out.println("Maaf TV ini hanya dapat menyimpan 10 channel");
        } else {
            this.semuaChannel = semuachannel;
            this.channelFavorit = semuaChannel;
            System.out.println("Informasi berhasil diupdate!");
        }
    }

    public String[] getChannels() {
        System.out.println("Belum ada channel yang diset!");
        return semuaChannel;
    }

    void setModusTampilan(int TELETEXT) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setHalamanTeletext(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setDiscTray(String the_Matrix) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void playCD() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}

