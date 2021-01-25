package com.example.redenvelopes

import android.util.Log


object WechatConstants {
    val Tag = "======="
    val WECHAT_PACKAGE = "com.tencent.mm"
    val WECHAT_LUCKYMONEY_ACTIVITY =
        "$WECHAT_PACKAGE.plugin.luckymoney.ui.LuckyMoneyNotHookReceiveUI" //微信红包弹框
    val WECHAT_LUCKYMONEYDETAILUI_ACTIVITY =
        "$WECHAT_PACKAGE.plugin.luckymoney.ui.LuckyMoneyDetailUI" //微信红包详情页


    var RED_ENVELOPE_ID = "com.tencent.mm:id/aou" //聊天页面红包点击框控件id
    var RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/aq6" //聊天页面检测红包已被领控件id
    var RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/aq7" //聊天页面区分红包id
    var RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/cyf" //抢红包页面点开控件id
    var RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/cv0" //抢红包页面退出控件id

    var RED_ENVELOPE_TITLE = "[微信红包]" //红包文字
    var RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/b5q" //红包id
    var RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/b5m" //红包RECT id

    var RED_ENVELOPE_COUNT_ID = "com.tencent.mm:id/csy" //红包金额id
    var DELAYTIME = 80L
    fun setVersion(version: String) {
        Log.d(Tag, "version:$version")
        when (version) {
            "7.0.3" -> {

                RED_ENVELOPE_ID = "com.tencent.mm:id/aou" //聊天页面红包点击框控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/aq6" //聊天页面检测红包已被领控件id
                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/aq7" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/cyf" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/cv0" //抢红包页面退出控件id

                RED_ENVELOPE_TITLE = "[微信红包]" //红包文字
                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/b5q" //红包id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/b5m" //红包RECT id

                RED_ENVELOPE_COUNT_ID = "com.tencent.mm:id/csy" //红包金额id

            }
            "7.0.4" -> {

                RED_ENVELOPE_ID = "com.tencent.mm:id/ap9" //聊天页面红包点击框控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/aqk" //聊天页面检测红包已被领控件id
                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/aql" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/d02" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/cwm" //抢红包页面退出控件id

                //下面是点过的
                RED_ENVELOPE_TITLE = "[微信红包]" //红包文字
                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/b6g" //红包id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/b6c" //红包RECT id

                RED_ENVELOPE_COUNT_ID = "com.tencent.mm:id/cuk" //红包金额id

            }
            "7.0.5" -> {

                RED_ENVELOPE_ID = "com.tencent.mm:id/ar0" //聊天页面红包点击框控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/asa" //聊天页面检测红包已被领控件id
                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/asb" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/d4h" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/d0y" //抢红包页面退出控件id

                //下面是点过的
                RED_ENVELOPE_TITLE = "[微信红包]" //红包文字
                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/b97" //红包id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/b93" //红包RECT id

                RED_ENVELOPE_COUNT_ID = "com.tencent.mm:id/cyw" //红包金额id

            }
            "7.0.8" -> {
                RED_ENVELOPE_ID = "com.tencent.mm:id/atb" //聊天页面红包点击框控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/aul" //聊天页面检测红包已被领控件id
                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/aum" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/dan" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/d84" //抢红包页面退出控件id

                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/bal" //红包id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/bah" //红包RECT id
            }
            "7.0.9" -> {
                RED_ENVELOPE_ID = "com.tencent.mm:id/atb" //聊天页面红包点击框控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/aul" //聊天页面检测红包已被领控件id
                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/aum" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/dan" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/d84" //抢红包页面退出控件id

                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/bal" //红包id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/bah" //红包RECT id
            }
            "7.0.10" -> {
                RED_ENVELOPE_ID = "com.tencent.mm:id/atb" //聊天页面红包点击框控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/aul" //聊天页面检测红包已被领控件id
                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/aum" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/dan" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/d84" //抢红包页面退出控件id

                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/bal" //红包id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/bah" //红包RECT id
            }
            "7.0.12" -> {
                RED_ENVELOPE_ID = "com.tencent.mm:id/ajp" //聊天页面红包点击框控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/qr" //聊天页面检测红包已被领控件id
                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/r2" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/d_4" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/d84" //抢红包页面退出控件id

                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/cto" //首页底面小文字的id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/cto" //红包RECT id
            }
            "7.0.13" -> {
                RED_ENVELOPE_ID = "com.tencent.mm:id/ak4" //聊天页面红包点击框控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/qv" //聊天页面检测红包已被领控件id
                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/r6" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/dbr" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/dm" //抢红包页面退出控件id

                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/cw7" //首页底面小文字的id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/cw7" //红包RECT id
            }
            "7.0.18" -> {
                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/cyv" //首页底面小文字的id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/cyv" //首页底面小文字的id
                RED_ENVELOPE_ID = "com.tencent.mm:id/al7" //聊天界面红包item点击框控件id

                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/ra" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/den" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/dem" //抢红包页面退出控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/r0" //聊天页面检测红包已被领控件id


            }
            "7.0.19" -> {
                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/cyv" //首页底面小文字的id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/cyv" //首页底面小文字的id
                RED_ENVELOPE_ID = "com.tencent.mm:id/al7" //聊天界面红包item点击框控件id

                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/ra" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/den" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/dem" //抢红包页面退出控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/r0" //聊天页面检测红包已被领控件id


            }
            "7.0.22" -> {
                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/cns" //首页底面小文字的id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/cns" //首页底面小文字的id
                RED_ENVELOPE_ID = "com.tencent.mm:id/al7" //聊天界面红包item点击框控件id

                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/ra" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/den" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/dn" //抢红包页面退出控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/r0" //聊天页面检测红包已被领控件id


            }
            else -> {
                RED_ENVELOPE_TITLE_ID = "com.tencent.mm:id/cyv" //首页底面小文字的id
                RED_ENVELOPE_RECT_TITLE_ID = "com.tencent.mm:id/cyv" //首页底面小文字的id
                RED_ENVELOPE_ID = "com.tencent.mm:id/al7" //聊天界面红包item点击框控件id

                RED_ENVELOPE_FLAG_ID = "com.tencent.mm:id/ra" //聊天页面区分红包id
                RED_ENVELOPE_OPEN_ID = "com.tencent.mm:id/den" //抢红包页面点开控件id
                RED_ENVELOPE_CLOSE_ID = "com.tencent.mm:id/dem" //抢红包页面退出控件id
                RED_ENVELOPE_BEEN_GRAB_ID = "com.tencent.mm:id/r0" //聊天页面检测红包已被领控件id
            }
        }
    }

}
