package com.example.fragmentbestpractice

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_news_content.*

class NewsContentActivity : AppCompatActivity() {

    companion object{
        //actionStart()方法完成了Intent的构建，NewsContentActivity所有需要用到的数据都是通过此方法的参数传递进来，然后存储到Intent中
        fun actionStart(context: Context, title: String, content: String) {
            val intent = Intent(context,NewsContentActivity::class.java).apply {
                putExtra("news_title", title)
                putExtra("news_content", content)
            }
            //调用startActivity方法启动NewsContentActivity
            context.startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_content)
        //通过intent获取传入的新闻标题
        val title = intent.getStringExtra("news_title")
        //获取intent传入的新闻内容
        val content = intent.getStringExtra("news_content")
        if (title != null && content != null) {
            //使用kotlin-android-extensions插件提供的简洁写法得到了NewsContentFragment的实例
            val fragment = newsContentFrag as NewsContentFragment
            //刷新NewsContentFragment界面
            fragment.refresh(title, content)
        }
    }
}