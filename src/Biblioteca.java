import java.util.*;

public class Biblioteca{

    /**
     *
     * Variáveis de instância
     */
    //private Collection<Media> listaMediaBiblioteca;
    private HashMap<Integer,Media> listaMediaBiblioteca;

    /**
     *
     * Construtores
     */
    public Biblioteca() {
        this.listaMediaBiblioteca = new HashMap<Integer,Media>();
    }

    public Biblioteca(HashMap<Integer,Media> listaMediaBiblioteca){
        this.listaMediaBiblioteca = listaMediaBiblioteca;
    }

    public Biblioteca(Biblioteca outraBiblioteca) {
    }

    /**
     *
     * Getters e Setters
     */
    public HashMap<Integer, Media> getListaMediaBiblioteca() {
        return listaMediaBiblioteca;
    }

    public void setListaMediaBiblioteca(HashMap<Integer, Media> listaMediaBiblioteca) {
        this.listaMediaBiblioteca = listaMediaBiblioteca;
    }

    public void adiciona(Media m){
       //this.listaMediaBiblioteca.put(m.getIdMedia(),m.clone());
    }
    /**
     *
     * @param artista_nome
     */
    public Media getMediaPorArtista(String artista_nome) {
        // TODO - implement Biblioteca.getMediaPorArtista
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param cat_name
     */
    public Media getMediaPorCat(String cat_name) {
        // TODO - implement Biblioteca.getMediaPorCat
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param media_name
     */
    public Media findMedia(int media_name) {
        // TODO - implement Biblioteca.findMedia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param media_name
     */
    public void removeMedia(int media_name) {
        // TODO - implement Biblioteca.removeMedia
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param idMedia
     */
    public void verificaConteudo(int idMedia) {
        // TODO - implement Biblioteca.verificaConteudo
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param m
     */
    public void updateMedia(Media m) {
        // TODO - implement Biblioteca.updateMedia
        throw new UnsupportedOperationException();
    }

    public List<Media> makeTempL() {
        // TODO - implement Biblioteca.makeTempL
        throw new UnsupportedOperationException();
    }

    /**
     *
     * To String
     */
    @Override
    public String toString() {
        return "Biblioteca{" +
                "listaMediaBiblioteca=" + listaMediaBiblioteca +
                '}';
    }

    /**
     *
     * Clone
     */
    public Biblioteca clone() {
        return new Biblioteca(this);
    }

}