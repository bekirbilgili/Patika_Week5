import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenler tanımlanır ve kullanıcıdan cümle istenir.
        String sentence;
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your sentences: ");
        sentence = input.nextLine();

        String[] words = sentence.split(" "); // kullanıcıdan alınan cümle bölünür ve her kelime bir dizi elemanına aktarılır

        Map<String, Integer> wordsAndCounts = new HashMap<>();

        for (int i = 0; i < words.length; i++) {// dizi elemanları bir hashmap a aktarılır
            wordsAndCounts.put(words[i], 0);
        }

        for (int i = 0; i < words.length; i++) { // kelime her tekrarlandığında value bir arttırılır

            if (wordsAndCounts.containsKey(words[i])) {
                int count = wordsAndCounts.get(words[i]);
                wordsAndCounts.put(words[i], count + 1);
            } else {
                wordsAndCounts.put(words[i], 1);
            }
        }

        int maxNum = 0;
        String mostFrequentWord = "";

        for (Map.Entry<String, Integer> entry : wordsAndCounts.entrySet()) { // en çok geçen kelime bulunum pastırılır.
            if (entry.getValue() > maxNum) {
                maxNum = entry.getValue();
                mostFrequentWord = entry.getKey();
            }
        }


        System.out.println("The most frequent word is: " + mostFrequentWord);



    }
}
