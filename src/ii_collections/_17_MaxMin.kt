package ii_collections

fun example4() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "b").maxBy { it.length }
}

fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    // Return a customer whose order count is the highest among all customers
    // todoCollectionTask()
    return this.customers.maxBy { cust -> cust.orders.size }
}

fun Customer.getMostExpensiveOrderedProduct(): Product? {
    // Return the most expensive product which has been ordered
    // todoCollectionTask()
    return this.orders.map { it.products.maxBy { it.price } }.sortedBy { it!!.price }.first()
}
