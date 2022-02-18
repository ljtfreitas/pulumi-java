// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The auto scaler properties.
 * 
 */
public final class AKSServiceResponseResponseAutoScaler extends io.pulumi.resources.InvokeArgs {

    public static final AKSServiceResponseResponseAutoScaler Empty = new AKSServiceResponseResponseAutoScaler();

    /**
     * Option to enable/disable auto scaling.
     * 
     */
    @InputImport(name="autoscaleEnabled")
    private final @Nullable Boolean autoscaleEnabled;

    public Optional<Boolean> getAutoscaleEnabled() {
        return this.autoscaleEnabled == null ? Optional.empty() : Optional.ofNullable(this.autoscaleEnabled);
    }

    /**
     * The maximum number of replicas in the cluster.
     * 
     */
    @InputImport(name="maxReplicas")
    private final @Nullable Integer maxReplicas;

    public Optional<Integer> getMaxReplicas() {
        return this.maxReplicas == null ? Optional.empty() : Optional.ofNullable(this.maxReplicas);
    }

    /**
     * The minimum number of replicas to scale down to.
     * 
     */
    @InputImport(name="minReplicas")
    private final @Nullable Integer minReplicas;

    public Optional<Integer> getMinReplicas() {
        return this.minReplicas == null ? Optional.empty() : Optional.ofNullable(this.minReplicas);
    }

    /**
     * The amount of seconds to wait between auto scale updates.
     * 
     */
    @InputImport(name="refreshPeriodInSeconds")
    private final @Nullable Integer refreshPeriodInSeconds;

    public Optional<Integer> getRefreshPeriodInSeconds() {
        return this.refreshPeriodInSeconds == null ? Optional.empty() : Optional.ofNullable(this.refreshPeriodInSeconds);
    }

    /**
     * The target utilization percentage to use for determining whether to scale the cluster.
     * 
     */
    @InputImport(name="targetUtilization")
    private final @Nullable Integer targetUtilization;

    public Optional<Integer> getTargetUtilization() {
        return this.targetUtilization == null ? Optional.empty() : Optional.ofNullable(this.targetUtilization);
    }

    public AKSServiceResponseResponseAutoScaler(
        @Nullable Boolean autoscaleEnabled,
        @Nullable Integer maxReplicas,
        @Nullable Integer minReplicas,
        @Nullable Integer refreshPeriodInSeconds,
        @Nullable Integer targetUtilization) {
        this.autoscaleEnabled = autoscaleEnabled;
        this.maxReplicas = maxReplicas;
        this.minReplicas = minReplicas;
        this.refreshPeriodInSeconds = refreshPeriodInSeconds;
        this.targetUtilization = targetUtilization;
    }

    private AKSServiceResponseResponseAutoScaler() {
        this.autoscaleEnabled = null;
        this.maxReplicas = null;
        this.minReplicas = null;
        this.refreshPeriodInSeconds = null;
        this.targetUtilization = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AKSServiceResponseResponseAutoScaler defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean autoscaleEnabled;
        private @Nullable Integer maxReplicas;
        private @Nullable Integer minReplicas;
        private @Nullable Integer refreshPeriodInSeconds;
        private @Nullable Integer targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(AKSServiceResponseResponseAutoScaler defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscaleEnabled = defaults.autoscaleEnabled;
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.refreshPeriodInSeconds = defaults.refreshPeriodInSeconds;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder setAutoscaleEnabled(@Nullable Boolean autoscaleEnabled) {
            this.autoscaleEnabled = autoscaleEnabled;
            return this;
        }

        public Builder setMaxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }

        public Builder setMinReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }

        public Builder setRefreshPeriodInSeconds(@Nullable Integer refreshPeriodInSeconds) {
            this.refreshPeriodInSeconds = refreshPeriodInSeconds;
            return this;
        }

        public Builder setTargetUtilization(@Nullable Integer targetUtilization) {
            this.targetUtilization = targetUtilization;
            return this;
        }

        public AKSServiceResponseResponseAutoScaler build() {
            return new AKSServiceResponseResponseAutoScaler(autoscaleEnabled, maxReplicas, minReplicas, refreshPeriodInSeconds, targetUtilization);
        }
    }
}
