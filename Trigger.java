package org.testing.runner;

import java.io.IOException;

import org.testing.testcases.TC10_DeleteRequest;
import org.testing.testcases.TC1_PostRequest;
import org.testing.testcases.TC2_GetAllRequest;
import org.testing.testcases.TC3_GetParticularRequest;
import org.testing.testcases.TC4_UpdateRequest;
import org.testing.testcases.TC5_DeleteRequest;
import org.testing.testcases.TC6_PostRequestRealtime;
import org.testing.testcases.TC7_GetAllRequestRealtime;
import org.testing.testcases.TC8_GetPartiularRequest;
import org.testing.testcases.TC9_UpdateRequest;

public class Trigger {
	
	public static void main(String[] args) throws IOException {
		
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.testcase1();
		
		
		TC2_GetAllRequest tc2= new TC2_GetAllRequest();
		tc2.testcase2();
		
		TC3_GetParticularRequest tc3= new TC3_GetParticularRequest();
		tc3.testcase3();
		
		TC4_UpdateRequest tc4= new TC4_UpdateRequest();
		tc4.testcase4();
		
		TC5_DeleteRequest tc5= new TC5_DeleteRequest();
		tc5.testcase5();
		
		TC6_PostRequestRealtime tc6 = new TC6_PostRequestRealtime();
		tc6.testcase6();
		
		TC7_GetAllRequestRealtime tc7 = new TC7_GetAllRequestRealtime();
		tc7.testcase7();
		
		TC8_GetPartiularRequest tc8 = new TC8_GetPartiularRequest();
		tc8.testcase8();
		
		TC9_UpdateRequest tc9 = new TC9_UpdateRequest();
		tc9.testcase9();
		
		TC10_DeleteRequest tc10 = new TC10_DeleteRequest();
		tc10.testcase10();
	
	}

}
