package com.ddvader44.gorun.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.ddvader44.gorun.repos.MainRepository

class StatisticsViewModel @ViewModelInject constructor(

    val mainRepository: MainRepository
): ViewModel() {

}