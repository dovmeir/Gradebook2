package gradebook2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Gradebook2 {
        ArrayList<Student> studentsNames = new ArrayList<>();
        private void controller(){
    System.out.println("Please choose from the following commands ");
    System.out.println("addName");
    System.out.println("addGrade   (the name must already exist to add a grade)");
    System.out.println("records    to check existing records");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    switch (input){
        case"addName":
            addName();
            break;
        case"addGrade":
            addGrade();
             
             
            break;
        case "records":
            checkRecord();
            break;
        default: System.err.println("You must enter a valid command");
        controller();
            break;
    
   }
    
}

public void addGrade(){
    System.out.println("please enter the name of the student");
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
        for(Student n:studentsNames){
            if (n.getName().equals(input)){
                for(;;){
              System.out.println("enter the test score you wish to add to "+ input );  //add grade to student and ask what next
               Scanner inscore = new Scanner(System.in);
               int grade = inscore.nextInt();
               n.recordGrade(grade);
               System.out.println("enter another score or press any key to retun to main menu for the main menu");
               Scanner sc = new Scanner(System.in);
                    String input2 = sc.next();
                    int putin= sc.nextInt();
                    while (!sc.hasNextInt()){System.out.println("does not have it");}  
                       /* sc.next();
                        controller();
                        break;
                    }*/continue;
                    
                    
               
            }
        }
           }
    System.out.println("No students with the name "+input+" was found /n"
            + " press t to try again or press any key  to go to the main menu");
    Scanner scanner2 = new Scanner(System.in);
    String input2 = scanner2.next();
    switch (input2){
        case "t":
            addGrade();
            break;
        default: 
            controller();
            
    
    }
    
}
public void checkRecord(){
}
    public static void main(String[] args) 
    {
        
        Student s = new Student("Bob");
        Student s2 = new Student("Joe");
        Random r = new Random();
        for(int i = 0; i < 10; i++)
        {
            s.addGrade(r.nextInt(41) + 60);
            s2.addGrade(r.nextInt(41) + 60);
        }
        
        Gradebook2 student = new Gradebook2();
        student.controller();

        
        //System.out.println(s.getName() + ": " + s.getAverage());
        //System.out.println(s2.getName() + ": " + s2.getAverage());
        
        
    } 
    public void addName(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        Student new_student = new Student(name);//starts the student class and passes in the string name as a parameter
        studentsNames.add(new_student);//adds the new_student class object into the Studentnames array
        System.out.println(name +" had been added to the records hit n to add another name or press any key to return to the main menu ");
           Scanner scanner2 = new Scanner(System.in);
                    String input2 = scanner2.next();
                    switch (input2){
                        case "n":
                            addName();
                            break;
                        default: 
                            controller();

                     }
    }

}
