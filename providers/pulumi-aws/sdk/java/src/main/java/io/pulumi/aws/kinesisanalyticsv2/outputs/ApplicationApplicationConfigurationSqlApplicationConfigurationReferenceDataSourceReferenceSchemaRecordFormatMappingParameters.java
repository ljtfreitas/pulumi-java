// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters;
import io.pulumi.aws.kinesisanalyticsv2.outputs.ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters {
    /**
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters;
    /**
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * 
     */
    private final @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters;

    @OutputCustomType.Constructor({"csvMappingParameters","jsonMappingParameters"})
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters(
        @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters,
        @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters) {
        this.csvMappingParameters = csvMappingParameters;
        this.jsonMappingParameters = jsonMappingParameters;
    }

    /**
     * Provides additional mapping information when the record format uses delimiters (for example, CSV).
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters> getCsvMappingParameters() {
        return Optional.ofNullable(this.csvMappingParameters);
    }
    /**
     * Provides additional mapping information when JSON is the record format on the streaming source.
     * 
     */
    public Optional<ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters> getJsonMappingParameters() {
        return Optional.ofNullable(this.jsonMappingParameters);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters;
        private @Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.csvMappingParameters = defaults.csvMappingParameters;
    	      this.jsonMappingParameters = defaults.jsonMappingParameters;
        }

        public Builder setCsvMappingParameters(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters csvMappingParameters) {
            this.csvMappingParameters = csvMappingParameters;
            return this;
        }

        public Builder setJsonMappingParameters(@Nullable ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersJsonMappingParameters jsonMappingParameters) {
            this.jsonMappingParameters = jsonMappingParameters;
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParameters(csvMappingParameters, jsonMappingParameters);
        }
    }
}
