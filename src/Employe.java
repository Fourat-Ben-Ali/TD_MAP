public class Employe {
    private String cin;
    private String matricule;
    private String nom;
    private String prenom;


    public Employe() {}


    public Employe(String cin, String matricule, String nom, String prenom) {
        this.cin = cin;
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
    }


    public String getCin() { return cin; }
    public void setCin(String cin) { this.cin = cin; }

    public String getMatricule() { return matricule; }
    public void setMatricule(String matricule) { this.matricule = matricule; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }


    @Override
    public String toString() {
        return "Employe [CIN=" + cin + ", Matricule=" + matricule + ", Nom=" + nom + ", Prenom=" + prenom + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employe employe = (Employe) obj;
        return cin.equals(employe.cin);
    }

    @Override
    public int hashCode() {
        return cin.hashCode();
    }
}
