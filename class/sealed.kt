// enum ali svaki state može biti drugačiji
sealed class UiState{

    object Loading: UiState()

    data class Loaded(val title: String, val subtitle: String) : UiState()

    class Error(val error: Throwable): UiState()
}



fun render(state: UiState) = when (state){
    is UiState.Error -> println("error")
    is UiState.Loaded -> println("loaded: ${state.title}")
    UiState.Loading -> println("loading loading")
}



fun main(){
    var state: UiState = UiState.Loading
    render(state)

    state = UiState.Loaded("kotlin","subtitle")
    render(state)

    state = UiState.Error(IllegalStateException())
    render(state)
}
