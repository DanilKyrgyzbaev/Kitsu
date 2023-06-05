package kg.geekstudio.kitsu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import kg.geekstudio.data.local.TokenPreferences
import kg.geekstudio.kitsu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val navController by lazy {
        (supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment).navController
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupListener()
    }

    private fun setupListener() {
        val graph = navController.navInflater.inflate(R.navigation.nav_graph)

        if (TokenPreferences.userAccessToken.isNotEmpty()){
            graph.setStartDestination(R.id.homeFragment)
        }else {
            graph.setStartDestination(R.id.signinFragment)
        }
        navController.graph = graph
    }
}