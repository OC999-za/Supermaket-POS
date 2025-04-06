# Supermaket-POS
This serves as a personal assessment based on OOP Concepts. I envision the Point-Of-Sale System and the door Security Product Scanners working this way: The door Security Product Scanners trigger an alarm only if a product passes through without having been paid for(or successfully passing through the POS).

Product(Object 1) passes through the POS(Object2), if the product has been paid for successfully, it changes state(attribute paid changes from false to true). When Object 1 passes through the Anti Theft Scanners/Door Security Product Scanners(Object 3), an alarm won't be triggered because the Product.hasbeenPaid for is true. If that wasn't the case(if Product.hasbeenPaid for is false), that would trigger an alarm, and RIP to the consumer.
