package types;

import java.util.List;

public class Question {
    
    private String iD;
    private String type;
    private String theme;
    
    public Question(String iD, String type, String theme) {
        this.iD = iD;
        this.type = type;
        this.theme = theme;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("question " + iD + ":\n");
        sb.append("\ttype " + type + "\n");
        sb.append("\ttheme \"" + theme + "\"\n");
        return sb.toString();
    }

    public List<String> getAnswer() {
        return null;
    }
   
    public void setAnswersShuffle() {

    }    
}
