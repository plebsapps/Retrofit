package ch.plebsapps.retrofit.api;

import ch.plebsapps.retrofit.data.Openweather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("weather?")  //weather?q={city}&appid=<YOUR OWN KEY>")
    Call<Openweather> doGetWeather(@Query("q") String city, @Query("appid") String key);

    /*
    IMPLEMET more

    Bsp:
        @POST("/api/users")
        Call<User> createUser(@Body User user);

        @GET("/api/users?")
        Call<UserList> doGetUserList(@Query("page") String page);

        @FormUrlEncoded
        @POST("/api/users?")
        Call<UserList> doCreateUserWithField(@Field("name") String name, @Field("job") String job);
    */
}