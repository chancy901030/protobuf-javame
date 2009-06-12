package net.jarlehansen.protobuf.javame.generated;
// Generated by proto2javame. DO NOT EDIT!

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.javame.JavaMeProtoFactory;
import com.google.protobuf.javame.input.InputReader;
import com.google.protobuf.javame.output.ComputeSizeUtil;
import com.google.protobuf.javame.output.OutputWriter;

public final class JunitTestMainObject {
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
	public static class Builder {		private int id;		private boolean hasId = false;		private Builder() {		}		public Builder setId(final int id) {			this.id = id;			this.hasId = true;			return this;		}		public JunitTestMainObject build() {			return new JunitTestMainObject(this);		}	}
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
		writer.writeData();
	}

	public void writeTo(final OutputStream outputStream) throws IOException {
		final byte[] outputData = createByteArray();

		final OutputWriter writer = JavaMeProtoFactory.createOutputUtil(outputData, outputStream);
		writeFields(writer);
		writer.writeData();
	}

	private byte[] createByteArray() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberId, id);

		return new byte[totalSize];
	}

	private void writeFields(final OutputWriter writer) throws IOException {
		writer.writeInt(fieldNumberId, id);
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
				throw new IllegalStateException("Unsupported field number, the input field was " + nextFieldNumber);
			}

			nextFieldNumber = reader.getNextFieldNumber();
		}

		return builder.build();
	}

	public static JunitTestMainObject parseFrom(final byte[] data) throws IOException {
		return parseFields(JavaMeProtoFactory.createInputUtil(data));
	}

	public static JunitTestMainObject parseFrom(final InputStream inputStream) throws IOException {
		return parseFields(JavaMeProtoFactory.createInputUtil(inputStream));
	}
}