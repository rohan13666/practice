import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
       
      String s = "This is a sample string This is a sample string";

      String[] words = s.split(" ");

      HashMap<String, Integer> map = new HashMap<String, Integer>();

      for(int i =0; i<words.length; i++)
      {
          if(map.containsKey(words[i]))
            map.put(words[i], map.get(words[i])+1);
        else
            map.put(words[i], 1);
      }

      System.out.println(map);
        
    }
}
