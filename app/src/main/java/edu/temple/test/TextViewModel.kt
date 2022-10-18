package edu.temple.test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextViewModel : ViewModel()
{
    val selSize : MutableLiveData<Float> by lazy{
        MutableLiveData<Float>()
    }
    fun setSelectedSize(size: Float){
        selSize.value=size
    }
    fun getSelectedSize(): LiveData<Float> {
        return selSize
    }
}