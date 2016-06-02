package ii_collections

fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    // Return the set of customers who ordered the specified product
    //todoCollectionTask()
    return this.customers.filter { cu -> cu.orders.filter { it.products.contains(product)}.size > 0}.toSet()
}

fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    // Return the most expensive product among all delivered products
    // (use the Order.isDelivered flag)
    //todoCollectionTask()
    return this.orders.filter { it.isDelivered }.map { it.products.maxBy { it.price } }.sortedBy { it!!.price }.last()
}

fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    // Return the number of times the given product was ordered.
    // Note: a customer may order the same product for several times.
    //todoCollectionTask()
    val custs = this.customers.filter { it.orders.filter {it.products.contains(product)}.size > 0}
    return custs.fold(0) { acc , cust ->
        acc + cust.orders.map { it.products.count { it == product } }.sum()
    }
}
