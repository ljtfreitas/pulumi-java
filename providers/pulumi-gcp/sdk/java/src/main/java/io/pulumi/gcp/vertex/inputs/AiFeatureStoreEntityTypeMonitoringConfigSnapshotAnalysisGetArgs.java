// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs Empty = new AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs();

    /**
     * The monitoring schedule for snapshot analysis. For EntityType-level config: unset / disabled = true indicates disabled by default for Features under it; otherwise by default enable snapshot analysis monitoring with monitoringInterval for Features under it.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> disabled() {
        return this.disabled == null ? Codegen.empty() : this.disabled;
    }

    /**
     * Configuration of the snapshot analysis based monitoring pipeline running interval. The value is rolled up to full day.
     * A duration in seconds with up to nine fractional digits, terminated by 's'. Example: "3.5s".
     * 
     */
    @Import(name="monitoringInterval")
      private final @Nullable Output<String> monitoringInterval;

    public Output<String> monitoringInterval() {
        return this.monitoringInterval == null ? Codegen.empty() : this.monitoringInterval;
    }

    public AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs(
        @Nullable Output<Boolean> disabled,
        @Nullable Output<String> monitoringInterval) {
        this.disabled = disabled;
        this.monitoringInterval = monitoringInterval;
    }

    private AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs() {
        this.disabled = Codegen.empty();
        this.monitoringInterval = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<String> monitoringInterval;

        public Builder() {
    	      // Empty
        }

        public Builder(AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disabled = defaults.disabled;
    	      this.monitoringInterval = defaults.monitoringInterval;
        }

        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Codegen.ofNullable(disabled);
            return this;
        }
        public Builder monitoringInterval(@Nullable Output<String> monitoringInterval) {
            this.monitoringInterval = monitoringInterval;
            return this;
        }
        public Builder monitoringInterval(@Nullable String monitoringInterval) {
            this.monitoringInterval = Codegen.ofNullable(monitoringInterval);
            return this;
        }        public AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs build() {
            return new AiFeatureStoreEntityTypeMonitoringConfigSnapshotAnalysisGetArgs(disabled, monitoringInterval);
        }
    }
}
