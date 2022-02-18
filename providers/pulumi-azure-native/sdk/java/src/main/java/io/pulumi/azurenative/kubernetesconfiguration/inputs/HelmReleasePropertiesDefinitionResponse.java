// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.inputs.ObjectReferenceDefinitionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HelmReleasePropertiesDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final HelmReleasePropertiesDefinitionResponse Empty = new HelmReleasePropertiesDefinitionResponse();

    /**
     * Total number of times that the HelmRelease failed to install or upgrade
     * 
     */
    @InputImport(name="failureCount")
    private final @Nullable Double failureCount;

    public Optional<Double> getFailureCount() {
        return this.failureCount == null ? Optional.empty() : Optional.ofNullable(this.failureCount);
    }

    /**
     * The reference to the HelmChart object used as the source to this HelmRelease
     * 
     */
    @InputImport(name="helmChartRef")
    private final @Nullable ObjectReferenceDefinitionResponse helmChartRef;

    public Optional<ObjectReferenceDefinitionResponse> getHelmChartRef() {
        return this.helmChartRef == null ? Optional.empty() : Optional.ofNullable(this.helmChartRef);
    }

    /**
     * Number of times that the HelmRelease failed to install
     * 
     */
    @InputImport(name="installFailureCount")
    private final @Nullable Double installFailureCount;

    public Optional<Double> getInstallFailureCount() {
        return this.installFailureCount == null ? Optional.empty() : Optional.ofNullable(this.installFailureCount);
    }

    /**
     * The revision number of the last released object change
     * 
     */
    @InputImport(name="lastRevisionApplied")
    private final @Nullable Double lastRevisionApplied;

    public Optional<Double> getLastRevisionApplied() {
        return this.lastRevisionApplied == null ? Optional.empty() : Optional.ofNullable(this.lastRevisionApplied);
    }

    /**
     * Number of times that the HelmRelease failed to upgrade
     * 
     */
    @InputImport(name="upgradeFailureCount")
    private final @Nullable Double upgradeFailureCount;

    public Optional<Double> getUpgradeFailureCount() {
        return this.upgradeFailureCount == null ? Optional.empty() : Optional.ofNullable(this.upgradeFailureCount);
    }

    public HelmReleasePropertiesDefinitionResponse(
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

    private HelmReleasePropertiesDefinitionResponse() {
        this.failureCount = null;
        this.helmChartRef = null;
        this.installFailureCount = null;
        this.lastRevisionApplied = null;
        this.upgradeFailureCount = null;
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
