package com.neppplus.jickbangcopy_20210820

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.jickbangcopy_20210820.datas.RoomData

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData( 8300, "서울시 동대문구", 5, "1번째 방입니다." ) )
        mRoomList.add( RoomData( 25000, "서울시 동대문구", 0, "2번째 방입니다." ) )
        mRoomList.add( RoomData( 38000, "서울시 동대문구", 7, "3번째 방입니다." ) )
        mRoomList.add( RoomData( 9700, "서울시 서대문구", -2, "4번째 방입니다." ) )
        mRoomList.add( RoomData( 164000, "서울시 서대문구", 14, "5번째 방입니다." ) )
        mRoomList.add( RoomData( 95000, "서울시 서대문구", -1, "6번째 방입니다." ) )
        mRoomList.add( RoomData( 56400, "서울시 동작구", 0, "7번째 방입니다." ) )
        mRoomList.add( RoomData( 7500, "서울시 동작구", 8, "8번째 방입니다." ) )
        mRoomList.add( RoomData( 4600, "서울시 동작구", 4, "9번째 방입니다." ) )
        mRoomList.add( RoomData( 5500, "서울시 동작구", 2, "10번째 방입니다." ) )

    }
}