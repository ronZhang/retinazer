/*******************************************************************************
 * Retinazer, an entity-component-system framework for Java
 *
 * Copyright (C) 2015-2016 Anton Gustafsson
 *
 * This file is part of Retinazer.
 *
 * Retinazer is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Retinazer is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Retinazer.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package com.github.antag99.retinazer.util;

import org.junit.Test;
import static org.junit.Assert.*;

// This class is auto-generated; do not modify! @off
@SuppressWarnings("all")
public final class ShortBagTest {
    /**
     * Ensures that the elements of a bag are actually stored
     */
    @Test
    public void testStorage() {
        ShortBag bag = new ShortBag();
        short element0 = (short) 1;
        short element1 = (short) 1;
        short element2 = (short) 1;
        short element3 = (short) 1;
        short element4 = (short) 1;
        short element5 = (short) 1;
        short element6 = (short) 1;
        short element7 = (short) 1;

        bag.set(0, element0);
        assertEquals((Short)element0, (Short)bag.get(0));
        assertEquals((Short)(short) 0, (Short)bag.get(1));
        assertEquals((Short)(short) 0, (Short)bag.get(2));
        assertEquals((Short)(short) 0, (Short)bag.get(3));
        assertEquals((Short)(short) 0, (Short)bag.get(4));
        assertEquals((Short)(short) 0, (Short)bag.get(5));
        assertEquals((Short)(short) 0, (Short)bag.get(6));
        assertEquals((Short)(short) 0, (Short)bag.get(7));

        bag.set(1, element1);
        assertEquals((Short)element0, (Short)bag.get(0));
        assertEquals((Short)element1, (Short)bag.get(1));
        assertEquals((Short)(short) 0, (Short)bag.get(2));
        assertEquals((Short)(short) 0, (Short)bag.get(3));
        assertEquals((Short)(short) 0, (Short)bag.get(4));
        assertEquals((Short)(short) 0, (Short)bag.get(5));
        assertEquals((Short)(short) 0, (Short)bag.get(6));
        assertEquals((Short)(short) 0, (Short)bag.get(7));

        bag.set(2, element2);
        assertEquals((Short)element0, (Short)bag.get(0));
        assertEquals((Short)element1, (Short)bag.get(1));
        assertEquals((Short)element2, (Short)bag.get(2));
        assertEquals((Short)(short) 0, (Short)bag.get(3));
        assertEquals((Short)(short) 0, (Short)bag.get(4));
        assertEquals((Short)(short) 0, (Short)bag.get(5));
        assertEquals((Short)(short) 0, (Short)bag.get(6));
        assertEquals((Short)(short) 0, (Short)bag.get(7));

        bag.set(3, element3);
        assertEquals((Short)element0, (Short)bag.get(0));
        assertEquals((Short)element1, (Short)bag.get(1));
        assertEquals((Short)element2, (Short)bag.get(2));
        assertEquals((Short)element3, (Short)bag.get(3));
        assertEquals((Short)(short) 0, (Short)bag.get(4));
        assertEquals((Short)(short) 0, (Short)bag.get(5));
        assertEquals((Short)(short) 0, (Short)bag.get(6));
        assertEquals((Short)(short) 0, (Short)bag.get(7));

        bag.set(4, element4);
        assertEquals((Short)element0, (Short)bag.get(0));
        assertEquals((Short)element1, (Short)bag.get(1));
        assertEquals((Short)element2, (Short)bag.get(2));
        assertEquals((Short)element3, (Short)bag.get(3));
        assertEquals((Short)element4, (Short)bag.get(4));
        assertEquals((Short)(short) 0, (Short)bag.get(5));
        assertEquals((Short)(short) 0, (Short)bag.get(6));
        assertEquals((Short)(short) 0, (Short)bag.get(7));

        bag.set(5, element5);
        assertEquals((Short)element0, (Short)bag.get(0));
        assertEquals((Short)element1, (Short)bag.get(1));
        assertEquals((Short)element2, (Short)bag.get(2));
        assertEquals((Short)element3, (Short)bag.get(3));
        assertEquals((Short)element4, (Short)bag.get(4));
        assertEquals((Short)element5, (Short)bag.get(5));
        assertEquals((Short)(short) 0, (Short)bag.get(6));
        assertEquals((Short)(short) 0, (Short)bag.get(7));

        bag.set(6, element6);
        assertEquals((Short)element0, (Short)bag.get(0));
        assertEquals((Short)element1, (Short)bag.get(1));
        assertEquals((Short)element2, (Short)bag.get(2));
        assertEquals((Short)element3, (Short)bag.get(3));
        assertEquals((Short)element4, (Short)bag.get(4));
        assertEquals((Short)element5, (Short)bag.get(5));
        assertEquals((Short)element6, (Short)bag.get(6));
        assertEquals((Short)(short) 0, (Short)bag.get(7));

        bag.set(7, element7);
        assertEquals((Short)element0, (Short)bag.get(0));
        assertEquals((Short)element1, (Short)bag.get(1));
        assertEquals((Short)element2, (Short)bag.get(2));
        assertEquals((Short)element3, (Short)bag.get(3));
        assertEquals((Short)element4, (Short)bag.get(4));
        assertEquals((Short)element5, (Short)bag.get(5));
        assertEquals((Short)element6, (Short)bag.get(6));
        assertEquals((Short)element7, (Short)bag.get(7));

        bag.clear();

        assertEquals((Short)(short) 0, (Short)bag.get(0));
        assertEquals((Short)(short) 0, (Short)bag.get(1));
        assertEquals((Short)(short) 0, (Short)bag.get(2));
        assertEquals((Short)(short) 0, (Short)bag.get(3));
        assertEquals((Short)(short) 0, (Short)bag.get(4));
        assertEquals((Short)(short) 0, (Short)bag.get(5));
        assertEquals((Short)(short) 0, (Short)bag.get(6));
        assertEquals((Short)(short) 0, (Short)bag.get(7));
    }

    /**
     * Ensures that the bag contains the default value by default
     */
    @Test
    public void testDefault() {
        ShortBag bag = new ShortBag();
        assertEquals((Short)(short) 0, (Short)bag.get(0));
        bag.set(0, (short) 1);
        assertEquals((Short)(short) 0, (Short)bag.get(1));
        assertEquals((Short)(short) 0, (Short)bag.get(2));
        assertEquals((Short)(short) 0, (Short)bag.get(3));
    }

    /**
     * Ensures that the bag resizes correctly when out of capacity and that it
     * does not resize when queried for non-existing elements.
     */
    @Test
    public void testCapacity() {
        ShortBag bag;

        bag = new ShortBag();
        assertEquals(0, bag.buffer.length);
        bag.set(0, (short) 1);
        assertEquals(1, bag.buffer.length);
        bag.set(1, (short) 1);
        assertEquals(2, bag.buffer.length);
        bag.set(2, (short) 1);
        assertEquals(4, bag.buffer.length);
        bag.set(3, (short) 1);
        assertEquals(4, bag.buffer.length);
        bag.set(4, (short) 1);
        assertEquals(8, bag.buffer.length);
        bag.set(8, (short) 1);
        assertEquals(16, bag.buffer.length);
        bag.set(35, (short) 1);
        assertEquals(64, bag.buffer.length);

        bag = new ShortBag();
        for (int i = 0; i < 32; i++) {
            bag.get((1 << i) - 1);
            assertEquals(0, bag.buffer.length);
        }
        bag.get(Integer.MAX_VALUE);
        assertEquals(0, bag.buffer.length);
    }

    /**
     * When a negative index is used, an {@link IndexOutOfBoundsException} should be thrown.
     */
    @Test
    public void testIndexOutOfBoundsException() {
        ShortBag bag = new ShortBag();
        for (int i = 0; i < 32; i++) {
            try {
                bag.set(-(1 << i), (short) 1);
            } catch (IndexOutOfBoundsException ex) {
                if (ex.getClass() == IndexOutOfBoundsException.class)
                    continue;
            }

            fail("IndexOutOfBoundsException expected for index " + (-(1 << i)));
        }
        for (int i = 0; i < 32; i++) {
            try {
                bag.get(-(1 << i));
            } catch (IndexOutOfBoundsException ex) {
                if (ex.getClass() == IndexOutOfBoundsException.class)
                    continue;
            }

            fail("IndexOutOfBoundsException expected for index " + (-(1 << i)));
        }
    }

    /**
     * When a negative capacity is used, a {@link NegativeArraySizeException} should be thrown.
     */
    @Test
    public void testNegativeArraySizeException() {
        ShortBag bag = new ShortBag();
        for (int i = 0; i < 32; i++) {
            try {
                bag.ensureCapacity(-(1 << i));
            } catch (NegativeArraySizeException ex) {
                if (ex.getClass() == NegativeArraySizeException.class)
                    continue;
            }

            fail("NegativeArraySizeException expected for capacity " + (-(1 << i)));
        }
    }

    /**
     * Ensures that the clear() and clear(Mask) methods work properly.
     */
    @Test
    public void testClear() {
        ShortBag bag;

        bag = new ShortBag();
        bag.set(0, (short) 1);
        bag.set(1, (short) 1);
        bag.set(63, (short) 1);
        bag.clear();
        assertEquals((Short) (short) 0, (Short) bag.get(0));
        assertEquals((Short) (short) 0, (Short) bag.get(1));
        assertEquals((Short) (short) 0, (Short) bag.get(63));
        assertEquals(64, bag.buffer.length);

        Mask mask = new Mask();
        bag = new ShortBag();
        bag.set(0, (short) 1);
        bag.set(1, (short) 1);
        bag.set(63, (short) 1);
        mask.set(63);
        mask.set(0);
        bag.clear(mask);
        assertEquals((Short) (short) 0, (Short) bag.get(0));
        assertNotEquals((Short) (short) 0, (Short) bag.get(1));
        assertEquals((Short) (short) 0, (Short) bag.get(63));
        mask.set(1);
        mask.set(457);
        bag.clear(mask);
        assertEquals((Short) (short) 0, (Short) bag.get(0));
        assertEquals((Short) (short) 0, (Short) bag.get(1));
        assertEquals((Short) (short) 0, (Short) bag.get(63));
        assertEquals(64, bag.buffer.length);
    }

    @Test
    public void testCopyFrom() {
        // Test copyFrom(bag) and copyFrom(bag, clearExceeding)
        ShortBag bag0, bag1;
        short e0 = (short) 1, e1 = (short) 1, e2 = (short) 1, e3 = (short) 1;

        bag0 = new ShortBag();
        bag0.set(0, e0);
        bag0.set(3, e1);
        bag0.set(9, e2);
        bag1 = new ShortBag();
        bag1.copyFrom(bag0);
        assertEquals((Short) e0, (Short) bag1.get(0));
        assertEquals((Short) e1, (Short) bag1.get(3));
        assertEquals((Short) e2, (Short) bag1.get(9));
        bag1 = new ShortBag();
        bag1.set(53, e3);
        bag1.copyFrom(bag0, false);
        assertEquals((Short) e0, (Short) bag1.get(0));
        assertEquals((Short) e1, (Short) bag1.get(3));
        assertEquals((Short) e2, (Short) bag1.get(9));
        assertEquals((Short) e3, (Short) bag1.get(53));
        bag1 = new ShortBag();
        bag1.set(53, e3);
        bag1.copyFrom(bag0, true);
        assertEquals((Short) e0, (Short) bag1.get(0));
        assertEquals((Short) e1, (Short) bag1.get(3));
        assertEquals((Short) e2, (Short) bag1.get(9));
        assertEquals((Short) (short) 0, (Short) bag1.get(53));

        // Test copyFrom(bag, length) and copyFrom(bag, length, clearExceeding)
        bag0 = new ShortBag();
        bag0.set(4, e0);
        bag0.set(7, e1);
        bag1 = new ShortBag();
        bag1.copyFrom(bag0, 3);
        assertEquals((Short) (short) 0, (Short) bag1.get(0));
        assertEquals((Short) (short) 0, (Short) bag1.get(1));
        assertEquals((Short) (short) 0, (Short) bag1.get(2));
        assertEquals((Short) (short) 0, (Short) bag1.get(3));
        assertEquals((Short) (short) 0, (Short) bag1.get(4));
        assertEquals((Short) (short) 0, (Short) bag1.get(5));
        assertEquals((Short) (short) 0, (Short) bag1.get(6));
        assertEquals((Short) (short) 0, (Short) bag1.get(7));
        bag1 = new ShortBag();
        bag1.copyFrom(bag0, 5);
        assertEquals((Short) (short) 0, (Short) bag1.get(0));
        assertEquals((Short) (short) 0, (Short) bag1.get(1));
        assertEquals((Short) (short) 0, (Short) bag1.get(2));
        assertEquals((Short) (short) 0, (Short) bag1.get(3));
        assertEquals((Short) e0, (Short) bag1.get(4));
        assertEquals((Short) (short) 0, (Short) bag1.get(5));
        assertEquals((Short) (short) 0, (Short) bag1.get(6));
        assertEquals((Short) (short) 0, (Short) bag1.get(7));
        bag1 = new ShortBag();
        bag1.set(8, e2);
        bag1.copyFrom(bag0, 8, true);
        assertEquals((Short) (short) 0, (Short) bag1.get(0));
        assertEquals((Short) (short) 0, (Short) bag1.get(1));
        assertEquals((Short) (short) 0, (Short) bag1.get(2));
        assertEquals((Short) (short) 0, (Short) bag1.get(3));
        assertEquals((Short) e0, (Short) bag1.get(4));
        assertEquals((Short) (short) 0, (Short) bag1.get(5));
        assertEquals((Short) (short) 0, (Short) bag1.get(6));
        assertEquals((Short) e1, (Short) bag1.get(7));
        assertEquals((Short) (short) 0, (Short) bag1.get(8));
        assertEquals((Short) (short) 0, (Short) bag1.get(9));

        // Test copyFrom(bag, fromOffset, length) and copyFrom(bag, fromOffset, length, clearExceeding)
        bag0 = new ShortBag();
        bag0.set(0, e0);
        bag0.set(4, e1);
        bag0.set(6, e2);
        bag1 = new ShortBag();
        bag1.copyFrom(bag0, 3, 2);
        assertEquals((Short) (short) 0, (Short) bag1.get(0));
        assertEquals((Short) e1, (Short) bag1.get(1));
        assertEquals((Short) (short) 0, (Short) bag1.get(2));
        assertEquals((Short) (short) 0, (Short) bag1.get(3));
        assertEquals((Short) (short) 0, (Short) bag1.get(4));
        assertEquals((Short) (short) 0, (Short) bag1.get(5));
        assertEquals((Short) (short) 0, (Short) bag1.get(6));
        assertEquals((Short) (short) 0, (Short) bag1.get(7));
        assertEquals((Short) (short) 0, (Short) bag1.get(8));
        bag0 = new ShortBag();
        bag0.set(0, e0);
        bag0.set(4, e1);
        bag0.set(10, e2);
        bag1 = new ShortBag();
        bag1.set(7, e3);
        bag1.copyFrom(bag0, 3, 2, false);
        assertEquals((Short) (short) 0, (Short) bag1.get(0));
        assertEquals((Short) e1, (Short) bag1.get(1));
        assertEquals((Short) (short) 0, (Short) bag1.get(2));
        assertEquals((Short) (short) 0, (Short) bag1.get(3));
        assertEquals((Short) (short) 0, (Short) bag1.get(4));
        assertEquals((Short) (short) 0, (Short) bag1.get(5));
        assertEquals((Short) (short) 0, (Short) bag1.get(6));
        assertEquals((Short) e3, (Short) bag1.get(7));
        assertEquals((Short) (short) 0, (Short) bag1.get(8));
        assertEquals((Short) (short) 0, (Short) bag1.get(9));
        assertEquals((Short) (short) 0, (Short) bag1.get(10));
    }

    @Test
    public void testCopyPartFrom() {
        ShortBag b0, b1;
        short e0 = (short) 1, e1 = (short) 1, e2 = (short) 1, e3 = (short) 1;
        b0 = new ShortBag();
        b0.set(5, e0);
        b0.set(14, e1);
        b0.set(21, e2);
        b1 = new ShortBag();
        b1.set(0, e3);
        b1.set(33, e0);
        b1.copyPartFrom(b0, 14, 1, 33);
        assertEquals((Short) e1, (Short) b1.get(1));
        assertEquals((Short) e2, (Short) b1.get(8));
        assertEquals((Short) e3, (Short) b1.get(0));
        assertEquals((Short) (short) 0, (Short) b1.get(32));
        assertEquals((Short) (short) 0, (Short) b1.get(33));
        assertEquals((Short) (short) 0, (Short) b1.get(34));
        assertEquals((Short) (short) 0, (Short) b1.get(35));
        b0 = new ShortBag();
        b0.set(5, e0);
        b0.set(14, e1);
        b0.set(21, e2);
        b1 = new ShortBag();
        b1.set(0, e3);
        b1.copyPartFrom(b0, 14, 1, 8);
        assertEquals((Short) e1, (Short) b1.get(1));
        assertEquals((Short) e2, (Short) b1.get(8));
        assertEquals((Short) e3, (Short) b1.get(0));
        assertEquals((Short) (short) 0, (Short) b1.get(32));
        assertEquals((Short) (short) 0, (Short) b1.get(33));
        assertEquals((Short) (short) 0, (Short) b1.get(34));
        assertEquals((Short) (short) 0, (Short) b1.get(35));
    }
}
