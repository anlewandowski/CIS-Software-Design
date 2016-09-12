/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daysto;

/**
 *
 * @author tue97761
 */
public class MyDate {
    public int year;
    public int month;
    public int day;
    public MyDate(int y, int m, int d){
        year = y;
        month = m;
        day = d;
    }
    
    public int getTotalDays(){
        int total = 0;
        total += getYearDays();
        total += getMonthDays();
        total += this.day;
        return total;
    }
    
    public int getYearDays(){
        int yearInDays;
        yearInDays =(this.year * 365) + (this.year/4);
        return yearInDays;
    }
    
    public int getMonthDays(){
      int monthInDays = 0;
      for(int i = 1;i<this.month; i++){
          if((i==9)||(i==4)||(i==6)||(i==11)){
              monthInDays += 30;
          }
          else if(i == 2){
              monthInDays += 28;
              if((this.year%4)==0){ /* for leap days */
                  monthInDays +=1;
              }
          }
          else{
              monthInDays += 31;
          }
      }
      return monthInDays;
    }
}