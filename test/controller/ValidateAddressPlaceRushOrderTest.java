package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateAddressPlaceRushOrderTest {

	private PlaceRushOrderController placeRushOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeRushOrderController = new PlaceRushOrderController();
	}
	// Nguyễn Văn Đạo - 20183879
	@ParameterizedTest
	@CsvSource({
		"Ha Noi,true",
		"Thanh Hoa, false",
		"Thanh Pho Ho Chi Minh, false",
		"123@, false"
	})
	void test(String address, boolean expected) {
		boolean isValied = this.placeRushOrderController.validateAddressPlaceRushOrder(address);
		assertEquals(expected, isValied);
	}

}
