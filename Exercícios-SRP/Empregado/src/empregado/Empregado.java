package empregado;

public class Empregado {

    public static void main(String[] args) {
        Employee empregado;
        empregado = new Employee(1, "Joao Silva", "Departamento 01", true);
        
        EmployeeDetailReportXML imprimeXML;
        imprimeXML = new EmployeeDetailReportXML();
        imprimeXML.print(empregado);
        
        EmployeeDetailReportCSV imprimeCSV;
        imprimeCSV = new EmployeeDetailReportCSV();
        imprimeCSV.print(empregado);
        
        EmployeeDAO empregadoDAO;
        empregadoDAO = new EmployeeDAO();
        empregadoDAO.save(empregado);
        
        empregado.terminateEmployee();
        
    }
    
}
