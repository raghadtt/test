package software;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void test() {
		Hello ob = new Hello();
		int act= ob.add(4,2);
		assertTrue (6== act);
		
	}

}
