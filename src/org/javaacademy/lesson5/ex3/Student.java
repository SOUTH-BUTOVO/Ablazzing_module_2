package org.javaacademy.lesson5.ex3;

public class Student implements Comparable<Student> {
    private Integer height;

    public Student(Integer height) {
        this.height = height;
    }

    @Override
    public int compareTo(Student o) {
        return height < o.height ? -1 : height > o.height ? 1 : 0;
    }

    @Override
    public String toString() {
        return "Student{" + "height=" + height + '}';
    }
}
