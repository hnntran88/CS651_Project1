package com.project1.com.posts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Post_Modal {
      public List < Post_Use_Bean > call_me_to_get_posts(String access_token) throws Exception {
        List < Post_Use_Bean > list_posts = new ArrayList < Post_Use_Bean > ();
        try {
            String url = "https://graph.facebook.com/v6.0/me/posts?access_token=" + access_token;
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            // optional default is GET
            con.setRequestMethod("GET");
            //add request header
            con.setRequestProperty("User-Agent", "Mozilla/5.0");
            int responseCode = con.getResponseCode();
            System.out.println("\nSending 'GET' request to URL : " + url);
            System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in .readLine()) != null) {
                response.append(inputLine);
            } in .close();
            System.out.println(response);
            JSONObject data_response = new JSONObject(response.toString());
            JSONArray data_array = data_response.getJSONArray("data");
            System.out.println(data_array.length());
            for (int count = 0; count < data_array.length(); count++) {
                Post_Use_Bean obj_Post_Use_Bean = new Post_Use_Bean();
                obj_Post_Use_Bean.setId(data_array.getJSONObject(count).getString("id"));
                obj_Post_Use_Bean.setCreated_time(data_array.getJSONObject(count).getString("created_time"));
                try {
                    obj_Post_Use_Bean.setStory(data_array.getJSONObject(count).getString("story"));
                } catch (Exception e) {
                    System.out.println(e);
                }
                try {
                    obj_Post_Use_Bean.setMessage(data_array.getJSONObject(count).getString("message"));
                } catch (Exception e) {
                    System.out.println(e);
                }
                list_posts.add(obj_Post_Use_Bean);
            }
            JSONObject data_paging = new JSONObject(data_response.getJSONObject("paging"));
            Post_Use_Bean obj_Post_Use_Bean = new Post_Use_Bean();
            obj_Post_Use_Bean.setPaging_next(data_paging.getString("next"));
            obj_Post_Use_Bean.setPaging_previous(data_paging.getString("previous"));
            list_posts.add(obj_Post_Use_Bean);
        } catch (Exception e) {
            System.out.println(e);
        }
    //return list_posts;
	return list_posts;
    }
}
