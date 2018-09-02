package com.monotonic.test;

import static com.monotonic.test.DefaultProducts.door;
import static com.monotonic.test.DefaultProducts.floorPanel;
import static com.monotonic.test.DefaultProducts.window;
import static org.hamcrest.Matchers.contains;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.monotonic.Shipment;

public class ShipmentTest {

	private Shipment shipment = new Shipment();

	@Test
	public void shouldAddNewProduct() {
		shipment.addNewProduct(door);
		shipment.addNewProduct(window);

		assertThat(shipment, contains(door, window));
	}

	@Test
	public void shouldReplaceProduct() {

		shipment.addNewProduct(door);
		shipment.addNewProduct(window);

		shipment.replaceProduct(window, floorPanel);

		assertThat(shipment, contains(door, floorPanel));
	}

	@Test
	public void shouldNotReplaceUndefinedProduct() {

		shipment.addNewProduct(window);

		shipment.replaceProduct(door, floorPanel);

		assertThat(shipment, contains(window));

	}

	@Test
	public void shouldIdentifyVanRequirement() {

		shipment.addNewProduct(window);
		shipment.addNewProduct(door);
		shipment.addNewProduct(floorPanel);

		shipment.prepare();

		assertThat(shipment.getLightVanProducts(), contains(window));
		assertThat(shipment.getHeavyVanProducts(), contains(door, floorPanel));

	}

}
