package com.example.SpringCore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductMypriceRequestDto {
    // 관심상품 최저가 업데이트 요청 DTO 전달
    private int myprice;
}
