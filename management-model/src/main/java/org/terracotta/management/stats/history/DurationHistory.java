/*
 * Copyright Terracotta, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.terracotta.management.stats.history;

import org.terracotta.management.stats.AbstractStatisticHistory;
import org.terracotta.management.stats.Sample;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Ludovic Orban
 */
public final class DurationHistory extends AbstractStatisticHistory<Long, TimeUnit> implements Serializable {
  public DurationHistory(String name, List<Sample<Long>> samples, TimeUnit timeUnit) {
    super(name, samples, timeUnit);
  }
}
