fun esPalindromo(texto:String): Boolean {
    val limpio =texto.lowercase().filter()
    {it.isLetterOrDigit()}
    return limpio == limpio.reversed()

}




