package com.udacity.stockhawk.data;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatUtils {

    public static DecimalFormat getDollarFormatter() {
        final DecimalFormat dollarFormat;
        dollarFormat = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US);
        return dollarFormat;
    }

    public static DecimalFormat getDollarWithPlusFormatter() {
        final DecimalFormat dollarFormatWithPlus;
        dollarFormatWithPlus = (DecimalFormat) NumberFormat.getCurrencyInstance(Locale.US);
        dollarFormatWithPlus.setPositivePrefix("+$");
        return dollarFormatWithPlus;
    }

    public static DecimalFormat getPercentageFormatter() {
        final DecimalFormat percentageFormat;
        percentageFormat = (DecimalFormat) NumberFormat.getPercentInstance(Locale.getDefault());
        percentageFormat.setMaximumFractionDigits(2);
        percentageFormat.setMinimumFractionDigits(2);
        percentageFormat.setPositivePrefix("+");
        return percentageFormat;
    }


}
