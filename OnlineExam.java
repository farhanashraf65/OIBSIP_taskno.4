import java.util.*;

//Hi! Farhan Ashraf here this my 3rd Task Online Examination

public class OnlineExam{
    public static void main(String[] args){

        //Login ID and Password to access the exam
        Scanner in=new Scanner(System.in);
        String realId="farhan",realPassword="fa@123";
        while(true){
            System.out.println("------Welcome to Login Portal------");
            System.out.print("Enter Login Id: ");
            String id,password;
            id=in.next();
            System.out.print("Enter Password: ");
            password=in.next();
            if(id.equals(realId) && password.equals(realPassword)){
                int count=0;
                System.out.println("<<<<<<<<<<<Welcome to Exam Portal>>>>>>>>>>>");

                while(true){
                    System.out.println("1.Exam\n2.Update Profile\n3.Logout\n");
                    System.out.print("Select Option:");
                    int n=in.nextInt();

                    //For exam if selected option 1.Exam
                    if(n==1){
                        long examStartTime=System.currentTimeMillis();  //Timer and auto submit
                        long endTime=examStartTime+30*1000;
                        while(System.currentTimeMillis()<endTime){
                            //questions and answer options
                            System.out.println("Exam Starts Now.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("----------------------------------------------------------------------");
                            System.out.println("Q1.Number of primitive data types in Java are?\n1. 6  2. 7  3. 8  4. 9");
                            System.out.print("Enter Correct Option: ");
                            String s=in.next();
                            if(s.equals("3")){
                                count+=1;
                            }
                            System.out.println("----------------------------------------------------------------------");
                            System.out.println("Question First Submitted Successfully.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("------------------------------------------------------------------------------------------");
                            System.out.println("Q2. What is the size of float and double in java?\n1.32 & 64 2.32 & 32 3.64 & 64 4.64 & 32");
                            System.out.print("Enter Correct Option: ");
                            s=in.next();
                            if(s.equals("1")){
                                count+=1;
                            }
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Question Second Submitted Successfully.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("---------------------------------------------------------------------------------");
                            System.out.println("Q3. Arrays in java are-\n1.Object reference 2.Object 3.Primitive data type 4.None");
                            System.out.print("Enter Correct Option: ");
                            s=in.next();
                            if(s.equals("2")){
                                count+=1;
                            }
                            System.out.println("-----------------------------------------------------------------------------------");
                            System.out.println("Question Third Submitted Successfully.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Q4.To which of the following does the class string belong to.\n1.java.lang 2.java.awt 3.java.applet 4.java.string");
                            System.out.print("Enter Correct Option: ");
                            s=in.next();
                            if(s.equals("1")){
                                count+=1;
                            }
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Question Forth Submitted Successfully.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Q5.Total constructor string class have?\n1. 3  2. 7  3. 13  4. 20");
                            System.out.print("Enter Correct Option: ");
                            s=in.next();
                            if(s.equals("3")){
                                count+=1;
                            }
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Question Fifth Submitted Successfully.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Q6.Identify the return type of a method that does not return any value.\n1.int  2.void  3.double  4.None");
                            System.out.print("Enter Correct Option: ");
                            s=in.next();
                            if(s.equals("2")){
                                count+=1;
                            }
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Question Sixth Submitted Successfully.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Q7.Output of Math.floor(3.6)?\n1. 3   2. 3.0   3. 4   4. 4.0");
                            System.out.print("Enter Correct Option: ");
                            s=in.next();
                            if(s.equals("2")){
                                count+=1;
                            }
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Question Seventh Submitted Successfully.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Q8.Which of the following is used to find and fix bugs in the program?\n1.JDK  2.JVM  3.JRE  4.JDB");
                            System.out.print("Enter Correct Option: ");
                            s=in.next();
                            if(s.equals("4")){
                                count+=1;
                            }
                            System.out.println("---------------------------------------------------------------------------------------");
                            System.out.println("Question Eighth Submitted Successfully.\nCurrent time:"+System.currentTimeMillis());
                            System.out.println("---------------------------------------------------------------------------------------");
                        }
                        System.out.println("Exam Ended.\nYour Scored:"+(count*10));
                    }

                    //For Update Profile and Password if selected option 2
                    else if(n==2){
                        try{
                            System.out.print("Enter Updated Id:");
                            System.out.print("Enter Updated Password:");
                            System.out.println("Details Updated Successfully");
                        }
                        catch(Exception e){
                            System.out.println("Failed to Update Details");
                        }

                    }

                    //Closing session and Logout
                    else if(n==3){
                        System.exit(0);
                    }
                    //if choice is wrong
                    else{
                        System.out.println("Enter valid choices");
                    }
                }
            }
            else{
                System.out.println("Your Entered Details are Invalid.Try Again");
            }
        }
    }
}
