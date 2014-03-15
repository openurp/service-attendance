package org.openurp.service.attendance.device.util

import java.text.SimpleDateFormat
import java.util.Date

object DateFormatUtils {

  val dateFormat = new SimpleDateFormat("yyyyMMdd");
  val timeFormat = new SimpleDateFormat("HHmmss");

  /** 将日期类型转为"yyyyMMdd"
   *
   *  @param date
   *  @return
   */
  def toDate(date: Date = new Date()): String = {
    return dateFormat.format(date);
  }

  /** 将时间类型转为“HHssmm”
   *
   *  @param date
   *  @return
   */
  def toTime(date: Date = new Date()): String = {
    if (date == null) null
    else timeFormat.format(date);
  }

}