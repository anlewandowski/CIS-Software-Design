/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysto;
import daysto.MyDate;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author tue97761
 */
public class daysto {
    public int daysuntil(int y1,int m1, int d1, int y2, int m2, int d2){
        MyDate Date1 = new MyDate(y1,m1,d1);
        MyDate Date2 = new MyDate(y2,m2,d2);
        int days = Date2.getTotalDays() - Date1.getTotalDays();
        return days;
    }
    
    public static void main(String [] args){
         Result result = JUnitCore.runClasses(daystoTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
    }
}
