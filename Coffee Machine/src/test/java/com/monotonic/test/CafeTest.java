package com.monotonic.test;

import static com.monotonic.CoffeeType.Espresso;
import static com.monotonic.CoffeeType.Latte;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasProperty;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.monotonic.Cafe;
import com.monotonic.Coffee;
import com.monotonic.CoffeeType;

class CafeTest {

	private static final int NO_BEANS = 0;
	private static final int NO_MILK = 0;
	private static final int ESPRESO_BEANS = Espresso.getRequiredBeans();

	private Cafe cafe;

	@BeforeEach
	public void initCafe() {
		cafe = new Cafe();
	}

	@Test
	public void canBrewEspreso() {

		// given
		withBeans();

		// when
		Coffee coffee = cafe.brew(Espresso);

		// then
		assertThat(coffee, hasProperty("beans", equalTo(ESPRESO_BEANS)));
		assertThat(coffee, hasProperty("milk", equalTo(NO_MILK)));
		assertThat(coffee, hasProperty("coffeeType", equalTo(CoffeeType.Espresso)));
	}

	@Test
	public void brewingEspresoConsumesBeans() {

		// given
		withBeans();

		// when
		cafe.brew(Espresso);

		// then
		assertThat(cafe, hasProperty("beansInStock", equalTo(cafe.getBeansInStock())));
	}

	@Test
	public void lattesRequireMilk() {

		// given
		withBeans();

		// then
		assertThrows(IllegalStateException.class, () -> cafe.brew(CoffeeType.Latte));
	}

	@Test
	public void mustRestockBeans() {

		// then
		assertThrows(IllegalArgumentException.class, () -> cafe.restockBeans(NO_BEANS));
	}

	@Test
	public void mustRestockMilk() {

		// then
		assertThrows(IllegalArgumentException.class, () -> cafe.restockMilk(NO_MILK));
	}

	@Test
	public void canBrewLatte() {

		// given
		withBeans();
		cafe.restockMilk(10);

		// when
		Coffee coffee = cafe.brew(Latte);

		// then
		assertThat(coffee, hasProperty("coffeeType", equalTo(coffee.getCoffeeType())));

	}

	private void withBeans() {
		cafe.restockBeans(ESPRESO_BEANS);
	}
}
