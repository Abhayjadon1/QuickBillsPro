package com.miniature.invoicegenerator.activity;

import static com.miniature.invoicegenerator.Uitilty.Util.ChangeStatusBarColor;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.miniature.invoicegenerator.BuildConfig;
import com.miniature.invoicegenerator.R;
import com.miniature.invoicegenerator.databinding.ActivityAboutBinding;

public class AboutActivity extends AppCompatActivity {

    private ActivityAboutBinding binding;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_about);

        ChangeStatusBarColor(this);

        binding.tvVersionName.setText("version : " + BuildConfig.VERSION_NAME);

        binding.tvDevName.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
