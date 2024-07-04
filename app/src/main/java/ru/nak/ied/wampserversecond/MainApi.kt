package ru.nak.ied.wampserversecond

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface MainApi {
    @GET("get_all_items.php")
    suspend fun getAllUsers(): List<User>

    // это body
    @POST("save_user.php")
    suspend fun saveUser(@Body user: User)

    // отправляем ImageData, ждем ImageUploadResponse
    @POST("upload_image.php")
    suspend fun uploadImage(@Body imageData: ImageData): ImageUploadResponse
}