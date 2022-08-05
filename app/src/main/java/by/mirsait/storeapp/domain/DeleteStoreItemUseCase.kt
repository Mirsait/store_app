package by.mirsait.storeapp.domain

class DeleteStoreItemUseCase(private val repository: IStoreListRepository) {

    fun deleteStoreItem(id: String){
        repository.deleteStoreItem(id)
    }
}