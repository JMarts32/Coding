package CodeForces;

import java.util.Scanner;

public class ACheapTravel {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String numbers = s.nextLine();

        String[] tocalculate = numbers.split(" ");
        float numberOfRides = Integer.parseInt(tocalculate[0]);
        float ridesm = Integer.parseInt(tocalculate[1]);
        float pricen = Integer.parseInt(tocalculate[2]);
        float pricem = Integer.parseInt(tocalculate[3]);


        float module = numberOfRides%ridesm;

        double one = Math.floor(numberOfRides/ridesm)*pricem;
        double two = Math.ceil(numberOfRides/ridesm)*pricem;

        if (( one + (module * pricen)) < two && one < (numberOfRides * pricen)){
            System.out.println((int) ((Math.floor(numberOfRides/ridesm)*pricem) + (module * pricen)));
        }else if (numberOfRides * pricen < one +(module * pricen) && numberOfRides * pricen < two){
            System.out.println((int) (numberOfRides * pricen));
        } else{
            System.out.println((int) (Math.ceil(numberOfRides/ridesm)*pricem));
        }
    }

}
