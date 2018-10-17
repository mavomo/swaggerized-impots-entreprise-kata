package fr.soat.cleancoders.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxCalculatorAPI {

    private TaxCalculatorService calculatorService;

    public TaxCalculatorAPI(TaxCalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @RequestMapping(value = "/")
    public String getStatus() {
        return calculatorService.getStatus();
    }

    @RequestMapping(value = "/taxes", method = RequestMethod.GET)
    public Double computeCompanyTax(@RequestParam(value = "siretNumber", defaultValue = "") String siretNumber,
                                    @RequestParam(value = "denomination", defaultValue = "") String denomination) {
        return calculatorService.computeTax(siretNumber, denomination);
    }
}
