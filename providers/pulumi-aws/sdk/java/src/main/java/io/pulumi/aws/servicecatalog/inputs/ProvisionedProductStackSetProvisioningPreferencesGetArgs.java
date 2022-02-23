// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisionedProductStackSetProvisioningPreferencesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductStackSetProvisioningPreferencesGetArgs Empty = new ProvisionedProductStackSetProvisioningPreferencesGetArgs();

    /**
     * One or more AWS accounts that will have access to the provisioned product. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all accounts from the STACKSET constraint.
     * 
     */
    @InputImport(name="accounts")
    private final @Nullable Input<List<String>> accounts;

    public Input<List<String>> getAccounts() {
        return this.accounts == null ? Input.empty() : this.accounts;
    }

    /**
     * Number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both. The default value is 0 if no value is specified.
     * 
     */
    @InputImport(name="failureToleranceCount")
    private final @Nullable Input<Integer> failureToleranceCount;

    public Input<Integer> getFailureToleranceCount() {
        return this.failureToleranceCount == null ? Input.empty() : this.failureToleranceCount;
    }

    /**
     * Percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both.
     * 
     */
    @InputImport(name="failureTolerancePercentage")
    private final @Nullable Input<Integer> failureTolerancePercentage;

    public Input<Integer> getFailureTolerancePercentage() {
        return this.failureTolerancePercentage == null ? Input.empty() : this.failureTolerancePercentage;
    }

    /**
     * Maximum number of accounts in which to perform this operation at one time. This is dependent on the value of `failure_tolerance_count`. `max_concurrency_count` is at most one more than the `failure_tolerance_count`. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
     * 
     */
    @InputImport(name="maxConcurrencyCount")
    private final @Nullable Input<Integer> maxConcurrencyCount;

    public Input<Integer> getMaxConcurrencyCount() {
        return this.maxConcurrencyCount == null ? Input.empty() : this.maxConcurrencyCount;
    }

    /**
     * Maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
     * 
     */
    @InputImport(name="maxConcurrencyPercentage")
    private final @Nullable Input<Integer> maxConcurrencyPercentage;

    public Input<Integer> getMaxConcurrencyPercentage() {
        return this.maxConcurrencyPercentage == null ? Input.empty() : this.maxConcurrencyPercentage;
    }

    /**
     * One or more AWS Regions where the provisioned product will be available. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all regions from the STACKSET constraint.
     * 
     */
    @InputImport(name="regions")
    private final @Nullable Input<List<String>> regions;

    public Input<List<String>> getRegions() {
        return this.regions == null ? Input.empty() : this.regions;
    }

    public ProvisionedProductStackSetProvisioningPreferencesGetArgs(
        @Nullable Input<List<String>> accounts,
        @Nullable Input<Integer> failureToleranceCount,
        @Nullable Input<Integer> failureTolerancePercentage,
        @Nullable Input<Integer> maxConcurrencyCount,
        @Nullable Input<Integer> maxConcurrencyPercentage,
        @Nullable Input<List<String>> regions) {
        this.accounts = accounts;
        this.failureToleranceCount = failureToleranceCount;
        this.failureTolerancePercentage = failureTolerancePercentage;
        this.maxConcurrencyCount = maxConcurrencyCount;
        this.maxConcurrencyPercentage = maxConcurrencyPercentage;
        this.regions = regions;
    }

    private ProvisionedProductStackSetProvisioningPreferencesGetArgs() {
        this.accounts = Input.empty();
        this.failureToleranceCount = Input.empty();
        this.failureTolerancePercentage = Input.empty();
        this.maxConcurrencyCount = Input.empty();
        this.maxConcurrencyPercentage = Input.empty();
        this.regions = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductStackSetProvisioningPreferencesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> accounts;
        private @Nullable Input<Integer> failureToleranceCount;
        private @Nullable Input<Integer> failureTolerancePercentage;
        private @Nullable Input<Integer> maxConcurrencyCount;
        private @Nullable Input<Integer> maxConcurrencyPercentage;
        private @Nullable Input<List<String>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedProductStackSetProvisioningPreferencesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.failureToleranceCount = defaults.failureToleranceCount;
    	      this.failureTolerancePercentage = defaults.failureTolerancePercentage;
    	      this.maxConcurrencyCount = defaults.maxConcurrencyCount;
    	      this.maxConcurrencyPercentage = defaults.maxConcurrencyPercentage;
    	      this.regions = defaults.regions;
        }

        public Builder setAccounts(@Nullable Input<List<String>> accounts) {
            this.accounts = accounts;
            return this;
        }

        public Builder setAccounts(@Nullable List<String> accounts) {
            this.accounts = Input.ofNullable(accounts);
            return this;
        }

        public Builder setFailureToleranceCount(@Nullable Input<Integer> failureToleranceCount) {
            this.failureToleranceCount = failureToleranceCount;
            return this;
        }

        public Builder setFailureToleranceCount(@Nullable Integer failureToleranceCount) {
            this.failureToleranceCount = Input.ofNullable(failureToleranceCount);
            return this;
        }

        public Builder setFailureTolerancePercentage(@Nullable Input<Integer> failureTolerancePercentage) {
            this.failureTolerancePercentage = failureTolerancePercentage;
            return this;
        }

        public Builder setFailureTolerancePercentage(@Nullable Integer failureTolerancePercentage) {
            this.failureTolerancePercentage = Input.ofNullable(failureTolerancePercentage);
            return this;
        }

        public Builder setMaxConcurrencyCount(@Nullable Input<Integer> maxConcurrencyCount) {
            this.maxConcurrencyCount = maxConcurrencyCount;
            return this;
        }

        public Builder setMaxConcurrencyCount(@Nullable Integer maxConcurrencyCount) {
            this.maxConcurrencyCount = Input.ofNullable(maxConcurrencyCount);
            return this;
        }

        public Builder setMaxConcurrencyPercentage(@Nullable Input<Integer> maxConcurrencyPercentage) {
            this.maxConcurrencyPercentage = maxConcurrencyPercentage;
            return this;
        }

        public Builder setMaxConcurrencyPercentage(@Nullable Integer maxConcurrencyPercentage) {
            this.maxConcurrencyPercentage = Input.ofNullable(maxConcurrencyPercentage);
            return this;
        }

        public Builder setRegions(@Nullable Input<List<String>> regions) {
            this.regions = regions;
            return this;
        }

        public Builder setRegions(@Nullable List<String> regions) {
            this.regions = Input.ofNullable(regions);
            return this;
        }
        public ProvisionedProductStackSetProvisioningPreferencesGetArgs build() {
            return new ProvisionedProductStackSetProvisioningPreferencesGetArgs(accounts, failureToleranceCount, failureTolerancePercentage, maxConcurrencyCount, maxConcurrencyPercentage, regions);
        }
    }
}
