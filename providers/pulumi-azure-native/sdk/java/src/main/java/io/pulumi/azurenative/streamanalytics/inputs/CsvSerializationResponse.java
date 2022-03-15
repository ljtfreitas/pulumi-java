// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes how data from an input is serialized or how data is serialized when written to an output in CSV format.
 * 
 */
public final class CsvSerializationResponse extends io.pulumi.resources.InvokeArgs {

    public static final CsvSerializationResponse Empty = new CsvSerializationResponse();

    /**
     * Specifies the encoding of the incoming data in the case of input and the encoding of outgoing data in the case of output. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="encoding")
      private final @Nullable String encoding;

    public Optional<String> getEncoding() {
        return this.encoding == null ? Optional.empty() : Optional.ofNullable(this.encoding);
    }

    /**
     * Specifies the delimiter that will be used to separate comma-separated value (CSV) records. See https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-input or https://docs.microsoft.com/en-us/rest/api/streamanalytics/stream-analytics-output for a list of supported values. Required on PUT (CreateOrReplace) requests.
     * 
     */
    @Import(name="fieldDelimiter")
      private final @Nullable String fieldDelimiter;

    public Optional<String> getFieldDelimiter() {
        return this.fieldDelimiter == null ? Optional.empty() : Optional.ofNullable(this.fieldDelimiter);
    }

    /**
     * Indicates the type of serialization that the input or output uses. Required on PUT (CreateOrReplace) requests.
     * Expected value is 'Csv'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public CsvSerializationResponse(
        @Nullable String encoding,
        @Nullable String fieldDelimiter,
        String type) {
        this.encoding = encoding;
        this.fieldDelimiter = fieldDelimiter;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CsvSerializationResponse() {
        this.encoding = null;
        this.fieldDelimiter = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CsvSerializationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String encoding;
        private @Nullable String fieldDelimiter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CsvSerializationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encoding = defaults.encoding;
    	      this.fieldDelimiter = defaults.fieldDelimiter;
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

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public CsvSerializationResponse build() {
            return new CsvSerializationResponse(encoding, fieldDelimiter, type);
        }
    }
}
