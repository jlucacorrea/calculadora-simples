import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

            Scanner leia = new Scanner(System.in);
            //TELA PRINCIPAL
            System.out.println("ESCOLHA O TIPO DE OPERAÇÃO QUE DESEJA:");
            System.out.println("1. SOMA | 2. SUBTRAÇÃO | 3. MULTIPLICAÇÃO | 4. DIVISÃO");
            int opcao = leia.nextInt();
            System.out.println("Primeiro numero:");
            int numA = leia.nextInt();
            System.out.println("Primeiro numero:");
            int numB = leia.nextInt();

            //OPÇÕES
            if (opcao == 1){
                soma(numA, numB);
            } else if (opcao == 2){
                subtracao(numA, numB);
            }else if (opcao == 3){
                multiplicao(numA, numB);
            }else if (opcao == 4){
                divisao(numA, numB);
            }
        }


    //METODOS PARA CADA OPERACAO
    static void soma(int numA, int numB){
        System.out.println("------------------------------------------------------");
        System.out.println("VOCÊ ESTA FAZENDO UMA OPERAÇÃO DE SOMA");
        System.out.println("------------------------------------------------------");
        System.out.println("O RESULTADO FOI: " + (numA + numB));
    }
    static void subtracao(int numA, int numB){
        System.out.println("------------------------------------------------------");
        System.out.println("VOCÊ ESTA FAZENDO UMA OPERAÇÃO DE SUBTRACAO");
        System.out.println("------------------------------------------------------");
        System.out.println("O RESULTADO FOI: " + (numA - numB));
    }
    static void multiplicao(int numA, int numB){
        System.out.println("------------------------------------------------------");
        System.out.println("VOCÊ ESTA FAZENDO UMA OPERAÇÃO DE MULTIPLICAO");
        System.out.println("------------------------------------------------------");
        System.out.println("O RESULTADO FOI: " + (numA*numB));
    }
    static void divisao(int numA, int numB){
        System.out.println("------------------------------------------------------");
        System.out.println("VOCÊ ESTA FAZENDO UMA OPERAÇÃO DE DIVISÃO");
        System.out.println("------------------------------------------------------");
        System.out.println("O RESULTADO FOI: " + (numA/numB));
    }
}
