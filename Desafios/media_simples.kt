fun main() {
    val media = readLine()!!.toDouble();
    
    when {
        media < 5 -> println("REP");
        else -> when{
        media >= 5 && media < 7 -> println("REC");
        else -> println("APR");
        }
    }
 }