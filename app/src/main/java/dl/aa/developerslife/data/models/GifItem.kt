package dl.aa.developerslife.data.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


@Serializable
data class GifItem(
    @SerialName("id")
    val id: Int,

    @SerialName("gifURL")
    val gifURL: String,

    @SerialName("description")
    val description: String
)