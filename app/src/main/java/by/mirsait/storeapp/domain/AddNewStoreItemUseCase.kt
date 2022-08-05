package by.mirsait.storeapp.domain

class AddNewStoreItemUseCase(private val repository: IStoreListRepository) {

    fun addStoreItem(item: StoreItem) {
        repository.addStoreItem(item)
    }
}