package students;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School {
//  public static void selectSmart(List<Student> ls) {
//    Iterator<Student> iter = ls.iterator();
//    while (iter.hasNext()) {
//      Student s = s.getGrade();
// NO NO NO NO don't mutate other people's data, or data structures
//      if (s < 3) iter.remove();
//    }
//  }

  public static void main(String[] args) {
    List<Student> roster = new ArrayList<>();
    roster.add(Student.of("Fred", 3.2, "Math", "Physics"));
    roster.add(Student.of("Jim", 2.4, "Art"));
    roster.add(Student.of("Sheila", 3.8, "Math", "Physics", "Astrophysics", "Quantum Mechanics"));

  }
}
