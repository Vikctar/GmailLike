package com.vikcandroid.gmaillike.network;

import com.vikcandroid.gmaillike.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Contains the REST api endpoints and the type of response
 * it is expecting.
 *
 * Created by android-dev on 6/19/17.
 */

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getInbox();
}
