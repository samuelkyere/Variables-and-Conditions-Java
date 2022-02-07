public class Conditions {
    public static void main(String args[]){
        
      int  score =  95;
      if (score >=90)
      {
          System.out.println( "Student grade is " + "A");
      }
      else if ((90>score) && (score >=80))
      {
          System.out.println( "Student grade is " +"B");
      }
      else  if ((80>score) && (score >=70))
      {
          System.out.println("Student grade is " +"C");
      }
       else if ((70>score) && (score >=55))
      {
          System.out.println("Student grade is " +"D");
      }
      else 
      {
          System.out.println("Student grade is " +"F");
      }

    
    }//end of main()
}// closing of class