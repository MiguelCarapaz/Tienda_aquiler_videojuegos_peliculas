public class Serie {

    private String creador;
    private String titulo;
    private String genero;
    private int n_temporadas;
    private boolean entregado;


    /*CONSTRUCTOR*/
    public Serie(){
        creador = " ";
        titulo = " ";
        genero = " ";
        n_temporadas = 3;
        entregado = false;
    }


    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        genero = " ";
        n_temporadas = 3;
        entregado = false;
    }


    public  Serie(String titulo, String creador, String genero, int temporadas){
        this.titulo = titulo;
        this.creador = creador;
        this.genero = genero;
        this.n_temporadas = temporadas;
        entregado = false;

    }



    /*MÉTODOS*/

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }


    public int getN_temporadas() {
        return n_temporadas;
    }

    public void setN_temporadas(int n_temporadas) {
        this.n_temporadas = n_temporadas;
    }








}//FIN DE LA CLASE SERIE
