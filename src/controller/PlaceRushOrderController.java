package controller;

import entity.media.Media;
import entity.order.Order;

/**
 * Controller for place rush order use case.
 * @author DaoNguyen
 * Date: 10/12/2021
 *
 */
public class PlaceRushOrderController extends PlaceOrderController {
	
	/**
	 * Kiem tra dia chi giao hang co ho tro giao hang nhanh
	 * @param address: dia chi giao hang
	 * @return boolean
	 */
	public boolean validateAddressPlaceRushOrder(String address) {
		return this.validateAddress(address) && address.contains("Ha Noi");
	}
	
	/**
	 * Kiem tra xem cac san pham trong order co ho tro giao hang nhanh hay khong
	 * @param order
	 * @return
	 */
	public boolean validate(Order order) {
		boolean result = false;
		for (Meida meida : order.getlstOrderMedia()) {
			if (isMediaSupportPlaceRushOrder(media)) result = true;
			break;
		}
		return result;
	}
}
