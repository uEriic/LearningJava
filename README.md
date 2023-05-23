<img width="100%" alt="Waves" src="https://capsule-render.vercel.app/api?type=waving&color=0:600000,100:C10000&height=160&section=header"/>

<div align="center" >

# ![java.png](images/java.png) Um newbe aprendendo Java ![java.png](images/java.png)

</div>


Nesse repositório você verá toda minha evolução na linguagem,
juntamente do caminho que percorri.

Estão preparados? Let's g then!

1. [Primeiro contato com ambiente Java.](#hello-world)
2. [Tipos primitivos em Java](#tipos-em-java)


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