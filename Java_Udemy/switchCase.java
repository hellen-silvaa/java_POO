import java.util.Scanner;

public class switchCase {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            String dia;
            switch (x) {
                case 1:
                    dia = "domingo";
                    break;
                case 2:
                    dia = "segunda";
                    break;
                case 3:
                    dia = "terca";
                    break;
                case 4:
                    dia = "quarta";
                    break;
                case 5:
                    dia = "quinta";
                    break;
                case 6:
                    dia = "sexta";
                    break;
                case 7:
                    dia = "sabado";
                    break;
                default:
                    dia = "valor invalido";
                    break;
            }
            System.out.println("Dia da semana: " + dia);
            sc.close();





            //Esse é em if e else e o de cima é baseado no valor da expressão x - switch case é uma sintaxe opcional
            Scanner sc2 = new Scanner(System.in);
            int x1 = sc.nextInt();
            String dia1;
            if (x1 == 1) {
                dia1 = "domingo";
            }
            else if (x == 2) {
                dia1 = "segunda";
            }
            else if (x == 3) {
                dia1 = "terca";
            }
            else if (x == 4) {
                dia1 = "quarta";
            }
            else if (x == 5) {
                dia1 = "quinta";
            }
            else if (x == 6) {
                dia1 = "sexta";
            }
            else if (x == 7) {
                dia1 = "sabado";
            }
            else {
                dia1 = "valor invalido";
            }
            System.out.println("Dia da semana: " + dia1);
            sc.close();
        }
        }


