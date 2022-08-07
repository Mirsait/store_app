package by.mirsait.storeapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import by.mirsait.storeapp.data.StoreListRepositoryImpl
import by.mirsait.storeapp.domain.DeleteStoreItemUseCase
import by.mirsait.storeapp.domain.GetStoreListUseCase
import by.mirsait.storeapp.domain.StoreItem
import by.mirsait.storeapp.domain.UpdateStoreItemUseCase

class MainViewModel: ViewModel() {

    private val repository = StoreListRepositoryImpl

    private val getStoreListUseCase = GetStoreListUseCase(repository)
    private val deleteStoreItemUseCase = DeleteStoreItemUseCase(repository)
    private val updateStoreItemUseCase = UpdateStoreItemUseCase(repository)

    val storelistLiveData = MutableLiveData<List<StoreItem>>()

    fun getStoreList(){
        storelistLiveData.postValue(getStoreListUseCase.getStoreList())
    }

    fun deleteStoreItemById(item: StoreItem) {
        deleteStoreItemUseCase.deleteStoreItem(item.id)
        getStoreList()
    }

    fun changeStoreItemState(item: StoreItem){
        val newItem = item.copy(enabled = !item.enabled)
        updateStoreItemUseCase.updateStoreItem(newItem)
        getStoreList()
    }
}
