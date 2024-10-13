package com.example.asm_ph45931.APISevices


import com.example.asm_ph45931.Cart.Cart
import com.example.asm_ph45931.History.Order
import com.example.asm_ph45931.Model.LoginResponse
import com.example.asm_ph45931.Model.Product
import com.example.asm_ph45931.Model.User
import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("products/getProduct")
    suspend fun getProducts(): List<Product>

    @POST("products/addProduct")
    suspend fun addProduct(@Body product: Product): Product

    @PUT("products/editProduct/{id}")
    suspend fun editProduct(@Path("id") id: String, @Body product: Product): Product

    @DELETE("products/deleteProduct/{id}")
    suspend fun deleteProduct(@Path("id") id: String): Unit

    @GET("products/getProductDetail/{productId}")
    suspend fun getProductDetail(@Path("productId") productId: String): Product

    // Search API
    @GET("products/search")
    suspend fun searchProducts(@Query("q") query: String): List<Product>

    @POST("products/addToCart")
    suspend fun addToCart(
        @Header("Authorization") token: String,
        @Body cart: Cart
    ): Response<ResponseBody>

    @GET("products/getCart")
    suspend fun getCart(
        @Header("Authorization") token: String,
    ): List<Cart>

    @POST("products/checkout")
    suspend fun checkout(@Body order: Order): Order

    // User API
    @POST("users/register")
    suspend fun registerUser(@Body user: User): User

    @POST("users/login")
    suspend fun login(@Body user: User): LoginResponse



}