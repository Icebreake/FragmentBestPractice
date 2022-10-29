package com.example.fragmentbestpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.news_content_frag.*

class NewsContentFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.news_content_frag,container,false)
    }

    //用于将新闻的标题和内容显示在我们刚刚定义的界面上，当调用了refresh()方法时，需要将我们刚才隐藏的新闻内容布局设置成可见
    fun refresh(title: String, content: String) {
        contentLayout.visibility = View.VISIBLE
        //刷新新闻的标题
        newsTitle.text = title
        //刷新新闻的内容
        newsContent.text = content
    }
    
}