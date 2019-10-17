import java.io.*;

public class numCharacters 
{   
    public static void main(String[] args) throws IOException {
        File file = new File("a-file.txt");
        StringBuilder sb = new StringBuilder("");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = br.readLine();
        int numOfCharacters = 0; 
        int numOfWords = 0;         
        int numOfLines = 0;
        while(line != null) {
            numOfLines++;
            String[] words = line.split(" ");
            numOfWords += words.length;
            for(String word : words)
            {
                numOfCharacters += word.length();
            }
            line = br.readLine();
        }
        System.out.println("Number of characters: "+ numOfCharacters);         
        System.out.println("Number words: "+ numOfWords);         
        System.out.println("Number of lines: "+ numOfLines);
        br.close();   
    } 
}   