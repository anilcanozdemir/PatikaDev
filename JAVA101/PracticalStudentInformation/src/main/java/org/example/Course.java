package org.example;

public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int examResult;
    int performanceResult;

    int performanceRate;

    public Course(String name, String code, String prefix,int performanceRate) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.performanceRate=performanceRate;
        this.examResult = 0;
        this.performanceResult=0;
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
    public int calculateGrade()
    {
        return (performanceResult*performanceRate+examResult*(100-performanceRate))/100;
    }
}
