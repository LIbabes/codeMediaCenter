import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MediaCenter {

    /**
     *
     * Variáveis de instância
     */
    private Biblioteca biblioteca;
    private Map<String,Utilizador> utilizadores;

    public void logout() {
        // TODO - implement MediaCenter.logout
        throw new UnsupportedOperationException();
    }

    /**
     *
     * Construtores
     */
    public MediaCenter() {
        this.biblioteca = new Biblioteca();
        this.utilizadores = new HashMap<String,Utilizador>();
    }

    public MediaCenter(Biblioteca biblioteca,Map<String,Utilizador> utilizadores){
        this.biblioteca= biblioteca;
        this.utilizadores = utilizadores; //clone
    }

    public MediaCenter(MediaCenter outroMediaCenter) {
        this.biblioteca = outroMediaCenter.getBiblioteca();
        this.utilizadores = outroMediaCenter.getUtilizadores();
    }


    /**
     *
     * Getters e Setters
     */
    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    public Map<String, Utilizador> getUtilizadores() {
        return utilizadores;
    }

    public void setUtilizadores(Map<String, Utilizador> utilizadores) {
        this.utilizadores = utilizadores;
    }

    /**
     *
     * @param email
     * @param nome
     * @param pass
     */
    public Utilizador newUtilizador(String email, String nome, String pass) {
        // TODO - implement MediaCenter.newUtilizador
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param email
     * @param nome
     * @param pass
     */
    public void validaRegisto(String email, String nome, String pass) {
        // TODO - implement MediaCenter.validaRegisto
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param n
     */
    public void pretendeAltNome(String n) {
        // TODO - implement MediaCenter.pretendeAltNome
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param p
     */
    public void pretendeAltPasse(String p) {
        // TODO - implement MediaCenter.pretendeAltPasse
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param id_media
     * @param id_playlist
     */
    public void removerMedia(int id_media, int id_playlist) {
        // TODO - implement MediaCenter.removerMedia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param email
     * @param password
     */
    public void insere(String email, String password) {
        // TODO - implement MediaCenter.insere
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param m
     */
    public void updateMedia(Media m) {
        // TODO - implement MediaCenter.updateMedia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param listaMedia
     */
    public void upload(List<Media> listaMedia) {
        // TODO - implement MediaCenter.upload
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param email
     */
    public void pretendeEliminar(String email) {
        // TODO - implement MediaCenter.pretendeEliminar
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param media_name
     */
    public void alterarCat(String media_name) {
        // TODO - implement MediaCenter.alterarCat
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param cat_name
     */
    public void categoriaMedia(String cat_name) {
        // TODO - implement MediaCenter.categoriaMedia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param tipo_name
     */
    public int validaTipo(String tipo_name) {
        // TODO - implement MediaCenter.validaTipo
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param artista_name
     */
    public String artistaMedia(String artista_name) {
        // TODO - implement MediaCenter.artistaMedia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param escolha
     */
    public void acedePlaylist(int escolha) {
        // TODO - implement MediaCenter.acedePlaylist
        throw new UnsupportedOperationException();
    }

    public void randomMedia() {
        // TODO - implement MediaCenter.randomMedia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param cat_name
     */
    public String findCategoria(String cat_name) {
        // TODO - implement MediaCenter.findCategoria
        throw new UnsupportedOperationException();
    }

    public void entrarComoConvidado() {
        // TODO - implement MediaCenter.entrarComoConvidado
        throw new UnsupportedOperationException();
    }

    /**
     *
     * To String
     */
    @Override
    public String toString() {
        return "MediaCenter{" +
                "biblioteca=" + biblioteca +
                ", utilizadores=" + utilizadores +
                '}';
    }

    /**
     *
     * Clone
     */
    public MediaCenter clone() {
        return new MediaCenter(this);
    }

}