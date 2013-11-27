package tests;

import static org.junit.Assert.*;
import main.Lift;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Test_go_to_EC_PW {

	private Lift lift;

	@Before
	public void Setup() {
		lift = new Lift();
	}

	@Test
	public void TestCase1() {
		lift.setFloor(1);
		lift.go_to(2);
		assertEquals(2, lift.getFloor());
	}

/*	@Test
	public void TestCase2() {
		lift.setFloor(1);
		lift.go_to(3);
		assertEquals(3, lift.getFloor());
	}

	@Test
	public void TestCase3() {
		lift.setFloor(1);
		lift.go_to(4);
		assertEquals(4, lift.getFloor());
	}

	@Test
	public void TestCase4() {
		lift.setFloor(1);
		lift.go_to(5);
		assertEquals(5, lift.getFloor());
	}

	@Test
	public void TestCase6() {
		lift.setFloor(2);
		lift.go_to(1);
		assertEquals(1, lift.getFloor());
	}

	@Test
	public void TestCase7() {
		lift.setFloor(2);
		lift.go_to(3);
		assertEquals(3, lift.getFloor());
	}

	@Test
	public void TestCase8() {
		lift.setFloor(2);
		lift.go_to(4);
		assertEquals(4, lift.getFloor());
	}

	@Test
	public void TestCase9() {
		lift.setFloor(2);
		lift.go_to(5);
		assertEquals(5, lift.getFloor());
	}

	@Test
	public void TestCase10() {
		lift.setFloor(3);
		lift.go_to(1);
		assertEquals(1, lift.getFloor());
	}

	@Test
	public void TestCase11() {
		lift.setFloor(3);
		lift.go_to(2);
		assertEquals(2, lift.getFloor());
	}

	@Test
	public void TestCase12() {
		lift.setFloor(3);
		lift.go_to(4);
		assertEquals(4, lift.getFloor());
	}

	@Test
	public void TestCase13() {
		lift.setFloor(3);
		lift.go_to(5);
		assertEquals(5, lift.getFloor());
	}

	@Test
	public void TestCase14() {
		lift.setFloor(4);
		lift.go_to(1);
		assertEquals(1, lift.getFloor());
	}

	@Test
	public void TestCase15() {
		lift.setFloor(4);
		lift.go_to(2);
		assertEquals(2, lift.getFloor());
	}

	@Test
	public void TestCase16() {
		lift.setFloor(4);
		lift.go_to(3);
		assertEquals(3, lift.getFloor());
	}

	@Test
	public void TestCase17() {
		lift.setFloor(4);
		lift.go_to(5);
		assertEquals(5, lift.getFloor());
	}

	@Test
	public void TestCase18() {
		lift.setFloor(5);
		lift.go_to(1);
		assertEquals(1, lift.getFloor());
	}

	@Test
	public void TestCase19() {
		lift.setFloor(5);
		lift.go_to(2);
		assertEquals(2, lift.getFloor());
	}

	@Test
	public void TestCase20() {
		lift.setFloor(5);
		lift.go_to(3);
		assertEquals(3, lift.getFloor());
	}

	@Test
	public void TestCase21() {
		lift.setFloor(5);
		lift.go_to(4);
		assertEquals(4, lift.getFloor());
	}
*/	

	@After
	public void TearDown() {
		lift = null;
	}

}
