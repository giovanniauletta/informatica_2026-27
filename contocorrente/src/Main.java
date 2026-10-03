import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Nome: ");
        String nome = input.next();
        System.out.println("Cognome: ");
        String cognome = input.next();
        System.out.println("Codice: ");
        String codice = input.next();
        ContoCorrente c = new ContoCorrente(nome, cognome, codice);
        System.out.println("1 Deposita");
        System.out.println("2 Preleva");
        System.out.println("3 Visualizza saldo");
        System.out.println("4 Visualizza codice");
        System.out.println("5 Visualizza nominativo");
        System.out.println("6 Visualizza informazioni conto");
        System.out.println("Scegli: ");
        int scelta = input.nextInt();
        if (scelta == 1){
            System.out.println("Quantità da depositare: ");
            double quantita = input.nextDouble();
            System.out.println("Saldo: " + c.deposita(quantita));
        }
        if (scelta == 2){
            System.out.println("Quantità da prelevare: ");
            double quantita = input.nextDouble();
            System.out.println("Saldo: " + c.preleva(quantita));
        }
        if (scelta == 3){
            System.out.println("Saldo: " + c.getSaldo());
        }
        if (scelta == 4){
            System.out.println("Codice: " + c.getCodice());
        }
        if (scelta == 5){
            System.out.println("Nominativo: " + c.getNominativo());
        }
        if (scelta == 6){
            System.out.println(c);
        }
    }
}