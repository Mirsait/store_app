package by.mirsait.storeapp.domain

class GetStoreItemUseCase(private val repository: IStoreListRepository) {

    fun getStoreItem(id: String): StoreItem {
        return repository.getStoreItem(id)
    }
}