import java.util.*;
import types.*;
import SecondaryGrammar.*;
import java.io.*;

public class Output {

   public static void main(String[] args) {

      String intro = "Caso a pergunta seja do tipo multiple-choice, insira o ID da resposta que acha que está correta, depois clique em enter e repita o processo. \nSe a pergunta for do tipo matching, insira os pares que acha correto no seguinte formato \"<par da esquerda> -> <par da direita>\", separando os pares por enter. \nEm ambas as situaçoes, quando nao quiser adicionar mais respostas, insira \":\".";
      Scanner sc = new Scanner(System.in);
      String input;
      String s;
      String[] splt;

      SecondaryGrammarMain secMain = new SecondaryGrammarMain();
      List<Question> questionToReport = new ArrayList<>();
      Map<String, List<String>> userAnswersMap = new HashMap<>();
      List<String> edits = new ArrayList<>();

      System.out.println("Questionário de Teste");
      MultipleChoice v1 = new MultipleChoice("pergunta1", "multiple-choice", "Futebol", "Quem é o melhor jogador do mundo?");
      String[][] tmp1 = {{"a1", "Cristiano Ronaldo", "true"}, {"a2", "Pepe", "false"}, {"a3", "Quaresma", "true"}, {"a4", "Bruno Fernandes", "false"}};
      for (String[] answer : tmp1) {
         if (answer.length == 3) {
            v1.addAnswer(answer[0], answer[1], Boolean.parseBoolean(answer[2]));
         } else {
            v1.addAnswer(answer[0], answer[1]);
         }
      }
      MultipleChoice v2 = new MultipleChoice("pergunta2", "multiple-choice", "Futebol", "Qual seleção europeia ganhou o Euro 2016?");
      String[][] tmp2 = {{"a1", "Portugal", "true"}, {"a2", "França", "false"}, {"a3", "Espanha", "false"}, {"a4", "Austrália", "false"}};
      for (String[] answer : tmp2) {
         if (answer.length == 3) {
            v2.addAnswer(answer[0], answer[1], Boolean.parseBoolean(answer[2]));
         } else {
            v2.addAnswer(answer[0], answer[1]);
         }
      }
      Matching v3 = new Matching("pergunta3", "matching", "Basquetebol");

      String[][] tmp3 = {{"element1", "O primeiro jogo de basquete foi disputado"}, {"element2", "O jogador de basquete mais alto de todos os tempos"}, {"element5", "Lebron James"}, {"element6", "Stephen Curry"}};
      for (String[] answer : tmp3) {
         v3.addQuestionLeft(answer[0], answer[1]);
      }

      String[][] tmp4 = {{"element3", "em 20 de janeiro de 1892"}, {"element4", "foi Suleiman Ali"}, {"element7", "sao jogadores de Basquetebol"}};
      for (String[] answer : tmp4) {
         v3.addAnswerRight(answer[0], answer[1]);
      }

      String[][] tmp5 = {{"element1" , "element3"}, {"element2" , "element4"}, {"element5" , "element7"}, {"element6" , "element7"}};
      for (String[] answer : tmp5) {
         v3.addPeers(answer[0], answer[1]);
      }

      System.out.println("\n" + intro + "\n");
      System.out.println(v1);
      Set<String> tmp6 = v1.getPossibleAnswers();
      ArrayList<String> tmp7 = new ArrayList<>();

      while(true){
         System.out.println("Insira a resposta (\":\" para terminar):");
         input = sc.nextLine().replaceAll("\\s+","");
         if(!input.equals(":")){
            if (!tmp6.contains(input)) {
               System.out.println("ID da opçao inválido!");
            } else if (tmp7.contains(input)) {
               System.out.println("Opçao já inserida!");
            } else {
               tmp7.add(input);
            }
         } else {
            break;
         }
         if (tmp6.size()== tmp7.size()) {
            System.out.println("Todas as respostas já foram selecionadas");
            break;
         }
      }
      userAnswersMap.put(v1.getiD(), tmp7);
      questionToReport.add(v1);
      System.out.println("\n" + intro + "\n");
      System.out.println(v2);
      Set<String> tmp8 = v2.getPossibleAnswers();
      ArrayList<String> tmp9 = new ArrayList<>();

      while(true){
         System.out.println("Insira a resposta (\":\" para terminar):");
         input = sc.nextLine().replaceAll("\\s+","");
         if(!input.equals(":")){
            if (!tmp8.contains(input)) {
               System.out.println("ID da opçao inválido!");
            } else if (tmp9.contains(input)) {
               System.out.println("Opçao já inserida!");
            } else {
               tmp9.add(input);
            }
         } else {
            break;
         }
         if (tmp8.size()== tmp9.size()) {
            System.out.println("Todas as respostas já foram selecionadas");
            break;
         }
      }
      userAnswersMap.put(v2.getiD(), tmp9);
      questionToReport.add(v2);
      System.out.println("\n" + intro + "\n");
      System.out.println(v3);
      Set<String> tmp10 = v3.getPossibleAnswers();
      ArrayList<String> tmp11 = new ArrayList<>();

      while(true){
         System.out.println("Insira a resposta (\":\" para terminar):");
         input = sc.nextLine().replaceAll("\\s+","");
         if(!input.equals(":")){
            if (!tmp10.contains(input)) {
               System.out.println("ID da opçao inválido!");
            } else if (tmp11.contains(input)) {
               System.out.println("Opçao já inserida!");
            } else {
               tmp11.add(input);
            }
         } else {
            break;
         }
         if (tmp10.size()== tmp11.size()) {
            System.out.println("Todas as respostas já foram selecionadas");
            break;
         }
      }
      userAnswersMap.put(v3.getiD(), tmp11);
      questionToReport.add(v3);

      String file = "reportQuizz.txt";
      List<String> correctAnswers;
      try (PrintWriter out = new PrintWriter(new File(file))) {
         for (Question question : questionToReport) {
            String idQuestion = question.getiD();
            for (String id : userAnswersMap.keySet()) { //key id_pergunta / values [id_respostas]
               if (idQuestion == id) {
                  correctAnswers = question.getAnswer();
                  out.println(question);
                  for (String key : userAnswersMap.keySet()) {
                     if (key.equals(idQuestion)) {
                        out.println("User answers   : " + userAnswersMap.get(key));
                     }
                  }
                  out.println("Correct answer : " + correctAnswers);
                  if (userAnswersMap.get(id).equals(correctAnswers)) {
                     out.println("CORRECT\n\n");
                  } else {
                     out.println("INCORRECT\n\n");
                  }
               }
            }
         }
      } catch (FileNotFoundException e) {
         ErrorHandling.printError("Filename is not found!");
         System.exit(1);
      }
   }
}



