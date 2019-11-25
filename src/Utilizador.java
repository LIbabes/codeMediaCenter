import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utilizador {

    /**
     *
     * Variáveis de instância
     */
    private HashMap<Integer,Playlist> listaPlaylists;
    private String nome;
    private String email;
    private String pass;

    /**
     *
     * Construtores
     */
    public Utilizador() {
        this.listaPlaylists = new HashMap<Integer,Playlist>();
        this.nome = "";
        this.email = "";
        this.pass = "";
    }

    public Utilizador(HashMap<Integer,Playlist> listaPlaylists,String nome, String email, String pass){
        this.listaPlaylists= listaPlaylists;
        this.nome = nome;
        this.email = email;
        this.pass = pass;
    }

    public Utilizador(Utilizador outroUtilizador) {
        this.listaPlaylists = outroUtilizador.getListaPlaylists();
        this.nome = outroUtilizador.getNome();
        this.email = outroUtilizador.getEmail();
        this.pass = outroUtilizador.getPass();
    }

    /**
     *
     * @param email
     * @param nome
     * @param passe
     */
    public Utilizador(String email, String nome, String passe) {
        // TODO - implement Utilizador.Utilizador
        throw new UnsupportedOperationException();
    }

    /**
     *
     * Getters e Setters
     */
    public HashMap<Integer, Playlist> getListaPlaylists() {
        return listaPlaylists;
    }

    public void setListaPlaylists(HashMap<Integer, Playlist> listaPlaylists) {
        this.listaPlaylists = listaPlaylists;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     *
     * @param id_playlist
     * @param idMedia
     */
    public void buscaPlaylist(int id_playlist, int idMedia) {
        // TODO - implement Utilizador.buscaPlaylist
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param password
     */
    public int verificaPass(String password) {
        // TODO - implement Utilizador.veridicaPass
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param id
     */
    public void entraMenuUtilizador(int id) {
        // TODO - implement Utilizador.entraMenuUtilizador
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param lm
     */
    public void addPlaylist(List<Media> lm) {
        // TODO - implement Utilizador.addPlaylist
        throw new UnsupportedOperationException();
    }

    /**
     *
     * To String
     */
    @Override
    public String toString() {
        return "Utilizador{" +
                "listaPlaylists=" + listaPlaylists +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }

    /**
     *
     * Clone
     */
    public Utilizador clone() {
        return new Utilizador(this);
    }

}