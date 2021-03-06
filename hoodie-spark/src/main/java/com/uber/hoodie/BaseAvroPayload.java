/*
 *  Copyright (c) 2017 Uber Technologies, Inc. (hoodie-dev-group@uber.com)
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *           http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 */

package com.uber.hoodie;

import java.io.Serializable;
import org.apache.avro.generic.GenericRecord;

/**
 * Base class for all AVRO record based payloads, that can be ordered based on a field
 */
public abstract class BaseAvroPayload implements Serializable {


  /**
   * Avro data extracted from the source
   */
  protected final GenericRecord record;

  /**
   * For purposes of preCombining
   */
  protected final Comparable orderingVal;

  /**
   * @param record
   * @param orderingVal
   */
  public BaseAvroPayload(GenericRecord record, Comparable orderingVal) {
    this.record = record;
    this.orderingVal = orderingVal;
  }
}
