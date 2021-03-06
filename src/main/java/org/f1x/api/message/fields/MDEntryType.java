/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.f1x.api.message.fields;

// Generated by org.f1x.tools.DictionaryGenerator from QuickFIX dictionary
public enum MDEntryType implements org.f1x.api.message.types.ByteEnum {
	BID((byte)'0'),
	OFFER((byte)'1'),
	TRADE((byte)'2'),
	INDEX_VALUE((byte)'3'),
	OPENING_PRICE((byte)'4'),
	CLOSING_PRICE((byte)'5'),
	SETTLEMENT_PRICE((byte)'6'),
	TRADING_SESSION_HIGH_PRICE((byte)'7'),
	TRADING_SESSION_LOW_PRICE((byte)'8'),
	TRADING_SESSION_VWAP_PRICE((byte)'9'),
	IMBALANCE((byte)'A'),
	TRADE_VOLUME((byte)'B'),
	OPEN_INTEREST((byte)'C');

	private final byte code;

	MDEntryType (byte code) {
		this.code  = code;
	}

	public byte getCode() { return code; }

	public static MDEntryType parse(String s) {
		switch(s) {
			case "0" : return BID;
			case "1" : return OFFER;
			case "2" : return TRADE;
			case "3" : return INDEX_VALUE;
			case "4" : return OPENING_PRICE;
			case "5" : return CLOSING_PRICE;
			case "6" : return SETTLEMENT_PRICE;
			case "7" : return TRADING_SESSION_HIGH_PRICE;
			case "8" : return TRADING_SESSION_LOW_PRICE;
			case "9" : return TRADING_SESSION_VWAP_PRICE;
			case "A" : return IMBALANCE;
			case "B" : return TRADE_VOLUME;
			case "C" : return OPEN_INTEREST;
		}
		return null;
	}

}