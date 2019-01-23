package com.horstmann.places;

import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Demo {
  public static void main(String[] args) throws JAXBException {
    com.horstmann.places.Country belgium = new com.horstmann.places.Country("Belgium", 30510);
    JAXBContext context = JAXBContext.newInstance(Country.class);
    Marshaller m = context.createMarshaller();
    m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true;
    m.marshal(belgium, System.out);
  }
}
