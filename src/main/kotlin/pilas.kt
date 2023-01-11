//declaraciones de guillermo
class Pila{



    private val pila = mutableListOf<Char>()



    fun push(elemento:Char){

        pila.add(elemento)

    }



    fun pop():Char?{

        return pila.removeLastOrNull()

    }



    override fun toString():String {

        return pila.toString()

    }

}



const val APERTURA='('

const val CIERRE=')'



fun main()

{

    val p = Pila()

    val expresion="((2+3)*4)-(3+4)/5"

    var correcta = true



    for (caracter in expresion)

        if (caracter==APERTURA)

            p.push(APERTURA)

        else if (caracter==CIERRE)

            if (p.pop() == null)

                correcta = false



    println(correcta)





}

