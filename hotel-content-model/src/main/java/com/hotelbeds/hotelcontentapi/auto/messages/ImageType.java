/**
 * Autogenerated code by SdkModelGenerator.
 * Do not edit. Any modification on this file will be removed automatically after project build
 *
 */
package com.hotelbeds.hotelcontentapi.auto.messages;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.hotelbeds.hotelcontentapi.auto.messages.Content;

import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.Data;

@JsonInclude(Include.NON_NULL)
@ToString
@NoArgsConstructor
@Data
public class ImageType {

	private String code;
	private Content description;


}