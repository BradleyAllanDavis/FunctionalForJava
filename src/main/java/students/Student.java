package students;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class Student {
  private final String name;
  private final double gpa;
  private final List<String> courses;

  private Student(String name, double gpa, List<String> courses) {
    this.name = name;
    this.gpa = gpa;
    this.courses = courses;
  }

  // varargs ALLOWS caller to either: provided comma separated items,
  // OR to provide a pre-built array
  public static Student of(String name, double gpa, String ... courses) {
    // Ouch!!! if caller retains the reference to the argument array
    // caller can change the data!!!
    // Arrays.asList creates a "view" on the array
    // this is OK for Java 8
//    return new Student(name, gpa,
//        Collections.unmodifiableList(Arrays.asList(courses.clone())));
    // Java 9 adds List.of
    return new Student(name, gpa, List.of(courses));
  }

  public String getName() {
    return name;
  }

  public double getGpa() {
    return gpa;
  }

  public List<String> getCourses() {
//     Safe with a List.of or otherwise unmodifiable list...
    return courses;
  }
}
