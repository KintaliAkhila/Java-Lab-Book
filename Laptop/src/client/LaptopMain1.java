package client;

import java.util.Scanner;

import entity.Customer;
import entity.Laptop;
import service.LaptopServiceImpl;
import validation.CustomerValidation;

public class LaptopMain1 {

	public static void main(String[] args)
	{
		
		LaptopServiceImpl ls=new LaptopServiceImpl();
		Customer cust=new Customer();
		CustomerValidation cv=new CustomerValidation();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter customer name:");
		String custName=sc.nextLine();
		String cn=cv.validateCustName(custName);
		cust.setCustName(custName);
		
		System.out.println("Enter Customer Address:");
		String custAddress=sc.nextLine();
		String ca=cv.validateCustAddress(custAddress);
		cust.setCustAddress(custAddress);
		
		System.out.println("Enter customer mail id:");
		String custMailId=sc.nextLine();
		String cm=cv.validateCustMailId(custMailId);
		cust.setCustMailId(custMailId);
	
		System.out.println("Enter customer Phone Number:");
		long custPhoneNo=sc.nextLong();
		
		cust.setCustPhoneNo(custPhoneNo);
		
		
		
		
	}
}