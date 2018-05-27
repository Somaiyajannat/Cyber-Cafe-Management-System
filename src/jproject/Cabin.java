package jproject;

/**
 *
 * @author Tanin
 */
public class Cabin {
    public String cabinStatus(int x){
        if(x==0){
            return "This cabin is open";
        }
        else if(x==1){
            return "This cabin is booked";
        }
        else{
            return "This cabin is defected";
        }
    }
}
