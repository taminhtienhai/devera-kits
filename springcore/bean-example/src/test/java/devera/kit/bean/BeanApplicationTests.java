package devera.kit.bean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import devera.kit.bean.model.CandyFactory;
import devera.kit.bean.model.Car;
import devera.kit.bean.model.Datetime;
import devera.kit.bean.model.Pojo;
import devera.kit.bean.model.Store;


@SpringBootTest(classes = BeanApplication.class)
class BeanApplicationTests {

	@Autowired
	Pojo pojo;

	@Value("${sample}")
	String value;

	@Autowired
	CandyFactory candy;

	@Autowired
	Car car;

	@Autowired
	Datetime datetime;

	@Autowired
	Store store;

	@Test
	void shouldLoads() {
		assertEquals(pojo.content, value);
	}

	@Test
	void loadViaMethod() {
		assertEquals(candy.products[0], "sugar");
	}

	@Test
	void loadConstructors() {
		assertEquals(car.seat3, 3);
	}

	@Test
	void loadConstructorsWithName() {
		assertEquals(datetime.year, "2023");
		assertEquals(datetime.month, "May");
		assertEquals(datetime.date, 23);
	}

	@Test
	void loadDependencies() {
		assertNotNull(store.cusService);
		assertNotNull(store.prodService);
	}
}
