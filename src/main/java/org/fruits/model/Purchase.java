package org.fruits.model;

import java.time.LocalDateTime;
import java.util.List;

public class Purchase {

    private Long id;

    private LocalDateTime dateTime;

    private List<PurchasedItem> purchasedItems;
}
