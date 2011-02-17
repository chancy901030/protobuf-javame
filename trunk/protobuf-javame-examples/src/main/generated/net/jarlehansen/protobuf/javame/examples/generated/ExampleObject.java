package net.jarlehansen.protobuf.javame.examples.generated;
// Generated by proto2javame, Thu Feb 17 21:49:50 CET 2011.

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

public final class ExampleObject extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int id;
	private static final int fieldNumberId = 1;

	private final String name;
	private static final int fieldNumberName = 2;

	private final String address;
	private static final int fieldNumberAddress = 3;
	private final boolean hasAddress;


	public static Builder newBuilder() {
		return new Builder();
	}

	private ExampleObject(final Builder builder) {
		if (builder.hasId && builder.hasName ) {
			this.id = builder.id;
			this.name = builder.name;
			this.address = builder.address;
			this.hasAddress = builder.hasAddress;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" id:" + builder.hasId + " name:" + builder.hasName + "");
		}
	}

	public static class Builder {
		private int id;
		private boolean hasId = false;

		private String name;
		private boolean hasName = false;

		private String address;
		private boolean hasAddress = false;


		private Builder() {
		}

		public Builder setId(final int id) {
			this.id = id;
			this.hasId = true;
			return this;
		}

		public Builder setName(final String name) {
			this.name = name;
			this.hasName = true;
			return this;
		}

		public Builder setAddress(final String address) {
			this.address = address;
			this.hasAddress = true;
			return this;
		}

		public ExampleObject build() {
			return new ExampleObject(this);
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public boolean hasAddress() {
		return hasAddress;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "id = " + this.id + TAB;
		retValue += "name = " + this.name + TAB;
		if(hasAddress) retValue += "address = " + this.address + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberId, id);
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberName, name);
		if(hasAddress) totalSize += ComputeSizeUtil.computeStringSize(fieldNumberAddress, address);
		totalSize += computeNestedMessageSize();

		return totalSize;
	}

	private int computeNestedMessageSize() {
		int messageSize = 0;

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		writer.writeInt(fieldNumberId, id);
		writer.writeString(fieldNumberName, name);
		if(hasAddress) writer.writeString(fieldNumberAddress, address);
		writer.writeData();
	}

	static ExampleObject parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final ExampleObject.Builder builder = ExampleObject.newBuilder();

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
			case fieldNumberId:
				builder.setId(reader.readInt(fieldNumber));
				break;
			case fieldNumberName:
				builder.setName(reader.readString(fieldNumber));
				break;
			case fieldNumberAddress:
				builder.setAddress(reader.readString(fieldNumber));
				break;
		default:
			fieldFound = false;
		}
		return fieldFound;
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		ExampleObject.unknownTagHandler = unknownTagHandler;
	}

	public static ExampleObject parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static ExampleObject parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static ExampleObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}