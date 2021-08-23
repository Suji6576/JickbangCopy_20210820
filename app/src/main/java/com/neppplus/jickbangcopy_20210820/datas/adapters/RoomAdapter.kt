package com.neppplus.jickbangcopy_20210820.datas.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jickbangcopy_20210820.R
import com.neppplus.jickbangcopy_20210820.datas.RoomData
import org.w3c.dom.Text

class RoomAdapter (
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<RoomData> ) : ArrayAdapter<RoomData>(mContext, resId, mList) {

        val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if (tempRow == null) {
            tempRow = mInflater.inflate(R.layout.room_list_item,null)
        }

        val row = tempRow!!

        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)

        descriptionTxt.text = data.description

        return row

    }


}