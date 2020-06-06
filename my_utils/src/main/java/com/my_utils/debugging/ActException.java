package com.my_utils.debugging;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.my_utils.R;
import com.my_utils.baseviews.ActBase;

import static com.my_utils.debugging.ExceptionHandler.EXCEPTION_DEVICE;
import static com.my_utils.debugging.ExceptionHandler.EXCEPTION_LOG;
import static com.my_utils.debugging.ExceptionHandler.EXCEPTION_MESSAGE;

public class ActException extends ActBase {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setExceptionHandler(ExceptionHandler.class);
        setContentView(R.layout.act_exception);

        if (getIntent().getExtras() != null) {
            Bundle extras = getIntent().getExtras();
            TextView message = findViewById(R.id.exception_message);
            TextView log = findViewById(R.id.exception_log);
            TextView device = findViewById(R.id.exception_device);

            message.setText(extras.getString(EXCEPTION_MESSAGE));
            log.setText(extras.getString(EXCEPTION_LOG));
            device.setText(extras.getString(EXCEPTION_DEVICE));
        }
    }
}
