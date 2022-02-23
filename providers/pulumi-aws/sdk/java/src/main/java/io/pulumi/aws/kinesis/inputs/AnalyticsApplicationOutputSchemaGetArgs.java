// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationOutputSchemaGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationOutputSchemaGetArgs Empty = new AnalyticsApplicationOutputSchemaGetArgs();

    /**
     * The Format Type of the records on the output stream. Can be `CSV` or `JSON`.
     * 
     */
    @InputImport(name="recordFormatType", required=true)
    private final Input<String> recordFormatType;

    public Input<String> getRecordFormatType() {
        return this.recordFormatType;
    }

    public AnalyticsApplicationOutputSchemaGetArgs(Input<String> recordFormatType) {
        this.recordFormatType = Objects.requireNonNull(recordFormatType, "expected parameter 'recordFormatType' to be non-null");
    }

    private AnalyticsApplicationOutputSchemaGetArgs() {
        this.recordFormatType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutputSchemaGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutputSchemaGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder setRecordFormatType(Input<String> recordFormatType) {
            this.recordFormatType = Objects.requireNonNull(recordFormatType);
            return this;
        }

        public Builder setRecordFormatType(String recordFormatType) {
            this.recordFormatType = Input.of(Objects.requireNonNull(recordFormatType));
            return this;
        }
        public AnalyticsApplicationOutputSchemaGetArgs build() {
            return new AnalyticsApplicationOutputSchemaGetArgs(recordFormatType);
        }
    }
}
