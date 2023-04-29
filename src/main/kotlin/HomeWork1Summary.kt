import java.lang.Exception

class HomeWork1Summary {

    fun summary(obj: Any?) =
        obj?.takeIf { it is List<*> }
            ?.let { it as List<*> }
            ?.takeUnless { it.size > 10 }
            ?.map { "list value $it" }
            ?.let { ArrayList(it) }
            ?.apply { this[0]="change value" }
            ?.also { println("got a list, size is ${it.size}, and changed the first value") }
            ?:throw Exception("obj is not a list, can not process")


}