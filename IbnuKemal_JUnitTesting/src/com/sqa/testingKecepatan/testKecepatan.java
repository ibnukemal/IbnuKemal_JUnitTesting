package com.sqa.testingKecepatan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sqa.kecepatan.main.KecepatanRataRata;

public class testKecepatan {

	KecepatanRataRata kecepatan;
	@Before
	public void setUp() throws Exception {
		kecepatan = new KecepatanRataRata();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testKecepatanRataRata() {
		 assertEquals(19.0, kecepatan.KecepatanRataRata(152.0, 8.0),0.0);
	}

}
