import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                ArrayList<String> studentNames = new ArrayList<>();
                Scanner scanner = new Scanner(System.in);
                String input;
                int i = 1;

                while (true) {
                        System.out.print("Masukkan nama ke-" + i + ": ");
                        input = scanner.nextLine();

                        if (input.equalsIgnoreCase("selesai")) {
                                break;
                        }

                        try {
                                if (input.isEmpty()) {
                                        throw new IllegalArgumentException("Nama tidak boleh kosong");
                                }
                                studentNames.add(input);
                                i++;
                        } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                        }
                }

                System.out.println("\nDaftar nama mahasiswa yang di input:");
                for (int j = 0; j < studentNames.size(); j++) {
                        System.out.println("Nama ke-" + (j + 1) + ": " + studentNames.get(j));
                        System.out.println("GG GAMING!!!!!!!");
                }

                scanner.close();
        }
}
