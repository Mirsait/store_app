package by.mirsait.storeapp.domain

interface IStoreListRepository {

    fun addStoreItem(item: StoreItem)

    fun getStoreList(): List<StoreItem>

    fun getStoreItem(id: String): StoreItem

    fun updateStoreItem(itemToUpdate: StoreItem)

    fun deleteStoreItem(id: String)

}