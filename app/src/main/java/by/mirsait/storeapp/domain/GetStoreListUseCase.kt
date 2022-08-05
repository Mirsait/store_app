package by.mirsait.storeapp.domain

class GetStoreListUseCase(private val repository: IStoreListRepository) {

    fun getStoreList(): List<StoreItem> {
        return repository.getStoreList()
    }
}