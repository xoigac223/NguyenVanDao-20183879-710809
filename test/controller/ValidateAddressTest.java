package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateAddressTest {

	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	// Nguyễn Văn Đạo - 20183879
	@ParameterizedTest
	@CsvSource({
		"Ha Noi,true",
		"Hai Ba Trung,true",
		"John@,false",
		"106 Nguyen An Ninh,true"
	})
	void test(String address, boolean expected) {
		boolean isValied = this.placeOrderController.validateAddress(address);
		assertEquals(expected, isValied);
	}

}
