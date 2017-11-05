package com.company;

import java.util.Arrays;

/**
 * Created by Veronica Lang on 11/3/2017.
 */
public class HighSchoolClass {
    public static String students[] = {"Baobao", "Eric", "Fafa", "Jack", "Jill", "Kelsey", "Kevin",
            "Lao Jibs", "Roki", "Victoria", "Xiaojuan", "Zhihui"}; //already in alphabetical order
    public static double gpa [] = {1.2,1.6,1.8,1.9,2.2,2.5,3.2,3.6,3.8,4.1,4.2,4.5}; //already sorted
    public static int honorsPercent [] = {1,0,1,0,0,1,1,0,1,0,1,1};
    //constructors and other data fields not shown

    //returns the valedictorian of the class

    public String getValedictorian(){
        Arrays.sort(gpa);
        int index = gpa.length -1;
        String TopStudent = students[index];

        return getValedictorian();
    }
    //returns the percentage of students in honors program
    public double getHonorsPercntage(){
        int count = 0;
        for (int i = 0; i<=students.length; i++){
            if ( honorsPercent[i] == 1){
                count++;
            }
        }
        double percentage = (count/students.length) * 100;
        return getHonorsPercntage();
    }
}
