package jp.co.archive_asia.cooper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager

const val LABEL_TEXT_KEY = "labelText"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // アプリ全体のページビュー
        val pager : ViewPager = this.findViewById(R.id.pager)

        // 下記のページアダプターを設定
        val fragmentManager : FragmentManager = supportFragmentManager
        val adapter = MyPageAdapter(fragmentManager)
        pager.adapter = adapter
    }
}
