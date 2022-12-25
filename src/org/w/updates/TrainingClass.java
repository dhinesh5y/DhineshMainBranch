package org.w.updates;

import org.a.inheritance.BusStandObject;
import org.w.dhinesh.*;

public class TrainingClass extends BasicSchool{
	
 public void english () {
	 System.out.println("Morning Class");
	 }
 public static void main(String[]args){
	 TrainingClass tr=new TrainingClass();
	 BusStandObject BS=new BusStandObject();
	 tr.english();
	 tr.libraryRoom();
	 tr.classRoom();
     tr.computerRoom();
     tr.staffRoom();
     BS.pallavaram();
     }
 }