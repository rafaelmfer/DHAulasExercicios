package class5.objetos.exercise4.java;

public class Tripe {
    private boolean dobrado;
    private int alturaMaxima;
    private int alturaMinima;
    private int alturaAtual;

    public Tripe(boolean dobrado, int alturaMaxima, int alturaMinima, int alturaAtual) {
        this.dobrado = dobrado;
        this.alturaMaxima = alturaMaxima;
        this.alturaMinima = alturaMinima;
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(Integer novaAltura){
        setAlturaAtual(novaAltura);
        System.out.println(getAlturaAtual());
    }

    public void dobrar() {
        if (!isDobrado()) {
            setDobrado(true);
            System.out.println("Tripé dobrado");
        }
        else System.out.println("Tripé já está dobrado");
    }

    public void desdobrar() {
        if (isDobrado()) {
            setDobrado(false);
            System.out.println("Tripé desdobrado");
        }
        else System.out.println("Tripé já está desdobrado");
    }

    public void guardar() {
        dobrar();
        setAlturaAtual(getAlturaMinima());
    }

    public boolean prontoParaGuardar() {
        if (isDobrado() && getAlturaAtual() == getAlturaMinima()) return true;
        else return false;
    }

    public void usar() {
        desdobrar();
        setAlturaAtual(getAlturaMaxima()/2);
    }

    public boolean prontoParaUsar() {
        if (!isDobrado() && getAlturaAtual() >= (getAlturaMaxima()/2)) return true;
        else return false;
    }

    public boolean isDobrado() {
        return dobrado;
    }

    public void setDobrado(boolean dobrado) {
        this.dobrado = dobrado;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    public int getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(int alturaAtual) {
        if (alturaAtual <= getAlturaMaxima() && alturaAtual >= getAlturaMinima()) {
            this.alturaAtual = alturaAtual;
        } else System.out.println("Escolha uma altura entre Altura Maxima e Minima do tripé");
    }
}