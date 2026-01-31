package spring;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

    private List<String> subjects;
    private Set<String> skills;
    private Map<String, Integer> marks;

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    public void setSkills(Set<String> skills) {
        this.skills = skills;
    }

    public void setMarks(Map<String, Integer> marks) {
        this.marks = marks;
    }

    public void show() {
        System.out.println("Subjects : " + subjects);
        System.out.println("Skills   : " + skills);
        System.out.println("Marks    : " + marks);
    }
}
