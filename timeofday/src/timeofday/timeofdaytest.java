package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class timeofdaytest {
	


	@Test
	void test() {
		Timeofday myTimeofday = new Timeofday();
		assert myTimeofday.gethours() == 0;
		assert myTimeofday.getminutes() == 0;
		myTimeofday.sethours(12);
		myTimeofday.setminutes(45);
		assert myTimeofday.gethours() == 12;
		assert myTimeofday.getminutes() == 45;
	}

}
