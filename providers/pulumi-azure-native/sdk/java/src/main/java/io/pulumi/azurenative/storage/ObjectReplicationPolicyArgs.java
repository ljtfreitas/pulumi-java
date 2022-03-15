// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage;

import io.pulumi.azurenative.storage.inputs.ObjectReplicationPolicyRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectReplicationPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectReplicationPolicyArgs Empty = new ObjectReplicationPolicyArgs();

    /**
     * The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Required. Destination account name.
     * 
     */
    @Import(name="destinationAccount", required=true)
      private final Output<String> destinationAccount;

    public Output<String> getDestinationAccount() {
        return this.destinationAccount;
    }

    /**
     * The ID of object replication policy or 'default' if the policy ID is unknown.
     * 
     */
    @Import(name="objectReplicationPolicyId")
      private final @Nullable Output<String> objectReplicationPolicyId;

    public Output<String> getObjectReplicationPolicyId() {
        return this.objectReplicationPolicyId == null ? Output.empty() : this.objectReplicationPolicyId;
    }

    /**
     * The name of the resource group within the user's subscription. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The storage account object replication rules.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<ObjectReplicationPolicyRuleArgs>> rules;

    public Output<List<ObjectReplicationPolicyRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * Required. Source account name.
     * 
     */
    @Import(name="sourceAccount", required=true)
      private final Output<String> sourceAccount;

    public Output<String> getSourceAccount() {
        return this.sourceAccount;
    }

    public ObjectReplicationPolicyArgs(
        Output<String> accountName,
        Output<String> destinationAccount,
        @Nullable Output<String> objectReplicationPolicyId,
        Output<String> resourceGroupName,
        @Nullable Output<List<ObjectReplicationPolicyRuleArgs>> rules,
        Output<String> sourceAccount) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.destinationAccount = Objects.requireNonNull(destinationAccount, "expected parameter 'destinationAccount' to be non-null");
        this.objectReplicationPolicyId = objectReplicationPolicyId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.rules = rules;
        this.sourceAccount = Objects.requireNonNull(sourceAccount, "expected parameter 'sourceAccount' to be non-null");
    }

    private ObjectReplicationPolicyArgs() {
        this.accountName = Output.empty();
        this.destinationAccount = Output.empty();
        this.objectReplicationPolicyId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.rules = Output.empty();
        this.sourceAccount = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectReplicationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private Output<String> destinationAccount;
        private @Nullable Output<String> objectReplicationPolicyId;
        private Output<String> resourceGroupName;
        private @Nullable Output<List<ObjectReplicationPolicyRuleArgs>> rules;
        private Output<String> sourceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectReplicationPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.destinationAccount = defaults.destinationAccount;
    	      this.objectReplicationPolicyId = defaults.objectReplicationPolicyId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.rules = defaults.rules;
    	      this.sourceAccount = defaults.sourceAccount;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }

        public Builder destinationAccount(Output<String> destinationAccount) {
            this.destinationAccount = Objects.requireNonNull(destinationAccount);
            return this;
        }

        public Builder destinationAccount(String destinationAccount) {
            this.destinationAccount = Output.of(Objects.requireNonNull(destinationAccount));
            return this;
        }

        public Builder objectReplicationPolicyId(@Nullable Output<String> objectReplicationPolicyId) {
            this.objectReplicationPolicyId = objectReplicationPolicyId;
            return this;
        }

        public Builder objectReplicationPolicyId(@Nullable String objectReplicationPolicyId) {
            this.objectReplicationPolicyId = Output.ofNullable(objectReplicationPolicyId);
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

        public Builder rules(@Nullable Output<List<ObjectReplicationPolicyRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<ObjectReplicationPolicyRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }

        public Builder sourceAccount(Output<String> sourceAccount) {
            this.sourceAccount = Objects.requireNonNull(sourceAccount);
            return this;
        }

        public Builder sourceAccount(String sourceAccount) {
            this.sourceAccount = Output.of(Objects.requireNonNull(sourceAccount));
            return this;
        }
        public ObjectReplicationPolicyArgs build() {
            return new ObjectReplicationPolicyArgs(accountName, destinationAccount, objectReplicationPolicyId, resourceGroupName, rules, sourceAccount);
        }
    }
}
