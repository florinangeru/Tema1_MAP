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


        String mesajBinar = "01010000011011110111011101100101011100100110010101100100001000000110001001111001001000000100000101101110011001110110010101110010011101010010000001000110011011000110111101110010011010010110111000100000010001000110000101101110011010010110010101101100";
        String mesajText = fromBinaryString(mesajBinar);
        JOptionPane.showMessageDialog(null, mesajText);
    }

    public static String fromBinaryString(String binary) {
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < binary.length(); i += 8) {
            int charCode = Integer.parseInt(binary.substring(i, i + 8), 2);
            text.append((char) charCode);
        }
        return text.toString();
    }
}
