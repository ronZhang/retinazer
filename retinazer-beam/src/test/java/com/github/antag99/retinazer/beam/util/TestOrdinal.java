/*******************************************************************************
 * Copyright (C) 2015 Anton Gustafsson
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 ******************************************************************************/
package com.github.antag99.retinazer.beam.util;

public final class TestOrdinal extends Ordinal<TestOrdinal> {
    public static final OrdinalType<TestOrdinal> TYPE = new OrdinalType<>();

    public TestOrdinal(String name) {
        super(TYPE, name);
    }

    public static final TestOrdinal TEST_0 = new TestOrdinal("TestOrdinal.TEST_0");
    public static final TestOrdinal TEST_1 = new TestOrdinal("TestOrdinal.TEST_1");
    public static final TestOrdinal TEST_2 = new TestOrdinal("TestOrdinal.TEST_2");
    public static final TestOrdinal TEST_3 = new TestOrdinal("TestOrdinal.TEST_3");
}