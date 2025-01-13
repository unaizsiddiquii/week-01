//Write a Program to compute the volume of Earth in km^3 and miles^3

public class VolumeOfEarth{
	public static void main(String[] args){
		
        // Radius of the Earth in kilometers
        double radiusKm = 6378;

        // Conversion factor from kilometers to miles
        double kmToMiles = 0.621371;

        //Value of pi
        double pi = 3.14159;

        // Calculate the volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * (radiusKm * radiusKm * radiusKm);

        // Convert radius to miles and compute radius cubed for miles
        double radiusMiles = radiusKm * kmToMiles;

        // Calculate the volume in cubic miles
        double volumeMiles3 = (4.0 / 3.0) * pi * (radiusMiles * radiusMiles * radiusMiles);

        //results
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3+"\nThe volume of Earth in cubic miles is " + volumeMiles3);
       
	}
}
