// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.LogAnalyticsOutputResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GetLogAnalyticExportRequestRateByIntervalResult {
    /**
     * LogAnalyticsOutput
     * 
     */
    private final LogAnalyticsOutputResponse properties;

    @CustomType.Constructor
    private GetLogAnalyticExportRequestRateByIntervalResult(@CustomType.Parameter("properties") LogAnalyticsOutputResponse properties) {
        this.properties = properties;
    }

    /**
     * LogAnalyticsOutput
     * 
    */
    public LogAnalyticsOutputResponse getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLogAnalyticExportRequestRateByIntervalResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogAnalyticsOutputResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLogAnalyticExportRequestRateByIntervalResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(LogAnalyticsOutputResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public GetLogAnalyticExportRequestRateByIntervalResult build() {
            return new GetLogAnalyticExportRequestRateByIntervalResult(properties);
        }
    }
}
