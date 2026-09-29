public class Main {
    public static void main(String[] args) {
        Studente s = new Studente("Giovanni", "Auletta", 17, 1.75);
        System.out.println(s.nome);
    }

    public class Studente {
        String nome;
        String cognome;
        int eta;
        double altezza;


    }
}