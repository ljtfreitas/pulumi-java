// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.rds.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterRoleAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ClusterRoleAssociationState Empty = new ClusterRoleAssociationState();

    /**
     * DB Cluster Identifier to associate with the IAM Role.
     * 
     */
    @Import(name="dbClusterIdentifier")
      private final @Nullable Output<String> dbClusterIdentifier;

    public Output<String> getDbClusterIdentifier() {
        return this.dbClusterIdentifier == null ? Output.empty() : this.dbClusterIdentifier;
    }

    /**
     * Name of the feature for association. This can be found in the AWS documentation relevant to the integration or a full list is available in the `SupportedFeatureNames` list returned by [AWS CLI rds describe-db-engine-versions](https://docs.aws.amazon.com/cli/latest/reference/rds/describe-db-engine-versions.html).
     * 
     */
    @Import(name="featureName")
      private final @Nullable Output<String> featureName;

    public Output<String> getFeatureName() {
        return this.featureName == null ? Output.empty() : this.featureName;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM Role to associate with the DB Cluster.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Output.empty() : this.roleArn;
    }

    public ClusterRoleAssociationState(
        @Nullable Output<String> dbClusterIdentifier,
        @Nullable Output<String> featureName,
        @Nullable Output<String> roleArn) {
        this.dbClusterIdentifier = dbClusterIdentifier;
        this.featureName = featureName;
        this.roleArn = roleArn;
    }

    private ClusterRoleAssociationState() {
        this.dbClusterIdentifier = Output.empty();
        this.featureName = Output.empty();
        this.roleArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterRoleAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dbClusterIdentifier;
        private @Nullable Output<String> featureName;
        private @Nullable Output<String> roleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterRoleAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dbClusterIdentifier = defaults.dbClusterIdentifier;
    	      this.featureName = defaults.featureName;
    	      this.roleArn = defaults.roleArn;
        }

        public Builder dbClusterIdentifier(@Nullable Output<String> dbClusterIdentifier) {
            this.dbClusterIdentifier = dbClusterIdentifier;
            return this;
        }

        public Builder dbClusterIdentifier(@Nullable String dbClusterIdentifier) {
            this.dbClusterIdentifier = Output.ofNullable(dbClusterIdentifier);
            return this;
        }

        public Builder featureName(@Nullable Output<String> featureName) {
            this.featureName = featureName;
            return this;
        }

        public Builder featureName(@Nullable String featureName) {
            this.featureName = Output.ofNullable(featureName);
            return this;
        }

        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Output.ofNullable(roleArn);
            return this;
        }
        public ClusterRoleAssociationState build() {
            return new ClusterRoleAssociationState(dbClusterIdentifier, featureName, roleArn);
        }
    }
}
