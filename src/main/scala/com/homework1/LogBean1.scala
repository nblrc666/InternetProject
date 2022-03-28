package com.homework1

import com.utils.NumFormat

case class LogBean1(
               var sessionid: String,
               var advertisersid: Int,
               var adorderid: Int,
               var adcreativeid: Int,
               var adplatformproviderid: Int,
               var sdkversion: String,
               var adplatformkey: String,
               var putinmodeltype: Int,
               var requestmode: Int,
               var adprice: Double,
               var adppprice: Double,
               var requestdate: String,
               var ip: String,
               var appid: String,
               var appname: String,
               var uuid: String,
               var device: String,
               var client: Int,
               var osversion: String,
               var density: String,
               var pw: Int,
               var ph: Int,
               var longitude: String,
               var lat: String,
               var provincename: String,
               var cityname: String,
               var ispid: Int,
               var ispname: String,
               var networkmannerid: Int,
               var networkmannername: String,
               var iseffective: Int,
               var isbilling: Int,
               var adspacetype: Int,
               var adspacetypename: String,
               var devicetype: Int,
               var processnode: Int,
               var apptype: Int,
               var district: String,
               var paymode: Int,
               var isbid: Int,
               var bidprice: Double,
               var winprice: Double,
               var iswin: Int,
               var cur: String,
               var rate: Double,
               var cnywinprice: Double,
               var imei: String,
               var mac: String,
               var idfa: String,
               var openudid: String,
               var androidid: String,
               var rtbprovince: String,
               var rtbcity: String,
               var rtbdistrict: String,
               var rtbstreet: String,
               var storeurl: String,
               var realip: String,
               var isqualityapp: Int,
               var bidfloor: Double,
               var aw: Int,
               var ah: Int,
               var imeimd5: String,
               var macmd5: String,
               var idfamd5: String,
               var openudidmd5: String,
               var androididmd5: String,
               var imeisha1: String,
               var macsha1: String,
               var idfasha1: String,
               var openudidsha1: String,
               var androididsha1: String,
               var uuidunknow: String,
               var userid: String,
               var iptype: Int,
               var initbidprice: Double,
               var adpayment: Double,
               var agentrate: Double,
               var lomarkrate: Double,
               var adxrate: Double,
               var title: String,
               var keywords: String,
               var tagid: String,
               var callbackdate: String,
               var channelid: String,
               var mediatype: Int
             ) extends Product with Serializable {
  override def productElement(n: Int): Any = n match {
    case 0 => sessionid: String
    case 1 => advertisersid: Int
    case 2 => adorderid: Int
    case 3 => adcreativeid: Int
    case 4 => adplatformproviderid: Int
    case 5 => sdkversion: String
    case 6 => adplatformkey: String
    case 7 => putinmodeltype: Int
    case 8 => requestmode: Int
    case 9 => adprice: Double
    case 10 => adppprice: Double
    case 11 => requestdate: String
    case 12 => ip: String
    case 13 => appid: String
    case 14 => appname: String
    case 15 => uuid: String
    case 16 => device: String
    case 17 => client: Int
    case 18 => osversion: String
    case 19 => density: String
    case 20 => pw: Int
    case 21 => ph: Int
    case 22 => longitude: String
    case 23 => lat: String
    case 24 => provincename: String
    case 25 => cityname: String
    case 26 => ispid: Int
    case 27 => ispname: String
    case 28 => networkmannerid: Int
    case 29 => networkmannername: String
    case 30 => iseffective: Int
    case 31 => isbilling: Int
    case 32 => adspacetype: Int
    case 33 => adspacetypename: String
    case 34 => devicetype: Int
    case 35 => processnode: Int
    case 36 => apptype: Int
    case 37 => district: String
    case 38 => paymode: Int
    case 39 => isbid: Int
    case 40 => bidprice: Double
    case 41 => winprice: Double
    case 42 => iswin: Int
    case 43 => cur: String
    case 44 => rate: Double
    case 45 => cnywinprice: Double
    case 46 => imei: String
    case 47 => mac: String
    case 48 => idfa: String
    case 49 => openudid: String
    case 50 => androidid: String
    case 51 => rtbprovince: String
    case 52 => rtbcity: String
    case 53 => rtbdistrict: String
    case 54 => rtbstreet: String
    case 55 => storeurl: String
    case 56 => realip: String
    case 57 => isqualityapp: Int
    case 58 => bidfloor: Double
    case 59 => aw: Int
    case 60 => ah: Int
    case 61 => imeimd5: String
    case 62 => macmd5: String
    case 63 => idfamd5: String
    case 64 => openudidmd5: String
    case 65 => androididmd5: String
    case 66 => imeisha1: String
    case 67 => macsha1: String
    case 68 => idfasha1: String
    case 69 => openudidsha1: String
    case 70 => androididsha1: String
    case 71 => uuidunknow: String
    case 72 => userid: String
    case 73 => iptype: Int
    case 74 => initbidprice: Double
    case 75 => adpayment: Double
    case 76 => agentrate: Double
    case 77 => lomarkrate: Double
    case 78 => adxrate: Double
    case 79 => title: String
    case 80 => keywords: String
    case 81 => tagid: String
    case 82 => callbackdate: String
    case 83 => channelid: String
    case 84 => mediatype: Int
  }
  override def productArity: Int = 85

  override def canEqual(that: Any): Boolean = this.isInstanceOf[LogBean1]
}

object LogBean {
  def apply(line:Array[String]) = new LogBean1(
    line(0),
    NumFormat.toInt(line(1)),
    NumFormat.toInt(line(2)),
    NumFormat.toInt(line(3)),
    NumFormat.toInt(line(4)),
    line(5),
    line(6),
    NumFormat.toInt(line(7)),
    NumFormat.toInt(line(8)),
    NumFormat.toDouble(line(9)),
    NumFormat.toDouble(line(10)),
    line(11),
    line(12),
    line(13),
    line(14),
    line(15),
    line(16),
    NumFormat.toInt(line(17)),
    line(18),
    line(19),
    NumFormat.toInt(line(20)),
    NumFormat.toInt(line(21)),
    line(22),
    line(23),
    line(24),
    line(25),
    NumFormat.toInt(line(26)),
    line(27),
    NumFormat.toInt(line(28)),
    line(29),
    NumFormat.toInt(line(30)),
    NumFormat.toInt(line(31)),
    NumFormat.toInt(line(32)),
    line(33),
    NumFormat.toInt(line(34)),
    NumFormat.toInt(line(35)),
    NumFormat.toInt(line(36)),
    line(37),
    NumFormat.toInt(line(38)),
    NumFormat.toInt(line(39)),
    NumFormat.toDouble(line(40)),
    NumFormat.toDouble(line(41)),
    NumFormat.toInt(line(42)),
    line(43),
    NumFormat.toDouble(line(44)),
    NumFormat.toDouble(line(45)),
    line(46),
    line(47),
    line(48),
    line(49),
    line(50),
    line(51),
    line(52),
    line(53),
    line(54),
    line(55),
    line(56),
    NumFormat.toInt(line(57)),
    NumFormat.toDouble(line(58)),
    NumFormat.toInt(line(59)),
    NumFormat.toInt(line(60)),
    line(61),
    line(62),
    line(63),
    line(64),
    line(65),
    line(66),
    line(67),
    line(68),
    line(69),
    line(70),
    line(71),
    line(72),
    NumFormat.toInt(line(73)),
    NumFormat.toDouble(line(74)),
    NumFormat.toDouble(line(75)),
    NumFormat.toDouble(line(76)),
    NumFormat.toDouble(line(77)),
    NumFormat.toDouble(line(78)),
    line(79),
    line(80),
    line(81),
    line(82),
    line(83),
    NumFormat.toInt(line(84))
  )

}
