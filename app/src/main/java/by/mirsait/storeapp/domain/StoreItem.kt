package by.mirsait.storeapp.domain

data class StoreItem(
    val name: String,
    val count: Int,
    val enabled: Boolean,
    var id: String = UNDEFINED_ID
) {
    companion object {
        const val UNDEFINED_ID = "Undefined"
    }
}

