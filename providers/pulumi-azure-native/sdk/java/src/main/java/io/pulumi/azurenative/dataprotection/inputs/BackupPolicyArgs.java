// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dataprotection.inputs;

import io.pulumi.azurenative.dataprotection.inputs.AzureBackupRuleArgs;
import io.pulumi.azurenative.dataprotection.inputs.AzureRetentionRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Rule based backup policy
 * 
 */
public final class BackupPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackupPolicyArgs Empty = new BackupPolicyArgs();

    /**
     * Type of datasource for the backup management
     * 
     */
    @InputImport(name="datasourceTypes", required=true)
    private final Input<List<String>> datasourceTypes;

    public Input<List<String>> getDatasourceTypes() {
        return this.datasourceTypes;
    }

    /**
     * Expected value is 'BackupPolicy'.
     * 
     */
    @InputImport(name="objectType", required=true)
    private final Input<String> objectType;

    public Input<String> getObjectType() {
        return this.objectType;
    }

    /**
     * Policy rule dictionary that contains rules for each backuptype i.e Full/Incremental/Logs etc
     * 
     */
    @InputImport(name="policyRules", required=true)
    private final Input<List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>>> policyRules;

    public Input<List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>>> getPolicyRules() {
        return this.policyRules;
    }

    public BackupPolicyArgs(
        Input<List<String>> datasourceTypes,
        Input<String> objectType,
        Input<List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>>> policyRules) {
        this.datasourceTypes = Objects.requireNonNull(datasourceTypes, "expected parameter 'datasourceTypes' to be non-null");
        this.objectType = Objects.requireNonNull(objectType, "expected parameter 'objectType' to be non-null");
        this.policyRules = Objects.requireNonNull(policyRules, "expected parameter 'policyRules' to be non-null");
    }

    private BackupPolicyArgs() {
        this.datasourceTypes = Input.empty();
        this.objectType = Input.empty();
        this.policyRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackupPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> datasourceTypes;
        private Input<String> objectType;
        private Input<List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>>> policyRules;

        public Builder() {
    	      // Empty
        }

        public Builder(BackupPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasourceTypes = defaults.datasourceTypes;
    	      this.objectType = defaults.objectType;
    	      this.policyRules = defaults.policyRules;
        }

        public Builder setDatasourceTypes(Input<List<String>> datasourceTypes) {
            this.datasourceTypes = Objects.requireNonNull(datasourceTypes);
            return this;
        }

        public Builder setDatasourceTypes(List<String> datasourceTypes) {
            this.datasourceTypes = Input.of(Objects.requireNonNull(datasourceTypes));
            return this;
        }

        public Builder setObjectType(Input<String> objectType) {
            this.objectType = Objects.requireNonNull(objectType);
            return this;
        }

        public Builder setObjectType(String objectType) {
            this.objectType = Input.of(Objects.requireNonNull(objectType));
            return this;
        }

        public Builder setPolicyRules(Input<List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>>> policyRules) {
            this.policyRules = Objects.requireNonNull(policyRules);
            return this;
        }

        public Builder setPolicyRules(List<Either<AzureBackupRuleArgs,AzureRetentionRuleArgs>> policyRules) {
            this.policyRules = Input.of(Objects.requireNonNull(policyRules));
            return this;
        }

        public BackupPolicyArgs build() {
            return new BackupPolicyArgs(datasourceTypes, objectType, policyRules);
        }
    }
}
