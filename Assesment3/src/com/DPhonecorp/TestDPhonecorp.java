package com.DPhonecorp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class TestDPhonecorp {
	private List <Referral>list;
	@Test
    public void testListInit() {
        assertTrue(list.isEmpty());
        assertTrue(list.size() == 0);
    }

   @Test
    public void testRemoveWithEmptyList() {
		Referral obj1 = new Referral();
        assertThrows(IndexOutOfBoundsException.class, () -> {
               obj1.listReferral.remove(0);
        });
    }

}
