package hw;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

  private HelloWorld fixture;

  @Before
  public void setUp() throws Exception {
    fixture = new HelloWorld();
  }

  @After
  public void tearDown() throws Exception {
    fixture = null;
  }

  @Test
  public void initialization() { // this test is OK as-is, it should pass with no problem
    assertNotNull(fixture);
  }

  @Test
  public void getMessage() { // this test is OK as-is, it should pass with no problem
    assertNotNull(fixture);
    assertEquals("hello world", fixture.getMessage());
  }

  @Test
  public void getYear() { // this test is OK, fix HelloWorld.java to make it pass!
    assertNotNull(fixture);
    assertEquals(2021, fixture.getYear());
  }

  @Test
  public void getMessageInList() { // this test is broken - fix it!
    var list = Arrays.asList(fixture);
    assertEquals("hello world", list.get(1).getMessage());
  }

  @Test
  public void getYearInList() { // this test is broken - fix it!
    var list = Arrays.asList(fixture);
    assertEquals(2020, list.get(1).getYear());
  }
}
