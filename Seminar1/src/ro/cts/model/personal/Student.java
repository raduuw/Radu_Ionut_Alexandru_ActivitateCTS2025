package ro.cts.model.personal;

public class Student extends Persoana {
    private int idStudent;
    private float bursaStudent;

    public Student(String nume, int varsta, int idStudent, float bursaStudent) {
        super(nume, varsta);
        this.idStudent = idStudent;
        this.bursaStudent = bursaStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public float getBursaStudent() {
        return bursaStudent;
    }

    public void setBursaStudent(float bursaStudent) {
        this.bursaStudent = bursaStudent;
    }

    @Override
    public float calculareVenit() {
        return this.bursaStudent;
    }
}
