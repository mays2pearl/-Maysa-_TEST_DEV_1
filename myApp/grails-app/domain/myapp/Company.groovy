package myapp

class Company {

    String name
    String segment
    Stock stock

    static constraints = {
        name maxSize: 255
        segment inList: ['vehicles', 'clothing', 'technology']

    }
}
