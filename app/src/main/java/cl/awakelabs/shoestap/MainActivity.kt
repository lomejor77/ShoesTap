package cl.awakelabs.shoestap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import cl.awakelabs.shoestap.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }

}