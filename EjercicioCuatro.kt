/*
Crea un programa que permita al usuario ingresar 4 números enteros y 
los almacene en un array. Luego, encuentra y muestra el número mayor 
del array. Usa try-catch para manejar entradas no numéricas.
*/

fun main() {
    val numeros = Array(4) {0}
    var maximo = 0

    for (i in numeros.indices) {
        while (true) {
            try {
                print("Ingresa un número entero (${i + 1}/4): ")
                numeros[i] = readLine()!!.toInt()
                
                if (numeros[i] > maximo) {
                    maximo = numeros[i]
                }
                break
            } catch (e: NumberFormatException) {
                println("Error: Debes ingresar un número entero válido.")
            }
        }
    }

    println("El numero mayor de los ingresados es: $maximo")
}
