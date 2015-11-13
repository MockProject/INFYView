package com.mock.infyview.hpcc;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SOAPResponseParser extends DefaultHandler {

	boolean currentElement = false;
	StringBuilder currentText = null;
	HPCCEmpPercentageBean hpccBean = null;

	ArrayList<HPCCEmpPercentageBean> hpccBeanList = new ArrayList<HPCCEmpPercentageBean>();

	public ArrayList<HPCCEmpPercentageBean> getHpccBeanList() {
		return hpccBeanList;
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		currentElement = true;
		currentText = new StringBuilder();
		if (qName.equals("Row")) {
			hpccBean = new HPCCEmpPercentageBean();
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		currentElement = false;
		
		if (qName.equalsIgnoreCase("organization")) {
			String currentValue = currentText.toString();
			currentText = null;
			hpccBean.setOrganization(currentValue);
			
		}else if (qName.equalsIgnoreCase("unit")) {
			String currentValue = currentText.toString();
			currentText = null;
			hpccBean.setUnit(currentValue);
			
		}else if (qName.equalsIgnoreCase("dulevel")) {
			String currentValue = currentText.toString();
			currentText = null;
			hpccBean.setDulevel(currentValue);
			
		}else if (qName.equalsIgnoreCase("currentmapping")) {
			String currentValue = currentText.toString();
			currentText = null;
			hpccBean.setCurrentmapping(currentValue);
			
		}else if (qName.equalsIgnoreCase("role")) {
			String currentValue = currentText.toString();
			currentText = null;
			hpccBean.setRole(currentValue);
			
		}  else if (qName.equalsIgnoreCase("valuecount")) {
			String currentValue = currentText.toString();
			currentText = null;
			hpccBean.setValuecount(currentValue);
			
		} else if (qName.equalsIgnoreCase("totalcount")) {
			String currentValue = currentText.toString();
			currentText = null;
			hpccBean.setTotalcount(currentValue);
			
		}else if (qName.equalsIgnoreCase("percentage")) {
			String currentValue = currentText.toString();
			currentText = null;
			hpccBean.setPercentage(currentValue);
			
		}else if (qName.equalsIgnoreCase("Row")) {
			hpccBeanList.add(hpccBean);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if (currentText != null) {
			currentText.append(ch, start, length);
		}
	}
}
