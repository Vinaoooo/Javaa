import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        // Exercicios de aula 1 - Declarando variaveis
        String nome = "Vinicius";
        System.out.println("Olá, " + nome);
        int a;
        int b = 2;
        a = 3;
        int soma = a + b;
        float divisao = (float) a / b;
        System.out.println("" + soma);
        System.out.println("" + divisao);
        System.out.println("-------------------------------------------------------------");


        // Usando boolean
        int vl1 = 2;
        int vl2 = 3;

        boolean resultado = false;
        boolean resultado2 = true;

        if (vl1 > vl2) {
            System.out.println(resultado);
        } else{
            System.out.println(resultado2);
        }
        System.out.println("-------------------------------------------------------------");


        // Deixando a string toda maiúscula
        String nomeOutro = "Vinao";
        System.out.println(nomeOutro.toUpperCase());
        System.out.println("-------------------------------------------------------------");


        //Olá, {nome}. Hoje é {dia-da-semana}, BOM DIA

        String nomeUsuario = "Vinao";
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);
        Locale brasil = new Locale("pt", "BR");
        System.out.println(hoje.getDayOfWeek() . getDisplayName(TextStyle.FULL,brasil));
        String diaDaSemana = hoje.getDayOfWeek() . getDisplayName(TextStyle.FULL,brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "BOM DIA";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18 ){
            saudacao = "Boa tarde";
        } else{
            saudacao = "Boa noite";
        }
        System.out.printf("Olá, %s. Hoje é %s, %s.%n",nomeUsuario, diaDaSemana, saudacao.toUpperCase());
        System.out.println("-------------------------------------------------------------");

        // Laços numericos
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++)
                System.out.println(j + "x" + i + "=" + j * i);
        }
        System.out.println("-------------------------------------------------------------");

        // Array
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        System.out.println("" + numero1);
        System.out.println("" + numero2);
        System.out.println("" + numero3);
        System.out.println("" + numero4);

        int[] numeros = new int[5];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;

        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]);
        }
        System.out.println("-------------------------------------------------------------");
        
        //Jeito diferente de exibir um array
        String [] letras = {"A", "B", "C", "D", "X"};
        for (int i = 0; i < letras.length; i++){
            System.out.println(letras[i]);
        }
        System.out.println("-------------------------------------------------------------");
        
        //Jeito diferente de exibir um array
        System.out.println(Arrays.toString(letras));
        System.out.println("-------------------------------------------------------------");

        // Como manipular valores dentro de um array ou um vetor
        int[] numerosM = {9, 15, 5, 35, 2};
        int maior = numerosM[0];
        int menor = numerosM[0];
        int media = 0;

        for(int i = 0; i < numerosM.length; i++){
            if (numerosM[i] > maior){
                maior = numerosM[i];
            }
            if (numerosM[i]< menor){
                menor = numerosM[i];
            }
            media += numerosM[i];


        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numerosM.length);

        System.out.println("-------------------------------------------------------------");
        
        // Chamando função - Função tem que estar fora do metodo, a variavel deve ser declarada dentro do metodo main 

        //variavel
        String name = "Vinao";
        //função saudacao que foi declarada em outro metodo sendo chamada 
        saudacao(name);

        //atribuindo um valor a variavel
        int resultado1 = adicao(2, 3);
        //exibindo o resultado - é usado o print pois a função não é do tipo void, ent retorna um valor do tipo int.
        System.out.println(resultado1);

    }

    // Função sem retorno com void + nome da função + entre parenteses é passado o parametro que nesse caso é o tipo + variavel
    public static void saudacao(String name){
        System.out.println("Hello, " + name);

    }
    // Função do tipo int + nome da função + entre parenteses é passado o parametro que nesse caso é o valor que vai ser atribuido a funcao adicao que sera atribuido a variavel
    public static int adicao(int a, int b){

        // Vai retornar A + B, poderia ser feito qualquer conta ou poderia apenas exibir A e B
        return a + b;

    }
}