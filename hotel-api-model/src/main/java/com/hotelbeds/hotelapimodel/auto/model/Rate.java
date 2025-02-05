/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelapimodel.auto.model;

/*
 * #%L
 * HotelAPI Model
 * %%
 * Copyright (C) 2015 - 2018 HOTELBEDS GROUP, S.L.U.
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation, either version 2.1 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU General Lesser Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/lgpl-2.1.html>.
 * #L%
 */


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.hotelbeds.hotelapimodel.auto.common.SimpleTypes.PaymentType;
import com.hotelbeds.hotelapimodel.auto.convert.json.RateSerializer;
import com.hotelbeds.hotelapimodel.auto.model.CancellationPolicy;
import com.hotelbeds.hotelapimodel.auto.model.DailyRate;
import com.hotelbeds.hotelapimodel.auto.model.Offer;
import com.hotelbeds.hotelapimodel.auto.model.Promotion;
import com.hotelbeds.hotelapimodel.auto.model.ShiftRate;
import com.hotelbeds.hotelapimodel.auto.model.Taxes;
import com.hotelbeds.hotelapimodel.auto.model.VoucherComment;
import java.math.BigDecimal;
import java.util.List;
import javax.validation.Valid;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@XmlAccessorType(XmlAccessType.FIELD)
@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class Rate extends BasicRate {

    @XmlAttribute
    private String rateCommentsId;
    @XmlAttribute
    private String rateComments;
    @XmlElementWrapper(name = "voucherComments")
    @XmlElement(name = "comment")
    private List<VoucherComment> voucherComments;
    @XmlAttribute
    private PaymentType paymentType;
    @XmlAttribute
    private Boolean packaging;
    @XmlAttribute
    private String boardCode;
    @XmlAttribute
    private String boardName;
    @XmlElementWrapper(name = "cancellationPolicies")
    @XmlElement(name = "cancellationPolicies")
    @JsonProperty("cancellationPolicies")
    private List<CancellationPolicy> cancellationPolicies;
    @XmlElement(name = "taxes")
    private Taxes taxes;
    @XmlElement
    private RateBreakDown rateBreakDown;
    @XmlAttribute
    private Integer rooms;
    @XmlAttribute
    private Integer adults;
    @XmlAttribute
    private Integer children;
    @XmlAttribute
    private String childrenAges;
    @XmlElementWrapper(name = "promotions")
    @XmlElement(name = "promotion")
    private List<Promotion> promotions;
    @XmlElementWrapper(name = "offers")
    @XmlElement(name = "offer")
    private List<Offer> offers;
    @XmlElementWrapper(name = "shifts")
    @XmlElement(name = "shiftRate")
    @Valid
    private List<ShiftRate> shiftRates;
    @XmlAttribute
    @JsonSerialize(using = RateSerializer.class)
    private BigDecimal rateup;
    @XmlElementWrapper(name = "dailyRates")
    @XmlElement(name = "dailyRates")
    @JsonProperty("dailyRates")
    private List<DailyRate> dailyRates;


}
