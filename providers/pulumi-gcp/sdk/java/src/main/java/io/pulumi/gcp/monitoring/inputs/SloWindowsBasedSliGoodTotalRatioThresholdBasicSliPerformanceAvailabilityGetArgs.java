// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.monitoring.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs Empty = new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs();

    /**
     * Whether an availability SLI is enabled or not. Must be set to ` true. Defaults to  `true`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs(@Nullable Output<Boolean> enabled) {
        this.enabled = enabled;
    }

    private SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs() {
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs build() {
            return new SloWindowsBasedSliGoodTotalRatioThresholdBasicSliPerformanceAvailabilityGetArgs(enabled);
        }
    }
}
