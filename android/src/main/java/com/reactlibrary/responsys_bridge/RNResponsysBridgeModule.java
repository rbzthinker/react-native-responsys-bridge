
package com.reactlibrary.responsys_bridge;

import android.util.Log;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.pushio.manager.PushIOManager;
import com.pushio.manager.tasks.PushIOListener;

public class RNResponsysBridgeModule extends ReactContextBaseJavaModule {
    private final ReactApplicationContext reactContext;

    public RNResponsysBridgeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "RNResponsysBridge";
    }

    private PushIOManager getPushIOManager() {
        return PushIOManager.getInstance(getReactApplicationContext());
    }

    @ReactMethod
    public void start() {
        getPushIOManager().ensureRegistration();

        //TODO: deleteme
        getPushIOManager().registerPushIOListener(new PushIOListener() {
            @Override
            public void onPushIOSuccess() {
                Log.i("PUSHIO", "----onPushIOSuccess");
            }

            @Override
            public void onPushIOError(String s) {
                Log.i("PUSHIO", "----onPushIOError");
            }
        });
    }

    @ReactMethod
    public void registerUserId(String userId) {
        getPushIOManager().registerUserId(userId);
    }

    @ReactMethod
    public void trackEvent(String event) {
        getPushIOManager().trackEvent(event);
    }
}