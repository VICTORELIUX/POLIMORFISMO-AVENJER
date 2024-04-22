public class Endgame {
    public static void main(String[] args) {
        Heroe blackPanther = new Heroe("Black Panther", "Ser el rey de Oaxaca", "Garras de Vibranium");
        Villano galactus = new Villano("Galactus el devorador de mundos", "Devorar mundos",
                "usa a su chalan el Silver Surfer");
        Avenger ironMan = new Avenger("Tony Stark", "Genio, millonario, playboy, filantropo", "Mark 42", "Prime");
        Thanos thanos = new Thanos("Thanos", "El titán loco", "Ejercito Chitaury", "Gemas del infinito");

        // aplicando el polimorfismo
        Personaje[] personajes = { blackPanther, galactus, ironMan, thanos };
        for (Personaje personaje : personajes) {
            personaje.atacar();
        }

        // método especifico
        ((Avenger) ironMan).reunirse();

        // ejemplo metodo especifico de thanos
        thanos.chasquearDedos();
    }
}