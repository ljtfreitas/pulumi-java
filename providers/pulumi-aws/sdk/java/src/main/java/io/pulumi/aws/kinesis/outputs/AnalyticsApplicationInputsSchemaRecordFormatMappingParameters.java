// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.outputs;

import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv;
import io.pulumi.aws.kinesis.outputs.AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AnalyticsApplicationInputsSchemaRecordFormatMappingParameters {
    /**
     * Mapping information when the record format uses delimiters.
     * See CSV Mapping Parameters below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv csv;
    /**
     * Mapping information when JSON is the record format on the streaming source.
     * See JSON Mapping Parameters below for more details.
     * 
     */
    private final @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson json;

    @CustomType.Constructor
    private AnalyticsApplicationInputsSchemaRecordFormatMappingParameters(
        @CustomType.Parameter("csv") @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv csv,
        @CustomType.Parameter("json") @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson json) {
        this.csv = csv;
        this.json = json;
    }

    /**
     * Mapping information when the record format uses delimiters.
     * See CSV Mapping Parameters below for more details.
     * 
    */
    public Optional<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv> getCsv() {
        return Optional.ofNullable(this.csv);
    }
    /**
     * Mapping information when JSON is the record format on the streaming source.
     * See JSON Mapping Parameters below for more details.
     * 
    */
    public Optional<AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson> getJson() {
        return Optional.ofNullable(this.json);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaRecordFormatMappingParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv csv;
        private @Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson json;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsSchemaRecordFormatMappingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
    	      this.json = defaults.json;
        }

        public Builder csv(@Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsv csv) {
            this.csv = csv;
            return this;
        }

        public Builder json(@Nullable AnalyticsApplicationInputsSchemaRecordFormatMappingParametersJson json) {
            this.json = json;
            return this;
        }
        public AnalyticsApplicationInputsSchemaRecordFormatMappingParameters build() {
            return new AnalyticsApplicationInputsSchemaRecordFormatMappingParameters(csv, json);
        }
    }
}
