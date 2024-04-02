import javax.swing.JOptionPane;

public class MasaIdeala {
    public static void main(String[] args) {
        // Solicită utilizatorului să introducă înălțimea și vârsta prin intermediul unor ferestre de dialog
        String inaltimeStr = JOptionPane.showInputDialog(null, "Introduceți înălțimea în centimetri:");
        String varstaStr = JOptionPane.showInputDialog(null, "Introduceți vârsta în ani:");

        // Convertim valorile introduse de utilizator din String în float
        float inaltime = Float.parseFloat(inaltimeStr);
        float varsta = Float.parseFloat(varstaStr);

        // Calculăm masa ideală folosind formulele specificate
        float masa = 50 + 0.75f * (inaltime - 150) + 0.25f * (varsta - 20);
        float masaIdealaBarbati = masa;
        float masaIdealaFemei = masa * 0.9f;

        // Formatarea rezultatului la două zecimale pentru ambii și combinarea lor într-un singur mesaj
        String rezultat = String.format("Masa ideală pentru bărbați: %.2f kg\nMasa ideală pentru femei: %.2f kg", masaIdealaBarbati, masaIdealaFemei);

        // Afișăm rezultatul combinat printr-o fereastră de dialog
        JOptionPane.showMessageDialog(null, rezultat);
    }
}
