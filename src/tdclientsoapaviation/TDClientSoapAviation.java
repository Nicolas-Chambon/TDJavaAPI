/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdclientsoapaviation;

import java.util.List;
import javax.jws.WebService;
import ws.wsdl.JAXBException_Exception;
import ws.wsdl.MalformedURLException_Exception;

/**
 *
 * @author NCham
 */
public class TDClientSoapAviation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JAXBException_Exception, MalformedURLException_Exception {
        // TODO code application logic here
        ws.wsdl.Avions_Service service = new ws.wsdl.Avions_Service();
        ws.wsdl.Avions port = service.getAvionsPort();
        
        
        
        List<String> Infos = getStation(port, "PHTO");
        System.out.println("response : " + Infos);
        
        
        
    }
    
    
    
    public static List<String> getStation(ws.wsdl.Avions port ,String a) throws JAXBException_Exception, MalformedURLException_Exception {
        
        return port.getStation(a);
        
    }

    
}
