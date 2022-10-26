package org.testing.runner;

import java.io.IOException;

import org.testing.testcases.TC1_Getallrecords;
import org.testing.testcases.TC2_Postrecord;
import org.testing.testcases.TC3_Getsinglerecord;
import org.testing.testcases.TC4_Putrecord;
import org.testing.testcases.TC5_Deletrecord;

public class Trigger {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         TC1_Getallrecords tc1 = new TC1_Getallrecords();
         tc1.testcase1();
         
         TC2_Postrecord tc2 = new TC2_Postrecord();
         tc2.Testcase2();
         
         TC3_Getsinglerecord tc3 = new TC3_Getsinglerecord();
         tc3.testcase3();
         
         TC4_Putrecord tc4 = new TC4_Putrecord();
         tc4.Testcase4();
         
         TC5_Deletrecord tc5 = new TC5_Deletrecord();
         tc5.testcase5();
	}

}
