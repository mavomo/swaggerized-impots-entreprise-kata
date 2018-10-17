package fr.soat.cleancoders.api;

import org.springframework.stereotype.Service;

@Service
class TaxCalculatorService {

    public Double computeTax(String siretNumber, String denomination) {
        throw new UnsupportedOperationException();
    }

    public String getStatus() {
        return "Tax calculator : OK";
    }
}
