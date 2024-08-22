public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }

    public void addBulkExamNote(int mat, int matSozlu, int fizik, int fizikSozlu, int kimya, int kimyaSozlu) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (matSozlu >= 0 && matSozlu <= 100) {
            this.mat.sozluNote = matSozlu;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (fizikSozlu >= 0 && fizikSozlu <= 100) {
            this.fizik.sozluNote = fizikSozlu;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

        if (kimyaSozlu >= 0 && kimyaSozlu <= 100) {
            this.kimya.sozluNote = kimyaSozlu;
        }

        calcAvarage();
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 ||
                this.mat.sozluNote == 0 || this.fizik.sozluNote == 0 || this.kimya.sozluNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        double matAverage = (this.mat.note * 0.80) + (this.mat.sozluNote * 0.20);
        double fizikAverage = (this.fizik.note * 0.90) + (this.fizik.sozluNote * 0.10);
        double kimyaAverage = (this.kimya.note * 0.60) + (this.kimya.sozluNote * 0.40);
        this.avarage = (matAverage + fizikAverage + kimyaAverage) / 3.0;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note + ", Sözlü Notu : " + this.mat.sozluNote);
        System.out.println("Fizik Notu : " + this.fizik.note + ", Sözlü Notu : " + this.fizik.sozluNote);
        System.out.println("Kimya Notu : " + this.kimya.note + ", Sözlü Notu : " + this.kimya.sozluNote);
    }
}
