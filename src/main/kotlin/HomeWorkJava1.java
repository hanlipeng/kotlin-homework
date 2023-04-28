public class HomeWorkJava1 {
/*
    fun nullCheck(obj: Any?): String =
    obj?.toString() ?: ""
*/
    public String nullCheck(Object obj){
        if (obj==null) {
            return obj.toString();
        }else {
            return "";
        }
    }

/*
    fun objLet(obj: Any): String =
            obj.let { obj.toString() }
*/

/*
    fun objApply(obj: Array<String>) {
        obj.apply { this[0] = "element" }
    }
*/

/*
    fun objTakeIf(obj: String): String? {
        return obj.takeIf { "i" in it }
    }
*/

/*
    fun objTakeUnless(obj: String): String? {
        return obj.takeUnless { "i" in it }
    }
*/

/*
    fun objWith(obj: String): String {
        return with(obj) {
            "value is $this"
        }
    }
*/

/*
    fun objAlso(obj: String): String {
        return obj.also { println("value is $it") }
    }
*/

/*
    fun repeatFun() {
        repeat(3) { println("value is $it") }
    }
*/

}
