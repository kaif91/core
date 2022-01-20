package com.developer.estore.core.events;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductReservedEvent {

	private final String productId;
	private final String orderId;
	private final int quantity;
	private final String userId;
}
