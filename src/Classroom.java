public class Classroom {

  Student[] students;

  public Classroom() {
    this.students = new Student[30];
  }

  public int count() {
    int count = 0;
    for (Student student : students) {
      if (student != null) {
        count++;
      }
    }
    return count;
  }
}
