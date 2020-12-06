package com.example.nested.models

// 用於存儲單個card_view的數據
// 因此包含一個string（用於card_view標題）和 ChildModel列表
// 用來顯示在recycler_view中的card_view

data class ParentModel (val title : String = "", val children : List<ChildModel>)
//val : 類似 Java 之中， final 宣告的變數，它不可以再被 assign 新的值，只能取用。

