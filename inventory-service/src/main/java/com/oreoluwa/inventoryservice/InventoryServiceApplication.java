package com.oreoluwa.inventoryservice;

import com.oreoluwa.inventoryservice.Entities.Inventory;
import com.oreoluwa.inventoryservice.Repositories.InventoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args -> {
			Inventory inventory = new Inventory();
			inventory.setSkuCode("iphone_12");
			inventory.setQuantity(122L);

			Inventory inventory1 = new Inventory();
			inventory.setSkuCode("iphone_12_blue");
			inventory.setQuantity(0L);

			Inventory inventory2 = new Inventory();
			inventory.setSkuCode("iphone_14_red");
			inventory.setQuantity(33L);

			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);
			inventoryRepository.save(inventory2);
		};
	}
}
