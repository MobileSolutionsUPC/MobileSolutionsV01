package com.mobilesolutions.carsauctionpj;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.MenuItem;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.mobilesolutions.model.Usuario;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class ListCars extends AppCompatActivity {

    private static ArrayList<Usuario> listUsuario = new ArrayList<>();
    Button searchButton;

    public static ArrayList<Usuario> getListSubasta() {
        return listUsuario;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_cars);
        searchButton = (Button) findViewById(R.id.searchButton);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //testUsuario();
                testSubasta();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void testSubasta() {

        String searchTitleUrl = "http://kaabasoft.com:8989/CarsAuctionREST/webresources/subasta";
        System.out.println("searchTitleUrl: " + searchTitleUrl);

        JsonArrayRequest jsonRequest = new JsonArrayRequest(
                Request.Method.GET, searchTitleUrl, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray jasonArray) {
                // the response is already constructed as a JSONObject!
                try {
                    JSONArray resultsArray = jasonArray;

                    System.out.println("resultsArray.length: " + resultsArray.length());

                    for (int i = 0; i<resultsArray.length() ; i++){
                        JSONObject result = resultsArray.getJSONObject(i);
                        String basePrice = result.getString("basePrice");
                        System.out.println("basePrice = " + basePrice);
                        JSONObject objVehiculo = result.getJSONObject("vehicleId");
                        String plate = objVehiculo.getString("plate");
                        System.out.println("plate = " + plate);
                        JSONObject objPropietario = objVehiculo.getJSONObject("ownerId");
                        String fullName = objPropietario.getString("fullName");
                        System.out.println("fullName = " + fullName);
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }
        );
        Volley.newRequestQueue(this).add(jsonRequest);

    }

    public void testUsuario() {

        String searchTitleUrl = "http://kaabasoft.com:8989/CarsAuctionREST/webresources/usuario";
        System.out.println("searchTitleUrl: " + searchTitleUrl);

        JsonArrayRequest jsonRequest = new JsonArrayRequest(
                Request.Method.GET, searchTitleUrl, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray jasonArray) {
                // the response is already constructed as a JSONObject!
                try {
                    JSONArray resultsArray = jasonArray;

                    System.out.println("resultsArray.length: " + resultsArray.length());

                    for (int i = 0; i<resultsArray.length() ; i++){
                        JSONObject result = resultsArray.getJSONObject(i);
                        String nombreCompleto = result.getString("fullName");
                        System.out.println("nombreCompleto = " + nombreCompleto);
                    }


                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                error.printStackTrace();
            }
        }
        );
        Volley.newRequestQueue(this).add(jsonRequest);

    }
}
