import java.util.TreeMap;

public class EVDictionary {
    public TreeMap<String, EngWord>dic;

    public EVDictionary(){
        dic = new TreeMap<String, EngWord>();
    }

    public boolean addWord(EngWord word)  {
        if(dic.put(word.getWord().toLowerCase(),word) != null)
            return false;
        return true;
    }

    // Tra tu
    public EngWord lookup(String word)  {
        return dic.get(word);
    }

    public String toString() {
        String ret = "";
        for (EngWord w : dic.values()) ret += w.toString() + "\n";
        return ret;

    }
}
