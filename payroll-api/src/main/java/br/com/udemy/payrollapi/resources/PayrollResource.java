package br.com.udemy.payrollapi.resources;

import br.com.udemy.payrollapi.domain.Payroll;
import br.com.udemy.payrollapi.services.PayrollService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/payments")
public class PayrollResource {

    private final PayrollService payrollService;

    @GetMapping(value = "/{workerId}")
    public ResponseEntity<Payroll> getPayment(@PathVariable Long workerId, @RequestBody Payroll payment) {
        return ResponseEntity.ok().body(payrollService.getPayment(workerId, payment));
    }
}
