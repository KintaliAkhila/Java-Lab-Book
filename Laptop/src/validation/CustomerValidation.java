package validation;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import entity.Customer;


public class CustomerValidation {

		  CustomerValidation valcus=new CustomerValidation();
		   Customer cust=new Customer();

		public String validateCustName(String name) {
			
			Pattern pattern=Pattern.compile("[A-Z][a-z]{2,6}");
			Matcher matcher=pattern.matcher(name);
			System.out.println(matcher.matches());
			if(true) {
				 cust.setCustName(name);
				 }
			return name;
			
				
		}
		
public String validateCustAddress(String address) {
			
			Pattern pattern=Pattern.compile("[A-Z][a-z]{2,6}");
			Matcher matcher=pattern.matcher(address);
			System.out.println(matcher.matches());
			if(true) {
				cust.setCustName(address);
			}
			return address;
			
				
		}


		public void validateCustPhoneNo(CharSequence n1) {
			Pattern p2=Pattern.compile("[6-9][0-9]{9}");
			Matcher matcher=p2.matcher(n1);
			System.out.println(matcher.matches());
		}

		
		public String validateCustMailId(String mail) {
			Pattern p3=Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$");
			Matcher matcher=p3.matcher(mail);
			System.out.println(matcher.matches());
			return mail;

		}
		
	}
