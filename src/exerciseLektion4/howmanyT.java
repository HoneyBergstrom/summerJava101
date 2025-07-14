package exerciseLektion4;

public class howmanyT {
    public static void main(String[] args) {
        /*Skapa en metod som räknar hur många gånger ett visst tecken
        finns i en sträng.

        Om man t.ex. har variabeln test av typen String och vill veta hur
        många gånger bokstaven ’t’ förekommer i texten kan man skriva
        String test = "Lite test text.";
        int antal = antalTecken(test, 't')
         */

        String test = "Lite test text";
        int antal = antalTecken(test, 't');
        System.out.println(antal);

    }

    public static int antalTecken(String test, char t) {
        int antal = 0;
        for (int i = 0; i < test.length(); i++) {
            if (test.charAt(i) == t) {
                antal++;

            }
        }
        return (antal);
    }
}
//ใน Java คำสั่งที่เป็นโค้ดต้องอยู่ ในบล็อกเมธอด หรือใน บล็อก {} เท่านั้น
//เขียนลอย ๆ นอก main หรือ method จะเกิด Syntax Error