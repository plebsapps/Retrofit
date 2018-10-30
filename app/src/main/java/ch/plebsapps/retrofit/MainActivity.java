package ch.plebsapps.retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import ch.plebsapps.retrofit.api.APIInterface;
import ch.plebsapps.retrofit.api.ApiClient;
import ch.plebsapps.retrofit.data.Openweather;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity{

    @BindView(R.id.txtData)
    TextView txtData;

    @BindView(R.id.edAppId)
    EditText edAppI;

    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnGetWether)
    public void getWeather(View v) {

        apiInterface = ApiClient.getClient().create(APIInterface.class);
        Call<Openweather> call = apiInterface.doGetWeather("Frankfurt", edAppI.getText().toString());

        call.enqueue(new Callback<Openweather>() {
            @Override
            public void onResponse(Call<Openweather> call, Response<Openweather> response) {

                Openweather resource = response.body();
                String strResponse = "";

                strResponse += "ResponseCode:" + response.code() + "\n";

                if (resource != null) {
                    strResponse += "-----------------------------\n";
                    strResponse += "Name: " + resource.getName() + "\n";
                    strResponse += "WindSpeed: " + resource.getWind().getSpeed() + "\n";
                    strResponse += "WindDeg: " + resource.getWind().getDeg() + "\n";
                }

                txtData.setText(strResponse);
            }

            @Override
            public void onFailure(Call<Openweather> call, Throwable t) {
                txtData.setText("Call Failure: " + t.getMessage());
                call.cancel();
            }
        });
    }
}