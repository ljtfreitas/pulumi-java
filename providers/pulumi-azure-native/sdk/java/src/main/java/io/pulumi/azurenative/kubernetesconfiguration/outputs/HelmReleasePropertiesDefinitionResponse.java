// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.ObjectReferenceDefinitionResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class HelmReleasePropertiesDefinitionResponse {
    /**
     * Total number of times that the HelmRelease failed to install or upgrade
     * 
     */
    private final @Nullable Double failureCount;
    /**
     * The reference to the HelmChart object used as the source to this HelmRelease
     * 
     */
    private final @Nullable ObjectReferenceDefinitionResponse helmChartRef;
    /**
     * Number of times that the HelmRelease failed to install
     * 
     */
    private final @Nullable Double installFailureCount;
    /**
     * The revision number of the last released object change
     * 
     */
    private final @Nullable Double lastRevisionApplied;
    /**
     * Number of times that the HelmRelease failed to upgrade
     * 
     */
    private final @Nullable Double upgradeFailureCount;

    @OutputCustomType.Constructor({"failureCount","helmChartRef","installFailureCount","lastRevisionApplied","upgradeFailureCount"})
    private HelmReleasePropertiesDefinitionResponse(
        @Nullable Double failureCount,
        @Nullable ObjectReferenceDefinitionResponse helmChartRef,
        @Nullable Double installFailureCount,
        @Nullable Double lastRevisionApplied,
        @Nullable Double upgradeFailureCount) {
        this.failureCount = failureCount;
        this.helmChartRef = helmChartRef;
        this.installFailureCount = installFailureCount;
        this.lastRevisionApplied = lastRevisionApplied;
        this.upgradeFailureCount = upgradeFailureCount;
    }

    /**
     * Total number of times that the HelmRelease failed to install or upgrade
     * 
     */
    public Optional<Double> getFailureCount() {
        return Optional.ofNullable(this.failureCount);
    }
    /**
     * The reference to the HelmChart object used as the source to this HelmRelease
     * 
     */
    public Optional<ObjectReferenceDefinitionResponse> getHelmChartRef() {
        return Optional.ofNullable(this.helmChartRef);
    }
    /**
     * Number of times that the HelmRelease failed to install
     * 
     */
    public Optional<Double> getInstallFailureCount() {
        return Optional.ofNullable(this.installFailureCount);
    }
    /**
     * The revision number of the last released object change
     * 
     */
    public Optional<Double> getLastRevisionApplied() {
        return Optional.ofNullable(this.lastRevisionApplied);
    }
    /**
     * Number of times that the HelmRelease failed to upgrade
     * 
     */
    public Optional<Double> getUpgradeFailureCount() {
        return Optional.ofNullable(this.upgradeFailureCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HelmReleasePropertiesDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Double failureCount;
        private @Nullable ObjectReferenceDefinitionResponse helmChartRef;
        private @Nullable Double installFailureCount;
        private @Nullable Double lastRevisionApplied;
        private @Nullable Double upgradeFailureCount;

        public Builder() {
    	      // Empty
        }

        public Builder(HelmReleasePropertiesDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureCount = defaults.failureCount;
    	      this.helmChartRef = defaults.helmChartRef;
    	      this.installFailureCount = defaults.installFailureCount;
    	      this.lastRevisionApplied = defaults.lastRevisionApplied;
    	      this.upgradeFailureCount = defaults.upgradeFailureCount;
        }

        public Builder setFailureCount(@Nullable Double failureCount) {
            this.failureCount = failureCount;
            return this;
        }

        public Builder setHelmChartRef(@Nullable ObjectReferenceDefinitionResponse helmChartRef) {
            this.helmChartRef = helmChartRef;
            return this;
        }

        public Builder setInstallFailureCount(@Nullable Double installFailureCount) {
            this.installFailureCount = installFailureCount;
            return this;
        }

        public Builder setLastRevisionApplied(@Nullable Double lastRevisionApplied) {
            this.lastRevisionApplied = lastRevisionApplied;
            return this;
        }

        public Builder setUpgradeFailureCount(@Nullable Double upgradeFailureCount) {
            this.upgradeFailureCount = upgradeFailureCount;
            return this;
        }

        public HelmReleasePropertiesDefinitionResponse build() {
            return new HelmReleasePropertiesDefinitionResponse(failureCount, helmChartRef, installFailureCount, lastRevisionApplied, upgradeFailureCount);
        }
    }
}
