/**
 * Copyright (c) 2012 RedEngine Ltd, http://www.RedEngine.co.nz. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package net.stickycode.scheduled;


/**
 * The contract for parsers that can create schedules from schedule specifications
 */
public interface ScheduleParser {

  /**
   * @param specification the specification that this parser should try to identify
   * @return true if the given specification is parseable by this parser
   */
  boolean matches(String specification);

  /**
   * @param specification the specification that this parser has said it can parse
   * @return the Schedule as parsed from the given specification
   */
  Schedule parse(String specification);
}
