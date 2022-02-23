// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters {
    /**
     * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
     * 
     */
    private final String recordColumnDelimiter;
    /**
     * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
     * 
     */
    private final String recordRowDelimiter;

    @OutputCustomType.Constructor({"recordColumnDelimiter","recordRowDelimiter"})
    private ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters(
        String recordColumnDelimiter,
        String recordRowDelimiter) {
        this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter);
        this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter);
    }

    /**
     * The column delimiter. For example, in a CSV format, a comma (`,`) is the typical column delimiter.
     * 
     */
    public String getRecordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }
    /**
     * The row delimiter. For example, in a CSV format, `\n` is the typical row delimiter.
     * 
     */
    public String getRecordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordColumnDelimiter;
        private String recordRowDelimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumnDelimiter = defaults.recordColumnDelimiter;
    	      this.recordRowDelimiter = defaults.recordRowDelimiter;
        }

        public Builder setRecordColumnDelimiter(String recordColumnDelimiter) {
            this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter);
            return this;
        }

        public Builder setRecordRowDelimiter(String recordRowDelimiter) {
            this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceReferenceSchemaRecordFormatMappingParametersCsvMappingParameters(recordColumnDelimiter, recordRowDelimiter);
        }
    }
}
