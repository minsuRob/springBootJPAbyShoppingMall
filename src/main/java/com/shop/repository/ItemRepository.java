package com.shop.repository;

import com.shop.constant.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findItemNmOrDetail(String itemNm, String itemDetail);
}
