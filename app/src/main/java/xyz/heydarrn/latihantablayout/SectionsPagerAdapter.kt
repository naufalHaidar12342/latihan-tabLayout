package xyz.heydarrn.latihantablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(activity:AppCompatActivity) :FragmentStateAdapter(activity) {
    //menentukan jumlah yang akan ditampilkan
    override fun getItemCount(): Int {
        return 2
    }

    //menampilkan fragment sesuai dengan posisi tab-nya.
    override fun createFragment(position: Int): Fragment {
        var fragment:Fragment?=null
        when(position){
            0 -> fragment=HomeFragment()
            1 -> fragment=ProfileFragment()
        }
        return fragment as Fragment
    }

}