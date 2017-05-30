package com.chrisThomps;

import javax.annotation.processing.FilerException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // write your code here

        String courseId1, courseId2;
        int noOfCourses = 0;
        double avg1, avg2, avgGroup1 = 0.0, avgGroup2 = 0.0;

        Scanner group1 = new Scanner(new FileReader("group1.txt"));
        Scanner group2 = new Scanner(new FileReader("group2.txt"));

        PrintWriter outFile = new PrintWriter("student.txt");

        outFile.println("Course ID   Group No   Course Average");

        while (group1.hasNext() && group2.hasNext()) {
            courseId1 = group1.next();
            courseId2 = group2.next();

            if (!courseId1.equals(courseId2)) {
                System.out.println("Data error: Course IDs do not match");
                System.out.println("Program terminates");
                outFile.println("Data error: Course IDs do not match");
                outFile.println("Program terminates");
                outFile.close();
            } else {
                avg1 = calculateAvg(group1);
                avg2 = calculateAvg(group2);

                printResult(outFile, 1, courseId1, avg1);
                printResult(outFile, 2, courseId2, avg2);

                avgGroup1 += avg1;
                avgGroup2 += avg2;
                outFile.println();
                noOfCourses++;
            }
        }

        if(group1.hasNext() && !group2.hasNext())
            System.out.println("Ran out of data for group 2 before group 1");
        else if (!group1.hasNext() && group2.hasNext())
            System.out.println("Ran out of data for group 1 before group 2");
        else{
            outFile.printf("Avg for group 1: %.2f %n", (avgGroup1/noOfCourses));
            outFile.printf("Avg for group 2: %.2f %n", (avgGroup2/noOfCourses));
        }

        group1.close();
        group2.close();
        outFile.close();

        }

    public static double calculateAvg(Scanner inp)
            throws FileNotFoundException{

        double totalScore = 0.0, courseAvg;
        int noOfStudents = 0, score;

        score = inp.nextInt();
        while (score != -999){
            totalScore+= score;
            noOfStudents++;
            score = inp.nextInt();
        }

        courseAvg = totalScore / noOfStudents;
        return courseAvg;
    }

    public static void printResult(PrintWriter outp, int groupNo,
                                   String courseId, double avg){
        if (groupNo == 1)
            outp.print(" " + courseId + " ");
        else
            outp.print("     ");

        outp.print(String.format("%9d % 15.2f%n", groupNo, avg));
    }
}
