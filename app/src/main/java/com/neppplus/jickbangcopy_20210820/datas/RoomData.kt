package com.neppplus.jickbangcopy_20210820.datas

import java.text.NumberFormat
import java.util.*

class RoomData(
    val price : Int,
    val address : String,
    val floor : Int,
    val description : String ) {

//    추가 기능 (함수) 구현

    fun getFormattedPrice() : String {

        if (this.price >= 10000) {
            val uk = this.price / 10000
            val rest = this.price % 10000

            val result = "${uk}억${NumberFormat.getNumberInstance(Locale.KOREA).format(rest)}"

            return result
        }
        else {
            val result  = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)

            return result
        }

    }


}