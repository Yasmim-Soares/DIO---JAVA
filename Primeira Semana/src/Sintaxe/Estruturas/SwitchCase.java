package Sintaxe.Estruturas;

public class SwitchCase {
public static void main(String[] args) {
    //usado quando precisar complementar
    //sem o break complementa (de cima pra baixo)
    String plano = "T";

    switch (plano) {
        case "T": {
            System.out.println("5Gb Youtube");
        }
        case "M": {
            System.out.println("Whats e Instagram grátis");
        }
        case "B":{
            System.out.println("100 minutos de ligação");
        }
    }

}
}
