package org.example;

public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int matExam,int matPerformance,int fizikExam,int fizikPerformance,int kimyaExam,int kimyaPerformance) {

        if (matExam >= 0 && matExam <= 100) {
            this.mat.examResult = matExam;
        }
        if (matPerformance >= 0 && matPerformance <= 100) {
            this.mat.performanceResult = matPerformance;
        }

        if (fizikExam >= 0 && fizikExam <= 100) {
            this.fizik.examResult = fizikExam;
        }
        if (fizikPerformance >= 0 && fizikPerformance <= 100) {
            this.fizik.performanceResult = fizikPerformance;
        }

        if (kimyaExam >= 0 && kimyaExam <= 100) {
            this.kimya.examResult = kimyaExam;
        }

        if (kimyaPerformance >= 0 && kimyaPerformance <= 100) {
            this.kimya.performanceResult = kimyaPerformance;
        }

    }

    public void isPass() {
        if (this.mat.calculateGrade() == 0 || this.fizik.calculateGrade() == 0 || this.kimya.calculateGrade() == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (this.fizik.calculateGrade() + this.kimya.calculateGrade() + this.mat.calculateGrade()) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.calculateGrade());
        System.out.println("Fizik Notu : " + this.fizik.calculateGrade());
        System.out.println("Kimya Notu : " + this.kimya.calculateGrade());
    }

}
