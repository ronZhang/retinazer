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
package com.github.antag99.retinazer;

import com.github.antag99.retinazer.utils.Bag;
import com.github.antag99.retinazer.utils.Mask;

final class ComponentStorage<T extends Component> {
    Class<T> componentType;
    // Index of the component type
    int index;
    // Current components of this type
    Bag<T> components = new Bag<T>();
    // Next components of this type
    Bag<T> nextComponents = new Bag<T>();
    // Components that will be added next
    Mask componentsAdded = new Mask();
    // Components that will be removed next
    Mask componentsRemoved = new Mask();
    // Whether any component has been modified
    boolean dirty = false;

    ComponentStorage(Class<T> componentType, int index) {
        this.componentType = componentType;
        this.index = index;
    }

    T get(Entity entity) {
        return components.get(entity.getIndex());
    }

    boolean has(Entity entity) {
        return components.get(entity.getIndex()) != null;
    }

    void add(Entity entity, T instance) {
        if (has(entity)) {
            remove(entity);
        }

        nextComponents.set(entity.getIndex(), instance);
        componentsAdded.set(entity.getIndex());
        dirty = true;
    }

    void remove(Entity entity) {
        final int index = entity.getIndex();
        if (nextComponents.get(index) == null)
            return;
        componentsAdded.clear(index);
        nextComponents.set(index, null);
        componentsRemoved.set(index);
        dirty = true;
    }
}
