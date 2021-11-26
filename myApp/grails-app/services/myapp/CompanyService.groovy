package myapp

import grails.gorm.services.Service

@Service(Company)
interface CompanyService {

    Company get(Serializable id)

    List<Company> list(Map args)

    Long count()


    void save(String, Stock stock)

    Company save(Company company)
}