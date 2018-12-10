package entity;

import java.util.Scanner;

public class Laptop {
	
  String laptopModelName;
  int laptopModelNo;
  int laptopPrice;
  public static void main(String[] args)  {
		

  }
   public int getLaptopModelNo() 
   {
	return laptopModelNo;
   }
  public void setLaptopModelNo(int laptopModelNo) 
  {
	  this.laptopModelNo = laptopModelNo;
  }

  public String getLaptopModelName()
  {
	  return laptopModelName;
  }
  public void setLaptopModelName(String laptopModelName) 
  {
	  this.laptopModelName = laptopModelName;
  }
  public int getLaptopPrice()
  {
	  return laptopPrice;
  }
  public void setLaptopPrice(int laptopPrice) 
  {
	  this.laptopPrice = laptopPrice;
  }
  

}