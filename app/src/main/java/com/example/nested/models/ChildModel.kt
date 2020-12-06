package com.example.nested.models

// 用於存儲recycler_view中的card_view各個items
// 這就是為什麼它包含一個用於電影標題的string和一個用於圖像的image

data class ChildModel(val image : Int = -1, val title : String = "")
//val : 類似 Java 之中， final 宣告的變數，它不可以再被 assign 新的值，只能取用。
