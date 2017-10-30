import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClassroomTest {

  Classroom classroom;
  Student student;

  @Before
  public void before() {
    classroom = new Classroom(30);
    student = new Student("Chris", 24);
  }

  @Test
  public void classroomHasNoStudentsAtStart() {
    assertEquals(0, classroom.count());
  }

  @Test
  public void canAddStudentToClassroom() {
    classroom.addStudent(student);
    assertEquals(1, classroom.count());
  }

  @Test
  public void classroomIsFullIfItHasMoreThan30Students() {
    for (int i = 0; i < 40; i++) {
      classroom.addStudent(student);
    }

    assertEquals(true, classroom.isFull());
  }

  @Test
  public void canMoveStudentsFromSchoolBusToClassroom() {
    SchoolBus schoolBus = new SchoolBus(20);
    for (int i = 0; i < 20; i++) {
      schoolBus.addPassenger(student);
    }

    schoolBus.moveStudentsToClassroom(classroom);

    assertEquals(0, schoolBus.countPassengers());
    assertEquals(20, classroom.count());
  }

}
