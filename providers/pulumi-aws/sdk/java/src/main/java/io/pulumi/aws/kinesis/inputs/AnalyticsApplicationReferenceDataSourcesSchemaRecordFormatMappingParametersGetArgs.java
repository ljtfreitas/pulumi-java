// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvGetArgs;
import io.pulumi.aws.kinesis.inputs.AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs Empty = new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs();

    /**
     * Mapping information when the record format uses delimiters.
     * See CSV Mapping Parameters below for more details.
     * 
     */
    @InputImport(name="csv")
    private final @Nullable Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvGetArgs> csv;

    public Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvGetArgs> getCsv() {
        return this.csv == null ? Input.empty() : this.csv;
    }

    /**
     * Mapping information when JSON is the record format on the streaming source.
     * See JSON Mapping Parameters below for more details.
     * 
     */
    @InputImport(name="json")
    private final @Nullable Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs> json;

    public Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs> getJson() {
        return this.json == null ? Input.empty() : this.json;
    }

    public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs(
        @Nullable Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvGetArgs> csv,
        @Nullable Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs> json) {
        this.csv = csv;
        this.json = json;
    }

    private AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs() {
        this.csv = Input.empty();
        this.json = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvGetArgs> csv;
        private @Nullable Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs> json;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csv = defaults.csv;
    	      this.json = defaults.json;
        }

        public Builder setCsv(@Nullable Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvGetArgs> csv) {
            this.csv = csv;
            return this;
        }

        public Builder setCsv(@Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersCsvGetArgs csv) {
            this.csv = Input.ofNullable(csv);
            return this;
        }

        public Builder setJson(@Nullable Input<AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs> json) {
            this.json = json;
            return this;
        }

        public Builder setJson(@Nullable AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersJsonGetArgs json) {
            this.json = Input.ofNullable(json);
            return this;
        }
        public AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs build() {
            return new AnalyticsApplicationReferenceDataSourcesSchemaRecordFormatMappingParametersGetArgs(csv, json);
        }
    }
}
