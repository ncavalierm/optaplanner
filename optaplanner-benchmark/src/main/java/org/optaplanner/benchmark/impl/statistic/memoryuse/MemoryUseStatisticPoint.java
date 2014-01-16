/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.optaplanner.benchmark.impl.statistic.memoryuse;

import java.util.List;

import org.optaplanner.benchmark.impl.statistic.StatisticPoint;

public class MemoryUseStatisticPoint extends StatisticPoint {

    private final long timeMillisSpend;
    private final MemoryUseMeasurement memoryUseMeasurement;

    public MemoryUseStatisticPoint(long timeMillisSpend, MemoryUseMeasurement memoryUseMeasurement) {
        this.timeMillisSpend = timeMillisSpend;
        this.memoryUseMeasurement = memoryUseMeasurement;
    }

    public long getTimeMillisSpend() {
        return timeMillisSpend;
    }

    public MemoryUseMeasurement getMemoryUseMeasurement() {
        return memoryUseMeasurement;
    }

    @Override
    public String toCsvLine() {
        return buildCsvLineWithLongs(timeMillisSpend, memoryUseMeasurement.getUsedMemory(), memoryUseMeasurement.getMaxMemory());
    }

}
