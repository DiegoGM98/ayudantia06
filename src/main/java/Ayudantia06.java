public class Powerlifter {
    private String nombre;
    private int edad;
    private double peso;
    private double pressDeBanca;
    private double sentadilla;
    private double pesoMuerto;

    public Powerlifter(String nombre, int edad, double peso, double pressDeBanca, double sentadilla, double pesoMuerto) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.pressDeBanca = pressDeBanca;
        this.sentadilla = sentadilla;
        this.pesoMuerto = pesoMuerto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPressDeBanca() {
        return pressDeBanca;
    }

    public void setPressDeBanca(double pressDeBanca) {
        this.pressDeBanca = pressDeBanca;
    }

    public double getSentadilla() {
        return sentadilla;
    }

    public void setSentadilla(double sentadilla) {
        this.sentadilla = sentadilla;
    }

    public double getPesoMuerto() {
        return pesoMuerto;
    }

    public void setPesoMuerto(double pesoMuerto) {
        this.pesoMuerto = pesoMuerto;
    }
}
