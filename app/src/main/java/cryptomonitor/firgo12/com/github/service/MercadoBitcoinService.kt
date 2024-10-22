package cryptomonitor.firgo12.com.github.service

import cryptomonitor.firgo12.com.github.service.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}