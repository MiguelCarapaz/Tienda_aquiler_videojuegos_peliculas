public class videojuegos {
    String titulo, genero, compania;
    double horas=10;
    boolean entregado=false;


    public videojuegos(){
            titulo="";
            genero="";
            compania="";
            horas = 0;
            entregado=false;
    }
    public videojuegos(String titulo, int horas){
        titulo="Plato";
        genero="";
        compania="";
        horas = 20;
        entregado=false;
    }
    public videojuegos(String titulo, String genero, String compania, int horas ){
        titulo="";
        genero="";
        compania="";
        horas = 0;
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

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
}
