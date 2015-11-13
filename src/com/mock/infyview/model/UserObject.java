package com.mock.infyview.model;
import java.util.Arrays;
import java.util.List;

/**
 * 
 */

/**
 * @author Saby
 *
 */
public class UserObject {

	/**
	 * 
	 */
	public UserObject() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<String> getDCDetails() {
        return Arrays.asList(new String[]{"Atlanta", "Bangalore", "Beijing", "Brisbane", "Canberra", "Chennai", "Dalian",
                "Frankfurt", "Houston", "Hyderabad", "Johannesburg", "Munich", "Mysore", "Perth", "Phoenix", "Pune", 
                "Shanghai", "Stuttgart"});
    }
	public static List<String> getDUDetails() {
        return Arrays.asList(new String[]{"BI-1","BI-2","BI-3","BI-4", 
        		"CISRUN-1", "CISRUN-2","CISRUN-3","CISRUN-4",
        		"DIS-1","DIS-2","DIS-3","DIS-4", 
        		"ECS-1","ECS-2","ECS-3","ECS-4", 
        		"ENGSP-1","ENGSP-2","ENGSP-3","ENGSP-4", 
        		"FSADM-1","FSADM-2","FSADM-3","FSADM-4", 
        		"FSI-1","FSI-2","FSI-3","FSI-4", 
        		"IVS-1","IVS-2","IVS-3","IVS-4", 
        		"LSS-1","LSS-2","LSS-3","LSS-4", 
        		"MFG-1","MFG-2","MFG-3","MFG-4", 
        		"RCL-1","RCL-2","RCL-3","RCL-4"});
    }
	public static List<String> getUnitDetails() {
        return Arrays.asList(new String[]{"BI", 
        		"CISRUN",
        		"DIS", 
        		"ECS", 
        		"ENGSP", 
        		"FSADM", 
        		"FSI", 
        		"IVS", 
        		"LSS", 
        		"MFG", 
        		"RCL"});
    }
	
	private String acesslevel;
	private String selectedDCValue;
	private String selectedDUValue;
	private String selectedUnitDetails;
	private String selectedProjectMapping;
	
	public String getAcesslevel() {
		return acesslevel;
	}

	public void setAcesslevel(String acesslevel) {
		this.acesslevel = acesslevel;
	}

	public String getSelectedDCValue() {
		return selectedDCValue;
	}

	public void setSelectedDCValue(String selectedDCValue) {
		this.selectedDCValue = selectedDCValue;
	}

	public String getSelectedDUValue() {
		return selectedDUValue;
	}

	public void setSelectedDUValue(String selectedDUValue) {
		this.selectedDUValue = selectedDUValue;
	}

	public String getSelectedUnitDetails() {
		return selectedUnitDetails;
	}

	public void setSelectedUnitDetails(String selectedUnitDetails) {
		this.selectedUnitDetails = selectedUnitDetails;
	}

	public String getSelectedProjectMapping() {
		return selectedProjectMapping;
	}

	public void setSelectedProjectMapping(String selectedProjectMapping) {
		this.selectedProjectMapping = selectedProjectMapping;
	}
	
	
	
}
