import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci il nome: ");
        String nome = input.next();

        System.out.println("Inserisci il cognome: ");
        String cognome = input.next();

        System.out.println("Inserisci il codice del conto: ");
        String codice = input.next();

        ContoCorrente c = new ContoCorrente(nome, cognome, codice);

        int scelta = -1;

        while (scelta != 0){

            System.out.println("\n--- MENU ---");
            System.out.println("1 Deposita");
            System.out.println("2 Preleva");
            System.out.println("3 Visualizza saldo");
            System.out.println("4 Visualizza codice");
            System.out.println("5 Visualizza nominativo");
            System.out.println("6 Visualizza informazioni conto");
            System.out.println("0 Esci");

            System.out.println("Scegli: ");
            scelta = input.nextInt();

            if (scelta == 1){
                System.out.println("Quantità da depositare: ");
                double quantita = input.nextDouble();

                System.out.println("Saldo: " + c.deposita(quantita) + " euro");
            }

            if (scelta == 2){
                System.out.println("Quantità da prelevare: ");
                double quantita = input.nextDouble();

                System.out.println("Saldo: " + c.preleva(quantita) + " euro");
            }

            if (scelta == 3){
                System.out.println("Saldo: " + c.getSaldo() + " euro");
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

            if (scelta == 0){
                System.out.println("Programma terminato");
            }
        }

        input.close();
    }