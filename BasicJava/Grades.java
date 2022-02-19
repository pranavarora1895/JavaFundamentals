
/** 
 * WAP to input the marks of a student and print the grades according to the given list:
 * Above 90 - A+
 * Above 80 - A
 * Above 70 - B+
 * Above 60 - B
 * Above 50 - C
 * Below 40 - F
 */
public class Grades
{
 void showGrades(int marks)
 {
     String grades = "";
     if(marks>=90)
     { 
     grades = "A+";
    }
    else if(marks>=80){
        grades = "A";
    }
    else if(marks>=70){
        grades = "B+";
    }
    else if(marks>=60){
        grades = "B";
    }
    else if(marks>=50){
        grades = "C";
    }
    else if(marks>=40){
        grades = "PASS";
    }
    else if(marks<40){
        grades = "F";
    }
    System.out.println("The Grades are: "+ grades);
}
    
     
     
 }
