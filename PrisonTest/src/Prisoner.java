// Prisoner class
public class Prisoner {
    private String name;
    private String height;
    private String sentence;

    public Prisoner(String name, String height, String sentence ) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }

    public String getName() {
        return name;
    }

    public String getHeight() {
        return height;
    }

    public String getSentence() {
        return sentence;
    }

}
