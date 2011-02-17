package net.jarlehansen.proto2javame.protobuf.integration.tempfiles.javame;
// Generated by proto2javame, Thu Feb 17 21:58:14 CET 2011.

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

public final class UpdatedIntegrationTestObject extends AbstractOutputWriter {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int id;
	private static final int fieldNumberId = 1;

	private final long longNumber;
	private static final int fieldNumberLongNumber = 2;

	private final java.util.Vector name;
	private static final int fieldNumberName = 3;

	private final net.jarlehansen.protobuf.javame.ByteString bytesObject;
	private static final int fieldNumberBytesObject = 4;

	private final float floatObject;
	private static final int fieldNumberFloatObject = 5;

	private final boolean boolObj;
	private static final int fieldNumberBoolObj = 6;
	private final boolean hasBoolObj;

	private final double amount;
	private static final int fieldNumberAmount = 7;

	private final net.jarlehansen.protobuf.javame.ByteString newField;
	private static final int fieldNumberNewField = 8;

	private final int newField2;
	private static final int fieldNumberNewField2 = 9;

	private final long newField3;
	private static final int fieldNumberNewField3 = 10;

	private final String newField4;
	private static final int fieldNumberNewField4 = 11;

	private final float newField5;
	private static final int fieldNumberNewField5 = 12;

	private final boolean newField6;
	private static final int fieldNumberNewField6 = 13;

	private final double newField7;
	private static final int fieldNumberNewField7 = 14;


	public static Builder newBuilder() {
		return new Builder();
	}

	private UpdatedIntegrationTestObject(final Builder builder) {
		if (builder.hasId && builder.hasLongNumber && builder.hasBytesObject && builder.hasFloatObject && builder.hasAmount && builder.hasNewField && builder.hasNewField2 && builder.hasNewField3 && builder.hasNewField4 && builder.hasNewField5 && builder.hasNewField6 && builder.hasNewField7 ) {
			this.id = builder.id;
			this.longNumber = builder.longNumber;
			this.name = builder.name;
			this.bytesObject = builder.bytesObject;
			this.floatObject = builder.floatObject;
			this.boolObj = builder.boolObj;
			this.hasBoolObj = builder.hasBoolObj;
			this.amount = builder.amount;
			this.newField = builder.newField;
			this.newField2 = builder.newField2;
			this.newField3 = builder.newField3;
			this.newField4 = builder.newField4;
			this.newField5 = builder.newField5;
			this.newField6 = builder.newField6;
			this.newField7 = builder.newField7;
		} else {
			throw new UninitializedMessageException("Not all required fields were included (false = not included in message), " + 
				" id:" + builder.hasId + " longNumber:" + builder.hasLongNumber + " bytesObject:" + builder.hasBytesObject + " floatObject:" + builder.hasFloatObject + " amount:" + builder.hasAmount + " newField:" + builder.hasNewField + " newField2:" + builder.hasNewField2 + " newField3:" + builder.hasNewField3 + " newField4:" + builder.hasNewField4 + " newField5:" + builder.hasNewField5 + " newField6:" + builder.hasNewField6 + " newField7:" + builder.hasNewField7 + "");
		}
	}

	public static class Builder {
		private int id;
		private boolean hasId = false;

		private long longNumber;
		private boolean hasLongNumber = false;

		private java.util.Vector name = new java.util.Vector();
		private boolean hasName = false;

		private net.jarlehansen.protobuf.javame.ByteString bytesObject;
		private boolean hasBytesObject = false;

		private float floatObject;
		private boolean hasFloatObject = false;

		private boolean boolObj;
		private boolean hasBoolObj = false;

		private double amount;
		private boolean hasAmount = false;

		private net.jarlehansen.protobuf.javame.ByteString newField;
		private boolean hasNewField = false;

		private int newField2;
		private boolean hasNewField2 = false;

		private long newField3;
		private boolean hasNewField3 = false;

		private String newField4;
		private boolean hasNewField4 = false;

		private float newField5;
		private boolean hasNewField5 = false;

		private boolean newField6;
		private boolean hasNewField6 = false;

		private double newField7;
		private boolean hasNewField7 = false;


		private Builder() {
		}

		public Builder setId(final int id) {
			this.id = id;
			this.hasId = true;
			return this;
		}

		public Builder setLongNumber(final long longNumber) {
			this.longNumber = longNumber;
			this.hasLongNumber = true;
			return this;
		}

		public Builder setName(final java.util.Vector name) {
			if(!hasName) {
				hasName = true;
			}
			this.name = name;
			return this;
		}


		public Builder addElementName(final String element) {
			if(!hasName) {
				hasName = true;
			}
			name.addElement(element);
			return this;
		}

		public Builder setBytesObject(final net.jarlehansen.protobuf.javame.ByteString bytesObject) {
			this.bytesObject = bytesObject;
			this.hasBytesObject = true;
			return this;
		}

		public Builder setFloatObject(final float floatObject) {
			this.floatObject = floatObject;
			this.hasFloatObject = true;
			return this;
		}

		public Builder setBoolObj(final boolean boolObj) {
			this.boolObj = boolObj;
			this.hasBoolObj = true;
			return this;
		}

		public Builder setAmount(final double amount) {
			this.amount = amount;
			this.hasAmount = true;
			return this;
		}

		public Builder setNewField(final net.jarlehansen.protobuf.javame.ByteString newField) {
			this.newField = newField;
			this.hasNewField = true;
			return this;
		}

		public Builder setNewField2(final int newField2) {
			this.newField2 = newField2;
			this.hasNewField2 = true;
			return this;
		}

		public Builder setNewField3(final long newField3) {
			this.newField3 = newField3;
			this.hasNewField3 = true;
			return this;
		}

		public Builder setNewField4(final String newField4) {
			this.newField4 = newField4;
			this.hasNewField4 = true;
			return this;
		}

		public Builder setNewField5(final float newField5) {
			this.newField5 = newField5;
			this.hasNewField5 = true;
			return this;
		}

		public Builder setNewField6(final boolean newField6) {
			this.newField6 = newField6;
			this.hasNewField6 = true;
			return this;
		}

		public Builder setNewField7(final double newField7) {
			this.newField7 = newField7;
			this.hasNewField7 = true;
			return this;
		}

		public UpdatedIntegrationTestObject build() {
			return new UpdatedIntegrationTestObject(this);
		}
	}

	public int getId() {
		return id;
	}

	public long getLongNumber() {
		return longNumber;
	}

	public java.util.Vector getName() {
		return name;
	}

	public net.jarlehansen.protobuf.javame.ByteString getBytesObject() {
		return bytesObject;
	}

	public float getFloatObject() {
		return floatObject;
	}

	public boolean getBoolObj() {
		return boolObj;
	}

	public boolean hasBoolObj() {
		return hasBoolObj;
	}

	public double getAmount() {
		return amount;
	}

	public net.jarlehansen.protobuf.javame.ByteString getNewField() {
		return newField;
	}

	public int getNewField2() {
		return newField2;
	}

	public long getNewField3() {
		return newField3;
	}

	public String getNewField4() {
		return newField4;
	}

	public float getNewField5() {
		return newField5;
	}

	public boolean getNewField6() {
		return newField6;
	}

	public double getNewField7() {
		return newField7;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "id = " + this.id + TAB;
		retValue += "longNumber = " + this.longNumber + TAB;
		retValue += "name = " + this.name + TAB;
		retValue += "bytesObject = " + this.bytesObject + TAB;
		retValue += "floatObject = " + this.floatObject + TAB;
		if(hasBoolObj) retValue += "boolObj = " + this.boolObj + TAB;
		retValue += "amount = " + this.amount + TAB;
		retValue += "newField = " + this.newField + TAB;
		retValue += "newField2 = " + this.newField2 + TAB;
		retValue += "newField3 = " + this.newField3 + TAB;
		retValue += "newField4 = " + this.newField4 + TAB;
		retValue += "newField5 = " + this.newField5 + TAB;
		retValue += "newField6 = " + this.newField6 + TAB;
		retValue += "newField7 = " + this.newField7 + TAB;
		retValue += ")";

		return retValue;
	}

	// Override
	public int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberId, id);
		totalSize += ComputeSizeUtil.computeLongSize(fieldNumberLongNumber, longNumber);
		totalSize += ComputeSizeUtil.computeListSize(fieldNumberName, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_STRING, name);
		totalSize += ComputeSizeUtil.computeByteStringSize(fieldNumberBytesObject, bytesObject);
		totalSize += ComputeSizeUtil.computeFloatSize(fieldNumberFloatObject, floatObject);
		if(hasBoolObj) totalSize += ComputeSizeUtil.computeBooleanSize(fieldNumberBoolObj, boolObj);
		totalSize += ComputeSizeUtil.computeDoubleSize(fieldNumberAmount, amount);
		totalSize += ComputeSizeUtil.computeByteStringSize(fieldNumberNewField, newField);
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberNewField2, newField2);
		totalSize += ComputeSizeUtil.computeLongSize(fieldNumberNewField3, newField3);
		totalSize += ComputeSizeUtil.computeStringSize(fieldNumberNewField4, newField4);
		totalSize += ComputeSizeUtil.computeFloatSize(fieldNumberNewField5, newField5);
		totalSize += ComputeSizeUtil.computeBooleanSize(fieldNumberNewField6, newField6);
		totalSize += ComputeSizeUtil.computeDoubleSize(fieldNumberNewField7, newField7);
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
		writer.writeLong(fieldNumberLongNumber, longNumber);
		writer.writeList(fieldNumberName, net.jarlehansen.protobuf.javame.SupportedDataTypes.DATA_TYPE_STRING, name);
		writer.writeByteString(fieldNumberBytesObject, bytesObject);
		writer.writeFloat(fieldNumberFloatObject, floatObject);
		if(hasBoolObj) writer.writeBoolean(fieldNumberBoolObj, boolObj);
		writer.writeDouble(fieldNumberAmount, amount);
		writer.writeByteString(fieldNumberNewField, newField);
		writer.writeInt(fieldNumberNewField2, newField2);
		writer.writeLong(fieldNumberNewField3, newField3);
		writer.writeString(fieldNumberNewField4, newField4);
		writer.writeFloat(fieldNumberNewField5, newField5);
		writer.writeBoolean(fieldNumberNewField6, newField6);
		writer.writeDouble(fieldNumberNewField7, newField7);
		writer.writeData();
	}

	static UpdatedIntegrationTestObject parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = getNextFieldNumber(reader);
		final UpdatedIntegrationTestObject.Builder builder = UpdatedIntegrationTestObject.newBuilder();

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
			case fieldNumberLongNumber:
				builder.setLongNumber(reader.readLong(fieldNumber));
				break;
			case fieldNumberName:
				builder.addElementName(reader.readString(fieldNumber));
				break;
			case fieldNumberBytesObject:
				builder.setBytesObject(reader.readByteString(fieldNumber));
				break;
			case fieldNumberFloatObject:
				builder.setFloatObject(reader.readFloat(fieldNumber));
				break;
			case fieldNumberBoolObj:
				builder.setBoolObj(reader.readBoolean(fieldNumber));
				break;
			case fieldNumberAmount:
				builder.setAmount(reader.readDouble(fieldNumber));
				break;
			case fieldNumberNewField:
				builder.setNewField(reader.readByteString(fieldNumber));
				break;
			case fieldNumberNewField2:
				builder.setNewField2(reader.readInt(fieldNumber));
				break;
			case fieldNumberNewField3:
				builder.setNewField3(reader.readLong(fieldNumber));
				break;
			case fieldNumberNewField4:
				builder.setNewField4(reader.readString(fieldNumber));
				break;
			case fieldNumberNewField5:
				builder.setNewField5(reader.readFloat(fieldNumber));
				break;
			case fieldNumberNewField6:
				builder.setNewField6(reader.readBoolean(fieldNumber));
				break;
			case fieldNumberNewField7:
				builder.setNewField7(reader.readDouble(fieldNumber));
				break;
		default:
			fieldFound = false;
		}
		return fieldFound;
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		UpdatedIntegrationTestObject.unknownTagHandler = unknownTagHandler;
	}

	public static UpdatedIntegrationTestObject parseFrom(final byte[] data) throws IOException {
		return parseFields(new InputReader(data, unknownTagHandler));
	}

	public static UpdatedIntegrationTestObject parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(new InputReader(inputStream, unknownTagHandler));
	}

	public static UpdatedIntegrationTestObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(new InputReader(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}