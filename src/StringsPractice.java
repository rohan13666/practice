public class StringsPractice {

    public static void main(String args[])
    {
        String s = "This string is to be reversed";
        String[] words = s.split(" ");

        String temp;
        int start = 0;
        int end = words.length-1;

        while(start<end){
            temp = words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;  
        
        }

        System.out.println(String.join(" ", words));

      
    }

    
}


