import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private Map<Employe, Departement> societe = new HashMap<>();

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        societe.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        societe.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        societe.forEach((e, d) -> System.out.println(e + " appartient au département " + d));
    }

    @Override
    public void afficherLesEmployes() {
        societe.keySet().forEach(System.out::println);
    }

    @Override
    public void afficherLesDepartements() {
        societe.values().stream().distinct().forEach(System.out::println);
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement d = societe.get(e);
        if (d != null) {
            System.out.println(e + " appartient au département " + d);
        } else {
            System.out.println("Employé non trouvé.");
        }
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return societe.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return societe.containsValue(d);
    }
}
