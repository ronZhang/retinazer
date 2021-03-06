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
public final class DoubleBagTest {
    /**
     * Ensures that the elements of a bag are actually stored
     */
    @Test
    public void testStorage() {
        DoubleBag bag = new DoubleBag();
        double element0 = 1d;
        double element1 = 1d;
        double element2 = 1d;
        double element3 = 1d;
        double element4 = 1d;
        double element5 = 1d;
        double element6 = 1d;
        double element7 = 1d;

        bag.set(0, element0);
        assertEquals((Double)element0, (Double)bag.get(0));
        assertEquals((Double)0d, (Double)bag.get(1));
        assertEquals((Double)0d, (Double)bag.get(2));
        assertEquals((Double)0d, (Double)bag.get(3));
        assertEquals((Double)0d, (Double)bag.get(4));
        assertEquals((Double)0d, (Double)bag.get(5));
        assertEquals((Double)0d, (Double)bag.get(6));
        assertEquals((Double)0d, (Double)bag.get(7));

        bag.set(1, element1);
        assertEquals((Double)element0, (Double)bag.get(0));
        assertEquals((Double)element1, (Double)bag.get(1));
        assertEquals((Double)0d, (Double)bag.get(2));
        assertEquals((Double)0d, (Double)bag.get(3));
        assertEquals((Double)0d, (Double)bag.get(4));
        assertEquals((Double)0d, (Double)bag.get(5));
        assertEquals((Double)0d, (Double)bag.get(6));
        assertEquals((Double)0d, (Double)bag.get(7));

        bag.set(2, element2);
        assertEquals((Double)element0, (Double)bag.get(0));
        assertEquals((Double)element1, (Double)bag.get(1));
        assertEquals((Double)element2, (Double)bag.get(2));
        assertEquals((Double)0d, (Double)bag.get(3));
        assertEquals((Double)0d, (Double)bag.get(4));
        assertEquals((Double)0d, (Double)bag.get(5));
        assertEquals((Double)0d, (Double)bag.get(6));
        assertEquals((Double)0d, (Double)bag.get(7));

        bag.set(3, element3);
        assertEquals((Double)element0, (Double)bag.get(0));
        assertEquals((Double)element1, (Double)bag.get(1));
        assertEquals((Double)element2, (Double)bag.get(2));
        assertEquals((Double)element3, (Double)bag.get(3));
        assertEquals((Double)0d, (Double)bag.get(4));
        assertEquals((Double)0d, (Double)bag.get(5));
        assertEquals((Double)0d, (Double)bag.get(6));
        assertEquals((Double)0d, (Double)bag.get(7));

        bag.set(4, element4);
        assertEquals((Double)element0, (Double)bag.get(0));
        assertEquals((Double)element1, (Double)bag.get(1));
        assertEquals((Double)element2, (Double)bag.get(2));
        assertEquals((Double)element3, (Double)bag.get(3));
        assertEquals((Double)element4, (Double)bag.get(4));
        assertEquals((Double)0d, (Double)bag.get(5));
        assertEquals((Double)0d, (Double)bag.get(6));
        assertEquals((Double)0d, (Double)bag.get(7));

        bag.set(5, element5);
        assertEquals((Double)element0, (Double)bag.get(0));
        assertEquals((Double)element1, (Double)bag.get(1));
        assertEquals((Double)element2, (Double)bag.get(2));
        assertEquals((Double)element3, (Double)bag.get(3));
        assertEquals((Double)element4, (Double)bag.get(4));
        assertEquals((Double)element5, (Double)bag.get(5));
        assertEquals((Double)0d, (Double)bag.get(6));
        assertEquals((Double)0d, (Double)bag.get(7));

        bag.set(6, element6);
        assertEquals((Double)element0, (Double)bag.get(0));
        assertEquals((Double)element1, (Double)bag.get(1));
        assertEquals((Double)element2, (Double)bag.get(2));
        assertEquals((Double)element3, (Double)bag.get(3));
        assertEquals((Double)element4, (Double)bag.get(4));
        assertEquals((Double)element5, (Double)bag.get(5));
        assertEquals((Double)element6, (Double)bag.get(6));
        assertEquals((Double)0d, (Double)bag.get(7));

        bag.set(7, element7);
        assertEquals((Double)element0, (Double)bag.get(0));
        assertEquals((Double)element1, (Double)bag.get(1));
        assertEquals((Double)element2, (Double)bag.get(2));
        assertEquals((Double)element3, (Double)bag.get(3));
        assertEquals((Double)element4, (Double)bag.get(4));
        assertEquals((Double)element5, (Double)bag.get(5));
        assertEquals((Double)element6, (Double)bag.get(6));
        assertEquals((Double)element7, (Double)bag.get(7));

        bag.clear();

        assertEquals((Double)0d, (Double)bag.get(0));
        assertEquals((Double)0d, (Double)bag.get(1));
        assertEquals((Double)0d, (Double)bag.get(2));
        assertEquals((Double)0d, (Double)bag.get(3));
        assertEquals((Double)0d, (Double)bag.get(4));
        assertEquals((Double)0d, (Double)bag.get(5));
        assertEquals((Double)0d, (Double)bag.get(6));
        assertEquals((Double)0d, (Double)bag.get(7));
    }

    /**
     * Ensures that the bag contains the default value by default
     */
    @Test
    public void testDefault() {
        DoubleBag bag = new DoubleBag();
        assertEquals((Double)0d, (Double)bag.get(0));
        bag.set(0, 1d);
        assertEquals((Double)0d, (Double)bag.get(1));
        assertEquals((Double)0d, (Double)bag.get(2));
        assertEquals((Double)0d, (Double)bag.get(3));
    }

    /**
     * Ensures that the bag resizes correctly when out of capacity and that it
     * does not resize when queried for non-existing elements.
     */
    @Test
    public void testCapacity() {
        DoubleBag bag;

        bag = new DoubleBag();
        assertEquals(0, bag.buffer.length);
        bag.set(0, 1d);
        assertEquals(1, bag.buffer.length);
        bag.set(1, 1d);
        assertEquals(2, bag.buffer.length);
        bag.set(2, 1d);
        assertEquals(4, bag.buffer.length);
        bag.set(3, 1d);
        assertEquals(4, bag.buffer.length);
        bag.set(4, 1d);
        assertEquals(8, bag.buffer.length);
        bag.set(8, 1d);
        assertEquals(16, bag.buffer.length);
        bag.set(35, 1d);
        assertEquals(64, bag.buffer.length);

        bag = new DoubleBag();
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
        DoubleBag bag = new DoubleBag();
        for (int i = 0; i < 32; i++) {
            try {
                bag.set(-(1 << i), 1d);
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
        DoubleBag bag = new DoubleBag();
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
        DoubleBag bag;

        bag = new DoubleBag();
        bag.set(0, 1d);
        bag.set(1, 1d);
        bag.set(63, 1d);
        bag.clear();
        assertEquals((Double) 0d, (Double) bag.get(0));
        assertEquals((Double) 0d, (Double) bag.get(1));
        assertEquals((Double) 0d, (Double) bag.get(63));
        assertEquals(64, bag.buffer.length);

        Mask mask = new Mask();
        bag = new DoubleBag();
        bag.set(0, 1d);
        bag.set(1, 1d);
        bag.set(63, 1d);
        mask.set(63);
        mask.set(0);
        bag.clear(mask);
        assertEquals((Double) 0d, (Double) bag.get(0));
        assertNotEquals((Double) 0d, (Double) bag.get(1));
        assertEquals((Double) 0d, (Double) bag.get(63));
        mask.set(1);
        mask.set(457);
        bag.clear(mask);
        assertEquals((Double) 0d, (Double) bag.get(0));
        assertEquals((Double) 0d, (Double) bag.get(1));
        assertEquals((Double) 0d, (Double) bag.get(63));
        assertEquals(64, bag.buffer.length);
    }

    @Test
    public void testCopyFrom() {
        // Test copyFrom(bag) and copyFrom(bag, clearExceeding)
        DoubleBag bag0, bag1;
        double e0 = 1d, e1 = 1d, e2 = 1d, e3 = 1d;

        bag0 = new DoubleBag();
        bag0.set(0, e0);
        bag0.set(3, e1);
        bag0.set(9, e2);
        bag1 = new DoubleBag();
        bag1.copyFrom(bag0);
        assertEquals((Double) e0, (Double) bag1.get(0));
        assertEquals((Double) e1, (Double) bag1.get(3));
        assertEquals((Double) e2, (Double) bag1.get(9));
        bag1 = new DoubleBag();
        bag1.set(53, e3);
        bag1.copyFrom(bag0, false);
        assertEquals((Double) e0, (Double) bag1.get(0));
        assertEquals((Double) e1, (Double) bag1.get(3));
        assertEquals((Double) e2, (Double) bag1.get(9));
        assertEquals((Double) e3, (Double) bag1.get(53));
        bag1 = new DoubleBag();
        bag1.set(53, e3);
        bag1.copyFrom(bag0, true);
        assertEquals((Double) e0, (Double) bag1.get(0));
        assertEquals((Double) e1, (Double) bag1.get(3));
        assertEquals((Double) e2, (Double) bag1.get(9));
        assertEquals((Double) 0d, (Double) bag1.get(53));

        // Test copyFrom(bag, length) and copyFrom(bag, length, clearExceeding)
        bag0 = new DoubleBag();
        bag0.set(4, e0);
        bag0.set(7, e1);
        bag1 = new DoubleBag();
        bag1.copyFrom(bag0, 3);
        assertEquals((Double) 0d, (Double) bag1.get(0));
        assertEquals((Double) 0d, (Double) bag1.get(1));
        assertEquals((Double) 0d, (Double) bag1.get(2));
        assertEquals((Double) 0d, (Double) bag1.get(3));
        assertEquals((Double) 0d, (Double) bag1.get(4));
        assertEquals((Double) 0d, (Double) bag1.get(5));
        assertEquals((Double) 0d, (Double) bag1.get(6));
        assertEquals((Double) 0d, (Double) bag1.get(7));
        bag1 = new DoubleBag();
        bag1.copyFrom(bag0, 5);
        assertEquals((Double) 0d, (Double) bag1.get(0));
        assertEquals((Double) 0d, (Double) bag1.get(1));
        assertEquals((Double) 0d, (Double) bag1.get(2));
        assertEquals((Double) 0d, (Double) bag1.get(3));
        assertEquals((Double) e0, (Double) bag1.get(4));
        assertEquals((Double) 0d, (Double) bag1.get(5));
        assertEquals((Double) 0d, (Double) bag1.get(6));
        assertEquals((Double) 0d, (Double) bag1.get(7));
        bag1 = new DoubleBag();
        bag1.set(8, e2);
        bag1.copyFrom(bag0, 8, true);
        assertEquals((Double) 0d, (Double) bag1.get(0));
        assertEquals((Double) 0d, (Double) bag1.get(1));
        assertEquals((Double) 0d, (Double) bag1.get(2));
        assertEquals((Double) 0d, (Double) bag1.get(3));
        assertEquals((Double) e0, (Double) bag1.get(4));
        assertEquals((Double) 0d, (Double) bag1.get(5));
        assertEquals((Double) 0d, (Double) bag1.get(6));
        assertEquals((Double) e1, (Double) bag1.get(7));
        assertEquals((Double) 0d, (Double) bag1.get(8));
        assertEquals((Double) 0d, (Double) bag1.get(9));

        // Test copyFrom(bag, fromOffset, length) and copyFrom(bag, fromOffset, length, clearExceeding)
        bag0 = new DoubleBag();
        bag0.set(0, e0);
        bag0.set(4, e1);
        bag0.set(6, e2);
        bag1 = new DoubleBag();
        bag1.copyFrom(bag0, 3, 2);
        assertEquals((Double) 0d, (Double) bag1.get(0));
        assertEquals((Double) e1, (Double) bag1.get(1));
        assertEquals((Double) 0d, (Double) bag1.get(2));
        assertEquals((Double) 0d, (Double) bag1.get(3));
        assertEquals((Double) 0d, (Double) bag1.get(4));
        assertEquals((Double) 0d, (Double) bag1.get(5));
        assertEquals((Double) 0d, (Double) bag1.get(6));
        assertEquals((Double) 0d, (Double) bag1.get(7));
        assertEquals((Double) 0d, (Double) bag1.get(8));
        bag0 = new DoubleBag();
        bag0.set(0, e0);
        bag0.set(4, e1);
        bag0.set(10, e2);
        bag1 = new DoubleBag();
        bag1.set(7, e3);
        bag1.copyFrom(bag0, 3, 2, false);
        assertEquals((Double) 0d, (Double) bag1.get(0));
        assertEquals((Double) e1, (Double) bag1.get(1));
        assertEquals((Double) 0d, (Double) bag1.get(2));
        assertEquals((Double) 0d, (Double) bag1.get(3));
        assertEquals((Double) 0d, (Double) bag1.get(4));
        assertEquals((Double) 0d, (Double) bag1.get(5));
        assertEquals((Double) 0d, (Double) bag1.get(6));
        assertEquals((Double) e3, (Double) bag1.get(7));
        assertEquals((Double) 0d, (Double) bag1.get(8));
        assertEquals((Double) 0d, (Double) bag1.get(9));
        assertEquals((Double) 0d, (Double) bag1.get(10));
    }

    @Test
    public void testCopyPartFrom() {
        DoubleBag b0, b1;
        double e0 = 1d, e1 = 1d, e2 = 1d, e3 = 1d;
        b0 = new DoubleBag();
        b0.set(5, e0);
        b0.set(14, e1);
        b0.set(21, e2);
        b1 = new DoubleBag();
        b1.set(0, e3);
        b1.set(33, e0);
        b1.copyPartFrom(b0, 14, 1, 33);
        assertEquals((Double) e1, (Double) b1.get(1));
        assertEquals((Double) e2, (Double) b1.get(8));
        assertEquals((Double) e3, (Double) b1.get(0));
        assertEquals((Double) 0d, (Double) b1.get(32));
        assertEquals((Double) 0d, (Double) b1.get(33));
        assertEquals((Double) 0d, (Double) b1.get(34));
        assertEquals((Double) 0d, (Double) b1.get(35));
        b0 = new DoubleBag();
        b0.set(5, e0);
        b0.set(14, e1);
        b0.set(21, e2);
        b1 = new DoubleBag();
        b1.set(0, e3);
        b1.copyPartFrom(b0, 14, 1, 8);
        assertEquals((Double) e1, (Double) b1.get(1));
        assertEquals((Double) e2, (Double) b1.get(8));
        assertEquals((Double) e3, (Double) b1.get(0));
        assertEquals((Double) 0d, (Double) b1.get(32));
        assertEquals((Double) 0d, (Double) b1.get(33));
        assertEquals((Double) 0d, (Double) b1.get(34));
        assertEquals((Double) 0d, (Double) b1.get(35));
    }
}
