package jp.co.archive_asia.cooper

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class MyPageAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        val fragment = MyFragment()

        // 各ページに渡すテキスト情報を設定
        val bundle : Bundle = Bundle()
        bundle.putString(LABEL_TEXT_KEY, "Page" + position)
        fragment.arguments = bundle

        return fragment
    }

    override fun getCount(): Int {
        return 2
    }

}