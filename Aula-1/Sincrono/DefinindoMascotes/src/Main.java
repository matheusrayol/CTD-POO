public class Main {
    public static void main(String[] args) {
        String nomeMascote;
        int idade;
        double quantosQuilosCome;
        String somDoMascote;

        nomeMascote = "Shesheu";
        idade = 2;
        quantosQuilosCome = 1.5;
        somDoMascote = "Woof woof";

        if (idade <= 1) {
            System.out.println(nomeMascote + " " + idade + " ano.");
        } else {
            System.out.println(nomeMascote + " " + idade + " anos.");
        }
        System.out.println("O cãozinho " + nomeMascote + " come " + quantosQuilosCome + " quilos de ração e faz " + somDoMascote + ".");

        nomeMascote = "Nemo";
        idade = 1;
        quantosQuilosCome = 0.14;
        somDoMascote = "Glub Glub";

        if (idade <= 1) {
            System.out.println(nomeMascote + " " + idade + " ano.");
        } else {
            System.out.println(nomeMascote + " " + idade + " anos.");
        }
        System.out.println("O peixe " + nomeMascote + " come " + quantosQuilosCome + " quilos de ração e faz " + somDoMascote + ".");

        nomeMascote = "Snow";
        idade = 3;
        quantosQuilosCome = .5;
        somDoMascote = "Miau miau";

        if (idade <= 1) {
            System.out.println(nomeMascote + " " + idade + " ano.");
        } else {
            System.out.println(nomeMascote + " " + idade + " anos.");
        }
        System.out.println("O gato " + nomeMascote + " come " + quantosQuilosCome + " quilos de ração e faz " + somDoMascote + ".");
    }
}