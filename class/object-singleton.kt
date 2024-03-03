interface NetworkInfoProvider{
    fun getNetworkDetails() : String
}


// postoji samo jedna instanca u cijelom projektu
// ne mogu se inicijalizirat, nemaju konstruktor

object NetworkConfig : NetworkInfoProvider{
    val baseUrl = "http://url"
    val userAgent = "demo"

    override fun getNetworkDetails(): String {
        return "$baseUrl - $userAgent"
    }
}



fun main(){
    println(NetworkConfig.baseUrl)
    println(NetworkConfig.getNetworkDetails())

    // anonymous object
    val provider: NetworkInfoProvider = object : NetworkInfoProvider {
        override fun getNetworkDetails(): String {
            TODO("Not yet implemented")
        }
    }

    provider.getNetworkDetails()
}
