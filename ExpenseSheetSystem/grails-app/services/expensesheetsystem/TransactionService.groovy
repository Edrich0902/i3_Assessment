package expensesheetsystem

import grails.transaction.Transactional
import groovy.json.JsonSlurper

@Transactional
class TransactionService {

    private setting
    def grailsApplication
    
    void afterPropertiesSet()
    {
        setting = grailsApplication.config.setting
    }
    
    def serviceMethod(){}
    
    def convertCurrency(def value)
    {
        def access_key = "365d39cc24b379c315449e4ec1125d42"
        def urlString = "http://data.fixer.io/api/latest?access_key=${access_key}&symbols=ZAR,USD"
        
        def result = new URL(urlString).text
        def slurper = new JsonSlurper()
        def data = slurper.parseText(result)

        def conv = data.rates["USD"]/data.rates["ZAR"]
        def dollar = value*conv
        
        dollar.round(2)
    }
}
