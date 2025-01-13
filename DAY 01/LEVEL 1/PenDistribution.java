//Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
public class PenDistribution {
    public static void main(String[] args) {
        // Initializing the total number of pens
        int totalPen = 14;

        //Initializing the total number of students
        int totalStudent = 3;

        //Calculating the number of pens each student will receive
        int distributedPen = totalPen / totalStudent;

        // Calculating the remaining pens
        int nonDistributedPen = totalPen % totalStudent;

        // Printing the result: pens per student and remaining pens
        System.out.print("The Pen Per Student is " + distributedPen + 
                         " and the remaining pen not distributed is " + nonDistributedPen);
    }
}
