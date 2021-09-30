package com.oci.currencyexchangeservice;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CurrencyExchangeRate
{
    private Long id;

    private String from, to;

    private BigDecimal conversionMultiple;

    private String environment;
}
