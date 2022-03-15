// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cognitiveservices;

import io.pulumi.azurenative.cognitiveservices.inputs.CommitmentPlanPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CommitmentPlanArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommitmentPlanArgs Empty = new CommitmentPlanArgs();

    /**
     * The name of Cognitive Services account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The name of the commitmentPlan associated with the Cognitive Services Account
     * 
     */
    @Import(name="commitmentPlanName")
      private final @Nullable Output<String> commitmentPlanName;

    public Output<String> getCommitmentPlanName() {
        return this.commitmentPlanName == null ? Output.empty() : this.commitmentPlanName;
    }

    /**
     * Properties of Cognitive Services account commitment plan.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<CommitmentPlanPropertiesArgs> properties;

    public Output<CommitmentPlanPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    public CommitmentPlanArgs(
        Output<String> accountName,
        @Nullable Output<String> commitmentPlanName,
        @Nullable Output<CommitmentPlanPropertiesArgs> properties,
        Output<String> resourceGroupName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.commitmentPlanName = commitmentPlanName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private CommitmentPlanArgs() {
        this.accountName = Output.empty();
        this.commitmentPlanName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommitmentPlanArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> commitmentPlanName;
        private @Nullable Output<CommitmentPlanPropertiesArgs> properties;
        private Output<String> resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(CommitmentPlanArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.commitmentPlanName = defaults.commitmentPlanName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder commitmentPlanName(@Nullable Output<String> commitmentPlanName) {
            this.commitmentPlanName = commitmentPlanName;
            return this;
        }

        public Builder commitmentPlanName(@Nullable String commitmentPlanName) {
            this.commitmentPlanName = Output.ofNullable(commitmentPlanName);
            return this;
        }

        public Builder properties(@Nullable Output<CommitmentPlanPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder properties(@Nullable CommitmentPlanPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public CommitmentPlanArgs build() {
            return new CommitmentPlanArgs(accountName, commitmentPlanName, properties, resourceGroupName);
        }
    }
}
