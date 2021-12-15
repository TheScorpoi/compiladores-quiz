package types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import javax.sound.midi.SysexMessage;

public class MultipleChoice extends Question {

    private String questionText;
    private Map<String, String> answersIdTextMap = new HashMap<>();
    private Map<String, Boolean> answersIdValidationMap = new HashMap<>();

    public MultipleChoice(String iD, String type, String theme, String questionText) {
        super(iD, type, theme);
        this.questionText = questionText;
    }

    public void addAnswer(String id, String anwserText, Boolean validation) {

        if (!answersIdTextMap.containsKey(id)) {
            for (String iD : answersIdTextMap.keySet()) {
                if (answersIdTextMap.get(iD).equals(anwserText)) {
                    ErrorHandling.printError("Answer \""+ anwserText +"\" is repeated");
                    System.exit(1);
                }
            }
            answersIdTextMap.put(id, anwserText);
        } else {
            ErrorHandling.printError("iD Answer \"" + id + "\" already exists");
            System.exit(1);
        }

        if (!answersIdValidationMap.containsKey(id)) {
            answersIdValidationMap.put(id, validation);
        } else {
            ErrorHandling.printError("iD Answer \"" + id + "\" already exists");
            System.exit(1);
        }
    }

    public List<String> getAnswer() {
        List<String> list = new ArrayList<>();
        for (String key : answersIdValidationMap.keySet()) {
            if (answersIdValidationMap.get(key) == true) {
                list.add(key);
            }
        }
        return list;
    }

    public void edit(List<String> answers){
    	Set<String> set = new HashSet<String>();
    	for (String id : answersIdTextMap.keySet()){
    		if (!answers.contains(id)){
    			set.add(id);
    			answersIdValidationMap.remove(id);
    		}
    	}
    	for (String x : set){
    		answersIdTextMap.remove(x);
    	}
    }

    public void setAnswersShuffle(Question q) {

        List<String> list = new ArrayList<>();
        List<String> listCopy = new ArrayList<>();
        List<String> listText = new ArrayList<>();
        Map<String, String> tmpMap = new HashMap<>();
        
        for (String key : answersIdTextMap.keySet()) {
            list.add(key);
            listCopy.add(key);
            listText.add(answersIdTextMap.get(key));
        }

        for (String s : list) {
            tmpMap.put(s, "");
        }

        List<Boolean> valiCorrect = new ArrayList<>();
        for (String key : answersIdValidationMap.keySet()) {
            valiCorrect.add(answersIdValidationMap.get(key));
        }

        long seed = System.nanoTime();
        Collections.shuffle(list, new Random(seed));
        Collections.shuffle(listText, new Random(seed));
        Collections.shuffle(valiCorrect, new Random(seed));

        int i = 0;
        for (String key : tmpMap.keySet()) {
            tmpMap.put(key, list.get(i));
            i++;
        }
        
        for (String key : answersIdTextMap.keySet()) {
            answersIdTextMap.put(key, "");
        }
        
        i = 0;
        //update answerIdTextMap 
        for (String key : listCopy) {
            answersIdTextMap.put(key, listText.get(i));
            i++;
        }

        i = 0;
        //update answerIdValidationMap 
        for (String key : answersIdValidationMap.keySet()) {
            answersIdValidationMap.put(key, valiCorrect.get(i));
            i++;
        }
    }

    public void addAnswer(String id, String anwserText) {

        if (!answersIdTextMap.containsKey(id)) {
            for (String iD : answersIdTextMap.keySet()) {
                if (answersIdTextMap.get(iD).equals(anwserText)) {
                    ErrorHandling.printError("Answer \""+ anwserText +"\" is repeated");
                    System.exit(1);
                }
            }
            answersIdTextMap.put(id, anwserText);
        } else {
            ErrorHandling.printError("iD Answer \"" + id + "\" already exists");
            System.exit(1);
        }
    }

    public String getQuestion() {
        return questionText;
    }

    public Set<String> getPossibleAnswers(){
        return answersIdTextMap.keySet();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("\ttext \"" + questionText + "\"\n");
        for (String idAnswer : answersIdTextMap.keySet()) {
            String answerText = answersIdTextMap.get(idAnswer);
            sb.append("\t\t" + idAnswer+ " \"" +  answerText + "\" \n");
        }
        return sb.toString();
    }

}
