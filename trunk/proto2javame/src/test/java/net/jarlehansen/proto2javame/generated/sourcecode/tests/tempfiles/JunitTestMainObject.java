package net.jarlehansen.proto2javame.generated.sourcecode.tests.tempfiles;
// Generated by proto2javame, Thu Jul 02 20:52:16 CEST 2009. DO NOT EDIT!

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.factory.JavaMeProtoFactory;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.util.ComputeSizeUtil;
import net.jarlehansen.protobuf.javame.output.OutputWriter;
import net.jarlehansen.protobuf.javame.input.taghandler.UnknownTagHandler;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;

public final class JunitTestMainObject {
	private static UnknownTagHandler unknownTagHandler = DefaultUnknownTagHandlerImpl.newInstance();

	private final int id;
	private static final int fieldNumberId = 1;


	public static Builder newBuilder() {
		return new Builder();
	}

	private JunitTestMainObject(final Builder builder) {
		if (builder.hasId ) {
			this.id = builder.id;
		} else {
			throw new UninitializedMessageException("Not all required fields were included, " + 
				" id:" + builder.hasId + ", all fields that are false are mandatory but were not added");
		}
	}

	public static class Builder {
		private int id;
		private boolean hasId = false;


		private Builder() {
		}

		public Builder setId(final int id) {
			this.id = id;
			this.hasId = true;
			return this;
		}

		public JunitTestMainObject build() {
			return new JunitTestMainObject(this);
		}
	}

	public int getId() {
		return id;
	}

	public String toString() {
		final String TAB = "   ";
		String retValue = "";
		retValue += this.getClass().getName() + "(";
		retValue += "id = " + this.id + TAB;
		retValue += ")";

		return retValue;
	}

	public byte[] toByteArray() throws IOException {
		final byte[] outputData = createByteArray();
		writeTo(outputData);

		return outputData;
	}

	public void writeTo(final byte[] data) throws IOException {
		final OutputWriter writer = JavaMeProtoFactory.createOutputUtil(data);
		writeFields(writer);
	}

	public void writeTo(final OutputStream outputStream) throws IOException {
		final byte[] outputData = createByteArray();

		final OutputWriter writer = JavaMeProtoFactory.createOutputUtil(outputData, outputStream);
		writeFields(writer);
	}

	private byte[] createByteArray() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberId, id);

		return new byte[totalSize];
	}

	private void writeFields(final OutputWriter writer) throws IOException {
		writer.writeInt(fieldNumberId, id);
		writer.writeData();
	}

	private static JunitTestMainObject parseFields(final InputReader reader) throws IOException {
		int nextFieldNumber = reader.getNextFieldNumber();
		final JunitTestMainObject.Builder builder = new JunitTestMainObject.Builder();

		while (nextFieldNumber > 0) {
			switch (nextFieldNumber) {
			case fieldNumberId:
				builder.setId(reader.readInt(nextFieldNumber));
				break;
			default:
				 reader.getPreviousTagDataTypeAndReadContent();
			}

			nextFieldNumber = reader.getNextFieldNumber();
		}

		return builder.build();
	}

	public static void setUnknownTagHandler(final UnknownTagHandler unknownTagHandler) {
		JunitTestMainObject.unknownTagHandler = unknownTagHandler;
	}

	public static JunitTestMainObject parseFrom(final byte[] data) throws IOException {
		return parseFields(JavaMeProtoFactory.createInputUtil(data, unknownTagHandler));
	}

	public static JunitTestMainObject parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(JavaMeProtoFactory.createInputUtil(inputStream, unknownTagHandler));
	}
}