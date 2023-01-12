package poo.esiea.td_employe;

public class Main {
    public static void main(String[] args) {
        CPersonnel personnel = new CPersonnel();

        CCommercial commercial1 = new CCommercial("John", "Doe", 35, 5, 200000);
        CCommercial commercial2 = new CCommercial("Jane", "Smith", 30, 3, 150000);
        CTechnicien technicien1 = new CTechnicien("Bob", "Johnson", 40, 10, 500);
        CTechnicien technicien2 = new CTechnicien("Emily", "Williams", 28, 7, 600);
        CManutentionnaire manutentionnaire1 = new CManutentionnaire("Mike", "Brown", 45, 2, 160);
        CManutentionnaire manutentionnaire2 = new CManutentionnaire("Ashley", "Moore", 32, 1, 140);

        personnel.embaucher(commercial1);
        personnel.embaucher(commercial2);
        personnel.embaucher(technicien1);
        personnel.embaucher(technicien2);
        personnel.embaucher(manutentionnaire1);
        personnel.embaucher(manutentionnaire2);

        personnel.printSalaires();
        System.out.println("Salaire moyen : " + personnel.salaireMoyen() + "€");

        personnel.licencier(commercial1);
       
        personnel.printSalaires();
        System.out.println("Salaire moyen : " + personnel.salaireMoyen() + "€");

        personnel.faillite();
        System.out.println("Tous les employés ont été licenciés en cas de faillite");
        personnel.printSalaires();
    }
}

