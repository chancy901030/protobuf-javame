package net.jarlehansen.protobuf.javame.generated;
// Generated by proto2javame, Mon Dec 28 01:15:10 CET 2009. DO NOT EDIT!

import java.io.IOException;
import java.io.InputStream;
import net.jarlehansen.protobuf.javame.UninitializedMessageException;
import net.jarlehansen.protobuf.javame.factory.JavaMeProtoFactory;
import net.jarlehansen.protobuf.javame.input.InputReader;
import net.jarlehansen.protobuf.javame.input.DelimitedInputStream;
import net.jarlehansen.protobuf.javame.input.DelimitedSizeUtil;
import net.jarlehansen.protobuf.javame.util.ComputeSizeUtil;
import net.jarlehansen.protobuf.javame.output.OutputWriter;
import net.jarlehansen.protobuf.javame.extended.output.AbstractOutputWriter;
import net.jarlehansen.protobuf.javame.input.taghandler.UnknownTagHandler;
import net.jarlehansen.protobuf.javame.input.taghandler.DefaultUnknownTagHandlerImpl;

public final class JunitTestMainObject extends AbstractOutputWriter {
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

	// Override
	protected int computeSize() {
		int totalSize = 0;
		totalSize += ComputeSizeUtil.computeIntSize(fieldNumberId, id);

		return totalSize;
	}

	// Override
	protected void writeFields(final OutputWriter writer) throws IOException {
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

	public static JunitTestMainObject parseDelimitedFrom(final InputStream inputStream) throws IOException {
		final int limit = DelimitedSizeUtil.readDelimitedSize(inputStream);
		return parseFields(JavaMeProtoFactory.createInputUtil(new DelimitedInputStream(inputStream, limit), unknownTagHandler));
	}
}