package com.emissor.nfe310.transformers;

import java.text.SimpleDateFormat;
import org.joda.time.LocalDate;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.simpleframework.xml.transform.Transform;

class NFLocalDateTransformer implements Transform<LocalDate> {

    private static final DateTimeFormatter DATETIME_FORMATTER = DateTimeFormat.forPattern("yyyy-MM-dd");
    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public LocalDate read(final String data) throws Exception {

        String data1 = sdf.format(sdf.parse(data));

        return LocalDate.parse(data1, NFLocalDateTransformer.DATETIME_FORMATTER);
    }

    @Override
    public String write(final LocalDate data) throws Exception {
        return NFLocalDateTransformer.DATETIME_FORMATTER.print(data);
    }
}
