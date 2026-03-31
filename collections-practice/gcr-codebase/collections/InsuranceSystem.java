import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;

// defining the policy class with comparators
class Policy implements Comparable<Policy> {
    String policyNumber, holderName, coverageType;
    LocalDate expiryDate;
    double premium;

    public Policy(String pn, String hn, String ed, String ct, double p) {
        this.policyNumber= pn; this.holderName = hn;
        this.expiryDate= LocalDate.parse(ed);
        this.coverageType= ct; this.premium = p;
    }

    // ensuring uniqueness based on policy number
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if(o== null || getClass()!= o.getClass()){
            return false;
        }

        Policy p= (Policy) o;
        return Objects.equals(policyNumber, p.policyNumber);
    }

    @Override
    public int hashCode() { return Objects.hash(policyNumber); }

    // comparing by date for treeset
    @Override
    public int compareTo(Policy o) {
        return this.expiryDate.compareTo(o.expiryDate);
    }
    
    @Override
    public String toString() { 
        return policyNumber+ " expires on "+ expiryDate; 
    }
}

public class InsuranceSystem {
    public static void main(String[] args) {
        // initializing different set types
        Set<Policy> hashSet= new HashSet<>();
        Set<Policy> linkedSet= new LinkedHashSet<>();
        Set<Policy> treeSet= new TreeSet<>();

        Policy p1= new Policy("P1", "A", "2026-02-01", "Health", 100);
        Policy p2= new Policy("P2", "B", "2026-06-01", "Auto", 200);

        // adding policies to sets
        hashSet.add(p1); 
        hashSet.add(p2);
        linkedSet.add(p1); 
        linkedSet.add(p2);
        treeSet.add(p1); 
        treeSet.add(p2);

        // checking policies expiring in 30 days
        System.out.println("Expiring soon:");
        LocalDate today = LocalDate.now();

        for(Policy p: hashSet){
            long days= ChronoUnit.DAYS.between(today, p.expiryDate);
            
            if(days>= 0 && days<= 30){
                System.out.println(p);
            }
        }
        
        // comparing performance simply
        long start= System.nanoTime();
        hashSet.contains(p1);
        long end= System.nanoTime();
        System.out.println("HashSet Search Time: "+(end- start)+ "ns");
    }
}