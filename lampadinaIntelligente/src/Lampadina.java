public class Lampadina {
    private double potenza;
    private int illuminazione;
    private String colore;
    private String nome;
    private boolean accesa;

    public Lampadina(double potenza){
        this.potenza = potenza;
        if (this.potenza < 1 || this.potenza > 100){
            this.potenza = 10;
        }
        this.colore = "bianco";
        this.illuminazione = 100;
        this.accesa = false;
        this.nome = "";
    }
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void accendi(){
        this.accesa = true;
    }
    public void spegni(){
        this.accesa = false;
    }
    public void aumenta_luminosita(){
        this.illuminazione += 10;
        if( this.illuminazione > 100){
            this.illuminazione = 100;
        }
    }
    public void diminuisci_luminosita(){
        this.illuminazione -=10;
        if( this.illuminazione < 0){
            this.illuminazione = 0;
        }
    }
    @Override
    public String toString(){
        return "Nome: " + this.nome + " Potenza: " + this.potenza + "watt/Stato:" + "Qta: " + this.illuminazione + "%/ Colore: " + this.colore;

    }
}
