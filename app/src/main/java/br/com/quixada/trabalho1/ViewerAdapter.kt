package br.com.quixada.trabalho1

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.fragment.app.FragmentActivity


class ViewerAdapter(fragmentActivity : FragmentActivity, list : ArrayList<String>) : FragmentStateAdapter(fragmentActivity){

    private val list = list
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> places_page(list)
            else -> places_page(list)
        }

    }

}

