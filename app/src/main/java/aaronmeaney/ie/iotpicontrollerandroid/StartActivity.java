package aaronmeaney.ie.iotpicontrollerandroid;

import android.app.Activity;
import android.os.Bundle;
import com.amazonaws.mobile.client.AWSMobileClient;

public class StartActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        // Get AWS Mobile Client instance
        AWSMobileClient.getInstance().initialize(this).execute();
    }
}
