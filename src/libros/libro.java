package libros;

public class libro {
    String titulo;
    String autor;
    String editorial;
    String genero;
    int cant_pag;
    double precio;

    public libro(){
        this.titulo = "Harry Potter y la piedra filosofal";
        this.autor = "J. K. Rowling";
        this.editorial = "Mr. John Rowling";
        this.genero = "Accion";
        this.cant_pag = 302;
        this.precio = 520.00;
    }

    public libro(String titulo, String autor, String editorial, String genero, int cant_pag, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.genero = genero;
        this.cant_pag = cant_pag;
        this.precio = precio;
    }
    public void imprimirDetalles(){
        System.out.println("Titulo: " + this.titulo+"\n"+"Autor: "+this.autor+"\n"+"Editorial: "+this.editorial+"\n"+"Genero: "+this.genero+"\n"+"Precio: "+this.precio+"\n"+"Cantidad de paginas: "+this.cant_pag);
    }

    public void actualizarPrecio(double precio){
        this.precio = precio;
    }
}
