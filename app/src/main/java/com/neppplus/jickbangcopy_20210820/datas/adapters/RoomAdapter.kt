package com.neppplus.jickbangcopy_20210820.datas.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.jickbangcopy_20210820.R
import com.neppplus.jickbangcopy_20210820.datas.RoomData

class RoomAdapter (
    val mContext : Context,
    val resid : Int,
    val mList : ArrayList<RoomData>) : ArrayAdapter<RoomData>(mContext, resid, mList) {

    val mInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temprow = convertView

        if (temprow == null) {

            temprow = mInflater.inflate(R.layout.room_list_item, null)

        }

        var row = temprow!!

        val data = mList[position]

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressAndFloorTxt)
        val descriptionTxt = row.findViewById<TextView>(R.id.descriptionTxt)


        priceTxt.text = data.getFormattedPrice()

        descriptionTxt.text = data.description

        addressAndFloorTxt.text = "${data.address},${data.getFormatterFloor()}"

        return row

    }

}