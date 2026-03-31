import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Festival{
    private String name;
    private String location;
    private String date;

    public Festival(String name, String location, String date){
        this.name= name;
        this.location= location;
        this.date= date;
    }

    public String getName(){
        return name;
    }

    public String getLocation(){
        return location;
    }

    public String getDate(){
        return date;
    }
}

class Music extends Festival{

    private String headliner;
    private String musicGenre;
    private int ticketPrice;

    public Music(String name, String location, String date, String headliner, String musicGenre, int ticketPrice){
        super(name,location,date);
        this.headliner= headliner;
        this.musicGenre= musicGenre;
        this.ticketPrice= ticketPrice;
    }

    public String getHeadliner(){
        return headliner;
    }

    public String getMusicGenre(){
        return  musicGenre;
    }

    public int getTicketPrice(){
        return ticketPrice;
    }

    @Override
    public String toString(){
        return "Festival Name: "+ getName()+ "\n"+
                "Location: "+ getLocation()+ "\n"+
                "Date: "+ getDate()+ "\n"+
                "Headliner: "+ headliner+ "\n"+
                "Music Genre: "+ musicGenre+ "\n"+
                "Ticket Price: "+ ticketPrice;
    }
}


class Food extends Festival{
    private String cuisine;
    private int numStalls;
    private int entryFee;

    public Food(String name, String location, String date, String cuisine, int numStalls, int entryFee){
        super(name,location,date);
        this.cuisine= cuisine;
        this.numStalls= numStalls;
        this.entryFee= entryFee;
    }

    public String getCuisine(){
        return cuisine;
    }

    public int getNumStalls(){
        return numStalls;
    }

    public int getEntryFee(){
        return entryFee;
    }

    @Override
    public String toString(){
        return "Festival Name: "+ getName()+ "\n"+
                "Location: "+ getLocation()+ "\n"+
                "Date: "+ getDate()+ "\n"+
                "Cuisine: "+ cuisine+ "\n"+
                "Number of Stalls: "+numStalls+ "\n"+
                "Entry Fee: "+ entryFee;

    }
}


class Art extends Festival{
    private String artType;
    private int numArtists;
    private int exhibitionFee;

    public Art(String name, String location, String date, String artType, int numArtists, int exhibitionFee){
        super(name,location,date);
        this.artType= artType;
        this.numArtists= numArtists;
        this.exhibitionFee= exhibitionFee;
    }

    public String getArtType(){
        return artType;
    }

    public int getNumArtists(){
        return numArtists;
    }

    public int getExhibitionFee(){
        return exhibitionFee;
    }

    @Override
    public String toString(){
        return "Festival Name: "+ getName()+ "\n"+
                "Location: "+ getLocation()+ "\n"+
                "Date: "+ getDate()+ "\n"+
                "Art Type: "+ artType+"\n"+
                "Number of Artists: "+ numArtists+ "\n"+
                "Exhibition Fee: "+ exhibitionFee;
    }
}

class FestivalManager{
    List<Festival> festivals= new ArrayList<>();

    public void addFestival(String type, Scanner s){
        if(type.equals("MUSIC")){
            String name= s.next();
            String location= s.next();
            String date= s.next();
            String headliner= s.next();
            String musicGenre= s.next();
            int ticketPrice= s.nextInt();

            Music m= new Music(name, location, date,headliner, musicGenre, ticketPrice);
            festivals.add(m);
        }
        else if(type.equals("FOOD")){
            String name= s.next();
            String location= s.next();
            String date= s.next();
            String cuisine= s.next();
            int numStalls= s.nextInt();
            int entryFee= s.nextInt();

            Food f= new Food(name, location, date,cuisine, numStalls, entryFee);
            festivals.add(f);
        }
        else{
            String name= s.next();
            String location= s.next();
            String date= s.next();
            String artType= s.next();
            int numArtists= s.nextInt();
            int exhibitionFee= s.nextInt();

            Art a= new Art(name, location, date,artType, numArtists, exhibitionFee);
            festivals.add(a);
        }
    }

    public void displayDetails(String name){
        for (Festival x: festivals){
            if(x.getName().equals(name)){
                System.out.println(x);
            }
        }
    }
}

public class EventPlannerFestival {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        FestivalManager manager= new FestivalManager();
        while (true){
            String input= s.next();
            if(input.equals("EXIT")){
                return;
            }

            else if (input.equals("ADD_FESTIVAL")){
                manager.addFestival(s.next(), s);
            }
            else{
                manager.displayDetails(s.next());
            }
        }
    }
}
