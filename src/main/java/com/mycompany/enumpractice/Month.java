/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.enumpractice;

/**
 *
 * @author kona
 */
public enum Month{
   JANUARY("January", 31),
   FEBRUARY("February", 28),
   MARCH("March", 31),
   APRIL("April", 30),
   MAY("May", 31),
   JUNE("June", 30),
   JULY("July", 31),
   AUGUST("August", 31),
   SEPTEMBER("September", 30),
   OCTOBER("October", 31),
   NOVEMBER("November", 30),
   DECEMBER("December", 31);

   private String title;
   private int daysInMonth;
   
    private Month(String title, int days) {
      this.title = title;
      daysInMonth = days;
    }
    
     int getDaysInMonth(){
        return this.daysInMonth;
    }
    
//    String getMonthShortForm(){
//        return this.title.substring(0,3).toUpperCase();
//    }
    
    public static Month parse(String inputMonth){
        
        
        if(inputMonth.isEmpty()){
            return null;
        }
        
          inputMonth = inputMonth.toUpperCase();
        
       // boolean validInput = false;
        
        try{
           // validInput = true;
            return Month.valueOf(inputMonth);
        }catch(IllegalArgumentException e1){
            for(Month month: Month.values()){
                if(month.name().substring(0, 3).toUpperCase().equals(inputMonth)){
                  //  validInput = true;
                    return month;
                }

            }
        }

//        if(validInput == false )
//        {
//            System.out.println("Invalid Input!!");
//        }
       return null;
    }
}

