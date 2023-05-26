<img width="100%" alt="Waves" src="https://capsule-render.vercel.app/api?type=waving&color=0:600000,100:C10000&height=160&section=header"/>

<div align="center" >

# ![java.png](images/java.png) Um newbe aprendendo Java ![java.png](images/java.png)

</div>


Nesse repositório você verá toda minha evolução na linguagem,
juntamente do caminho que percorri.

Estão preparados? Let's g then!

1. [Primeiro contato com ambiente Java.](#hello-world)
2. [Tipos primitivos em Java](#tipos-em-java)
3. [Operadores Aritmétricos](#operadores-aritimétricos-em-java)
4. [Classe Math](#classe-javalangmath)


## Hello World!
> O código-fonte deste exercício pode ser encontrado [aqui](src/HelloWorld.java). **;)**

Nesse exercício eu só iniciei meus estudos 
aprendendo um pouco da estrutura de pastas da linguagem
e explorando a IDE.

A termos de curiosidade, o IDE escolhido foi a IntelliJ IDEA,
versão Community porque aqui é Brasil né,
porém o curso está usando a NetBeans,
sinceramente por mim não importa eu quero usar essa porque tem integração com o Discord hihihi

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Java é lindo guys!
        // Do you like ice cream?
        // I love you baby.
    }
}
```
Eu acho interessante o uso de uma IDE para facilitar o desenvolvimento,
vocês acreditam que existem pessoas que preferem escrever `System.out.println()`
ao invés de escrever `sout` e apertar "tab"?
Por isso dizem que *"Java é linguagem de maluco."* ksskkskssk

É isso guys aguardem por novos conteúdos. 😘

## Tipos em Java
> O código-fonte deste exercício pode ser encontrado [aqui](src/TiposPrimitivos.java). ;)

Como nas aulas passadas eu aprendi mais sobre a linguagem, a sua história e como ela funciona
nada mais justo que aprender os tipos primitivos em linguagem Java.
Como um usuário javascript há muito tempo eu estou acostumado a ter uma infinidade de tipos,
pois uso principalmente typescript, porém surpreendi-me com o Java, vocês irão entender assim que verem a próxima foto,
a linguagem possui uma boa variedade de tipos, inferior ao typescript, porém bem divididos e isso me deixou impressionado. Sinceramente goxtei 😜
![tipos em java.png](images/tipos%20em%20java.png)
> Podemos analisar que temos uma boa variedade de tipos
> e cada um desempenha muito bem sua função.
> 
> Para informações mais detalhadas sobre tipos
> você pode ver algum vídeo no YouTube ou assistir o curso que estou fazendo
> cujo link se encontra na descrição desse repo.

Para iniciar com o pé direito nos tipos eu simplesmente comecei a usar básico
fazendo um algoritmo bem simples, pois eu não brinco em serviço bb
```java
public class TiposPrimitivos1 {
    public static void main(String[] args) {
        char letter = 'E';
        byte age = 16;
        float height = 1.75F;
        boolean marred = false;
        System.out.println("My name start with the letter " + letter + ". I'm " + age + " years old, and I'm " + height + "m tall.");
        if (marred) {
            System.out.println("I'm marred!");
        } else {
            System.out.println("I'm not marred!");
        }
    }
}
 ```
 Depois o professor deu uma aprofundada e ensinou o inverso do `System.out.print()`
 que no caso seria a entrada de dados, `System.in`,
 porém esse método não pode ser usado de qualquer forma. Vejamos a seguir:
```java
import java.util.Scanner; // Importando a classe Scanner do pacote java.util

public class TiposPrimitivos2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); // definindo um objeto para conseguir manipular a classe.
        System.out.print("Digite seu nome aqui: "); // intuitividade de lei
        String name = keyboard.nextLine(); // lendo o input do usuário
        System.out.print("Digite seu salário aqui: "); // intuitividade de lei
        float income = keyboard.nextFloat(); // lendo o input do usuário

        if (income <= 1000.00) { // fazendo uma instância de if statement porque eu já aprendi em javascript e python
            System.out.printf("Olá %s seu salário é de %.2f, logo você é pobre. SEU PLEBE COM PRIME!\n", name, income); // nada a declarar 👀
        } else if (income <= 1320.00) { // if...else if...else
            System.out.printf("Olá %s seu salário é de %.2f, logo você é um brasileiro de classe média. FAZ O L CARALHO!", name, income); // nada a declarar 👀
        } else { // conteúdos da próxima aula, acredito.
            System.out.printf("Olá %s seu salário é de %.2f, logo você é rico. You are my sugar daddy UwU", name, income); // nada a declarar 👀
        }
    }
}
// i love you javalang 😜
```
Para finalizar com chave de outro o professor fala e prova que dentro dos tipos também existem brigas de clan.
Para você que gosta de naruto vou fazer uma analogia para ficar mais fácil,
se você não gosta pau no seu cu vai aprender assim msm. _Brinks kkkkk, namoral não me cancela no Twitter!!!_
```java
public  class TiposPrimitivos3 {
    public static void main(String[] args) {
        /* Não funciona, pois o tipo "int" não pode ser atribuído ao tipo "String"!
            int idade = 16; // definindo um inteiro com o valor da minha idade
            String value = idade; // aqui dizemos que ele é uma string, aparece um erro astronômico kkkk
         */

        // Dessa forma podemos fazer o código anterior funcionar.
        int idade = 16; // definindo dnv
        String value = Integer.toString(idade); // Usando o método toString() da classe Integer transformamos "int" em String.
        System.out.println(value); // Sucesso: 16
    }    
}
```
> Preparado para o justo analogia? Se não estiver você pode só parar de ler kkkkkkkk.
> 
> Vamos lá quando declaramos uma var int idade estamos dizendo que aquilo é o clan senju,
> quando declaramos a String dizemos que o clan senju está tentando dominar o território dos uchihas,
> como _todos_ sabem isso vai dar treta. E foi isso que ocorreu no primeiro exemplo,
> eu comentei ele por isso. Agora se colocarmos `Integer.toString()` nós fazemos a indução do DNA uchiha nos senju
> assim eles são uchihas agr, tem sharingan e os caralho, logo os uchiha aceitam eles.
> Fim da história, se entendeu ok, senão vê no YouTube ou no curso.
 
Novamente chegamos ao final de uma _"aula"_, nos vemos na próxima guys! 😉


## Operadores Aritimétricos em Java
> O código-fonte deste exercício pode ser encontrado [aqui](src/Operadores.java). ;)

Vamos lá guys, execício simples para nozes finalmente hihihi.
Se prepare para memorizar uns símbolos e cadeia de símbolos.

Começaremos pelos clássicos operadores aritmétricos,
está pronto para uma aula de matemática computacional? kksksks

```java
public class Operadores {
 public static void main(String[] args) {
  int n1 = 16;
  int n2 = 25;
  int res = n1 + n2;

  System.out.println(res); //Saída: 41
 }
}
```
Vejamos acima que temos uma continha simples de **soma**,
e sim é o mesmo sinal de *mais* que estamos acostumados.
Aqui vai uma breve lista dos demais sinais e suas funções.

| Sinal | Função           | Exemplo | Saída |
|-------|------------------|---------|-------|
| +     | Soma             | 7 + 2   | 9     |
| -     | Subtração        | 7 - 2   | 5     |
| *     | Multiplicação    | 7 * 2   | 14    |
| /     | Divisão          | 7 / 2   | 3.5   |
| %     | Resto da Divisão | 7 % 2   | 1     |

> O sinal % (resto da divisão) faz uma divisão e força aparecer um resultado
> inteiro, porém o mesmo retorna o valor que sobra disso.
> Para ficar mais claro imagine 7 dividido para 2 sabemos que vai ficar 3,5, mas
> fazendo a divisão inteira temos o resultado "3" de 6 dividido para 2
> e sobra 1 desse cálculo pois não tem como dividir ele.

Espero que tenham entendido, qualquer coisa tente mentalizar ou pesquisar na internet,
ou abra um issue que eu tentarei te ajudar.

Também temos os operadores `++` e `--` que são, respectivamente, operadores de
incremento e decremento. Eles servem, respectivamente, para somar 1 na variável
e subtrair 1 da variável.
> Vale apena mencionar que eles podem funcionar de duas maneiras, pré-variável e pós-variável.
> Veja nos exemplos a seguir!

```java
public  class Operadores {
 public static void main(String[] args) {
  int n1 = 2;
  n1++;
  System.out.println(n1); //Saída: 2
  
  // Vejamos o seguinte:
  int n2 = 3;
  int n3 = n1 + n2++;
  System.out.println(n3); //Saída: 5
 }
}
```
Você provavelmente deve ter chutado que a saída seria 2 + 4 = 6, mas não
nós mandamos o java fazer a soma e **depois** incrementar o valor de n2.

Observe:
```java
public  class Operadores {
 public static void main(String[] args) {
  int n1 = 2;
  int n2 = 3;
  int n3 = n1 + ++n2;
  System.out.println(n3); //Saída: 6
 }
}
```
Nesse caso mandamos primeiro incrementar o n2 e **depois** fazer a soma.
Então nesses casos a ordem importa, fiquem atentos guys para não passarem vergonha
no futuro como devs java! 😜

## Classe java.lang.Math
> O código-fonte deste exercício pode ser encontrado [aqui](src/ClasseMath.java). ;)
 
Você deve ter se perguntado "*Como eu posso fazer potenciação e raiz usando java?*", e eu estou aqui para lhe ajudar!
Para isso e ***MUITAS*** outras operações matemáticas e coisas relacionadas
usaremos a classe do java.lang chama `Math`.

Por ser uma classe do próprio java não é necessário importá-la no seu projeto, veja a seguir alguns exemplos:
```java
public class ClasseMath {
    public static void main(String[] args) {
        double power = Math.pow(5,3); //Potênciação
        System.out.println(power);

        int pass = (int) (1111111   + Math.random() * (9999999-1111111)); //Randomização de números "avaçada"

        System.out.println("Sua nova senha é: " + pass);


        double nota = 4.1;
        double notaFinal = Math.round(nota); //Arredondamento inteligente

        System.out.println("A nota final desse aluno ficará = " + notaFinal);
    }
}

```
> O `Math.random()` visto acima representa um número aleatório entre 0 e 1, por exemplo, 0,3.
> Fazemos esse cálculo para ter um número aleatório com uma "folga" maior. Exemplo:
> 
> `(minNum) + Math.random() * (maxNum - minNum)`
> 
> Dessa forma fazemos um número aleatório com valores maiores.

Lembrando pessoal que essa classe tem muitos mais métodos e atributos, fiquem avontade para pesuqisar mais.
Se tiverem no IntelliJ IDEA basta digitar `Math.` e apertar "tab".

Por hoje é só guys, até dps bbs 😘