package lab.pkg2_jamilgarcia;


public class Personajes {
    
    private String tipo;
    private String nombre;
    private String raza;
    private double estatura;
    private double peso;
    private int años;
    private String descripcion;
    private String nacion;
    private int HP;
    private int CS;
    private int AC;
    private int DG;
    
    public Personajes(){
        
    }

    public Personajes(String tipo, String nombre, String raza, double estatura, double peso, int años, String descripcion, String nacion, int HP, int CS, int AC) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.raza = raza;
        this.estatura = estatura;
        this.peso = peso;
        this.años = años;
        this.descripcion = descripcion;
        this.nacion = nacion;
        this.HP = HP;
        this.CS = CS;
        this.AC = AC;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getCS() {
        return CS;
    }

    public void setCS(int CS) {
        this.CS = CS;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }

    public int getDG() {
        return DG;
    }

    public void setDG(int DG) {
        this.DG = DG;
    }

    @Override
    public String toString() {
        return "Personajes:" + "\n" + "Tipo: " + tipo + "\n" + "Nombre: " + nombre + "\n" +"Raza: " + raza + "\n" +"Estatura: " + estatura + "\n" + "Peso: " + peso + "\n" + "A\u00f1os: " + años + "\n" + "Descripcion: " + descripcion + "\n" + "Nacion: " + nacion + "\n" + "HP: " + HP + "\n" + "CS: " + CS + "\n" + "AC: " + AC + "\n";
    }
    
    
}
