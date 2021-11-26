package myapp

import groovy.transform.CompileStatic

@CompileStatic
class BootStrap {

    StockService stockService
    CompanyService companyService
    def init = { servletContext ->

        Stock roupa = stockService.save('Roupa' as Company)
        Stock carro = stockService.save('Carro' as Company)
        Stock alimento = stockService.save('Alimento' as Company)

        companyService.save('MModas', roupa)
        companyService.save('CarFirst', carro)
        companyService.save('DoceLanche', alimento)
    }
    def destroy = {
    }
}