package primerosVideos;

import java.util.Random;
import javax.swing.JOptionPane;

public class Arrays {

    public static void main(String[] args) {
        
//        Matrices();
//        For_Each();
//        RellenaArray();
//        RellenaArrayAleatorio();
//        ArraysBi_01();
//        ArraysBi_02();
//        ArraysBi_03();
        Ejercicio_ArrayBi();
//        PruebaRandom();
    }
    
    public static void Matrices ()
    {
        int[] mi_matriz = new int[5];
        
        mi_matriz[0]=5;
        mi_matriz[1]=10;
        mi_matriz[2]=15;
        mi_matriz[3]=20;
        mi_matriz[4]=25;
        
        System.out.println("I'm Mem, you have "+mi_matriz[4]+" years old.");
        System.out.println("A few minutes later...");
        
        int[] mi_matriz2 = {30,35,40,45,50};
        
        System.out.println("Now, you have "+mi_matriz2[2]+" years old.");
        
        for (int i=0; i<mi_matriz.length-1 ; i++)
        {
            System.out.print(mi_matriz[i]+", ");
        }
        System.out.println(mi_matriz[4]+".");
    }
    
    public static void For_Each()
    {
        String[] paises = {"Argentina", "España", "México", "Brasil", "Uruguay"};
        
//        for (int i=0; i<paises.length; i++)
//        {
//            System.out.println("País número "+(i+1)+": "+paises[i]);
//        }
        for (String elemento:paises) //Declaracion FOR EACH. (El tipo + nombre de cada posicion + : + nombre de array)
        {
            System.out.println("País: " + elemento);
        }
    }
    
    public static void RellenaArray()
    {
        String[] nombres = new String[5];
        
        for (int i=0; i<nombres.length; i++)
        {
            nombres[i] = JOptionPane.showInputDialog("Introduce un nombre");
        }
        
        int x=1;
        
        for (String nombre:nombres)
        {
            System.out.println("El nombre número "+x+" es "+nombre);
            x++;
        }
    }
    
    public static void RellenaArrayAleatorio()
    {
        int[] numerosAleatorios = new int[100];
        
        for (int i=0; i<numerosAleatorios.length; i++)
        {
            numerosAleatorios[i] = (int)(Math.random()*100);    
        }
        
        for (int numero:numerosAleatorios)
        {
            System.out.println(numero);
        }
    }
    
    public static void ArraysBi_01()
    {
        int numAl [][] = new int [3][3];
        
        numAl[0][0]=1;
        numAl[0][1]=2;
        numAl[0][2]=3;
        
        numAl[1][0]=4;
        numAl[1][1]=5;
        numAl[1][2]=6;
    
        numAl[2][0]=7;
        numAl[2][1]=8;
        numAl[2][2]=9;
        
        Random r = new Random(); 
        int Low = 0; 
        int High = 3; 
        int result = r.nextInt(High-Low) + Low; 
        int result2 = r.nextInt(High-Low) + Low; 
        
        System.out.println("Número aleatorio: "+numAl[result][result2]);
    }
    
    public static void ArraysBi_02()
    {
        int[][] numAl = new int[3][3];
        
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3 ; j++)
            numAl[i][j] = (int)(Math.random()*100);
        }
        
        for (int i=0; i<3; i++)
        {
            for (int j=0; j<3 ; j++)
            {
                System.out.print(numAl[i][j]+ " ");
            }
        }
        
        System.out.println(" ");
    }
    
    public static void ArraysBi_03()
    {
        int[][] numAl = //Manera de rellenar un Arrary Bidireccional más rapido, manualmente. 
        {
            {85,10,15,20},
            {25,30,35,40},
            {45,50,55,60},
            {65,70,75,80},
            {12,76,84,22}
        };
        
        /*
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<4; j++)
            {
                System.out.print(numAl[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        */
        
        for (int[] x:numAl)  //Formula para recorrer ARRAY BIDIRECCIONAL con un FOR EACH
        {
            System.out.println();
            for (int y:x)    //Primer for para el primer numero, y el segundo, cada numero del primero
            {
                System.out.print(y+" ");
            }
        }
        System.out.println();
    }
    
    public static void Ejercicio_ArrayBi()
    {
        double acumulado;
        double interes = 0.10;
        
        double[][] saldo = new double[6][5]; 
        
        for (int i=0; i<6; i++)
        {
            saldo[i][0] = 10000;
            acumulado = 10000;
            
            for(int j=1; j<5; j++)
            {
                acumulado = acumulado+(acumulado*interes);
                saldo[i][j]=acumulado;
            }
            
            interes = interes + 0.01;
        }
        
        for (int i=0; i<6; i++)
        {
            System.out.println();
            for (int j=0; j<5; j++)
            {
                System.out.printf("%1.2f", saldo[i][j]);
                System.out.print(" ");
            }
        }
        
        System.out.println();
    }
//    public static void PruebaRandom()
//    {
//        
//    }
    
}
