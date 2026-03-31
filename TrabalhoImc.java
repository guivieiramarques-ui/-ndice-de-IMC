public class TrabalhoImc {

    public static void main(String[] args) {
        
        String nome = IO.readln("Nome: ");
        String entradaGenero = IO.readln("Gênero (M/F/N): ");
        char genero = entradaGenero.toUpperCase().charAt(0);
        
        double altura = Double.parseDouble(IO.readln("Altura (m): "));
        double peso = Double.parseDouble(IO.readln("Peso (kg): "));

        double imc = peso / (altura * altura);
        String status = "";

        switch (genero) {
            case 'M':
                if (imc >= 40) {
                    status = "Obesidade Mórbida";
                } else if (imc >= 30) {
                    status = "Obesidade Moderada";
                } else if (imc >= 25) {
                    status = "Obesidade Leve";
                } else if (imc >= 20) {
                    status = "Normal";
                } else {
                    status = "Abaixo do Normal";
                }
                break;

            case 'F':
            case 'N':
                if (imc >= 39) {
                    status = "Obesidade Mórbida";
                } else if (imc >= 29) {
                    status = "Obesidade Moderada";
                } else if (imc >= 24) {
                    status = "Obesidade Leve";
                } else if (imc >= 19) {
                    status = "Normal";
                } else {
                    status = "Abaixo do Normal";
                }
                break;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Gênero: " + genero);
        System.out.print("IMC: ");
        System.out.printf("%.1f\n", imc);
        System.out.println("Classificação: " + status);
        
        System.out.println("Atitus Educação - O lado certo da força!!!");
    }
}
