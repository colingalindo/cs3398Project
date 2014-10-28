package com.greenteam.cs3398project;

/**
 * Created by sam on 10/27/2014.
 */
import com.loopj.android.http.*;

import org.apache.http.Header;
import org.json.JSONObject;

public class UserRestClient {
    private static final String BASE_URL = "ec2-54-68-231-89.us-west-2.compute.amazonaws.com/api/v1.0/";

    private static AsyncHttpClient client = new AsyncHttpClient();


    public static void get(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.setBasicAuth("neb","foobar");
        client.get(getAbsoluteUrl(url), params, responseHandler);
    }

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.setBasicAuth("neb","foobar");
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

    //possibly might want to move this code into another file later? unsure

    public static void createUser(String username, String password, String first_name,
                                     String last_name, String e_mail, String work_number,
                                     String mobile_number, int role){

        //role of 0 = student
        //role of 1 = tutor

        RequestParams parameters = new RequestParams();
        parameters.put("Username", username);
        parameters.put("Password", password);
        parameters.put("FirstName", first_name);
        parameters.put("LastName", last_name);
        parameters.put("E-Mail", e_mail);
        parameters.put("WorkNumber", work_number);
        parameters.put("MobileNumber", mobile_number);
        parameters.put("Role", role);

        post(null, parameters, new JsonHttpResponseHandler() {
            @Override
            public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                System.out.println("success");
            }
        });


    }

}