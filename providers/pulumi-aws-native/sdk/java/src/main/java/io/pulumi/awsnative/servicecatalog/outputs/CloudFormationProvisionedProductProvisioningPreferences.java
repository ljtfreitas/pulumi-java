// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.servicecatalog.outputs;

import io.pulumi.awsnative.servicecatalog.enums.CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CloudFormationProvisionedProductProvisioningPreferences {
    private final @Nullable List<String> stackSetAccounts;
    private final @Nullable Integer stackSetFailureToleranceCount;
    private final @Nullable Integer stackSetFailureTolerancePercentage;
    private final @Nullable Integer stackSetMaxConcurrencyCount;
    private final @Nullable Integer stackSetMaxConcurrencyPercentage;
    private final @Nullable CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType stackSetOperationType;
    private final @Nullable List<String> stackSetRegions;

    @OutputCustomType.Constructor
    private CloudFormationProvisionedProductProvisioningPreferences(
        @OutputCustomType.Parameter("stackSetAccounts") @Nullable List<String> stackSetAccounts,
        @OutputCustomType.Parameter("stackSetFailureToleranceCount") @Nullable Integer stackSetFailureToleranceCount,
        @OutputCustomType.Parameter("stackSetFailureTolerancePercentage") @Nullable Integer stackSetFailureTolerancePercentage,
        @OutputCustomType.Parameter("stackSetMaxConcurrencyCount") @Nullable Integer stackSetMaxConcurrencyCount,
        @OutputCustomType.Parameter("stackSetMaxConcurrencyPercentage") @Nullable Integer stackSetMaxConcurrencyPercentage,
        @OutputCustomType.Parameter("stackSetOperationType") @Nullable CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType stackSetOperationType,
        @OutputCustomType.Parameter("stackSetRegions") @Nullable List<String> stackSetRegions) {
        this.stackSetAccounts = stackSetAccounts;
        this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
        this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
        this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
        this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
        this.stackSetOperationType = stackSetOperationType;
        this.stackSetRegions = stackSetRegions;
    }

    public List<String> getStackSetAccounts() {
        return this.stackSetAccounts == null ? List.of() : this.stackSetAccounts;
    }
    public Optional<Integer> getStackSetFailureToleranceCount() {
        return Optional.ofNullable(this.stackSetFailureToleranceCount);
    }
    public Optional<Integer> getStackSetFailureTolerancePercentage() {
        return Optional.ofNullable(this.stackSetFailureTolerancePercentage);
    }
    public Optional<Integer> getStackSetMaxConcurrencyCount() {
        return Optional.ofNullable(this.stackSetMaxConcurrencyCount);
    }
    public Optional<Integer> getStackSetMaxConcurrencyPercentage() {
        return Optional.ofNullable(this.stackSetMaxConcurrencyPercentage);
    }
    public Optional<CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType> getStackSetOperationType() {
        return Optional.ofNullable(this.stackSetOperationType);
    }
    public List<String> getStackSetRegions() {
        return this.stackSetRegions == null ? List.of() : this.stackSetRegions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudFormationProvisionedProductProvisioningPreferences defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> stackSetAccounts;
        private @Nullable Integer stackSetFailureToleranceCount;
        private @Nullable Integer stackSetFailureTolerancePercentage;
        private @Nullable Integer stackSetMaxConcurrencyCount;
        private @Nullable Integer stackSetMaxConcurrencyPercentage;
        private @Nullable CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType stackSetOperationType;
        private @Nullable List<String> stackSetRegions;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudFormationProvisionedProductProvisioningPreferences defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.stackSetAccounts = defaults.stackSetAccounts;
    	      this.stackSetFailureToleranceCount = defaults.stackSetFailureToleranceCount;
    	      this.stackSetFailureTolerancePercentage = defaults.stackSetFailureTolerancePercentage;
    	      this.stackSetMaxConcurrencyCount = defaults.stackSetMaxConcurrencyCount;
    	      this.stackSetMaxConcurrencyPercentage = defaults.stackSetMaxConcurrencyPercentage;
    	      this.stackSetOperationType = defaults.stackSetOperationType;
    	      this.stackSetRegions = defaults.stackSetRegions;
        }

        public Builder setStackSetAccounts(@Nullable List<String> stackSetAccounts) {
            this.stackSetAccounts = stackSetAccounts;
            return this;
        }

        public Builder setStackSetFailureToleranceCount(@Nullable Integer stackSetFailureToleranceCount) {
            this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
            return this;
        }

        public Builder setStackSetFailureTolerancePercentage(@Nullable Integer stackSetFailureTolerancePercentage) {
            this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
            return this;
        }

        public Builder setStackSetMaxConcurrencyCount(@Nullable Integer stackSetMaxConcurrencyCount) {
            this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
            return this;
        }

        public Builder setStackSetMaxConcurrencyPercentage(@Nullable Integer stackSetMaxConcurrencyPercentage) {
            this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
            return this;
        }

        public Builder setStackSetOperationType(@Nullable CloudFormationProvisionedProductProvisioningPreferencesStackSetOperationType stackSetOperationType) {
            this.stackSetOperationType = stackSetOperationType;
            return this;
        }

        public Builder setStackSetRegions(@Nullable List<String> stackSetRegions) {
            this.stackSetRegions = stackSetRegions;
            return this;
        }
        public CloudFormationProvisionedProductProvisioningPreferences build() {
            return new CloudFormationProvisionedProductProvisioningPreferences(stackSetAccounts, stackSetFailureToleranceCount, stackSetFailureTolerancePercentage, stackSetMaxConcurrencyCount, stackSetMaxConcurrencyPercentage, stackSetOperationType, stackSetRegions);
        }
    }
}
