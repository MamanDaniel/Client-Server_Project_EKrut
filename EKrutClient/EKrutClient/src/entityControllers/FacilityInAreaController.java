package entityControllers;

import java.util.ArrayList;

import entities.Facility;

public class FacilityInAreaController {
	
	private static ArrayList<Facility> facilityList=null;
	
	public FacilityInAreaController() {
	}

	public FacilityInAreaController(ArrayList<Facility> facilityList) {
		FacilityInAreaController.facilityList = facilityList;
	}

	public void setFacilityInArea(ArrayList<Facility> facilityList) {
		FacilityInAreaController.facilityList = facilityList;
	}
	
	public ArrayList<Facility>  getFacilityInArea() {
		return FacilityInAreaController.facilityList;
	}
	

}
