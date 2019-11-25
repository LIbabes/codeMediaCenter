import java.util.Objects;

public class Media {

    /**
     *
     * Variáveis de instância
     */
    private int idMedia;
    private String cat;
    private Reprodutor rep;
    //para um primeiro teste:
    private String link;

    /**
     *
     * Construtores
     */
    public Media() {
        this.idMedia = 0;
        this.cat = "";
        this.rep = new Reprodutor();
        this.link = "";
    }

    public Media(int idMedia ,String cat,Reprodutor rep, String link){
        this.idMedia= idMedia;
        this.cat= cat; //clone
        this.rep= rep; //clone
        this.link = link;
    }

    public Media(Media outraMedia) {
        this.idMedia = outraMedia.getIdMedia();
        this.cat = outraMedia.getCat();
        this.rep = outraMedia.getRep();
        this.link = outraMedia.getLink();
    }

    /**
     *
     * Getters e Setters
     */
    public int getIdMedia() {
        return idMedia;
    }

    public void setIdMedia(int idMedia) {
        this.idMedia = idMedia;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public Reprodutor getRep() {
        return rep;
    }

    public void setRep(Reprodutor rep) {
        this.rep = rep;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return idMedia == media.idMedia &&
                Objects.equals(cat, media.cat) &&
                Objects.equals(rep, media.rep) &&
                Objects.equals(link, media.link);
    }

    /**
     *
     * @param cat_name
     */
    public void alteraCategoria(String cat_name) {
        // TODO - implement Media.alteraCategoria
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param artista_name
     */
    public void comparaArtista(String artista_name) {
        // TODO - implement Media.comparaArtista
        throw new UnsupportedOperationException();
    }

    /**
     *
     * @param cat_name
     */
    public void comparaCategoria(String cat_name) {
        // TODO - implement Media.comparaCategoria
        throw new UnsupportedOperationException();
    }

    /**
     *
     * To String
     */
    @Override
    public String toString() {
        return "Media{" +
                "idMedia=" + idMedia +
                ", cat='" + cat + '\'' +
                ", rep=" + rep +
                ", link='" + link + '\'' +
                '}';
    }

    /**
     *
     * Clone
     */
    public Media clone() {
        return new Media(this);
    }

}