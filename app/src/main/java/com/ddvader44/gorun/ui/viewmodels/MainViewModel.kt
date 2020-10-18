package com.ddvader44.gorun.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ddvader44.gorun.db.Run
import com.ddvader44.gorun.repos.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(

    val mainRepository: MainRepository
): ViewModel() {

    fun insertRun(run : Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}