import java.util.Scanner;



    public class Principal {
        private static String key = "2593210f7b89da216fb6a8fe";


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ConversorDeMoedas conversor = new ConversorDeMoedas(key);

            Menu menu = new Menu(conversor);

            try {
                while (true) {
                    menu.exibirMenu();
                    int opcode = Integer.parseInt(scanner.nextLine());
                    if (opcode == 0) {
                        System.out.println("Saindo...");
                        return;
                    }
                    menu.escolherOpcao(opcode);
                }
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }





