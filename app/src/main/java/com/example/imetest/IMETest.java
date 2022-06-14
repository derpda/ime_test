package com.example.imetest;

import android.inputmethodservice.InputMethodService;
import android.view.View;

public class IMETest extends InputMethodService {
    @Override
    public View onCreateInputView() {
        return getLayoutInflater().inflate(R.layout.ime_test, null);
    }
}
