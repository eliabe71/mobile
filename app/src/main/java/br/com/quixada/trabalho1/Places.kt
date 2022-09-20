package br.com.quixada.trabalho1

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import br.com.quixada.trabalho1.databinding.ActivityPlacesBinding
import com.google.android.material.tabs.TabLayout

class Places : AppCompatActivity() {
    private lateinit var bind: ActivityPlacesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = DataBindingUtil.setContentView(this, R.layout.activity_places)
        bind.viewpage.adapter = ViewerAdapter(this)
    //setContentView(R.layout.activity_places)

        //findViewById<ViewPager2>(R.id.viewpage).adapter = ViewerAdapter(this)

        bind.viewpage.currentItem = 0
//
//
        bind.tabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                Toast.makeText(this@Places, "POS "+tab?.position as Int, Toast.LENGTH_LONG).show()
                bind.viewpage.currentItem = 1
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
                //TODO("Not yet implemented")
            }
        })
//        bind.viewpage.registerOnPageChangeCallback(object: ViewPager2.OnPageChangeCallback(){
//            override fun onPageSelected(position: Int) {
//                super.onPageSelected(position)
//
//
//
//            }
//
//        })
    }
}