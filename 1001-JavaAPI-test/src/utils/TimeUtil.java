/**
 * 版权所有 (c) 2019，中金支付有限公司
 */
package utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/8/28       Create
 * </pre>
 */

    public class TimeUtil {
        public static final String PATTERN_DATE8 = "yyyyMMdd";
        public static final String PATTERN_DATE8_2 = "yyyy-MM-dd";
        public static final String PATTERN_DATE12 = "yyyyMMddHHmm";
        public static final String PATTERN_DATE12_2 = "yyyy-MM-dd HH:mm";
        public static final String PATTERN_TIME6 = "HHmmss";
        public static final String PATTERN_TIME14 = "yyyyMMddHHmmss";
        public static final String PATTERN_TIME14_2 = "yyyy-MM-dd HH:mm:ss";
        public static final String PATTERN_TIME14_3 = "yyyyMMdd HH:mm:ss";
        public static final String PATTERN_TIME17 = "yyyyMMddHHmmssSSS";

        public TimeUtil() {
        }

        public static String getFormattedDate(Date date) {
            if (date == null) {
                return null;
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                return sdf.format(date);
            }
        }

        public static String getFormattedLastMonth() {
            Calendar c = Calendar.getInstance();
            c.add(2, -1);
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM");
            String time = format.format(c.getTime());
            return time;
        }

        public static String getFormattedTime(Date date) {
            if (date == null) {
                return "";
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                return sdf.format(date);
            }
        }

        public static String getFormattedTime2(Date date) {
            if (date == null) {
                return "";
            } else {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
                return sdf.format(date);
            }
        }

        public static String getFormattedDate(Date date, String pattern) {
            SimpleDateFormat sdf = new SimpleDateFormat(pattern);
            return sdf.format(date);
        }

        public static String getTimeStamp() {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            return sdf.format(date);
        }

        public static String getTimeStamp2() {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
            return sdf.format(date);
        }

        public static String getMinuteStamp() {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
            return sdf.format(date);
        }

        public static String getDateStamp() {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            return sdf.format(date);
        }

        public static String getDateStamp(int time) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, 0 - time);
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            return sdf.format(date);
        }

        public static String getCurrentDate() {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(date);
        }

        public static String getCurrentTime() {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return sdf.format(date);
        }

        public static String getMonthStamp() {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
            return sdf.format(date);
        }

        public static int getDays(int year, int month) {
            int days = 30;
            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 2:
                    if ((year % 4 != 0 || year % 100 == 0) && year % 400 != 0) {
                        days = 28;
                    } else {
                        days = 29;
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
            }

            return days;
        }

        /*public static boolean isValidDate(String dateString, String dateFormatPattern) {
            if (!StringUtils.isEmpty(dateString) && !StringUtils.isEmpty(dateFormatPattern)) {
                if (dateString.length() != dateFormatPattern.length()) {
                    return false;
                } else {
                    Date validDate = null;

                    try {
                        SimpleDateFormat sdf = new SimpleDateFormat(dateFormatPattern);
                        sdf.setLenient(false);
                        validDate = sdf.parse(dateString);
                    } catch (ParseException var4) {
                        ;
                    }

                    return validDate != null;
                }
            } else {
                return false;
            }
        }*/

        public static Date string2Date(String date, String format) throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);

            try {
                return simpleDateFormat.parse(date);
            } catch (ParseException var4) {
                throw var4;
            }
        }

        public static String date2String(Date date, String format) {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            return sdf.format(date);
        }

        public static Date getNowTime() {
            return Calendar.getInstance().getTime();
        }

        public static long getNowTimeInMillis() {
            return Calendar.getInstance().getTimeInMillis();
        }

        public static String getTimeMillisecondStamp() {
            Calendar calendar = Calendar.getInstance();
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            return sdf.format(date);
        }

        public static String getTimeMillisecondStamp(int days) {
            Calendar calendar = Calendar.getInstance();
            calendar.add(5, days);
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            return sdf.format(date);
        }

        public static String transformTime(String date, String sourceFormat, String destFormat) throws Exception {
            SimpleDateFormat sdfSource = new SimpleDateFormat(sourceFormat);
            sdfSource.setLenient(false);
            Date dateSource = sdfSource.parse(date);
            SimpleDateFormat sdfDest = new SimpleDateFormat(destFormat);
            return sdfDest.format(dateSource);
        }

        public static Timestamp stringToTimestamp(String datetime) throws ParseException {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
            Timestamp ts = new Timestamp(formatter.parse(datetime).getTime());
            return ts;
        }

        public static String addDays(int days) {
            String fromTime = "";
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(5, days);
            Date date = calendar.getTime();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            fromTime = sdf.format(date);
            return fromTime;
        }

        public static Date addDays(Date date, int days) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.add(5, days);
            return calendar.getTime();
        }

        public static String addDays(String dateStr, int days) throws ParseException {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
            sdf.setLenient(false);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sdf.parse(dateStr));
            calendar.add(5, days);
            return sdf.format(calendar.getTime());
        }

        public static String addHours(String timeStr, int hours) throws ParseException {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            sdf.setLenient(false);
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(sdf.parse(timeStr));
            calendar.add(10, hours);
            return sdf.format(calendar.getTime());
        }

        public static String imsubDays(Date date, int days, String dftStr) throws ParseException {
            SimpleDateFormat dft = new SimpleDateFormat(dftStr);
            Calendar beginDate = Calendar.getInstance();
            beginDate.setTime(date);
            beginDate.set(5, beginDate.get(5) - days);

            Date endDate;
            try {
                endDate = dft.parse(dft.format(beginDate.getTime()));
            } catch (ParseException var7) {
                throw var7;
            }

            String endDateStr = date2String(endDate, dftStr);
            return endDateStr;
        }

        public static boolean isAfter(String time1, String time2, String pattern) throws ParseException {
            Date date1 = string2Date(time1, pattern);
            Date date2 = string2Date(time2, pattern);
            long tim1 = date1.getTime();
            long tim2 = date2.getTime();
            return tim1 > tim2;
        }

        public static long nextHourDelay(int offset) {
            Calendar calendar = Calendar.getInstance();
            long currTime = calendar.getTimeInMillis();
            int hour = calendar.get(11);
            calendar.set(11, hour + offset);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            long nextHourTime = calendar.getTimeInMillis();
            return nextHourTime - currTime;
        }

        public static long getDatePoor(Date nowDate, Date endDate) {
            long nd = 86400000L;
            long diff = endDate.getTime() - nowDate.getTime();
            long day = diff / nd;
            return day;
        }

        public static String getLastDayOfMonth(String month) {
            Calendar cal = Calendar.getInstance();
            cal.set(1, Integer.valueOf(month.substring(0, 4)));
            cal.set(2, Integer.valueOf(month.substring(4)) - 1);
            cal.set(5, 1);
            cal.add(2, 1);
            cal.add(5, -1);
            return (new SimpleDateFormat("yyyyMMdd")).format(cal.getTime());
        }

        public static String getFirstDayOfMonth(String date) {
            String s = date.substring(0, 6) + "01";
            return s;
        }

        public static String getBeforeDay(String date) {
            Calendar cal = Calendar.getInstance();
            cal.set(1, Integer.valueOf(date.substring(0, 4)));
            cal.set(2, Integer.valueOf(date.substring(4, 6)) - 1);
            cal.set(5, Integer.valueOf(date.substring(6)));
            cal.add(5, -1);
            return (new SimpleDateFormat("yyyyMMdd")).format(cal.getTime());
        }

        public static int getDayNumberByMonth(String month) {
            Calendar cal = Calendar.getInstance();
            cal.set(1, Integer.valueOf(month.substring(0, 4)));
            cal.set(2, Integer.valueOf(month.substring(4)) - 1);
            int dayNumber = cal.getActualMaximum(5);
            return dayNumber;
        }

        public static String getNextDayTime(String date) {
            Calendar cal = Calendar.getInstance();
            cal.set(1, Integer.valueOf(date.substring(0, 4)));
            cal.set(2, Integer.valueOf(date.substring(4, 6)) - 1);
            cal.set(5, Integer.valueOf(date.substring(6)));
            cal.add(5, 1);
            String s = (new SimpleDateFormat("yyyyMMdd")).format(cal.getTime());
            return s + "000000000";
        }

        public static String getNextDayTimeMinute(String date) {
            Calendar cal = Calendar.getInstance();
            cal.set(1, Integer.valueOf(date.substring(0, 4)));
            cal.set(2, Integer.valueOf(date.substring(4, 6)) - 1);
            cal.set(5, Integer.valueOf(date.substring(6)));
            cal.add(5, 1);
            return (new SimpleDateFormat("yyyyMMdd")).format(cal.getTime()) + "0000";
        }

        public static String beforeMonthLastDay() {
            Calendar calendar = Calendar.getInstance();
            int month = calendar.get(2);
            calendar.set(2, month - 1);
            calendar.set(5, calendar.getActualMaximum(5));
            Date strDateTo = calendar.getTime();
            String s = (new SimpleDateFormat("yyyyMMdd")).format(strDateTo);
            return s;
        }

        public static String nextMonthFirstDayTime(String date) {
            Calendar cal = Calendar.getInstance();
            cal.set(1, Integer.valueOf(date.substring(0, 4)));
            cal.set(2, Integer.valueOf(date.substring(4, 6)));
            cal.set(5, 1);
            String s = (new SimpleDateFormat("yyyyMMdd")).format(cal.getTime());
            return s + "000000000";
        }
}
