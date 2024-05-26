public class Menu {
    private final ConversorDeMoedas conversor;

    public Menu(ConversorDeMoedas conversor) {
        this.conversor = conversor;
    }

    public void exibirMenu() {
        String txt =
        "  Conversor de Moedas\n "+
        "1.USD (Dólar) para BRL (Real)\n"+
        "2.BRL (Real) para USD (Dólar)\n"+
        "3.COP (Peso colombiano) para BRL (Real)\n"+
        "4.BRL (Real) para COP (Peso colombiano)\n"+
        "5.COP(Peso colombiano) para USD (Dólar)\n"+
        "6.USD (Dólar) para COP (Peso colombiano)\n"+
        "7.BRL (Real) para ARS (Peso Argentino)\n"+
        "8.ARS (Peso Argentino) para BRL (Real)\n"+
        "9.BRL (Real) para CLP(Peso chileno)\n"+
        "10.CLP (Peso chileno) para BRL (Real)\n"+
        "11.BRL(Real) para BOB(Peso boliviano)\n"+
        "12.BOB(Peso boliviano)para BRL\n ";
        System.out.println(txt);
        System.out.println("0.Sair");
        System.out.println("Digite uma opção: ");
    }

    public void escolherOpcao(int opcao) {
        switch (opcao) {
            case 1:
                conversor.CurrencyCode("USD", "BRL");
                break;
            case 2:
                conversor.CurrencyCode("BRL", "USD");
                break;
            case 3:
                conversor.CurrencyCode("COP", "BRL");
                break;
            case 4:
                conversor.CurrencyCode("BRL", "COP");
                break;
            case 5:
                conversor.CurrencyCode("COP", "USD");
                break;
            case 6:
                conversor.CurrencyCode("USD", "COP");
                break;
            case 7:
                conversor.CurrencyCode("BRL", "ARS");
                break;
            case 8:
                conversor.CurrencyCode("ARS", "BRL");
                break;
            case 9:
                conversor.CurrencyCode("BRL", "BOB");
                break;
            case 10:
                conversor.CurrencyCode("BOB", "BRL");
                break;
            case 11:
                conversor.CurrencyCode("BRL", "BOB");
            case 12:
                conversor.CurrencyCode("BOB", "BRL");
            default:


        }

                  System.out.println(" Escolha inválida.");


        }
    }
