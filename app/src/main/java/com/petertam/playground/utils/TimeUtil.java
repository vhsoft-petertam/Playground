package com.petertam.playground.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class TimeUtil {
    private static final String TIME_ZONE_GMT = "GMT";
    private static final String DB_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss";
    private static final String DISPLAY_DATE_TIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    private static final String DISPLAY_DATE_FORMAT = "dd/MM/yyyy";
    private static final String DISPLAY_TIME_FORMAT = "HH:mm";
    
    private static final Locale Locale_UK = Locale.UK;
    
    public static String DateTimeNowDbFormat() {
        final SimpleDateFormat sdf = new SimpleDateFormat(DB_DATE_TIME_FORMAT, Locale_UK);
        sdf.setTimeZone(TimeZone.getTimeZone(TIME_ZONE_GMT));

        return sdf.format(new Date());
    }
    
    public static String GetGmtDateTimeFromLocalTime(Calendar locCal) {
        SimpleDateFormat sdf = new SimpleDateFormat(DB_DATE_TIME_FORMAT, Locale_UK);
        Date locDate = locCal.getTime();
        TimeZone locTimeZone = locCal.getTimeZone();
        long msFromEpochGmt = locDate.getTime();
        int offsetFromGMT = locTimeZone.getOffset(msFromEpochGmt);

        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE_GMT));
        gmtCal.setTime(locDate);
        gmtCal.add(Calendar.MILLISECOND, -offsetFromGMT);

        return sdf.format(gmtCal.getTime());
    }
    
    public static Date GetGmtDateFromLocalTime(Calendar locCal) {
        Date locDate = locCal.getTime();
        TimeZone locTimeZone = locCal.getTimeZone();
        long msFromEpochGmt = locDate.getTime();
        int offsetFromGMT = locTimeZone.getOffset(msFromEpochGmt);

        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE_GMT));
        gmtCal.setTime(locDate);
        gmtCal.add(Calendar.MILLISECOND, -offsetFromGMT);

        return gmtCal.getTime();
    }
    
    public static String GetLocalDateTimeFromGmt(String gmtDateTime) {
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(DB_DATE_TIME_FORMAT, Locale_UK);
            Date date = sdf.parse(gmtDateTime);
            Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE_GMT));
            gmtCal.setTime(date);
            TimeZone tz = Calendar.getInstance().getTimeZone();
            long msFromEpochGmt = date.getTime();
            int offsetFromGMT = tz.getOffset(msFromEpochGmt);
            gmtCal.add(Calendar.MILLISECOND, offsetFromGMT);
            return sdf.format(gmtCal.getTime());
        }catch(ParseException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static String GetDisplayLocalDateFromGmt(String gmtDateTime) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(DB_DATE_TIME_FORMAT, Locale_UK);
            SimpleDateFormat displaySdf = new SimpleDateFormat(DISPLAY_DATE_FORMAT, Locale_UK);
            Date date = sdf.parse(gmtDateTime);
            
            Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE_GMT));
            gmtCal.setTime(date);
            TimeZone tz = Calendar.getInstance().getTimeZone();
            long msFromEpochGmt = date.getTime();
            int offsetFromGMT = tz.getOffset(msFromEpochGmt);
            gmtCal.add(Calendar.MILLISECOND, offsetFromGMT);
            return displaySdf.format(gmtCal.getTime());
            
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    public static String GetDisplayLocalDateTimeFromGmt(String gmtDateTime){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(DB_DATE_TIME_FORMAT, Locale_UK);
            SimpleDateFormat sdfc = new SimpleDateFormat(DISPLAY_DATE_TIME_FORMAT, Locale_UK);
            Date date = sdf.parse(gmtDateTime);
            Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone(TIME_ZONE_GMT));
            
            gmtCal.setTime(date);
            TimeZone tz = Calendar.getInstance().getTimeZone();
            long msFromEpochGmt = date.getTime();
            int offsetFromGMT = tz.getOffset(msFromEpochGmt);
            gmtCal.add(Calendar.MILLISECOND, offsetFromGMT);
            return sdfc.format(gmtCal.getTime());
        } catch (ParseException e){
            e.printStackTrace();
        }
        return null;
    }
    
    public static String getDateString(String datetime){
        return datetime.substring(0, datetime.indexOf('T'));
    }
        
    public static String getTimeString(String datetime){
        return datetime.substring(datetime.indexOf('T') + 1); 
    }
    
    public static boolean IsDateAfter(String checkDate,String baseDate) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(DB_DATE_TIME_FORMAT, Locale.ENGLISH);
        Date date1 = simpleDateFormat.parse(baseDate);
        Date date2 = simpleDateFormat.parse(checkDate);
        if(date2.after(date1))
            return true;
        else
            return false;
    }
    
    public static boolean isToday(String dateTime){
        String date = getDateString(dateTime);
        return DateTimeNowDbFormat().contains(date);
    }

    public static String getDisplayDayTimeNow(){
        String localTime = GetDisplayLocalDateTimeFromGmt(DateTimeNowDbFormat());
        return localTime.replace('T', ' ');
    }
    
    public static String getDisplayTimeNow(){
        String localTime = GetDisplayLocalDateTimeFromGmt(DateTimeNowDbFormat());
        return localTime.substring(localTime.indexOf(' ') + 1);
    }
    
    public static Calendar getCalendarDateFromDateString(String dateString){
        try {
            final SimpleDateFormat sdf = new SimpleDateFormat(DISPLAY_DATE_TIME_FORMAT, Locale_UK);
            Date parseDate = sdf.parse(dateString);
            Calendar c = Calendar.getInstance();
            c.setTime(parseDate);
            return c;
        } catch (ParseException e) {
            e.printStackTrace();
            Calendar c = Calendar.getInstance();
            return c;
        }
    }
    
    public static double getOffset(){
        TimeZone timezone = TimeZone.getDefault();
        int seconds = timezone.getOffset(Calendar.ZONE_OFFSET)/1000;
        double minutes = seconds/60;
        double hours = minutes/60;
        return hours;
    }
    
}
