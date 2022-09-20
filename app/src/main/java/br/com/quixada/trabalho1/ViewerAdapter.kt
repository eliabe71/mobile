package br.com.quixada.trabalho1

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.FragmentActivity


class ViewerAdapter(fragmentActivity : FragmentActivity, home: ArrayList<String>, others: ArrayList<String>) : FragmentStateAdapter(fragmentActivity){

    private val home = home
    private val others = others
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> PlacesPage(home)
            else -> PlacesPage(others)
        }
    }


}

