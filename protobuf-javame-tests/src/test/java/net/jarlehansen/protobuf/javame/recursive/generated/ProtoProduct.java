package net.jarlehansen.protobuf.javame.recursive.generated;
// Generated by proto2javame, Wed Feb 23 17:06:07 CET 2011.

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

public final class ProtoProduct extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int id;
	private static final int fieldNumberId = 1;

	private final String name;
	private static final int fieldNumberName = 2;


	public static Builder newBuilder() {
		return new Builder();
	}

	private ProtoProduct(final Builder builder) {
		if (builder.hasId && builder.hasName ) {
			this.id = builder.id;
			this.name = builder.name;
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

		public ProtoProduct build() {
			return new ProtoProduct(this);
		}
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "id = " + this.id + TAB;
		retValue += "name = " + this.name + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberId, id);
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberName, name);
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
		writer.writeData();
	}

	static ProtoProduct parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final ProtoProduct.Builder builder = ProtoProduct.newBuilder();

		while (nextFieldNumber > 0) {
			if(!populateBuilderWithField(reader, builder, nextFieldNumber)) {
				reader.getPreviousTagDataTypeAndReadContent();
			}
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
		default:
			fieldFound = false;
		}
		return fieldFound;
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		ProtoProduct.unknownTagHandler = unknownTagHandler;
	}

	public static ProtoProduct parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static ProtoProduct parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static ProtoProduct parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}