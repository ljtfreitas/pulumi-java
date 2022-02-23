// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters to be applied to the cluster-autoscaler when enabled
 * 
 */
public final class ManagedClusterPropertiesResponseAutoScalerProfile extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterPropertiesResponseAutoScalerProfile Empty = new ManagedClusterPropertiesResponseAutoScalerProfile();

    @InputImport(name="balanceSimilarNodeGroups")
        private final @Nullable String balanceSimilarNodeGroups;

    public Optional<String> getBalanceSimilarNodeGroups() {
        return this.balanceSimilarNodeGroups == null ? Optional.empty() : Optional.ofNullable(this.balanceSimilarNodeGroups);
    }

    @InputImport(name="expander")
        private final @Nullable String expander;

    public Optional<String> getExpander() {
        return this.expander == null ? Optional.empty() : Optional.ofNullable(this.expander);
    }

    @InputImport(name="maxEmptyBulkDelete")
        private final @Nullable String maxEmptyBulkDelete;

    public Optional<String> getMaxEmptyBulkDelete() {
        return this.maxEmptyBulkDelete == null ? Optional.empty() : Optional.ofNullable(this.maxEmptyBulkDelete);
    }

    @InputImport(name="maxGracefulTerminationSec")
        private final @Nullable String maxGracefulTerminationSec;

    public Optional<String> getMaxGracefulTerminationSec() {
        return this.maxGracefulTerminationSec == null ? Optional.empty() : Optional.ofNullable(this.maxGracefulTerminationSec);
    }

    @InputImport(name="maxNodeProvisionTime")
        private final @Nullable String maxNodeProvisionTime;

    public Optional<String> getMaxNodeProvisionTime() {
        return this.maxNodeProvisionTime == null ? Optional.empty() : Optional.ofNullable(this.maxNodeProvisionTime);
    }

    @InputImport(name="maxTotalUnreadyPercentage")
        private final @Nullable String maxTotalUnreadyPercentage;

    public Optional<String> getMaxTotalUnreadyPercentage() {
        return this.maxTotalUnreadyPercentage == null ? Optional.empty() : Optional.ofNullable(this.maxTotalUnreadyPercentage);
    }

    @InputImport(name="newPodScaleUpDelay")
        private final @Nullable String newPodScaleUpDelay;

    public Optional<String> getNewPodScaleUpDelay() {
        return this.newPodScaleUpDelay == null ? Optional.empty() : Optional.ofNullable(this.newPodScaleUpDelay);
    }

    @InputImport(name="okTotalUnreadyCount")
        private final @Nullable String okTotalUnreadyCount;

    public Optional<String> getOkTotalUnreadyCount() {
        return this.okTotalUnreadyCount == null ? Optional.empty() : Optional.ofNullable(this.okTotalUnreadyCount);
    }

    @InputImport(name="scaleDownDelayAfterAdd")
        private final @Nullable String scaleDownDelayAfterAdd;

    public Optional<String> getScaleDownDelayAfterAdd() {
        return this.scaleDownDelayAfterAdd == null ? Optional.empty() : Optional.ofNullable(this.scaleDownDelayAfterAdd);
    }

    @InputImport(name="scaleDownDelayAfterDelete")
        private final @Nullable String scaleDownDelayAfterDelete;

    public Optional<String> getScaleDownDelayAfterDelete() {
        return this.scaleDownDelayAfterDelete == null ? Optional.empty() : Optional.ofNullable(this.scaleDownDelayAfterDelete);
    }

    @InputImport(name="scaleDownDelayAfterFailure")
        private final @Nullable String scaleDownDelayAfterFailure;

    public Optional<String> getScaleDownDelayAfterFailure() {
        return this.scaleDownDelayAfterFailure == null ? Optional.empty() : Optional.ofNullable(this.scaleDownDelayAfterFailure);
    }

    @InputImport(name="scaleDownUnneededTime")
        private final @Nullable String scaleDownUnneededTime;

    public Optional<String> getScaleDownUnneededTime() {
        return this.scaleDownUnneededTime == null ? Optional.empty() : Optional.ofNullable(this.scaleDownUnneededTime);
    }

    @InputImport(name="scaleDownUnreadyTime")
        private final @Nullable String scaleDownUnreadyTime;

    public Optional<String> getScaleDownUnreadyTime() {
        return this.scaleDownUnreadyTime == null ? Optional.empty() : Optional.ofNullable(this.scaleDownUnreadyTime);
    }

    @InputImport(name="scaleDownUtilizationThreshold")
        private final @Nullable String scaleDownUtilizationThreshold;

    public Optional<String> getScaleDownUtilizationThreshold() {
        return this.scaleDownUtilizationThreshold == null ? Optional.empty() : Optional.ofNullable(this.scaleDownUtilizationThreshold);
    }

    @InputImport(name="scanInterval")
        private final @Nullable String scanInterval;

    public Optional<String> getScanInterval() {
        return this.scanInterval == null ? Optional.empty() : Optional.ofNullable(this.scanInterval);
    }

    @InputImport(name="skipNodesWithLocalStorage")
        private final @Nullable String skipNodesWithLocalStorage;

    public Optional<String> getSkipNodesWithLocalStorage() {
        return this.skipNodesWithLocalStorage == null ? Optional.empty() : Optional.ofNullable(this.skipNodesWithLocalStorage);
    }

    @InputImport(name="skipNodesWithSystemPods")
        private final @Nullable String skipNodesWithSystemPods;

    public Optional<String> getSkipNodesWithSystemPods() {
        return this.skipNodesWithSystemPods == null ? Optional.empty() : Optional.ofNullable(this.skipNodesWithSystemPods);
    }

    public ManagedClusterPropertiesResponseAutoScalerProfile(
        @Nullable String balanceSimilarNodeGroups,
        @Nullable String expander,
        @Nullable String maxEmptyBulkDelete,
        @Nullable String maxGracefulTerminationSec,
        @Nullable String maxNodeProvisionTime,
        @Nullable String maxTotalUnreadyPercentage,
        @Nullable String newPodScaleUpDelay,
        @Nullable String okTotalUnreadyCount,
        @Nullable String scaleDownDelayAfterAdd,
        @Nullable String scaleDownDelayAfterDelete,
        @Nullable String scaleDownDelayAfterFailure,
        @Nullable String scaleDownUnneededTime,
        @Nullable String scaleDownUnreadyTime,
        @Nullable String scaleDownUtilizationThreshold,
        @Nullable String scanInterval,
        @Nullable String skipNodesWithLocalStorage,
        @Nullable String skipNodesWithSystemPods) {
        this.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
        this.expander = expander;
        this.maxEmptyBulkDelete = maxEmptyBulkDelete;
        this.maxGracefulTerminationSec = maxGracefulTerminationSec;
        this.maxNodeProvisionTime = maxNodeProvisionTime;
        this.maxTotalUnreadyPercentage = maxTotalUnreadyPercentage;
        this.newPodScaleUpDelay = newPodScaleUpDelay;
        this.okTotalUnreadyCount = okTotalUnreadyCount;
        this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
        this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
        this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
        this.scaleDownUnneededTime = scaleDownUnneededTime;
        this.scaleDownUnreadyTime = scaleDownUnreadyTime;
        this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
        this.scanInterval = scanInterval;
        this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
        this.skipNodesWithSystemPods = skipNodesWithSystemPods;
    }

    private ManagedClusterPropertiesResponseAutoScalerProfile() {
        this.balanceSimilarNodeGroups = null;
        this.expander = null;
        this.maxEmptyBulkDelete = null;
        this.maxGracefulTerminationSec = null;
        this.maxNodeProvisionTime = null;
        this.maxTotalUnreadyPercentage = null;
        this.newPodScaleUpDelay = null;
        this.okTotalUnreadyCount = null;
        this.scaleDownDelayAfterAdd = null;
        this.scaleDownDelayAfterDelete = null;
        this.scaleDownDelayAfterFailure = null;
        this.scaleDownUnneededTime = null;
        this.scaleDownUnreadyTime = null;
        this.scaleDownUtilizationThreshold = null;
        this.scanInterval = null;
        this.skipNodesWithLocalStorage = null;
        this.skipNodesWithSystemPods = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPropertiesResponseAutoScalerProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String balanceSimilarNodeGroups;
        private @Nullable String expander;
        private @Nullable String maxEmptyBulkDelete;
        private @Nullable String maxGracefulTerminationSec;
        private @Nullable String maxNodeProvisionTime;
        private @Nullable String maxTotalUnreadyPercentage;
        private @Nullable String newPodScaleUpDelay;
        private @Nullable String okTotalUnreadyCount;
        private @Nullable String scaleDownDelayAfterAdd;
        private @Nullable String scaleDownDelayAfterDelete;
        private @Nullable String scaleDownDelayAfterFailure;
        private @Nullable String scaleDownUnneededTime;
        private @Nullable String scaleDownUnreadyTime;
        private @Nullable String scaleDownUtilizationThreshold;
        private @Nullable String scanInterval;
        private @Nullable String skipNodesWithLocalStorage;
        private @Nullable String skipNodesWithSystemPods;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPropertiesResponseAutoScalerProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.balanceSimilarNodeGroups = defaults.balanceSimilarNodeGroups;
    	      this.expander = defaults.expander;
    	      this.maxEmptyBulkDelete = defaults.maxEmptyBulkDelete;
    	      this.maxGracefulTerminationSec = defaults.maxGracefulTerminationSec;
    	      this.maxNodeProvisionTime = defaults.maxNodeProvisionTime;
    	      this.maxTotalUnreadyPercentage = defaults.maxTotalUnreadyPercentage;
    	      this.newPodScaleUpDelay = defaults.newPodScaleUpDelay;
    	      this.okTotalUnreadyCount = defaults.okTotalUnreadyCount;
    	      this.scaleDownDelayAfterAdd = defaults.scaleDownDelayAfterAdd;
    	      this.scaleDownDelayAfterDelete = defaults.scaleDownDelayAfterDelete;
    	      this.scaleDownDelayAfterFailure = defaults.scaleDownDelayAfterFailure;
    	      this.scaleDownUnneededTime = defaults.scaleDownUnneededTime;
    	      this.scaleDownUnreadyTime = defaults.scaleDownUnreadyTime;
    	      this.scaleDownUtilizationThreshold = defaults.scaleDownUtilizationThreshold;
    	      this.scanInterval = defaults.scanInterval;
    	      this.skipNodesWithLocalStorage = defaults.skipNodesWithLocalStorage;
    	      this.skipNodesWithSystemPods = defaults.skipNodesWithSystemPods;
        }

        public Builder setBalanceSimilarNodeGroups(@Nullable String balanceSimilarNodeGroups) {
            this.balanceSimilarNodeGroups = balanceSimilarNodeGroups;
            return this;
        }

        public Builder setExpander(@Nullable String expander) {
            this.expander = expander;
            return this;
        }

        public Builder setMaxEmptyBulkDelete(@Nullable String maxEmptyBulkDelete) {
            this.maxEmptyBulkDelete = maxEmptyBulkDelete;
            return this;
        }

        public Builder setMaxGracefulTerminationSec(@Nullable String maxGracefulTerminationSec) {
            this.maxGracefulTerminationSec = maxGracefulTerminationSec;
            return this;
        }

        public Builder setMaxNodeProvisionTime(@Nullable String maxNodeProvisionTime) {
            this.maxNodeProvisionTime = maxNodeProvisionTime;
            return this;
        }

        public Builder setMaxTotalUnreadyPercentage(@Nullable String maxTotalUnreadyPercentage) {
            this.maxTotalUnreadyPercentage = maxTotalUnreadyPercentage;
            return this;
        }

        public Builder setNewPodScaleUpDelay(@Nullable String newPodScaleUpDelay) {
            this.newPodScaleUpDelay = newPodScaleUpDelay;
            return this;
        }

        public Builder setOkTotalUnreadyCount(@Nullable String okTotalUnreadyCount) {
            this.okTotalUnreadyCount = okTotalUnreadyCount;
            return this;
        }

        public Builder setScaleDownDelayAfterAdd(@Nullable String scaleDownDelayAfterAdd) {
            this.scaleDownDelayAfterAdd = scaleDownDelayAfterAdd;
            return this;
        }

        public Builder setScaleDownDelayAfterDelete(@Nullable String scaleDownDelayAfterDelete) {
            this.scaleDownDelayAfterDelete = scaleDownDelayAfterDelete;
            return this;
        }

        public Builder setScaleDownDelayAfterFailure(@Nullable String scaleDownDelayAfterFailure) {
            this.scaleDownDelayAfterFailure = scaleDownDelayAfterFailure;
            return this;
        }

        public Builder setScaleDownUnneededTime(@Nullable String scaleDownUnneededTime) {
            this.scaleDownUnneededTime = scaleDownUnneededTime;
            return this;
        }

        public Builder setScaleDownUnreadyTime(@Nullable String scaleDownUnreadyTime) {
            this.scaleDownUnreadyTime = scaleDownUnreadyTime;
            return this;
        }

        public Builder setScaleDownUtilizationThreshold(@Nullable String scaleDownUtilizationThreshold) {
            this.scaleDownUtilizationThreshold = scaleDownUtilizationThreshold;
            return this;
        }

        public Builder setScanInterval(@Nullable String scanInterval) {
            this.scanInterval = scanInterval;
            return this;
        }

        public Builder setSkipNodesWithLocalStorage(@Nullable String skipNodesWithLocalStorage) {
            this.skipNodesWithLocalStorage = skipNodesWithLocalStorage;
            return this;
        }

        public Builder setSkipNodesWithSystemPods(@Nullable String skipNodesWithSystemPods) {
            this.skipNodesWithSystemPods = skipNodesWithSystemPods;
            return this;
        }
        public ManagedClusterPropertiesResponseAutoScalerProfile build() {
            return new ManagedClusterPropertiesResponseAutoScalerProfile(balanceSimilarNodeGroups, expander, maxEmptyBulkDelete, maxGracefulTerminationSec, maxNodeProvisionTime, maxTotalUnreadyPercentage, newPodScaleUpDelay, okTotalUnreadyCount, scaleDownDelayAfterAdd, scaleDownDelayAfterDelete, scaleDownDelayAfterFailure, scaleDownUnneededTime, scaleDownUnreadyTime, scaleDownUtilizationThreshold, scanInterval, skipNodesWithLocalStorage, skipNodesWithSystemPods);
        }
    }
}
