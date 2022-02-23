// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TextFormatResponse {
    /**
     * The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object columnDelimiter;
    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object deserializer;
    /**
     * The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object encodingName;
    /**
     * The escape character. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object escapeChar;
    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object firstRowAsHeader;
    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object nullValue;
    /**
     * The quote character. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object quoteChar;
    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object rowDelimiter;
    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    private final @Nullable Object serializer;
    /**
     * The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     * 
     */
    private final @Nullable Object skipLineCount;
    /**
     * Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    private final @Nullable Object treatEmptyAsNull;
    /**
     * Type of dataset storage format.
     * Expected value is 'TextFormat'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"columnDelimiter","deserializer","encodingName","escapeChar","firstRowAsHeader","nullValue","quoteChar","rowDelimiter","serializer","skipLineCount","treatEmptyAsNull","type"})
    private TextFormatResponse(
        @Nullable Object columnDelimiter,
        @Nullable Object deserializer,
        @Nullable Object encodingName,
        @Nullable Object escapeChar,
        @Nullable Object firstRowAsHeader,
        @Nullable Object nullValue,
        @Nullable Object quoteChar,
        @Nullable Object rowDelimiter,
        @Nullable Object serializer,
        @Nullable Object skipLineCount,
        @Nullable Object treatEmptyAsNull,
        String type) {
        this.columnDelimiter = columnDelimiter;
        this.deserializer = deserializer;
        this.encodingName = encodingName;
        this.escapeChar = escapeChar;
        this.firstRowAsHeader = firstRowAsHeader;
        this.nullValue = nullValue;
        this.quoteChar = quoteChar;
        this.rowDelimiter = rowDelimiter;
        this.serializer = serializer;
        this.skipLineCount = skipLineCount;
        this.treatEmptyAsNull = treatEmptyAsNull;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The column delimiter. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getColumnDelimiter() {
        return Optional.ofNullable(this.columnDelimiter);
    }
    /**
     * Deserializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getDeserializer() {
        return Optional.ofNullable(this.deserializer);
    }
    /**
     * The code page name of the preferred encoding. If miss, the default value is ΓÇ£utf-8ΓÇ¥, unless BOM denotes another Unicode encoding. Refer to the ΓÇ£NameΓÇ¥ column of the table in the following link to set supported values: https://msdn.microsoft.com/library/system.text.encoding.aspx. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEncodingName() {
        return Optional.ofNullable(this.encodingName);
    }
    /**
     * The escape character. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getEscapeChar() {
        return Optional.ofNullable(this.escapeChar);
    }
    /**
     * When used as input, treat the first row of data as headers. When used as output,write the headers into the output as the first row of data. The default value is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getFirstRowAsHeader() {
        return Optional.ofNullable(this.firstRowAsHeader);
    }
    /**
     * The null value string. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getNullValue() {
        return Optional.ofNullable(this.nullValue);
    }
    /**
     * The quote character. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getQuoteChar() {
        return Optional.ofNullable(this.quoteChar);
    }
    /**
     * The row delimiter. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getRowDelimiter() {
        return Optional.ofNullable(this.rowDelimiter);
    }
    /**
     * Serializer. Type: string (or Expression with resultType string).
     * 
     */
    public Optional<Object> getSerializer() {
        return Optional.ofNullable(this.serializer);
    }
    /**
     * The number of lines/rows to be skipped when parsing text files. The default value is 0. Type: integer (or Expression with resultType integer).
     * 
     */
    public Optional<Object> getSkipLineCount() {
        return Optional.ofNullable(this.skipLineCount);
    }
    /**
     * Treat empty column values in the text file as null. The default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     */
    public Optional<Object> getTreatEmptyAsNull() {
        return Optional.ofNullable(this.treatEmptyAsNull);
    }
    /**
     * Type of dataset storage format.
     * Expected value is 'TextFormat'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TextFormatResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object columnDelimiter;
        private @Nullable Object deserializer;
        private @Nullable Object encodingName;
        private @Nullable Object escapeChar;
        private @Nullable Object firstRowAsHeader;
        private @Nullable Object nullValue;
        private @Nullable Object quoteChar;
        private @Nullable Object rowDelimiter;
        private @Nullable Object serializer;
        private @Nullable Object skipLineCount;
        private @Nullable Object treatEmptyAsNull;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TextFormatResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnDelimiter = defaults.columnDelimiter;
    	      this.deserializer = defaults.deserializer;
    	      this.encodingName = defaults.encodingName;
    	      this.escapeChar = defaults.escapeChar;
    	      this.firstRowAsHeader = defaults.firstRowAsHeader;
    	      this.nullValue = defaults.nullValue;
    	      this.quoteChar = defaults.quoteChar;
    	      this.rowDelimiter = defaults.rowDelimiter;
    	      this.serializer = defaults.serializer;
    	      this.skipLineCount = defaults.skipLineCount;
    	      this.treatEmptyAsNull = defaults.treatEmptyAsNull;
    	      this.type = defaults.type;
        }

        public Builder setColumnDelimiter(@Nullable Object columnDelimiter) {
            this.columnDelimiter = columnDelimiter;
            return this;
        }

        public Builder setDeserializer(@Nullable Object deserializer) {
            this.deserializer = deserializer;
            return this;
        }

        public Builder setEncodingName(@Nullable Object encodingName) {
            this.encodingName = encodingName;
            return this;
        }

        public Builder setEscapeChar(@Nullable Object escapeChar) {
            this.escapeChar = escapeChar;
            return this;
        }

        public Builder setFirstRowAsHeader(@Nullable Object firstRowAsHeader) {
            this.firstRowAsHeader = firstRowAsHeader;
            return this;
        }

        public Builder setNullValue(@Nullable Object nullValue) {
            this.nullValue = nullValue;
            return this;
        }

        public Builder setQuoteChar(@Nullable Object quoteChar) {
            this.quoteChar = quoteChar;
            return this;
        }

        public Builder setRowDelimiter(@Nullable Object rowDelimiter) {
            this.rowDelimiter = rowDelimiter;
            return this;
        }

        public Builder setSerializer(@Nullable Object serializer) {
            this.serializer = serializer;
            return this;
        }

        public Builder setSkipLineCount(@Nullable Object skipLineCount) {
            this.skipLineCount = skipLineCount;
            return this;
        }

        public Builder setTreatEmptyAsNull(@Nullable Object treatEmptyAsNull) {
            this.treatEmptyAsNull = treatEmptyAsNull;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TextFormatResponse build() {
            return new TextFormatResponse(columnDelimiter, deserializer, encodingName, escapeChar, firstRowAsHeader, nullValue, quoteChar, rowDelimiter, serializer, skipLineCount, treatEmptyAsNull, type);
        }
    }
}
