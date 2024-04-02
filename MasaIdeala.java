import javax.swing.JOptionPane;

public class MasaIdeala {
    public static void main(String[] args) {
        // Solicitam introducerea inaltimii si varsta prin intermediul ferestrelor de dialog
        String inaltimeStr = JOptionPane.showInputDialog(null, "Introduceti inaltimea in centimetri:");
        String varstaStr = JOptionPane.showInputDialog(null, "Introduceti varsta in ani:");

        // Convertim valorile introduse de la tastatura din String in float
        float inaltime = Float.parseFloat(inaltimeStr);
        float varsta = Float.parseFloat(varstaStr);

        // Calculam masa ideala folosind formulele specificate in cerinta
        float masa = 50 + 0.75f * (inaltime - 150) + 0.25f * (varsta - 20);
        float masaIdealaBarbati = masa;
        float masaIdealaFemei = masa * 0.9f;

        // Formatam rezultatul la doua zecimale pentru ambele categorii si le combinam intr-un singur mesaj
        String rezultat = String.format("Masa ideala pentru barbati: %.2f kg\n Masa ideala pentru femei: %.2f kg", masaIdealaBarbati, masaIdealaFemei);

        // Afisam rezultatul intr-o singura fereastra de dialog
        JOptionPane.showMessageDialog(null, rezultat);
    }
}
