# exerciciosJava

//LISTA 1 DE EXERCICIOS JAVA E INFORMAÇÕES

Para cada exercício, crie um novo arquivo com extensão .java, Exemplo:
class ExercicioX {
public static void main(String[] args) {
// seu exercicio vai aqui
}
}
1) Imprima todos os números de 330 a 450.
2) Imprima a soma de 1 até 100.
Ex. de saída:
0 + 1 = 1
1 + 1 = 2
2 + 1 = 3
.......
.......
99 + 1 = 100
3) Imprima todos os múltiplos de 5, entre 1 e 100.
4) Faça um programa que leia pelo teclado um valor, em dolar, converta e imprima o mesmo
num valor em reais. Considere que $ 1.00 dolar seja equivalente a R$5.10
5) A condição física de uma pessoa pode ser medida com base no cálculo do índice de Massa
Corporal (IMC). Faça um programa que calcule o IMC com base nos dados abaixo:
IMC = PESO /(ALTURA)²
Condição IMC em (M)ulheres e (H)omens:
Abaixo do Peso:
M&lt;19,1
H&lt;20,7
Peso ideal:
Mulheres 19,1 - 25,8
Homens 20,7 - 26,4
Acima disto considere como obeso
6) Faça um programa que, a partir da leitura das medidas dos lados de um retângulo
(comprimento e largura), lidos do teclado, calcule e imprima a área e o perímetro do retângulo.
A fórmula da área do retângulo é A=C*L e do perímetro P=2*C+2*L.
7) Faça um programa para calcular a média final de um aluno a partir de quatro notas
bimestrais. A média é calculada através de uma média aritmética simples (todos os bimestres
têm o mesmo peso).
Média Situação:

entre 0 e 3.49 reprovado
entre 3.5 e 6.49 recuperação
maior que 6.5 aprovado
Obs. As notas devem ser digitadas entre 0 e 10. A média deve possuir 2 casas decimais.
8) Uma parede em formato retangular, cuja altura é HP (altura da parede) e largura é LP
(largura da parede) precisa ser coberta por azulejos também regulares. O azulejo retangular
tem dimensões HA(altura do azulejo) e LA (largura do azulejo). Escreva um programa que leia
as quatro medidas HP, LP, HA e LA, calcule e imprima quantos azulejos com as medidas
dadas são necessários para cobrir a parede dada.
9) Numa determinada região, o imposto sobre a propriedade é calculado a partir de duas
informações:
 Área total do terreno (m2)
 Área construída do terreno (m2)
O imposto é cobrado da seguinte maneira:
 R$ 5.00 para cada metro quadrado construído
 R$ 3.80 para cada metro não construído
Faça um programa que leia a área total do terreno, a área construída do terreno, calcule e
imprima o valor total a ser pago.
10) Que resultados são produzidos no código a seguir?
public class Ternario {
public static void main (String args[ ] ){
int x=4;
System.out.println( “O valor é “ + ( ( x&gt;4 ) ? 99.99 : 9 ) ) ;
}
}
11) Uma empresa de locação de veículos cobra pelo uso de seus veículos populares a partir
da seguinte regra:
 45.00 reais para cada dia de uso como custo fixo;
 0.50 centavos de real para cada quilômetro que exceder o total de quilômetros dados
de cortesia.
 A cada dia o usuário tem direito a 60 quilômetros de cortesia
 O usuário efetua o pagamento somente ao devolver o carro à empresa de locação.
Escreva um programa que leia o número de dias que o usuário ficou com o carro e a
quilometragem do mesmo e imprima o valor a ser pago.
12) De forma simplificada, o IRPF Simples Anual pode ser calculado a partir das seguintes
regras, no caso de um contribuinte com anual dada:
 Caso o contribuinte ganhe até 10800.00 reais, ele está isento do pagamento

 Caso o contribuinte ganhe entre 10800.00 até 21600.00 reais, ele deve calcular o seu
IRPF Simples multiplicando sua renda por 0.15 (alíquota de 15%) e subtraindo da
multiplicação 1620.00 reais.
 Quando o contribuinte ganhar a partir de 21600.01 reais, ele deve calcular seu IRPF
Simples multiplicando sua renda por 0.275 (alíquota de 27.5%) e subtrair da
multiplicação 4320.00 reais.
Escreva um programa que leia o valor da renda de um contribuinte, imprimindo o IRPF
Simples a ser pago pelo mesmo.
13) Uma empresa de turismo tem a seguinte tabela de preços para pacotes turísticos para
grupos:
Número de pessoas Preço (em reais) por um dia de hospedagem
1 até 4 R$ 160,00 por pessoa
5 até 8 R$ 120,00 por pessoa
Acima de 8 R$ 80, 00 por pessoa

Escreva um programa que leia o número de pessoas que comprou o pacote, o número de dias
do pacote turístico e imprima o valor a ser pago pelo grupo.
14) Utilizando for. Entrar com uma palavra e informar quantas letras “a” possui a palavra.
Dicas:
String palavra = “Amanda”;
palavra.length(); // retorna o tamanho da String
palavra.substring(0,1); // retorna a primeira letra do nome Amanda = “A”
palavra.substring(1,2); // retorna a segunda letra do nome Amanda = “m”
palavra.equals(“Amanda”); // método equals é utilizado para comparar duas Strings,
retorna verdadeiro ou falso, no caso Verdadeiro
15) Capicuas são números que lidos da esquerda para a direita, e vise versa, tem o
mesmo valor. Entrar com um número e informar se este é um capicuas.
Dica:
Métodos necessário length() e substring
16) Utilizando while. Entrar com uma palavra e informar quantas letras “a” possui a
palavra.
Dica:
Métodos necessário length() e substring

17) Utilizando o for. Desenvolva um programa que receba um número e uma letra e
mostre a letra repetida o número de vezes correspondente ao número recebido. Exemplo:
- Se informar: 12 B o resultado será BBBBBBBBBBBB
