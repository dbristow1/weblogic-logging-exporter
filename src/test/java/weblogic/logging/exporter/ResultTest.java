/*
 * Copyright (c) 2019, Oracle and/or its affiliates. All rights reserved.
 *
 * Licensed under the Universal Permissive License v 1.0 as shown at http://oss.oracle.com/licenses/upl.
 */

package weblogic.logging.exporter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test the Result object")
public class ResultTest {

  // using 200 for status field just to test it is set/got correctly
  // 200 is HTTP status for OK
  private static final String EXPECTED_STRING =
      "Result{response='good', status=200, successful=true}";

  @DisplayName("After creating a Result, make sure I can retrieve the field values")
  @Test
  public void afterCreated_canRetrieveFieldValues() {
    Result result = new Result("good", 200, true);

    assertEquals("good", result.getResponse());
    assertEquals(200, result.getStatus());
    assertEquals(true, result.isSuccessful());
  }

  @DisplayName("Check toString() works")
  @Test
  public void checkToString() {
    Result result = new Result("good", 200, true);

    assertEquals(EXPECTED_STRING, result.toString());
  }
}