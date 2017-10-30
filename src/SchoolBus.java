
public class SchoolBus {

  Student[] passengers;

  public SchoolBus(int capacity) {
    this.passengers = new Student[capacity];
  }

  public void moveStudentsToClassroom(Classroom classroom) {
    for (int i = 0; i < passengers.length; i++) {
      classroom.addStudent(passengers[i]);
      passengers[i] = null;
    }
  }

  public int countPassengers() {
    int count = 0;
    for (Student student : passengers) {
      if (student != null) {
        count++;
      }
    }
    return count;
  }

  public void addPassenger(Student passenger) {
    if (countPassengers() == passengers.length) {
      return;
    }

    passengers[countPassengers()] = passenger;
  }
}
