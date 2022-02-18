// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterPropertiesResponseAutoScalerProfile {
    private final @Nullable String balanceSimilarNodeGroups;
    private final @Nullable String expander;
    private final @Nullable String maxEmptyBulkDelete;
    private final @Nullable String maxGracefulTerminationSec;
    private final @Nullable String maxNodeProvisionTime;
    private final @Nullable String maxTotalUnreadyPercentage;
    private final @Nullable String newPodScaleUpDelay;
    private final @Nullable String okTotalUnreadyCount;
    private final @Nullable String scaleDownDelayAfterAdd;
    private final @Nullable String scaleDownDelayAfterDelete;
    private final @Nullable String scaleDownDelayAfterFailure;
    private final @Nullable String scaleDownUnneededTime;
    private final @Nullable String scaleDownUnreadyTime;
    private final @Nullable String scaleDownUtilizationThreshold;
    private final @Nullable String scanInterval;
    private final @Nullable String skipNodesWithLocalStorage;
    private final @Nullable String skipNodesWithSystemPods;

    @OutputCustomType.Constructor({"balanceSimilarNodeGroups","expander","maxEmptyBulkDelete","maxGracefulTerminationSec","maxNodeProvisionTime","maxTotalUnreadyPercentage","newPodScaleUpDelay","okTotalUnreadyCount","scaleDownDelayAfterAdd","scaleDownDelayAfterDelete","scaleDownDelayAfterFailure","scaleDownUnneededTime","scaleDownUnreadyTime","scaleDownUtilizationThreshold","scanInterval","skipNodesWithLocalStorage","skipNodesWithSystemPods"})
    private ManagedClusterPropertiesResponseAutoScalerProfile(
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

    public Optional<String> getBalanceSimilarNodeGroups() {
        return Optional.ofNullable(this.balanceSimilarNodeGroups);
    }
    public Optional<String> getExpander() {
        return Optional.ofNullable(this.expander);
    }
    public Optional<String> getMaxEmptyBulkDelete() {
        return Optional.ofNullable(this.maxEmptyBulkDelete);
    }
    public Optional<String> getMaxGracefulTerminationSec() {
        return Optional.ofNullable(this.maxGracefulTerminationSec);
    }
    public Optional<String> getMaxNodeProvisionTime() {
        return Optional.ofNullable(this.maxNodeProvisionTime);
    }
    public Optional<String> getMaxTotalUnreadyPercentage() {
        return Optional.ofNullable(this.maxTotalUnreadyPercentage);
    }
    public Optional<String> getNewPodScaleUpDelay() {
        return Optional.ofNullable(this.newPodScaleUpDelay);
    }
    public Optional<String> getOkTotalUnreadyCount() {
        return Optional.ofNullable(this.okTotalUnreadyCount);
    }
    public Optional<String> getScaleDownDelayAfterAdd() {
        return Optional.ofNullable(this.scaleDownDelayAfterAdd);
    }
    public Optional<String> getScaleDownDelayAfterDelete() {
        return Optional.ofNullable(this.scaleDownDelayAfterDelete);
    }
    public Optional<String> getScaleDownDelayAfterFailure() {
        return Optional.ofNullable(this.scaleDownDelayAfterFailure);
    }
    public Optional<String> getScaleDownUnneededTime() {
        return Optional.ofNullable(this.scaleDownUnneededTime);
    }
    public Optional<String> getScaleDownUnreadyTime() {
        return Optional.ofNullable(this.scaleDownUnreadyTime);
    }
    public Optional<String> getScaleDownUtilizationThreshold() {
        return Optional.ofNullable(this.scaleDownUtilizationThreshold);
    }
    public Optional<String> getScanInterval() {
        return Optional.ofNullable(this.scanInterval);
    }
    public Optional<String> getSkipNodesWithLocalStorage() {
        return Optional.ofNullable(this.skipNodesWithLocalStorage);
    }
    public Optional<String> getSkipNodesWithSystemPods() {
        return Optional.ofNullable(this.skipNodesWithSystemPods);
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
