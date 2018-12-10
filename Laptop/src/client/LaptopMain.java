package client;

import java.util.Scanner;

public class LaptopMain {

	public static void main(String[] args) {
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Dell\n2.HP\n3.Lenovo\n4.ASUS\n");
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();
		switch(choice)
		{
		   
		   case 1:
			   System.out.println("1.DELL VOSTRO 15\n2.DELL INSPIRON");
			   System.out.println("Enter the Dell Model:");
			   int model1=sc.nextInt();
		       switch(model1)
		       {
		         
		       case 1:
		    	   System.out.println("DELL VOSTRO 15\nScreen:15.6 Inches,1366 X 768 pixel Resolution\nRAM:4GB\nCPU:2GHZ Intel core i3 6th generation-6006U\nOS:Windows 10 Home\nHard Disk:1 TB\n");
		           break;
		       case 2:
		    	   System.out.println("DELLInspiron \nScreen:14 Inches,1366 X 768 pixel Resolution\nRAM:4GB\nCPU:2.3GHZ Intel core i3 7th generation-7020U\nOS:Linux\nHard Disk:1 TB\n");
		    	   break;
		       
		       }
		       break;
		   case 2:
			   System.out.println("1.HP ENVY 13 \n2.HP Pavilion 15");
			   System.out.println("Enter the HP Model:");
			   int model2=sc.nextInt();
		       switch(model2)
		       {
		         
		       case 1:
		    	   System.out.println("HP ENVY 13\nScreen:13.3 Inches,1920 X 1080 pixel Resolution\nRAM:8GB\nCPU:2.5GHZ Intel core i7-6500U\nOS:Windows 10 Home\nHard Disk:1 TB\n");
		           break;
		       case 2:
		    	   System.out.println("HP Pavilion 15\nScreen:15.6 Inches,1366 X 768 pixel Resolution\nRAM:4GB\nCPU:1.6GHZ Intel core i5 \nOS:Windows 8(64-bit)\nHard Disk:1 TB\n");
		    	   break;
		       
		       }
		       break;
		   case 3:
			   System.out.println("1.Lenovo ThinkPad\n2.Lenovo IdeaPad");
			   System.out.println("Enter the Lenovo Model:");
			   int model3=sc.nextInt();
		       switch(model3)
		       {
		         
		       case 1:
		    	   System.out.println("Lenovo ThinkPad\nScreen:14 Inches,1366 X 768 pixel Resolution\nRAM:8GB\nCPU:1.6GHZ Intel core i5 8th generation\nOS:DOS \nHard Disk:1 TB\n");
		           break;
		       case 2:
		    	   System.out.println("Lenovo IdeaPad\nScreen:15.6 Inches,1366 X 768 pixel Resolution\nRAM:4GB\nCPU:2GHZ Intel core i7 \nOS:Windows 10\nHard Disk:1 TB\n");
		    	   break;
		       
		       }
		       break;
		   case 4:
			   System.out.println("1.Asus EeeBook\n2.Asus VivoBook");
			   System.out.println("Enter the Asus Model:");
			   int model4=sc.nextInt();
		       switch(model4)
		       {
		         
		       case 1:
		    	   System.out.println("Asus EeeBook\nScreen:11.6 Inches,1366 X 768 pixel Resolution\nRAM:2GB\nCPU:1.6GHZ Intel Celeron Dual Core-N4000\nOS:Windows 10 Home(64 bit)\nHard Disk:500 GB\n");
		           break;
		       case 2:
		    	   System.out.println("Asus VivoBook\nScreen:14 Inches,1920 X 1080 pixel Resolution\nRAM:8GB\nCPU:1.6GHZ Intel core i5 8th generation \nOS:Windows 10 Home(64 bit)\nHard Disk:1 TB\n");
		    	   break;
		       
		       }
			   
			   
		       
		       }
		
		
		
		
		
		
		}
	}