package tests;

import static org.junit.Assert.*;
import main.Lift;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_query_floor_EC_EC {

	private Lift lift;

	@Before
	public void Setup() {
		lift = new Lift();
	}

	@Test
	public void TestCase1() {
		lift.setFloor(1);
		assertEquals(1, lift.query_floor());
	}

	@Test
	public void TestCase2() {
		lift.setFloor(2);
		assertEquals(2, lift.query_floor());
	}

	@Test
	public void TestCase3() {
		lift.setFloor(3);
		assertEquals(3, lift.query_floor());
	}

	@Test
	public void TestCase4() {
		lift.setFloor(4);
		assertEquals(4, lift.query_floor());
	}

	@Test
	public void TestCase5() {
		lift.setFloor(5);
		assertEquals(5, lift.query_floor());
	}
	

	@After
	public void TearDown() {
		lift = null;
	}

}
