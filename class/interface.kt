interface StringProvider{

    val placeHolder: String
    fun getString(id: Int): String
}

interface ResourceProvider : StringProvider {
    // ovu metodu ne treba override jer ima default implementaciju
    fun getDimmension(id: Int): Long = id.toLong()
}

class DefaultProvider : ResourceProvider{

    override val placeHolder: String = "<placeholder>"

    override fun getString(id: Int): String {
        return "id: $id"
    }

}

fun main(){
    val some: Any? = null
    if(some is StringProvider) print("neeee")

    var provider: ResourceProvider = DefaultProvider()
    println(provider.getString(23))
    println(provider.getDimmension(23))
    println(provider.placeHolder)

}
