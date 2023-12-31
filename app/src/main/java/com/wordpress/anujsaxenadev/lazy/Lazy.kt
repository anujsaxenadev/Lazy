package com.wordpress.anujsaxenadev.lazy

import kotlin.reflect.KProperty

class Lazy<out T: Any?>(
    private val initialize: () -> T
) {
    private var value: T? = null

    operator fun getValue(thisRef: Any?, property: KProperty<*>): T{
        return if(value == null){
            value = initialize()
            value!!
        }
        else{
            value!!
        }
    }
}