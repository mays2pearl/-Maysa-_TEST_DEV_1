package myapp

class Stock {

    Double price
    Double priceDate

    String name

    static belongsTo = [company: Company]
    static constraints = {
        price min: 0.0
        priceDate min:0.0
    }
}
