package uz.ghost.instagram

import HomFragment
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.ghost.instagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .add(R.id.my_container, HomFragment())
            .commit()
    }
}