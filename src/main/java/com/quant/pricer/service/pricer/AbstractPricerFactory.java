package com.quant.pricer.service.pricer;

import com.quant.pricer.common.input.CalculationInput;
import com.quant.pricer.common.input.ExoticEvent;
import com.quant.pricer.common.input.ExoticEventType;
import com.quant.pricer.common.input.ObservationType;
import com.quant.pricer.common.output.ArrayOfPriceOutput;
import com.quant.pricer.common.output.CalculationOutput;
import com.quant.pricer.common.output.PriceOutput;

import java.math.BigDecimal;

public abstract class AbstractPricerFactory {

    public static final boolean USE_DIVIDEND = false;

    public CalculationOutput calculate(CalculationInput input) throws Exception {

        //input field값으로 output field값을 채운다.
        CalculationOutput output = new CalculationOutput();
        output.setId(input.getId());
        output.setInsId(input.getInsId());

        //input field값으로 priceOutput filed값을 채운다.
        PriceOutput priceOutput = new PriceOutput();
        priceOutput.setCurrency(input.getInstrument().getUnitAmount().getCurrency());
        priceOutput.setUnitEvalAmount(input.getInstrument().getUnitAmount().getValue());
        priceOutput.setValue(BigDecimal.valueOf(1));

        //ArrayOfPriceOutput 생성 뒤, getPrice 메서드 호출. 프로퍼티(price)에 새로운 List<PriceOutput)할당
        //다음 전 코드에서 생성한 priceOutput을 price 필드(list)에 넣는다.
        ArrayOfPriceOutput arrayOfPriceOutput = new ArrayOfPriceOutput();
        arrayOfPriceOutput.getPrice().add(priceOutput);

        //calculate 메서드가 overriding이 되지 않았을 때, ErrorMessage property를 set한다.
        output.setPrices(arrayOfPriceOutput);
        output.setErrorMessage(String.format("There is no %s Pricer", input.getPricer().getId()));

        return output;

    }

    //barrier optioon type을 String으로 return
    public String getBarrierOptionType(ExoticEvent exoticEvent) {
        if (exoticEvent.getType() == ExoticEventType.KNOCK_OUT_BARRIER) {
            if (exoticEvent.getObservationType() == ObservationType.EQUAL_OR_GREATER ||
                    exoticEvent.getObservationType() == ObservationType.GREATER)
                return "UO";
            else
                return "UI";
        }
        else if(exoticEvent.getType() == ExoticEventType.KNOCK_IN_BARRIER){
            if(exoticEvent.getObservationType() == ObservationType.EQUAL_OR_GREATER ||
                    exoticEvent.getObservationType() == ObservationType.GREATER)
                return "DI";
            else
                return "DO";
        }

        return "None";

    }
}
