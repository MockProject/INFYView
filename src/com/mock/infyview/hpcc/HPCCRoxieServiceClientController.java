package com.mock.infyview.hpcc;

import java.io.ByteArrayInputStream;
import java.io.StringWriter;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;

//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.methods.InputStreamRequestEntity;
//import org.apache.commons.httpclient.methods.PostMethod;


public class HPCCRoxieServiceClientController {

	public ArrayList<HPCCEmpPercentageBean> getEmployeeData(String ceo, 
			String city, String duname, String projmapping, String unitname)
			throws Exception {
		ArrayList<HPCCEmpPercentageBean> EmpdataBeanList = null;
		String resultString = "";
		SOAPConnectionFactory soapConnectionFactory = null;
		SOAPConnection soapConnection = null;

		try {
			// Authenticator.setDefault(new RoxyAuthenticator());

			/* //Building SOAP Body element for the request */
			soapConnectionFactory = SOAPConnectionFactory.newInstance();
			soapConnection = soapConnectionFactory.createConnection();

			MessageFactory messageFactory = MessageFactory.newInstance();
			SOAPMessage soapMessage = messageFactory.createMessage();
			soapMessage.setProperty(SOAPMessage.WRITE_XML_DECLARATION ,"true");
			SOAPPart soapPart = soapMessage.getSOAPPart();

			// SOAP Envelope
			SOAPEnvelope envelope = soapPart.getEnvelope();
			envelope.addNamespaceDeclaration(Constants.SERVICE_TNS,
					Constants.SERVICE_WSDL_TNS_EMPROXIE_SERVICE);

			// SOAP Body
			SOAPBody soapBody = envelope.getBody();
			SOAPElement soapBodyElem = soapBody.addChildElement(
					Constants.SERVICE_REQUEST_ELEMENT_NAME_EMPROXIE,
					Constants.SERVICE_TNS);

			// SOAP Body
			SOAPElement soapBodyElem1 = soapBodyElem.addChildElement(
					Constants.CEO_ELEMENT,Constants.SERVICE_TNS);
			soapBodyElem1.addTextNode(ceo);

			SOAPElement soapBodyElem2 = soapBodyElem.addChildElement(
					Constants.CITY_ELEMENT,Constants.SERVICE_TNS);
			soapBodyElem2.addTextNode(city);

			
			SOAPElement soapBodyElem3 = soapBodyElem.addChildElement(
					Constants.DU_NAME,Constants.SERVICE_TNS);
			soapBodyElem3.addTextNode(duname);
			
			SOAPElement soapBodyElem4 = soapBodyElem.addChildElement(
					Constants.PROJECT_ELEMENT,Constants.SERVICE_TNS);
			soapBodyElem4.addTextNode(projmapping);
			
			SOAPElement soapBodyElem5 = soapBodyElem.addChildElement(
					Constants.UNIT_ELEMENT,Constants.SERVICE_TNS);
			soapBodyElem5.addTextNode(unitname);
			
			soapMessage.saveChanges();
			soapMessage.writeTo(System.out);

			String wsdlURL = Constants.EMPLOYEE_ROXIE_WSDL_URL;

			SOAPMessage soapResponse = soapConnection
					.call(soapMessage, wsdlURL);
			System.out.println("********************************");
			//soapResponse.writeTo(System.out);
			resultString = convertSOAPResponseToString(soapResponse);
			
			System.out.println(resultString);
			
			EmpdataBeanList = parseResponse(resultString);
		}

		catch (SOAPException se) {
			throw se;
		} catch (Exception e) {
			throw e;

		} finally {
			if (soapConnection != null) {
				try {
					soapConnection.close();
				} catch (SOAPException se) {

					throw se;
				}
			}
		}

		return EmpdataBeanList;
	}

	public static String convertSOAPResponseToString(SOAPMessage soapResponse)
			throws TransformerException, SOAPException {
		StringWriter responseWriter = new StringWriter();
		TransformerFactory transformerFactory = TransformerFactory
				.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		Source sourceContent = soapResponse.getSOAPPart().getContent();
		StreamResult result = new StreamResult(responseWriter);
		transformer.transform(sourceContent, result);

		String resultStr = responseWriter.toString();

		return resultStr;
	}

	/**
	 * This is method which parses the SOAP XML Response of HPCC EmpRoxie
	 * service to Java Object. It uses a SAX Parser.
	 * 
	 * @param result
	 * @return ArrayList<HPCCDataBean>
	 * @throws Exception
	 */
	public static ArrayList<HPCCEmpPercentageBean> parseResponse(String result)
			throws Exception {
		ArrayList<HPCCEmpPercentageBean> hpccDataBeanList;
		if (result == null) {
			return null;
		}
		try {
			SOAPResponseParser soapResponseParser = new SOAPResponseParser();
			SAXParserFactory spf = SAXParserFactory.newInstance();
			SAXParser sp = spf.newSAXParser();
			sp.parse(
					new ByteArrayInputStream(result
							.getBytes(Constants.UTF8_ENCODING)),
					soapResponseParser);
			hpccDataBeanList = soapResponseParser.getHpccBeanList();

		} catch (Exception e) {

			throw e;
		}
		return hpccDataBeanList;
	}

}
