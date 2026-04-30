import java.util.Scanner;

public class Padaria {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Notas possiveis
        int[] notas = {200, 100, 50, 20, 10, 5, 2, 1};
        int quantidadeNotas = 0;

        //Nome cliente
        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        //Valor da Compra
        System.out.print("Insira o valor da compra: ");
        double valorCompra = sc.nextInt();
        
        //Valor pago pelo cliente
        System.out.print("Insira o valor pago: ");
        double valorPago = sc.nextInt();

        //Soma para valor de troco para o cliente
        double valorTroco =  valorPago - valorCompra;
        
        //Logica para identificar se o valor pago pelo cliente é o suficiente para a compra
        if (valorTroco >= 0){
            System.out.println("Pagamento Efeturado!");

            System.out.println("Troco: R$" + valorTroco);
            

            //Logica para percorrer as notas existentes
            for (int troco : notas){
                
                //Logica para validar qual nova deve ser utilizado de acordo com o valor do troco pendente
                while (troco <= valorTroco){
                    
                    valorTroco = valorTroco - troco;
                    
                    quantidadeNotas++;
                    
                }
            

            //Logica para exibir a quantidade de tipo de notas entregue para o cliente  
            if (quantidadeNotas>0){
                System.out.print(quantidadeNotas + "x R$" + troco );

                //Logica para identificar quando é o ultimo loop e finalizar o programa
                if (valorTroco != 0){
                    System.out.print(", ");
                } else {
                    System.out.println("");
                    System.out.print("Obrigado por comprar com a gente " + nome + " - Volte Sempre!");
                }
            }
            quantidadeNotas = 0;

            

            }
        }  else{System.out.println("Valor insuficiente para realizar suas compras!");}

        


        

        



    }
}