package com.kryptoblocks.scratchview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.cooltechworks.views.ScratchImageView;
import com.cooltechworks.views.ScratchTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ScratchTextView scratchTextView = (ScratchTextView)findViewById(R.id.text);
        ScratchImageView scratchImageView = findViewById(R.id.image);

        assert scratchTextView != null;
        scratchTextView.setRevealListener(new ScratchTextView.IRevealListener() {
            @Override
            public void onRevealed(ScratchTextView tv) {
                Toast.makeText(MainActivity.this, "Revealed text!", Toast.LENGTH_SHORT).show();
            }
        });

        assert scratchImageView != null;
        scratchImageView.setRevealListener(new ScratchImageView.IRevealListener() {
            @Override
            public void onRevealed(ScratchImageView scratchImageView) {
                Toast.makeText(MainActivity.this, "Revealed image!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    }

