public class Wordfrequency {
    public static void main(String args[]){
        String sentence= "Harvard Stanford Mit Stanford Harvard Mit Harvard Stanford";

        HashMap<String, Integer> map=new HashMap<>();

        String[] words=sentence.split(" ");

        for(String word: words){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);   // Or map.put(word,map.getOrDefault(word,0)+1)
            } else{
                map.put(word,1);
            }
        }
        System.out.println(map);
    }
}



// String[] : One sentence ➝ broken into pieces , Those pieces are stored in a String array