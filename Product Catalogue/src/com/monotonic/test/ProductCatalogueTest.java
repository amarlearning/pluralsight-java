package com.monotonic.test;

import static com.monotonic.test.ProductFixtures.bob;
import static com.monotonic.test.ProductFixtures.door;
import static com.monotonic.test.ProductFixtures.floor;
import static com.monotonic.test.ProductFixtures.kane;
import static com.monotonic.test.ProductFixtures.window;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.monotonic.ProductCatalogue;

public class ProductCatalogueTest {

	@Test
	public void shouldMentainUniqueness() {

		ProductCatalogue catalogue = new ProductCatalogue();

		catalogue.isSupplied(bob);
		catalogue.isSupplied(kane);

		assertThat(catalogue, containsInAnyOrder(door, floor, window));
	}

	@Test
	public void shouldFindLightVanProducts() {

		ProductCatalogue catalogue = new ProductCatalogue();

		catalogue.isSupplied(bob);
		catalogue.isSupplied(kane);

		assertThat(catalogue.lightVanProducts(), containsInAnyOrder(window));

	}

	@Test
	public void shouldFindHeavyVanProducts() {

		ProductCatalogue catalogue = new ProductCatalogue();

		catalogue.isSupplied(bob);
		catalogue.isSupplied(kane);

		assertThat(catalogue.heavyVanProducts(), containsInAnyOrder(door, floor));

	}

}
