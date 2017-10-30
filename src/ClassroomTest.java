import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassroomTest {

  Classroom classroom;

  @Before
  public void before() {
    classroom = new Classroom();
  }

  @Test
  public void classroomHasNoStudentsAtStart() {
    assertEquals(0, classroom.count());
  }

}
