package desafios;

import java.util.Scanner;

public class NumeroReverso {

    public static void numeroReverso() {

            Scanner scan = new Scanner(System.in);

            do {
                System.out.print("Entre com um valor de 4 digitos, inteiro e positivo: ");
                int num = scan.nextInt();
                String numString = String.valueOf(num);
                if(num >= 1000 && num <=9000) {

                    StringBuilder sb = new StringBuilder(numString);
                    System.out.println(sb.reverse());
                    break;
                } else if (numString.length() <4) {
                    System.out.println("O numero informado devera conter 4 digitos!");
                }

            } while (true);


    }
}
