package com.oci.currencyexchangeservice;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("currency-exchange")
public class CurrencyExchangeController
{
    private Environment environment;

    @GetMapping("from/{from}/to/{to}")
    public CurrencyExchangeRate getExchangeRate(@PathVariable String from, @PathVariable String to)
    {
        final var port = environment.getProperty("local.server.port");
        return new CurrencyExchangeRate(1l, from, to, BigDecimal.valueOf(8.75), port);
    }
}
