package cryptomonitor.firgo12.com.github.state

import cryptomonitor.firgo12.com.github.service.Ticker

sealed class ScreenState {

    object Loading : ScreenState()
    data class Success(val data: Ticker) : ScreenState()
    data class Error(val exception: Throwable) : ScreenState()
}