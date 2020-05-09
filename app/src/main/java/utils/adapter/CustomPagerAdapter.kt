package utils.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

fun ViewPager.setupPagerAdapter(frags: Any, titles: Any) {
    adapter = CustomPagerAdapter(
        frags, titles, (context as AppCompatActivity).supportFragmentManager
    )
}

class CustomPagerAdapter(
    private val frags: Any,
    private val titles: Any,
    fragmentManager: FragmentManager
) : FragmentPagerAdapter(fragmentManager) {

    override fun getItem(position: Int) =
        when (frags) {
            is List<*> -> frags[position] as Fragment
            is Array<*> -> frags[position] as Fragment
            else -> null as Fragment
        }

    override fun getPageTitle(position: Int) = when (titles) {
        is List<*> -> titles[position] as String
        is Array<*> -> titles[position] as String
        else -> null
    }

    override fun getCount() = when (frags) {
        is List<*> -> frags.size
        is Array<*> -> frags.size
        else -> when (titles) {
            is List<*> -> titles.size
            is Array<*> -> titles.size
            else -> 2
        }
    }
}

