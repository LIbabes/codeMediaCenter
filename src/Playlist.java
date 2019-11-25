import java.util.*;

public class Playlist {

    /**
     *
     * Variáveis de instância
     */
    private HashMap<Integer,Media> listaMediaPlaylist;
    private int idPlaylist;
    //private Media atual;

    /**
     *
     * Construtores
     */
    public Playlist() {
        this.listaMediaPlaylist = new HashMap<Integer,Media>();
        this.idPlaylist = 0;
    }

    public Playlist(HashMap<Integer,Media> listaMediaPlaylist,int idPlaylist){
        this.listaMediaPlaylist= listaMediaPlaylist;
        this.idPlaylist = idPlaylist; //clone
    }

    public Playlist(Playlist outraPlaylist) {
        this.listaMediaPlaylist = outraPlaylist.getListaMediaPlaylist();
        this.idPlaylist = outraPlaylist.getIdPlaylist();
    }

    /**
     *
     * Getters e Setters
     */
    public HashMap<Integer, Media> getListaMediaPlaylist() {
        return listaMediaPlaylist;
    }

    public void setListaMediaPlaylist(HashMap<Integer, Media> listaMediaPlaylist) {
        this.listaMediaPlaylist = listaMediaPlaylist;
    }

    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    /**
     *
     * @param idMedia
     */
    public void findMedia(int idMedia) {
    }

    /**
     *
     * @param idMedia
     */
    public void remove(int idMedia) {
        // TODO - implement Playlist.remove
        throw new UnsupportedOperationException();
    }

    /**
     *
     * To String
     */
    @Override
    public String toString() {
        return "Playlist{" +
                "listaMediaPlaylist=" + listaMediaPlaylist +
                ", idPlaylist=" + idPlaylist +
                '}';
    }

    /**
     *
     * Clone
     */
    public Playlist clone() {
        return new Playlist(this);
    }
}