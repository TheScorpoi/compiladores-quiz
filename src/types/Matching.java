package types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Matching extends Question {

    private Map<String, String> idQuestionLeftMap = new HashMap<>();
    private Map<String, String> idAnswerRightMap = new HashMap<>();
    private List<String[]> rightPeers = new ArrayList<>();

    public Matching(String iD, String type, String theme) {
        super(iD, type, theme);
    }

    public void addQuestionLeft(String id, String questionText) {
        if (!idQuestionLeftMap.containsKey(id)) {
            for (String iD : idQuestionLeftMap.keySet()) {
                if (idQuestionLeftMap.get(iD).equals(questionText)) {
                    ErrorHandling.printError("Question \"" + questionText + "\" is repeated");
                    System.exit(1);
                }
            }
            idQuestionLeftMap.put(id, questionText);
        } else {
            ErrorHandling.printError("iD Answer \"" + id + "\" already exists");
            System.exit(1);
        }
    }

    public void addAnswerRight(String id, String answerText) {
        if (!idAnswerRightMap.containsKey(id)) {
            for (String iD : idAnswerRightMap.keySet()) {
                if (idAnswerRightMap.get(iD).equals(answerText)) {
                    ErrorHandling.printError("Answer \"" + answerText + "\" is repeated");
                    System.exit(1);
                }
            }
            idAnswerRightMap.put(id, answerText);
        } else {
            ErrorHandling.printError("iD Answer \"" + id + "\" already exists");
            System.exit(1);
        }
    }

    public void addPeers(String peerLeft, String peerRight) {
        String[] peers = { peerLeft, peerRight };
        if (!rightPeers.contains(peers)) {
            rightPeers.add(peers);
        } else {
            ErrorHandling.printError("Peers already exists");
            System.exit(1);

        }
    }

    public void edit(List<String> answers){
    	Set<String> setRight = new HashSet<String>();
    	Set<String> setLeft = new HashSet<String>();
    	Set<String[]> setPeers = new HashSet<String[]>();
    	for (String id : idAnswerRightMap.keySet()){
    		if (!answers.contains(id)){
    			setRight.add(id);
    		}
    	}
    	for (String x : setRight){
    		idAnswerRightMap.remove(x);
    	}
    	for (String id : idQuestionLeftMap.keySet()){
    		if (!answers.contains(id)){
    			setLeft.add(id);
    		}
    	}
    	for (String x : setLeft){
    		idQuestionLeftMap.remove(x);
    	}
    	for (String[] str : rightPeers){
    		for (String id : setLeft){
    			for (String id2 : setRight){
    				if (str[0].equals(id) || str[1].equals(id2))
    					setPeers.add(str);
    			}
    		}
    	}
    	for (String[] x : setPeers){
    		rightPeers.remove(x);
    	}
    }

    public void getSetLeft() {
    }

    public void getSetRight() {
    }

    public List<String> getAnswer() {
        List<String> list = new ArrayList<>();
        for (String[] a : rightPeers) {
            list.add(a[0] + "->" + a[1]);
        }
        return list;
    }

    public Set<String> getPossibleAnswers(){
        Set<String> idQuestionLeft = idQuestionLeftMap.keySet();
        Set<String> idAnswerRight = idAnswerRightMap.keySet();
        Set<String> possibleAnswers = new HashSet<>();

        for (String idLeft : idQuestionLeft) {
            for (String idRight : idAnswerRight) {
                possibleAnswers.add(idLeft + "->" + idRight);
            }
        }
        return possibleAnswers;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\tsetLeft{\n");
        for (String key : idQuestionLeftMap.keySet()) {
            sb.append("\t\t" + key + " " + idQuestionLeftMap.get(key) + "\n");
        }
        sb.append("\t}\n\tsetRight{\n");
        for (String key : idAnswerRightMap.keySet()) {
            sb.append("\t\t" + key + " " + idAnswerRightMap.get(key) + "\n");
        }
        //to print the correct asnwer
        //sb.append("\t}\n\trightPeer{\n");
        //for (String[] strings : rightPeers) {
        //    sb.append("\t\t" + strings[0] + " -> " + strings[1] + "\n");
        //}
        sb.append("\t}");
        sb.append("\n");

        return sb.toString();
    }

}
