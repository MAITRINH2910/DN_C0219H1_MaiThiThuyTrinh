public class EngWord implements Comparable {
    private String word;
    private String type;
    private String note;
    private String mean;

    public EngWord() {
    }

    public EngWord(String word, String type, String note, String mean) {
        this.word = word;
        this.type = type;
        this.note = note;
        this.mean = mean;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMean() {
        return mean;
    }

    public void setMean(String mean) {
        this.mean = mean;
    }

    public String toString(){
        return word+"; "+type+"; "+mean+"; "+note;
    }

    public int compareTo(Object o) {
        return this.word.compareToIgnoreCase(((EngWord)o).getWord());
    }
}
