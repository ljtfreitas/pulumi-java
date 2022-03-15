// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema {
    /**
     * Specifies the format of the records on the output stream. Valid values: `CSV`, `JSON`.
     * 
     */
    private final String recordFormatType;

    @CustomType.Constructor
    private ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema(@CustomType.Parameter("recordFormatType") String recordFormatType) {
        this.recordFormatType = recordFormatType;
    }

    /**
     * Specifies the format of the records on the output stream. Valid values: `CSV`, `JSON`.
     * 
    */
    public String getRecordFormatType() {
        return this.recordFormatType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder recordFormatType(String recordFormatType) {
            this.recordFormatType = Objects.requireNonNull(recordFormatType);
            return this;
        }
        public ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema build() {
            return new ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema(recordFormatType);
        }
    }
}
