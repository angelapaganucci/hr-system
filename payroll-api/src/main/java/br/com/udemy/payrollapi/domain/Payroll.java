package br.com.udemy.payrollapi.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class Payroll {

    private String workerName;
    private String description;
    private BigDecimal hourlyPrice;
    private BigDecimal workedHours;
    private BigDecimal totalPayment;
}
