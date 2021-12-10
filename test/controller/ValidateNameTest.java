package controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ValidateNameTest {
	
	private PlaceOrderController placeOrderController;
	
	@BeforeEach
	void setUp() throws Exception {
		placeOrderController = new PlaceOrderController();
	}
	// Nguyễn Văn Đạo - 20183879
	@ParameterizedTest
	@CsvSource({
		"Dao Nguyen,true",
		"Test 123, false",
		"JohnDoe, true",
		"John12@, false"
	})
	void test(String name, boolean expected) {
		boolean isValied = this.placeOrderController.validateName(name);
		assertEquals(expected, isValied);
	}

}
