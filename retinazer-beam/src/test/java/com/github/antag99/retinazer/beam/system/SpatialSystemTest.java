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
package com.github.antag99.retinazer.beam.system;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.badlogic.gdx.math.GridPoint2;
import com.github.antag99.retinazer.Engine;
import com.github.antag99.retinazer.EngineConfig;
import com.github.antag99.retinazer.EntitySet;
import com.github.antag99.retinazer.Handle;
import com.github.antag99.retinazer.Mapper;
import com.github.antag99.retinazer.beam.component.Location;
import com.github.antag99.retinazer.beam.component.Position;
import com.github.antag99.retinazer.beam.component.Room;
import com.github.antag99.retinazer.beam.component.Size;
import com.github.antag99.retinazer.beam.component.Spatial;

public final class SpatialSystemTest {
    private static final int PARTITION_WIDTH = 32;
    private static final int PARTITION_HEIGHT = 32;

    private static final float ENTITY_WIDTH = 4f;
    private static final float ENTITY_HEIGHT = 4f;

    Engine engine;
    SpatialSystem spatialSystem;
    Mapper<Spatial> mSpatial;

    @Before
    public void initialize() {
        engine = new Engine(new EngineConfig()
                .addSystem(spatialSystem = new SpatialSystem(PARTITION_WIDTH, PARTITION_HEIGHT)));
        mSpatial = engine.getMapper(Spatial.class);
    }

    @Test
    public void testSpatial() {
        Handle roomEntity = engine.createEntity().duplicate();
        Room room = roomEntity.create(Room.class);

        Handle entity = engine.createEntity().duplicate();

        EntitySet set = new EntitySet();
        set.addEntity(entity.getEntity());

        EntitySet emptySet = new EntitySet();

        Position position = entity.create(Position.class);
        position.x = 0f;
        position.y = 0f;

        Size size = entity.create(Size.class);
        size.width = 4f;
        size.height = 4f;

        Location location = entity.create(Location.class);
        location.room = roomEntity.getEntity();

        engine.update();

        assertEquals(0, location.partitionStartX);
        assertEquals(0, location.partitionStartY);

        assertEquals(1, location.partitionEndX);
        assertEquals(1, location.partitionEndY);

        assertEquals(set, mSpatial.get(room.partitions.get(new GridPoint2(0, 0), -1)).entities);

        engine.update();

        assertEquals(0, location.partitionStartX);
        assertEquals(0, location.partitionStartY);

        assertEquals(1, location.partitionEndX);
        assertEquals(1, location.partitionEndY);

        assertEquals(set, mSpatial.get(room.partitions.get(new GridPoint2(0, 0), -1)).entities);

        position.x = PARTITION_WIDTH - ENTITY_WIDTH * 0.5f;
        position.y = PARTITION_HEIGHT - ENTITY_HEIGHT * 0.5f;

        engine.update();

        assertEquals(0, location.partitionStartX);
        assertEquals(0, location.partitionStartY);

        assertEquals(2, location.partitionEndX);
        assertEquals(2, location.partitionEndY);

        assertEquals(set, mSpatial.get(room.partitions.get(new GridPoint2(0, 0), -1)).entities);
        assertEquals(set, mSpatial.get(room.partitions.get(new GridPoint2(1, 0), -1)).entities);
        assertEquals(set, mSpatial.get(room.partitions.get(new GridPoint2(0, 1), -1)).entities);
        assertEquals(set, mSpatial.get(room.partitions.get(new GridPoint2(1, 1), -1)).entities);

        position.x = PARTITION_WIDTH;
        position.y = PARTITION_HEIGHT;

        engine.update();

        assertEquals(1, location.partitionStartX);
        assertEquals(1, location.partitionStartY);

        assertEquals(2, location.partitionEndX);
        assertEquals(2, location.partitionEndY);

        assertEquals(emptySet, mSpatial.get(room.partitions.get(new GridPoint2(0, 0), -1)).entities);
        assertEquals(emptySet, mSpatial.get(room.partitions.get(new GridPoint2(1, 0), -1)).entities);
        assertEquals(emptySet, mSpatial.get(room.partitions.get(new GridPoint2(0, 1), -1)).entities);
        assertEquals(set, mSpatial.get(room.partitions.get(new GridPoint2(1, 1), -1)).entities);

        entity.destroy();

        engine.update();

        assertEquals(emptySet, mSpatial.get(room.partitions.get(new GridPoint2(0, 0), -1)).entities);
        assertEquals(emptySet, mSpatial.get(room.partitions.get(new GridPoint2(1, 0), -1)).entities);
        assertEquals(emptySet, mSpatial.get(room.partitions.get(new GridPoint2(0, 1), -1)).entities);
        assertEquals(emptySet, mSpatial.get(room.partitions.get(new GridPoint2(1, 1), -1)).entities);
    }
}
