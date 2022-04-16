package dl.aa.developerslife.data

import dl.aa.developerslife.data.models.GifItem
import dl.aa.developerslife.data.models.GifItems

class GifRepository {

    suspend fun getLatest(page: Int): GifItems {
        return Networking.developersLifeApi.getLatest(page)
    }

    suspend fun getTop(page: Int): GifItems {
        return Networking.developersLifeApi.getTop(page)
    }

    suspend fun getRandom(): GifItem {
        return Networking.developersLifeApi.getRandom()
    }
}