package com.tme.towing_made_easy_android_app;

import android.app.Application;
import com.firebase.client.Firebase;

/**
 * Created by ashwi on 4/16/2016.
 */
    public class TowingApplication extends Application {

        @Override
        public void onCreate() {
            super.onCreate();

            Firebase.setAndroidContext(this);
        }
}
