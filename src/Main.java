import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {
    // Main method
    public static void main(String[] args) {

        Media m0 = new Media();
        m0.setIdMedia(0);
        m0.setLink("seeYouAgain.wav");
        Media m1 = new Media();
        m1.setIdMedia(1);
        m1.setLink("zombie.wav");
        Media m2 = new Media();
        m2.setIdMedia(2);
        m2.setLink("useSomebody.wav");

        Biblioteca biblioteca = new Biblioteca();
        HashMap<Integer,Media> biblio = new HashMap<Integer,Media>();
        biblio.put(0,m0);
        biblio.put(1,m1);
        biblio.put(2,m2);
        biblioteca.setListaMediaBiblioteca(biblio);

        Playlist playlist1 = new Playlist();
        HashMap<Integer,Media> pl1 = playlist1.getListaMediaPlaylist();
        pl1.put(0,m0);
        pl1.put(1,m1);
        playlist1.setListaMediaPlaylist(pl1);

        Playlist playlist2 = new Playlist();
        HashMap<Integer,Media> pl2 = playlist1.getListaMediaPlaylist();
        pl2.put(0,m2);
        playlist2.setListaMediaPlaylist(pl2);

        Utilizador user1 = new Utilizador();
        user1.setNome("Pedro Gomes");
        user1.setEmail("pedrogomes2000@gmail.com");
        user1.setPass("12345");
        HashMap<Integer,Playlist> lp1 = user1.getListaPlaylists();
        lp1.put(1,playlist1);
        lp1.put(2,playlist2);
        user1.setListaPlaylists(lp1);


        //TESTE DO PLAYER DA PLAYLIST 1 DO UTILIZADOR PEDRO GOMES

        //System.out.println("Insira o número da playlist que pretende ouvir (por agora este user tem 2 playlists, a 1 e a 2).");
        //Scanner scan = new Scanner(System.in);
        //int nb = scan.nextInt();
        //System.out.println("Playing playlist "+ nb);
        /*while(i<user1.getListaPlaylists().size()) {
            Playlist playlistAtual = user1.getListaPlaylists().get(nb);
            int i = 0;
            while (i < playlistAtual.getListaMediaPlaylist().size()) {
                playMedia(playlistAtual.getListaMediaPlaylist().get(i).getLink());
                i++;
            }*/
        //i++;
        //}

        int i = 0;
        while (i < playlist1.getListaMediaPlaylist().size()) {
            playMedia(playlist1.getListaMediaPlaylist().get(i).getLink());
            i++;
        }
    }

    public static void playMedia(String filepath){

        try {
            File media = new File(filepath);

            if (media.exists()) {
                AudioInputStream mediaInput = AudioSystem.getAudioInputStream(media);
                //InputStream url = new URL(filepath).openStream();
                //AudioInputStream mediaInput = AudioSystem.getAudioInputStream(url);
                Clip clip = AudioSystem.getClip();
                clip.open(mediaInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);

                JOptionPane.showMessageDialog(null,"Press OK to pause song.");
                long clipTimePosition = clip.getMicrosecondPosition();
                clip.stop();

                JOptionPane.showMessageDialog(null,"Press OK to resume song.");
                clip.setMicrosecondPosition(clipTimePosition);
                clip.start();

                JOptionPane.showMessageDialog(null,"Press OK to listen to the next song.");
                clip.stop();
            } else {
                System.out.println("Can't found file");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}