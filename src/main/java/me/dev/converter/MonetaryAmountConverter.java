package me.dev.converter;

import me.dev.advenced.MonetaryAmount;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter(autoApply = true)
public class MonetaryAmountConverter
            implements AttributeConverter<MonetaryAmount, String> {
        @Override
        public String convertToDatabaseColumn(MonetaryAmount monetaryAmount) {
            return monetaryAmount.toString();
        }
        @Override
        public MonetaryAmount convertToEntityAttribute(String s) {
            return MonetaryAmount.fromString(s);
        }
    }

