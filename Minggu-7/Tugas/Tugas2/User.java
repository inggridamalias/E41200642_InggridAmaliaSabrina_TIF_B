package Tugas2;

/**
 *
 * @author inggridamaliasabrina
 */
public class User {

    public static void main(String[] args) {
        Televisi tv = new TelevisiModern("TV Modern, 29 inches", 100);
        String[] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                 "METRO TV", "TRANS TV", "TPI", "TV 7",
                                 "TVRI", "TV G", "ANTV"};
        String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
            "METRO TV", "TRANS TV", "TPI", "TV 7"};

        System.out.println("Inggrid, membeli Televisi : " + tv.getDeskripsi());

        tv.getChannels();
        tv.setChannels(semuaChannel);
        tv.setChannels(channelFavorit);

        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);

       
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.playCD();
        tv.setDiscTray("The Matrix");
        tv.playCD();
    }
}
    

