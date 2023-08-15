//Practica de ejercitacion de Datos tipo Complejos
//Tipo String
//tipo Arrays

import java.sql.SQLOutput;
import java.util.Vector;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Inicio del programa");

       /* //ejercicio tipo String
        var  nombre="Daniel";//variable sin asignacion especifica del tipo
        String apellido="calle";
        int tamanoString=nombre.length();//esperado un int 6

        System.out.println(nombre+" "+apellido);
        System.out.println(tamanoString);
        System.out.println(nombre.toLowerCase()+" "+apellido.toUpperCase());

        boolean comienzo=nombre.startsWith("da");
        System.out.println(comienzo);
        boolean fin =apellido.endsWith("le");
        System.out.println(fin);

        char letra=nombre.charAt(0);//tipo de dato caracter, decime X letra en Y indice
        System.out.println(letra);

        //para recorrer un String(simil a un array)
        System.out.println("recorrer String");

        String nombreCompleto=nombre+" "+apellido;//Daniel calle

        for (int i=0; i<nombreCompleto.length(); i++){
            System.out.println(nombreCompleto.charAt(i));
        }

        System.out.println("recorrer String inverso");

        for (int i=nombreCompleto.length()-1;i>=0;i--){
            //la condicion i debe ser mayor e igual que el indice 0 para cortar en el final que es
            // 0 pero tambien tomar el 0 que sera la ultima letra
            System.out.println(nombreCompleto.charAt(i));
        }*/

        /*//ejercicio tipo Arrays
        int arrayUno[]=new int[5];//creacion de Array con 5 espacios sin conocer previos sus valores
        //darle valores al Array
        arrayUno[0]=1;
        arrayUno[1]=2;
        arrayUno[2]=3;
        arrayUno[3]=4;
        arrayUno[4]=5;

        //forma corta para ver elementos de un array
        for (int i:arrayUno) {
            System.out.println(i);
        }

        //conociendo previamente los valores del arrays
        System.out.println("array Dos");

        int arrayDos[]={6,7,8,9,10};

        for (int i:arrayDos) {
            System.out.println(i);
        }

        System.out.println("recorrer array con for completo");
        for (int i=0;i<arrayDos.length;i++){
            System.out.println("valor actual "+arrayDos[i]+" el index es "+i);
        }*/

        //Arrays Bidimensionales
        //unidimensional x
        //bidimensional x,y
        //tridimensionL X,Y,Z

       /* int arrayBidi[][]=new int [2][4];//2 espacios en x y 4 en y
        arrayBidi[0][0]=1;// primer espacio es X y segundo es Y
        arrayBidi[0][1]=2;
        arrayBidi[0][2]=3;
        arrayBidi[0][3]=4;
        arrayBidi[1][0]=10;//ahora es la columna 2 del X
        arrayBidi[1][1]=20;
        arrayBidi[1][2]=30;
        arrayBidi[1][3]=40;

        int arrayBidiDos[][]={// crear un array bidimensional conociendo los valores dentro
                {5,6,7,8},
                {50,60,70,80}
        };
        //recorrer el array bidimensional
        for (int i=0;i<arrayBidi.length;i++){//plano X
            for (int j=0;j<arrayBidi[i].length;j++){//plano Y
                System.out.println("esto es X "+i+" esto es Y "+j);
                System.out.println("contenido "+arrayBidi[i][j]);
            }

        }*/

        /*//vectores, utilidad para array muy largos, son arrays dinamicos
        //se debe importar su paquete
        Vector <String> arrayVector=new Vector<String>();
        arrayVector.add("Daniel");//metodos para ingresar dato al vector
        arrayVector.add("Matias");
        arrayVector.add("Calle");
        arrayVector.add("Mozalvo");
        arrayVector.remove(2);//metodo para eliminar un valor del vector
        System.out.println("tamaño del vector "+arrayVector.size());//cantidad de elementos dentro
        System.out.println("capacidad del vector "+arrayVector.capacity());
        //recorrer un Vector
        System.out.println("recorriendo el Vector");
        for (int i=0;i<arrayVector.size();i++){//el largo total del vector lo da su tamaño
            System.out.println("valor: "+arrayVector.get(i)+" en index "+i );//uso del metodo get para entregar el valor
        }*/

        /*//ejercicio pares e impares

        int arrayDeNumeros[]={1,2,3,4,5,6,7,8,9,10};
        for (int i=0;i<arrayDeNumeros.length;i++){
            if (i%2==0){
                System.out.println("es numero impar: "+arrayDeNumeros[i]);
            }else {
                System.out.println("es numero par: "+arrayDeNumeros[i]);
            }
        }*/

        /*//Array List; tambien debe ser un paquete importado
        ArrayList<Integer>arrayList=new ArrayList<Integer>();
        arrayList.add(0);
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(1000);
        arrayList.add(100000);
        System.out.println("elementos del ArrayList: "+arrayList);
        arrayList.remove(2);
        System.out.println("elementos del ArrayList: "+arrayList);
        System.out.println("recorrerlo con for");
        //de forma corta
        for (int i:arrayList){
            System.out.println(i);
        }
        //forma completa
        for (int i=0;i<arrayList.size();i++){
            System.out.println("el valor es: "+arrayList.get(i));
        }*/



        

        System.out.println("FIN del programa");

    }
}