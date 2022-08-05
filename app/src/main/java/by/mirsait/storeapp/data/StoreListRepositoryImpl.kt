package by.mirsait.storeapp.data

import by.mirsait.storeapp.domain.IStoreListRepository
import by.mirsait.storeapp.domain.StoreItem
import java.util.UUID

object StoreListRepositoryImpl : IStoreListRepository {

    private val storeList = mutableListOf<StoreItem>()

    override fun addStoreItem(item: StoreItem) {
        if (item.id == StoreItem.UNDEFINED_ID) {
            item.id = UUID.randomUUID().toString()
        }
        storeList.add(item)
    }

    override fun getStoreList(): List<StoreItem> {
        return storeList.toList()
    }

    override fun getStoreItem(id: String): StoreItem {
        return storeList.find {
            it.id == id
        } ?: throw RuntimeException("Element with id=$id is not found")
    }

    override fun updateStoreItem(itemToUpdate: StoreItem) {
        deleteStoreItem(itemToUpdate.id)
        addStoreItem(itemToUpdate)
    }

    override fun deleteStoreItem(id: String) {
        val item = getStoreItem(id)
        storeList.remove(item)
    }
}