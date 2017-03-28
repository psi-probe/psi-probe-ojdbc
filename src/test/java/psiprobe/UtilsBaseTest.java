/**
 * Licensed under the GPL License. You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   https://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 *
 * THIS PACKAGE IS PROVIDED "AS IS" AND WITHOUT ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * WITHOUT LIMITATION, THE IMPLIED WARRANTIES OF MERCHANTIBILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE.
 */
package psiprobe;

import org.junit.Assert;
import org.junit.Test;

import com.codebox.bean.JavaBeanTester;

/**
 * The Class UtilsTest.
 */
public class UtilsBaseTest {

  /**
   * Calc pool usage score test.
   */
  @Test
  public void calcPoolUsageScoreTest() {
    Assert.assertEquals(100, UtilsBase.calcPoolUsageScore(5, 5));
    Assert.assertEquals(0, UtilsBase.calcPoolUsageScore(0, 5));
  }

  /**
   * To int test.
   */
  @Test
  public void toIntTest() {
    Assert.assertEquals(5, UtilsBase.toInt("garbage", 5));
    Assert.assertEquals(3, UtilsBase.toInt("3", 5));
    Assert.assertEquals(5, UtilsBase.toInt("3 3", 5));
    Assert.assertEquals(5, UtilsBase.toInt((String) null, 5)); 
  }

  /**
   * JavabeanTester Private Constructor.
   */
  @Test
  public void javabeanTester() {
    JavaBeanTester.builder(UtilsBase.class).testPrivateConstructor();
  }  

}
