package org.fernal.jee7.webservices.service;

import javax.jws.WebService;

@WebService(endpointInterface = "org.fernal.jee7.webservices.service.Validator")
public class CardValidator implements Validator {

  public boolean validate(CreditCard creditCard) {

    Character lastDigit = creditCard.getNumber().charAt(creditCard.getNumber().length() - 1);

    if (Integer.parseInt(lastDigit.toString()) % 2 == 0) {
      return true;
    } else {
      return false;
    }
  }
}