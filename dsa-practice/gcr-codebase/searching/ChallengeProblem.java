import java.io.*;

public class ChallengeProblem {
    public static void main(String[] args) throws IOException {
        System.out.println("--- Part 1: Concatenation ---");
        performConcatTest();

        System.out.println("\n--- Part 2: File Word Count ---");
        countWords("largeFile.txt");
    }

    public static void performConcatTest() {
        // iterations and text
        int itr= 1000000;
        String text= "hello";

        long start= System.currentTimeMillis();
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<itr;i++){
            sb.append(text);
        }

        long end= System.currentTimeMillis();
        System.out.println("StringBuilder time: "+ (end - start)+ "ms");

        start= System.currentTimeMillis();
        StringBuffer sf= new StringBuffer();

        for(int i=0;i<itr;i++){
            sf.append(text);
        }

        end= System.currentTimeMillis();
        System.out.println("StringBuffer time: "+ (end - start)+ "ms");
    }

    // method now throws IOException instead of catching it
    public static void countWords(String filePath) throws IOException {
        long start= System.currentTimeMillis();
        int wordCount= 0;

        InputStreamReader isr= new InputStreamReader(new FileInputStream(filePath));
        BufferedReader br= new BufferedReader(isr);
            
        String line;
        while((line= br.readLine())!= null){
            if(!line.trim().isEmpty()){
                String[] words= line.trim().split("\\s+");
                wordCount+= words.length;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("Total words: "+ wordCount);
        System.out.println("Time taken to read and count: "+ (end - start) + "ms");
    }
}