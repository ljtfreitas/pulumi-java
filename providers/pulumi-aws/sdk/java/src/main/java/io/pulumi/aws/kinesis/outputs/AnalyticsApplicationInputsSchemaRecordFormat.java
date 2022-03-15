// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParameters;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationInputsSchemaRecordFormat {
    /**
     * The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParameters mappingParameters;
    /**
     * The type of Record Format. Can be `CSV` or `JSON`.
     * 
     */
    private final @Nullable String recordFormatType;

    @CustomType.Constructor
    private AnalyticsApplicationInputsSchemaRecordFormat(
        @CustomType.Parameter("mappingParameters") @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParameters mappingParameters,
        @CustomType.Parameter("recordFormatType") @Nullable String recordFormatType) {
        this.mappingParameters = mappingParameters;
        this.recordFormatType = recordFormatType;
    }

    /**
     * The Mapping Information for the record format.
     * See Mapping Parameters below for more details.
     * 
    */
    public Optional<AnalyticsApplicationInputsSchemaRecordFormatMappingParameters> getMappingParameters() {
        return Optional.ofNullable(this.mappingParameters);
    }
    /**
     * The type of Record Format. Can be `CSV` or `JSON`.
     * 
    */
    public Optional<String> getRecordFormatType() {
        return Optional.ofNullable(this.recordFormatType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaRecordFormat defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParameters mappingParameters;
        private @Nullable String recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsSchemaRecordFormat defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mappingParameters = defaults.mappingParameters;
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder mappingParameters(@Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParameters mappingParameters) {
            this.mappingParameters = mappingParameters;
            return this;
        }

        public Builder recordFormatType(@Nullable String recordFormatType) {
            this.recordFormatType = recordFormatType;
            return this;
        }
        public AnalyticsApplicationInputsSchemaRecordFormat build() {
            return new AnalyticsApplicationInputsSchemaRecordFormat(mappingParameters, recordFormatType);
        }
    }
}
