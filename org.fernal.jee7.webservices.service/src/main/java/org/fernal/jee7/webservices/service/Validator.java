package org.fernal.jee7.webservices.service;

import javax.jws.WebService;

@WebService
public interface Validator {

  public boolean validate(CreditCard creditCard);

}
