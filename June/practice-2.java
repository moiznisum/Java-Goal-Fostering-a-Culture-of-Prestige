@Transactional(rollbackFor = Exception.class)
public void processOrder(Order order) throws Exception {
    // some logic
    if(order.getItems().isEmpty()) throw new Exception("No items");
}
