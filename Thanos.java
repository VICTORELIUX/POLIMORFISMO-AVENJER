public class Thanos extends Villano {
    protected String guantelete;

    public Thanos(String nombre, String poder, String ejercito, String guantelete) {
        super(nombre, poder, ejercito);
        this.guantelete = guantelete;
    }

    public void chasquearDedos() {
        System.out.println(nombre + "utiliza el guantelete del infinito" + guantelete);
    }
}