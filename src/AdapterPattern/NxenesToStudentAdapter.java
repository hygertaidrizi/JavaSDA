package AdapterPattern;

public class NxenesToStudentAdapter implements Student {
    private Nxenes nxenes;

    public NxenesToStudentAdapter(Nxenes nxenes) {
        this.nxenes = nxenes;
    }

    @Override
    public double getGrade() {
        int grade = this.nxenes.getMark() +5;
        return grade;
    }

    @Override
    public void printFullName() {
        System.out.println (this.nxenes.getName() + " " + this.nxenes.getSurname());

    }
}
