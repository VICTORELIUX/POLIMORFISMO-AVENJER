public class Villano extends Personaje {
    protected String ejercito;

    public Villano(String nombre, String poder, String ejercito) {
        super(nombre, poder);
        this.ejercito = ejercito;
    }

    @Override
    public void atacar() {
        System.out.println(nombre + "Comanda su ejercito para atacar");
    }
}