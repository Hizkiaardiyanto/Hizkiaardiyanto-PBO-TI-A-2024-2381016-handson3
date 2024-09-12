package handson3;

public class DoWhile {
    public static void main(String[] args) {
        //Inisialisasi variabel counter
        int counter = 1;

        //Loop dengan Do-While
        do {
            //Berhenti jika angka lebih dari 15
            if (counter > 15) {
                break;
            }
            //Lewati angka yang habis dibagi 3
            if (counter % 3 != 0) {
                //Cetak angka
                System.out.println(counter + " ");
            }
            //Increment counter
            counter++;
        } while (counter <= 20);
    }
}
