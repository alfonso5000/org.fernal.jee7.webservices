package org.fernal.jee7.webservices.consumer;

import javax.xml.ws.WebServiceRef;

import org.fernal.jee7.webservices.service.CardValidatorService;
import org.fernal.jee7.webservices.service.CreditCard;
import org.fernal.jee7.webservices.service.Validator;

public class WebServiceConsumer {

  @WebServiceRef
  private static CardValidatorService cardValidatorService;	
	
  public static void main(String[] args) {

//    System.out.println("Invoking web service programmatically");
//
//    CreditCard creditCard = new CreditCard();
//    creditCard.setNumber("12341234");
//    creditCard.setExpiryDate("10/12");
//    creditCard.setType("VISA");
//    creditCard.setControlNumber(1234);
//
//    Validator cardValidator = new CardValidatorService().getCardValidatorPort();
//    System.out.println(cardValidator.validate(creditCard));
//
//    creditCard.setNumber("12341233");
//    System.out.println(cardValidator.validate(creditCard));
	  
	    System.out.println("Invoking web service with injection");

	    CreditCard creditCard = new CreditCard();
	    creditCard.setNumber("12341234");
	    creditCard.setExpiryDate("10/12");
	    creditCard.setType("VISA");
	    creditCard.setControlNumber(1234);

	    Validator cardValidator = cardValidatorService.getCardValidatorPort();
	    System.out.println(cardValidator.validate(creditCard));

	    creditCard.setNumber("12341233");
	    System.out.println(cardValidator.validate(creditCard));
	  
	  
  }
}
