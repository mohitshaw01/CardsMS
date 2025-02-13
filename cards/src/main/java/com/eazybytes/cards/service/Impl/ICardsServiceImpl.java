package com.eazybytes.cards.service.Impl;

import com.eazybytes.cards.dto.CardsDto;
import com.eazybytes.cards.service.ICardsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ICardsServiceImpl implements ICardsService {
    @Override
    public void createCard(String mobileNumber) {

    }

    @Override
    public CardsDto fetchCard(String mobileNumber) {
        return null;
    }

    @Override
    public boolean updateCard(CardsDto cardsDto) {
        return false;
    }

    @Override
    public boolean deleteCard(String mobileNumber) {
        return false;
    }
}
