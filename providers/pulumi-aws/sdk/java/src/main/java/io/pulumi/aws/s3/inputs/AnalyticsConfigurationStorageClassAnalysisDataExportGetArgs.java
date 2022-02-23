// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.s3.inputs;

import io.pulumi.aws.s3.inputs.AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs Empty = new AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs();

    /**
     * Specifies the destination for the exported analytics data (documented below).
     * 
     */
    @InputImport(name="destination", required=true)
    private final Input<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs> destination;

    public Input<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs> getDestination() {
        return this.destination;
    }

    /**
     * The schema version of exported analytics data. Allowed values: `V_1`. Default value: `V_1`.
     * 
     */
    @InputImport(name="outputSchemaVersion")
    private final @Nullable Input<String> outputSchemaVersion;

    public Input<String> getOutputSchemaVersion() {
        return this.outputSchemaVersion == null ? Input.empty() : this.outputSchemaVersion;
    }

    public AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs(
        Input<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs> destination,
        @Nullable Input<String> outputSchemaVersion) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
        this.outputSchemaVersion = outputSchemaVersion;
    }

    private AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs() {
        this.destination = Input.empty();
        this.outputSchemaVersion = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs> destination;
        private @Nullable Input<String> outputSchemaVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.outputSchemaVersion = defaults.outputSchemaVersion;
        }

        public Builder setDestination(Input<AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs> destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }

        public Builder setDestination(AnalyticsConfigurationStorageClassAnalysisDataExportDestinationGetArgs destination) {
            this.destination = Input.of(Objects.requireNonNull(destination));
            return this;
        }

        public Builder setOutputSchemaVersion(@Nullable Input<String> outputSchemaVersion) {
            this.outputSchemaVersion = outputSchemaVersion;
            return this;
        }

        public Builder setOutputSchemaVersion(@Nullable String outputSchemaVersion) {
            this.outputSchemaVersion = Input.ofNullable(outputSchemaVersion);
            return this;
        }
        public AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs build() {
            return new AnalyticsConfigurationStorageClassAnalysisDataExportGetArgs(destination, outputSchemaVersion);
        }
    }
}
