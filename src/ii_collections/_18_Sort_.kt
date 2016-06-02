package ii_collections

fun example5() {
    val result = listOf("a", "bbb", "cc").sortedBy { it.length }

    result == listOf("a", "cc", "bbb")
}

fun Shop.getCustomersSortedByNumberOfOrders(): List<Customer> {
    // Return a list of customers, sorted by the ascending number of orders they made
    //todoCollectionTask()
    val p = this.customers.map { Pair(it, it.orders.size) }
    return p.sortedBy { it.second }.map { it.first }
}
