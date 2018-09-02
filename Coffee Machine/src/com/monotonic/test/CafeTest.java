package com.monotonic.test;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.monotonic.Cafe;
import com.monotonic.Coffee;
import com.monotonic.CoffeeType;

class CafeTest {

	@Test
	public void canBrewEspreso() {

		// given
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);

		// when
		Coffee coffee = cafe.brew(CoffeeType.Espresso);

		// then
		Assert.assertEquals(CoffeeType.Espresso, coffee.getCoffeeType());
		Assert.assertEquals(0, coffee.getMilk());
		Assert.assertEquals(7, coffee.getBeans());
	}

	@Test
	public void brewingEspresoConsumesBeans() {

		// given
		Cafe cafe = new Cafe();
		cafe.restockBeans(7);

		// when
		cafe.brew(CoffeeType.Espresso);

		// then
		Assert.assertEquals(0, cafe.getBeansInStock());
	}
	
	@Test
	public void lattesRequireMilk() {
		
	}
	
}
