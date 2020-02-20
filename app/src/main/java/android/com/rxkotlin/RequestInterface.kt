package android.com.rxkotlin

import io.reactivex.Observable
import retrofit2.http.GET


interface RequestInterface {

    /*@GET("api/android")
    fun getData(): Observable<List<Hero>>*/

    @GET("marvel")
    fun getData(): Observable<List<Hero>>

}