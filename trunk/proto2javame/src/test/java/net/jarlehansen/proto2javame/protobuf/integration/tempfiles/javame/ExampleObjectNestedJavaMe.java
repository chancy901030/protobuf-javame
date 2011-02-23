package net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javame;
// Generated by proto2javame, Wed Feb 23 16:35:57 CET 2011.

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

public final class ExampleObjectNestedJavaMe extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int id;
	private static final int fieldNumberId = 1;

	private final String name;
	private static final int fieldNumberName = 2;

	private final String address;
	private static final int fieldNumberAddress = 3;
	private final boolean hasAddress;

	private final Number number;
	private static final int fieldNumberNumber = 4;
	private final boolean hasNumber;

	private final Identifier identifier;
	private static final int fieldNumberIdentifier = 5;


	public static Builder newBuilder() {
		return new Builder();
	}

	private ExampleObjectNestedJavaMe(final Builder builder) {
		if (builder.hasId && builder.hasName && builder.hasIdentifier ) {
			this.id = builder.id;
			this.name = builder.name;
			this.address = builder.address;
			this.hasAddress = builder.hasAddress;
			this.number = builder.number;
			this.hasNumber = builder.hasNumber;
			this.identifier = builder.identifier;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" id:" + builder.hasId + " name:" + builder.hasName + " identifier:" + builder.hasIdentifier + "");
		}
	}

	public static class Builder {
		private int id;
		private boolean hasId = false;

		private String name;
		private boolean hasName = false;

		private String address;
		private boolean hasAddress = false;

		private Number number;
		private boolean hasNumber = false;

		private Identifier identifier;
		private boolean hasIdentifier = false;


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

		public Builder setNumber(final Number number) {
			this.number = number;
			this.hasNumber = true;
			return this;
		}

		public Builder setIdentifier(final Identifier identifier) {
			this.identifier = identifier;
			this.hasIdentifier = true;
			return this;
		}

		public ExampleObjectNestedJavaMe build() {
			return new ExampleObjectNestedJavaMe(this);
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

	public Number getNumber() {
		return number;
	}

	public boolean hasNumber() {
		return hasNumber;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "id = " + this.id + TAB;
		retValue += "name = " + this.name + TAB;
		if(hasAddress) retValue += "address = " + this.address + TAB;
		if(hasNumber) retValue += "number = " + this.number + TAB;
		retValue += "identifier = " + this.identifier + TAB;
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
		if(hasNumber) messageSize += ComputeSizeUtil.computeMessageSize(fieldNumberNumber, number.computeSize());
		messageSize += ComputeSizeUtil.computeMessageSize(fieldNumberIdentifier, identifier.computeSize());

		return messageSize;
	}

	// Override
	public void writeFields(final OutputWriter writer) throws IOException {
		writer.writeInt(fieldNumberId, id);
		writer.writeString(fieldNumberName, name);
		if(hasAddress) writer.writeString(fieldNumberAddress, address);
		if(hasNumber) { writer.writeMessage(fieldNumberNumber, number.computeSize()); number.writeFields(writer); }
		writer.writeMessage(fieldNumberIdentifier, identifier.computeSize());
		identifier.writeFields(writer);
		writer.writeData();
	}

	static ExampleObjectNestedJavaMe parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final ExampleObjectNestedJavaMe.Builder builder = ExampleObjectNestedJavaMe.newBuilder();

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
			case fieldNumberAddress:
				builder.setAddress(reader.readString(fieldNumber));
				break;
			case fieldNumberNumber:
				Vector vcNumber = reader.readMessages(fieldNumberNumber);
				for(int i = 0 ; i < vcNumber.size(); i++) {
					byte[] eachBinData = (byte[]) vcNumber.elementAt(i);
					Number.Builder builderNumber = Number.newBuilder();
					InputReader innerInputReader = new InputReader(eachBinData, unknownTagHandler);
					boolean boolNumber = true;
					int nestedFieldNumber = -1;
					while(boolNumber) {
						nestedFieldNumber = getNextFieldNumber(innerInputReader);
						boolNumber = Number.populateBuilderWithField(innerInputReader, builderNumber, nestedFieldNumber);
					}
					eachBinData = null;
					innerInputReader = null;
					builder.setNumber(builderNumber.build());
				}
				break;
			case fieldNumberIdentifier:
				Vector vcIdentifier = reader.readMessages(fieldNumberIdentifier);
				for(int i = 0 ; i < vcIdentifier.size(); i++) {
					byte[] eachBinData = (byte[]) vcIdentifier.elementAt(i);
					Identifier.Builder builderIdentifier = Identifier.newBuilder();
					InputReader innerInputReader = new InputReader(eachBinData, unknownTagHandler);
					boolean boolIdentifier = true;
					int nestedFieldIdentifier = -1;
					while(boolIdentifier) {
						nestedFieldIdentifier = getNextFieldNumber(innerInputReader);
						boolIdentifier = Identifier.populateBuilderWithField(innerInputReader, builderIdentifier, nestedFieldIdentifier);
					}
					eachBinData = null;
					innerInputReader = null;
					builder.setIdentifier(builderIdentifier.build());
				}
				break;
		default:
			fieldFound = false;
		}
		return fieldFound;
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		ExampleObjectNestedJavaMe.unknownTagHandler = unknownTagHandler;
	}

	public static ExampleObjectNestedJavaMe parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static ExampleObjectNestedJavaMe parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static ExampleObjectNestedJavaMe parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}