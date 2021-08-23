package com.neppplus.jickbangcopy_20210820

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210820.datas.RoomData
import kotlinx.android.synthetic.main.activity_view_room_detail.*

class viewRoomDetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)

        val RoomData = intent.getSerializableExtra("roomData") as RoomData

        priceTxt.text = roomData.getFormatter

    }
}