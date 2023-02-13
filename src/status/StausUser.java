/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 */
public class StausUser 
{
   public enum stat {ZERO, ONE, TWO, THREE};    
   private Status s;
   {
    Status userStatus = Status.ZERO;
    switch(userStatus) {
      case ZERO:
        System.out.println("ZERO");
        break;
      case ONE:
         System.out.println("ONE");
        break;
      case TWO:
        System.out.println("TWO");
        break;
      case THREE:
        System.out.println("THREE");
        default:
         System.out.println("NOT VALID CODE");
        break
    }
  }
}