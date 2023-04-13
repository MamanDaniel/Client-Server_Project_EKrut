package entityControllers;

import java.util.ArrayList;

import entities.Order;
import entities.SelfCollection;
import entities.Shipment;

public class UserOrdersEntityController {
	private static ArrayList<Order> ordersList = new ArrayList<Order>();
	private static ArrayList<Shipment> shipmentList = new ArrayList<Shipment>();
	private static ArrayList<SelfCollection> selfCollectionList = new ArrayList<SelfCollection>();
	
	public UserOrdersEntityController() {
		
	}

	public static ArrayList<Order> getOrdersList() {
		return ordersList;
	}

	public static void setOrdersList(ArrayList<Order> ordersList) {
		UserOrdersEntityController.ordersList = ordersList;
	}
	public static ArrayList<Shipment> getShipmentList() {
		return shipmentList;
	}

	public static void setShipmentList(ArrayList<Shipment> shipmentList) {
		UserOrdersEntityController.shipmentList = shipmentList;
	}
	
	public static ArrayList<SelfCollection> getSelfCollectionList() {
		return selfCollectionList;
	}

	public static void setSelfCollectionList(ArrayList<SelfCollection> selfCollectionList) {
		UserOrdersEntityController.selfCollectionList = selfCollectionList;
	}

}
