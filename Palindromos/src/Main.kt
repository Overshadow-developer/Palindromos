fun Palindromo(texto: String): Boolean {

    val textoLimpio = texto.lowercase()
        .replace('á', 'a')
        .replace('é', 'e')
        .replace('í', 'i')
        .replace('ó', 'o')
        .replace('ú', 'u')
        .replace('ü', 'u')

        .filter { it.isLetterOrDigit() }


    return textoLimpio == textoLimpio.reversed()
}

fun main() {

    val prueba1 = "Ana lleva al oso la avellana."
    val prueba2 = "Hola mundo"

    println("¿'$prueba1' es palíndromo?: ${Palindromo(prueba1)}")
    println("¿'$prueba2' es palíndromo?: ${Palindromo(prueba2)}")
}