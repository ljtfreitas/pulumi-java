// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OutputBlobSerialization {
    /**
     * @return The encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. It currently can only be set to `UTF8`.
     * 
     */
    private final @Nullable String encoding;
    /**
     * @return The delimiter that will be used to separate comma-separated value (CSV) records. Possible values are ` ` (space), `,` (comma), `   ` (tab), `|` (pipe) and `;`.
     * 
     */
    private final @Nullable String fieldDelimiter;
    /**
     * @return Specifies the format of the JSON the output will be written in. Possible values are `Array` and `LineSeparated`.
     * 
     */
    private final @Nullable String format;
    /**
     * @return The serialization format used for outgoing data streams. Possible values are `Avro`, `Csv`, `Json` and `Parquet`.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private OutputBlobSerialization(
        @CustomType.Parameter("encoding") @Nullable String encoding,
        @CustomType.Parameter("fieldDelimiter") @Nullable String fieldDelimiter,
        @CustomType.Parameter("format") @Nullable String format,
        @CustomType.Parameter("type") String type) {
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.format = format;
        this.type = type;
    }

    /**
     * @return The encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. It currently can only be set to `UTF8`.
     * 
     */
    public Optional<String> encoding() {
        return Optional.ofNullable(this.encoding);
    }
    /**
     * @return The delimiter that will be used to separate comma-separated value (CSV) records. Possible values are ` ` (space), `,` (comma), `   ` (tab), `|` (pipe) and `;`.
     * 
     */
    public Optional<String> fieldDelimiter() {
        return Optional.ofNullable(this.fieldDelimiter);
    }
    /**
     * @return Specifies the format of the JSON the output will be written in. Possible values are `Array` and `LineSeparated`.
     * 
     */
    public Optional<String> format() {
        return Optional.ofNullable(this.format);
    }
    /**
     * @return The serialization format used for outgoing data streams. Possible values are `Avro`, `Csv`, `Json` and `Parquet`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputBlobSerialization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encoding;
        private @Nullable String fieldDelimiter;
        private @Nullable String format;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputBlobSerialization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
    	      this.format = defaults.format;
    	      this.type = defaults.type;
        }

        public Builder encoding(@Nullable String encoding) {
            this.encoding = encoding;
            return this;
        }
        public Builder fieldDelimiter(@Nullable String fieldDelimiter) {
            this.fieldDelimiter = fieldDelimiter;
            return this;
        }
        public Builder format(@Nullable String format) {
            this.format = format;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public OutputBlobSerialization build() {
            return new OutputBlobSerialization(encoding, fieldDelimiter, format, type);
        }
    }
}
