public class ComparingConcat {
    public static void main(String[] args) {
        // iterations
        int itr= 1000000;
        String text= "hello";

        // initializing StringBuilder
        StringBuilder sb= new StringBuilder();
        long startTime= System.nanoTime();

        // appending string 1 million times using StringBuilder
        for(int i=0;i<itr;i++){
            sb.append(text);
        }
        long endTime= System.nanoTime();
        long durationBuilder= endTime - startTime;

        System.out.println("Time taken by StringBuilder: "+ durationBuilder+ " nanoseconds");

        // initializing StringBuffer
        StringBuffer sf= new StringBuffer();
        startTime= System.nanoTime();

        // appending string 1 million times using StringBuffer
        for(int i=0;i<itr;i++){
            sf.append(text);
        }
        endTime= System.nanoTime();
        long durationBuffer= endTime - startTime;

        System.out.println("Time taken by StringBuffer: "+ durationBuffer+ " nanoseconds");
        
        // comparing results
        if(durationBuilder< durationBuffer){
            System.out.println("StringBuilder is faster");
        } 
        else{
            System.out.println("StringBuffer is faster");
        }
    }
}