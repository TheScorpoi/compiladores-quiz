import java.util.ArrayList;
import java.util.Scanner;

public class eliminar {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Caso a pergunta seja do tipo multiple-choice, insira o ID da resposta que acha que está correta, depois clique em enter e repita o processo. \nSe a pergunta for do tipo matching, insira os pares que acha correto no seguinte formato \"<par da esquerda> -> <par da direita>\", separando os pares por enter. \nEm ambas as situaçoes, quando nao quiser adicionar mais respostas, insira \":\".");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        ArrayList<String> respostas = new ArrayList<>();
        do {
            respostas.add(sc.nextLine());
        } while (condition);

        while(true){
            String input = sc.nextLine();
            if(!input.equals(":")){
                respostas.add(input);
            }else{
                break;
            }
        }


    }
}
