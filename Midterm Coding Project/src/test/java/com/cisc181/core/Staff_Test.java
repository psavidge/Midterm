package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	private static ArrayList<Staff> staffList = new ArrayList<Staff>();
	
	@BeforeClass
	public static void salarySetup() 
	{		
		double firstSalary = 100;
		for(int i = 0; i < 5; i++)
		{
			Staff s = new Staff(null);
			s.setSalary(firstSalary);
			staffList.add(s);
			firstSalary += 100;
		}
	}
	
	@Test
	public void test() 
	{
		int total = 0;
		int averageSalary = 0;
		for(int j = 0; j < staffList.size(); j++)
		{
			total += staffList.get(j).getSalary();
		}
		
		averageSalary = total / staffList.size();
		
		assertEquals(averageSalary, 300);
	}
	@Test
	public void test2()
	{
		int res = 0;
		try {
			Staff AgeTest = new Staff("Patrick","James","Savidge",new Date(1896,12,27),"55 Delaware St","123-456-7890","psav@udel.edu","7-9",500,10000000,new Date(2016,3,20),eTitle.MR);
		} catch (PersonException e) {
		res = 1;
		}
		assertEquals(res,1);
	}
	@Test
	public void test3()
	{
		int isFalse = 0;
		try {
			Staff PhoneTest = new Staff("Patrick","James","Savidge",new Date(1996,12,27),"55 Delaware St","123-456-789","psav@udel.edu","7-9",500,10000000,new Date(2016,3,20),eTitle.MR);
		} catch (PersonException e) {
			isFalse = 1;
		}
		assertEquals(isFalse,1);
	}
}

	
	
