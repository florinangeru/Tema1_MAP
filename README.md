# Tema1_MAP
Tema 1 - Metode avansate de programare
Angeru Florin-Daniel, grupa 205,
Informatica, anul 2, ID

CERINTA:  
In pachetul aplicatii, scrieti o sursa Java care calculeaza masa ideala pentru barbati si femei in functie de varsta si inaltimea lor. 
Citirea datelor de intrare (inaltimea si varsta) se va realiza de la tastatura folosind clasa Scanner.

Indicatii:  
Pentru a citi de la tastatura se poate folosi clasa Scanner, din pachetul java.util.  
Consultati documentatia si observati metodele puse la dispozitie.  
Scanner sc = new Scanner(System.in);  
int n = sc.nextInt(); //citirea unui număr întreg  

Formule de calcul necesare:  
masa= 50+0.75*(inaltimea - 150F) + 0.25*(varsta- 20F)  
masaIdealab=masa  
masaidealaf=masa*0.9  
Schimbați modalitatea de citirea a datelor, astfel încât acestea sa fie introduse folosind o fereastra de dialog de tip JoptionPane.