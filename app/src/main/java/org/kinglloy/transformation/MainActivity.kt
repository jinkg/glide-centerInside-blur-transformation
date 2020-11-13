package org.kinglloy.transformation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    companion object {
        private const val IMAGE_URL =
                "https://th.bing.com/th/id/OIP.bLx51CquIR2c5rp7BN1GjwHaLI?pid=Api&rs=1"

        private const val IMAGE_URL2 =
                "https://th.bing.com/th/id/OIP.fq3C-Dodg9sC0xlCNuB4IQHaLH?pid=Api&rs=1"

        private const val IMAGE_URL3 =
                "https://th.bing.com/th/id/OIP.Tlumx9iXVC4rqPbISLZaRQHaF7?pid=Api&rs=1"
    }

    private lateinit var result: ImageView
    private lateinit var result2: ImageView
    private lateinit var result3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        result = findViewById(R.id.result)
        result2 = findViewById(R.id.result2)
        result3 = findViewById(R.id.result3)
        findViewById<View>(R.id.load).setOnClickListener {
            Glide.with(result)
                    .load(IMAGE_URL)
                    .transform(CenterInsideBlurTransformation(20, 3))
                    .into(result)

            Glide.with(result2)
                    .load(IMAGE_URL2)
                    .transform(CenterInsideBlurTransformation(40, 3))
                    .into(result2)

            Glide.with(result3)
                    .load(IMAGE_URL3)
                    .transform(CenterInsideBlurTransformation(60, 3))
                    .into(result3)
        }
    }

}