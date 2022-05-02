import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;



//    b) determinar o número de elementos não nulos de um array;
//    c) determinar o maior elemento de um array;
//    d) calcular a média dos elementos de um array que sejam múltiplos de um dado número;
//    e) calcular a percentagem de elementos de um array que sejam iguais a um dado número;
//    f) verificar se um array está vazio;
//    g) verificar se um array possui apenas elementos pares;
//    h) verificar se um array possui elementos duplicados;
//    i) obter os elementos de um array que sejam constituídos apenas por algarismos pares;
//    j) obter os elementos de um array que sejam sequências crescentes (e.g. 347);
//    k) obter um novo array com os elementos invertidos.


public class main {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = {20, 33, 150, 34, 22, 2, 100};
        int[] arrayPares3 = {2, 6, 6};

        ProcessaArray arrayLength = (array) -> array.length;
        System.out.printf("O número de elementos do array é: %d", arrayLength.determinar(array2));

        ProcessaArray arrayNaoNulos = (array) -> {
            int cont = 0;
            for (int i : array) {
                if (i != 0) cont++;
            }
            return cont;
        };
        System.out.printf("\nO número de elementos não nulos do array é: %d", arrayNaoNulos.determinar(array2));


        ProcessaArray arrayMaiorElemento = (array) -> {
            int temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            return array[array.length - 1];
        };
        System.out.printf("\nO maior elemento do array é: %d", arrayMaiorElemento.determinar(array2));

        ProcessaArrayParametro arrayMedia = (array, num) -> {
            double cont = 0;
            double soma = 0;
            for (int i : array) {
                if (i % num == 0) {
                    cont++;
                    soma += i;
                }
            }
            return soma / cont;
        };
        System.out.printf("\nMédia dos elementos de um número: %s", arrayMedia.calcular(array2, 2));

        ProcessaArrayParametro arrayPercentagem = (array, num) -> {
            double cont = 0;
            for (int i : array) {
                if (i == num) {
                    cont++;
                }
            }
            return (cont * 100) / array.length;
        };
        System.out.printf("\nPercentagem dos elementos de um número: %.2f%%", arrayPercentagem.calcular(array2, 150));

        ProcessaArrayBoolean arrayVazio = (array) -> {
            boolean flag = true;
            for (int i : array) {
                if (i != 0)
                    flag = false;
            }
            return flag;
        };
        System.out.printf("\nSerá que o Array está vazio????? A RESPOSTA É %s", arrayVazio.verificar(array2));

        //g) verificar se um array possui apenas elementos pares;
        ProcessaArrayBoolean arrayPares = (array) -> {
            int cont = 0;
            boolean flag = false;
            for (int i : array) {
                if (i % 2 == 0 && i != 0)
                    cont++;
                if (cont == array.length)
                    flag = true;
            }
            return flag;
        };
        System.out.printf("\nSerá que o Array possui apenas elementos pares????? A RESPOSTA É %s", arrayPares.verificar(arrayPares3));
//h) verificar se um array possui elementos duplicados;
        ProcessaArrayBoolean arrayDuplicados = (array) -> {
            boolean flag = false;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j])
                        flag = true;
                }
            }
            return flag;
        };
        System.out.printf("\nSerá que o Array possui elementos duplicados????? A RESPOSTA É %s", arrayDuplicados.verificar(arrayPares3));
        System.out.println(array2.toString());
        ProcessaArrayVec novoArray =(array) ->{
            int count=0;
            int conta = 0;
            int countStart,iTempCount,iTempConta;

            for (int i = 0; i <array.length-1 ; i++) {
                if (array[i]!=0)
                    count++;
            }
            countStart=count;
           while (count-1>=0){
               iTempCount=array[count];
               iTempConta=array[conta];
               array[count]=iTempConta;
               array[conta]=iTempCount;
               count--;
               if (conta!=countStart)
                   conta++;
           }
            return array;
        };
        System.out.printf("\n H: %s",novoArray.obter(array2));
    }
}