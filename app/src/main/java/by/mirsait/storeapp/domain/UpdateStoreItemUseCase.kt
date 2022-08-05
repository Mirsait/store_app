package by.mirsait.storeapp.domain

class UpdateStoreItemUseCase(private val repository: IStoreListRepository) {

    fun updateStoreItem(item: StoreItem){
        repository.updateStoreItem(item)
    }
}