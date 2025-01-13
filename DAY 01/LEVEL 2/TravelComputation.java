// Create TravelComputation Class to compute the Distance and Travel Time

import java.util.Scanner;

public class TravelComputation {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Create a variable name to indicate the person traveling
    String name = "Eric";

    // taking user input in a variable fromCity, viaCity and toCity to indicate the city
    // from city, via city and to city the person is travelling

    System.out.print("Enter city name From : ");
    String fromCity = input.nextLine();
    System.out.print("Enter Via  : ");
    String viaCity = input.nextLine();
    System.out.print("Enter To : ");
    String toCity = input.nextLine();

    // taking user input of in a variable distanceFromToVia and the viaCIty to Final city
    System.out.print("Enter the Distance From to via: ");
    double distanceFromToVia = input.nextDouble();
    System.out.print("Enter the Distance via to final city: ");
    double distanceViaToFinalCity  = input.nextDouble();

    // Create a variable timeFromToVia to indicate the time taken to
    // travel from fromCity to viaCity in minutes
    System.out.print("Enter time taken From To via City in minutes: ");
    int timeFromToVia = input.nextInt();

    // Create a variable timeViaToFinalCity to indicate the time taken to
    // travel from viaCity to toCity in minutes
    System.out.print("Enter time taken Via To Fianl City in minutes: ");
    int timeViaToFinalCity = input.nextInt();

    // Create a variable totalDistance to indicate the total distance
    // between the fromCity to toCity
    double totalDistance = distanceFromToVia + distanceViaToFinalCity;

    // Create a variable totalTime to indicate the total time taken to
    // travel from fromCity to toCity in minutes
    int totalTime = timeFromToVia + timeViaToFinalCity;

    // Print the travel details
    System.out.println("The Total Distance travelled by " + name + " from " +
        fromCity + " to " + toCity + " via " + viaCity +
        " is " + totalDistance + " km and " +
        "the Total Time taken is " + totalTime + " minutes");

    input.close();
  }
}
