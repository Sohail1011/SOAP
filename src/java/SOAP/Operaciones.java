/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package SOAP;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Shelly
 */
@WebService(serviceName = "Operaciones")
public class Operaciones {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "saludo")
    public String saludo(@WebParam(name = "valor") String persona) {
        return "Hola soy " + persona;
    }
}
