package While;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while(mesada > 0) {
            double valordoce = valorAleatorio();
            if(valordoce > mesada){
                valordoce = mesada;
             }
             System.out.println("doce dovalo: " + valordoce + " Adicionddo no carrinho ");
             mesada = mesada - valordoce;

    }
    System.out.println("mesada: " + mesada);
    System.out.println("Joazinho gastou a sua mesada em doces");
    
}
 private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}