package net.jarlehansen.protobuf.javame.examples.generated;
// Generated by proto2javame, Thu Feb 17 21:50:35 CET 2011.

import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.input.DelimitedInputStream;
import net.jarlehansen.protobuf.javame.input.DelimitedSizeUtil;
import net.jarlehansen.protobuf.javame.ComputeSizeUtil;
import net.jarlehansen.protobuf.javame.output.OutputWriter;
import net.jarlehansen.protobuf.javame.AbstractOutputWriter;
import net.jarlehansen.protobuf.javame.input.taghandler.UnknownTagHandler;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;

public final class Address extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final String street;
	private static final int fieldNumberStreet = 1;

	private final String state;
	private static final int fieldNumberState = 2;
	private final boolean hasState;


	public static Builder newBuilder() {
		return new Builder();
	}

	private Address(final Builder builder) {
		if (builder.hasStreet ) {
			this.street = builder.street;
			this.state = builder.state;
			this.hasState = builder.hasState;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" street:" + builder.hasStreet + "");
		}
	}

	public static class Builder {
		private String street;
		private boolean hasStreet = false;

		private String state;
		private boolean hasState = false;


		private Builder() {
		}

		public Builder setStreet(final String street) {
			this.street = street;
			this.hasStreet = true;
			return this;
		}

		public Builder setState(final String state) {
			this.state = state;
			this.hasState = true;
			return this;
		}

		public Address build() {
			return new Address(this);
		}
	}

	public String getStreet() {
		return street;
	}

	public String getState() {
		return state;
	}

	public boolean hasState() {
		return hasState;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "street = " + this.street + TAB;
		if(hasState) retValue += "state = " + this.state + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberStreet, street);
		if(hasState) totalSize += ComputeSizeUtil.computeStringSize(fieldNumberState, state);
		totalSize += computeNestedMessageSize();

		return totalSize;
	}

	private int computeNestedMessageSize() {
		int messageSize = 0;

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		writer.writeString(fieldNumberStreet, street);
		if(hasState) writer.writeString(fieldNumberState, state);
		writer.writeData();
	}

	static Address parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final Address.Builder builder = Address.newBuilder();

		while (nextFieldNumber > 0) {
			populateBuilderWithField(reader, builder, nextFieldNumber);
			nextFieldNumber = getNextFieldNumber(reader);
		}

		return builder.build();
	}
	static int getNextFieldNumber(final InputReader reader) throws IOException {
		return reader.getNextFieldNumber();
	}

	static boolean populateBuilderWithField(final InputReader reader, final Builder builder, final int fieldNumber) throws IOException {
		boolean fieldFound = true;
		switch (fieldNumber) {
			case fieldNumberStreet:
				builder.setStreet(reader.readString(fieldNumber));
				break;
			case fieldNumberState:
				builder.setState(reader.readString(fieldNumber));
				break;
		default:
			fieldFound = false;
		}
		return fieldFound;
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		Address.unknownTagHandler = unknownTagHandler;
	}

	public static Address parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static Address parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static Address parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}