package com.entitymapping0419.listeners;

import java.util.GregorianCalendar;

public class ObjectDemo extends Object {

   public static void main(String[] args) {
      try {
         // create a new ObjectDemo object
         ObjectDemo cal = new ObjectDemo();

         // print current time
        // System.out.println("" + cal.getTime());

         // finalize cal
         System.out.println("Finalizing...");
         cal.finalize();
         System.out.println("Finalized.");

      } catch (Throwable ex) {
         ex.printStackTrace();
      }
   }
   @Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
	   System.out.println("finalize");
		super.finalize();
	}
   
}