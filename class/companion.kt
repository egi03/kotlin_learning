// companion = static
class SearchController{
    private var query: String = ""

    init{
        MAX_RESULT
    }

    companion object{

        private const val MAX_RESULT = 100

        fun create(initialQuery: String) : SearchController{
            val controller = SearchController()
            controller.query = initialQuery
            return controller
        }
    }
}


fun main(){
    val controller = SearchController.create("Kotlin")
}
