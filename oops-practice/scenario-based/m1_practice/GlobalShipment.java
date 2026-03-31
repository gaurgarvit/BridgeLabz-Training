import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.Scanner;

public class GlobalShipment {
    public static boolean validateShipment(String str){
        if(!str.startsWith("SHIP-")){
            return false;
        }

        String sub= str.substring(5);
        if(sub.length()!=6){
            return false;
        }
        if(!sub.matches("[1-9][0-9]{5}")){
            return false;
        }

        for(int i=0;i<sub.length()-3;i++){
            char a= sub.charAt(i);
            char b= sub.charAt(i+1);
            char c= sub.charAt(i+2);
            char d= sub.charAt(i+3);

            if(a==b && b==c && c==d){
                return false;
            }
        }

        return true;
    }

    public static boolean validateDate(String str){
        try{
            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd")
                            .withResolverStyle(ResolverStyle.STRICT);

            LocalDate date = LocalDate.parse(str, formatter);

            if(date.getYear()<2000 || date.getYear()>2099){
                return false;
            }

            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static boolean validateMode(String str){
        switch (str){
            case "AIR":
                return true;
            case "SEA":
                return true;
            case "ROAD":
                return true;
            case "RAIL":
                return true;
            case "EXPRESS":
                return true;
            case "FREIGHT":
                return true;
            default:
                return false;
        }
    }

    public static boolean validateWeight(String str){
        try{
            double n= Double.parseDouble(str);
            if(n<0 || n> 999999.99){
                return false;
            }
            if(!str.matches("[1-9][0-9]*\\.\\d{2}") && !str.matches("[0]\\.\\d{2}")){
                return false;
            }

            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public static boolean validateDelivery(String str){
        switch (str){
            case "DELIVERED":
                return true;
            case "CANCELLED":
                return true;
            case "IN_TRANSIT":
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int t= s.nextInt();
        s.nextLine();
        StringBuilder sb=new StringBuilder();
        while (t-->0){
            String input= s.nextLine();
            String[] parts= input.trim().split("\\|");

            if(parts.length!= 5){
                System.out.println("NON-COMPLIANT RECORD");
                continue;
            }

            if(validateShipment(parts[0]) && validateDate(parts[1]) && validateMode(parts[2])
                    && validateWeight(parts[3]) && validateDelivery(parts[4])){
                sb.append("COMPLIANT RECORD\n");
            }
            else {
                sb.append("NON-COMPLIANT RECORD\n");
            }
        }
        System.out.println(sb.toString());
    }
}
