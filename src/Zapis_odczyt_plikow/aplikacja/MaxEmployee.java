import java.io.Serializable;

public class MaxEmployee implements Serializable {
    public static final int max = 3;
    private EmployeeAPP[] employees = new EmployeeAPP[max];
    private int index = 0;


    public void add(EmployeeAPP employee){
        employees[index]=employee;
        index++;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (EmployeeAPP employee : employees) {
            builder.append(employee.toString());
            builder.append("\n");
        }
        return builder.toString();
    }
}
