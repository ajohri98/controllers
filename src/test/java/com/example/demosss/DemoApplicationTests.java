package com.example.demosss;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.*;


@SpringBootTest
class DemoApplicationTests {

	private Calculator c=new Calculator();

	@Test
	void contextLoads() {
	}

	@Test
	void TestSum(){

		int expectedResult=17;
		int actual=c.doSum(12,3,2);
		assertThat(actual).isEqualTo(expectedResult);

	}

	@Test
	void TestMulti(){

		int expectedResult=20;
		int actual=c.doProduct(5,4);
		assertThat(actual).isEqualTo(expectedResult);
		assertThat(actual).isGreaterThan(15);

	}

	@Test
	public void comparetest(){
		Boolean actual=c.compareTwoNums(3,3);
		assertThat(actual).isEqualTo(true);
	}

}
