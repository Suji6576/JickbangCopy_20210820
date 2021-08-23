package com.neppplus.jickbangcopy_20210820

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210820.datas.RoomData
import com.neppplus.jickbangcopy_20210820.datas.adapters.RoomAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//    추가 브랜치 연습

    val mRoomList = ArrayList<RoomData>()

    lateinit var mRoomAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData( 8300, "서울시 동작구", 5, "1번째 방입니다.") )
        mRoomList.add( RoomData( 12000, "서울시 마포구", 7, "2번째 방입니다.") )
        mRoomList.add( RoomData( 9700, "서울시 성북구", 1, "3번째 방입니다.") )
        mRoomList.add( RoomData( 164000, "서울시 중구", 8, "4번째 방입니다.") )
        mRoomList.add( RoomData( 4600, "서울시 영등포구", -1, "5번째 방입니다.") )
        mRoomList.add( RoomData( 56400, "서울시 성동구", 4, "6번째 방입니다.") )
        mRoomList.add( RoomData( 5500, "서울시 동작구", 2, "7번째 방입니다.") )
        mRoomList.add( RoomData( 25000, "서울시 서초구", 8, "8번째 방입니다.") )
        mRoomList.add( RoomData( 38000, "서울시 성동구", 11, "9번째 방입니다.") )
        mRoomList.add( RoomData( 8700, "서울시 동대문구", -2, "10번째 방입니다.") )
        mRoomList.add( RoomData( 8000, "서울시 서대문구", 0, "11번째 방입니다.") )

        mRoomAdapter = RoomAdapter (this, R.layout.room_list_item, mRoomList)
        roomListView.adapter = mRoomAdapter

        roomListView.setOnItemClickListener { adapterView, view, position, l ->

            val clickedRoom = mRoomList[position]

            val myIntent = Intent(this, viewRoomDetailActivity::class.java)

            myIntent.putExtra("roomData", clickedRoom)

            startActivity(myIntent)

        }


    }
}