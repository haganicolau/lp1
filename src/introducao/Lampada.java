package introducao;

public class Lampada {

    private int voltagem;
    private int potencia;
    private String cor;
    private int luminosidade;
    private boolean estaLigada;

    public Lampada(int voltagem, int potencia, String cor) {
         this.voltagem = voltagem;
         this.potencia = potencia;
         this.cor = cor;
    }

    public void acender() {
        if(verificar()) {
            System.out.println("Erro! Lâmpada já ligada!");
        } else {
            this.estaLigada = true;
            this.iluminar();
        }
    }

    public void apagar() {
        if(verificar()) {
            this.estaLigada = false;
            System.out.println("Luz apagada!");
        } else {
            System.out.println("Erro! Lâmpada já desligada!");
        }

    }

    public void iluminar() {
        System.out.println("Luz ligada!");
    }

    private boolean verificar() {
        return this.estaLigada;
    }

}
