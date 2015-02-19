/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core.api.iterable;

import static org.mockito.Mockito.verify;


import org.assertj.core.api.ConcreteIterableAssert;
import org.assertj.core.api.Condition;
import org.assertj.core.api.IterableAssertBaseTest;
import org.assertj.core.api.TestCondition;
import org.junit.BeforeClass;

/**
 * Tests for <code>{@link org.assertj.core.api.AbstractIterableAssert#areNot(org.assertj.core.api.Condition)} </code>.
 * 
 * @author Nicolas François
 */
public class IterableAssert_areNot_Test extends IterableAssertBaseTest {

  private static Condition<Object> condition;

  @BeforeClass
  public static void beforeOnce() {
    condition = new TestCondition<>();
  }

  @Override
  protected ConcreteIterableAssert<Object> invoke_api_method() {
    return assertions.areNot(condition);
  }

  @Override
  protected void verify_internal_effects() {
    verify(iterables).assertAreNot(getInfo(assertions), getActual(assertions), condition);
  }
}
