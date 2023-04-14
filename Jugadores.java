
public class Jugadores {
    
    String Nombre;
    String Pocicion;
    int NJugador;
    int EDAD;

    public Jugadores(String Nombre, String Pocicion, int NJugador, int EDAD) {
        this.Nombre = Nombre;
        this.Pocicion = Pocicion;
        this.NJugador = NJugador;
        this.EDAD = EDAD;
    }

    Jugadores() {
       
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPocicion() {
        return Pocicion;
    }

    public void setPocicion(String Pocicion) {
        this.Pocicion = Pocicion;
    }

    public int getNJugador() {
        return NJugador;
    }

    public void setNJugador(int NJugador) {
        this.NJugador = NJugador;
    }

    public int getEDAD() {
        return EDAD;
    }

    public void setEDAD(int EDAD) {
        this.EDAD = EDAD;
    }
   
}
