package org.gucardev.mixed.relationship_cases.e_commerce.mapper;

import org.gucardev.mixed.relationship_cases.e_commerce.dto.MerchantDTO;
import org.gucardev.mixed.relationship_cases.e_commerce.entitiy.Merchant;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface MerchantMapper {

    @Mapping(target = "products", ignore = true)
    MerchantDTO toDtoWithoutProducts(Merchant merchant);

    @Mapping(target = "products", qualifiedByName = "toDtoIgnoreMerchant")
    MerchantDTO toDto(Merchant merchant);
}