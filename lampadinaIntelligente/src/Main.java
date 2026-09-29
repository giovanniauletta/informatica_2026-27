public class Main {
    public static void main(String[] args) {
        Lampadina lampadina1 = new Lampadina(60);
        lampadina1.setNome("Camera");
        System.out.println("Nome della lampadina: ");
        System.ou.println(lampadina1.getNome());
        lampadina1.accendi();
        System.out.println(lampadina1);
        lampadina1.aumenta_luminosita();
        lampadina1.aumenta_luminosita();
        System.out.println(lampadina1);
        lampadina1.diminuisci_luminosita();
        System.out.println(lampadina1);
        lampadina1.spegni();
        System.out.println(lampadina1);

        Lampadina lampadina2 = new Lampadina(lampadina1);
        System.out.println("Lampadina copiata: ");
        System.out.println(lampadina2);

    }
}