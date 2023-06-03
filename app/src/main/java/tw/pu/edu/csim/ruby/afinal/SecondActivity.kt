package tw.pu.edu.csim.ruby.afinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    lateinit var btnBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnBack = findViewById(R.id.btnBack)
        btnBack.setOnClickListener({
            finish()
        })
}
}