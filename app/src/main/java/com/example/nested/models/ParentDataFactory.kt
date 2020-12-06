package com.example.nested.models

import java.util.*


//如果通通都是static function跟變數，你就可以使用 object Demo來定義這個物件
//透過object 定義的物件，在外部要存取的時候就不需要額外撰寫 compaion object這樣的定義，外部的class就可以直接使用靜態呼叫的語法

object ParentDataFactory{
    private val random = Random()

    private val titles =  arrayListOf( "Now Playing", "Classic", "Comedy", "Thriller", "Action", "Horror", "TV Series")

    private fun randomTitle() : String{
        val index = random.nextInt(titles.size)
        return titles[index]
    }

    private fun randomChildren() : List<ChildModel>{
        return ChildDataFactory.getChildren(20)
    }

    fun getParents(count : Int) : List<ParentModel>{
        val parents = mutableListOf<ParentModel>()
        repeat(count){
            val parent = ParentModel(randomTitle(), randomChildren())
            parents.add(parent)
        }
        return parents
    }
}