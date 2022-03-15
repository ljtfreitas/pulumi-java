// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.container.inputs.AzureClusterAuthorizationAdminUserGetArgs;
import java.util.List;
import java.util.Objects;


public final class AzureClusterAuthorizationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterAuthorizationGetArgs Empty = new AzureClusterAuthorizationGetArgs();

    /**
     * Required. Users that can perform operations as a cluster admin. A new ClusterRoleBinding will be created to grant the cluster-admin ClusterRole to the users. At most one user can be specified. For more info on RBAC, see https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles
     * 
     */
    @Import(name="adminUsers", required=true)
      private final Output<List<AzureClusterAuthorizationAdminUserGetArgs>> adminUsers;

    public Output<List<AzureClusterAuthorizationAdminUserGetArgs>> getAdminUsers() {
        return this.adminUsers;
    }

    public AzureClusterAuthorizationGetArgs(Output<List<AzureClusterAuthorizationAdminUserGetArgs>> adminUsers) {
        this.adminUsers = Objects.requireNonNull(adminUsers, "expected parameter 'adminUsers' to be non-null");
    }

    private AzureClusterAuthorizationGetArgs() {
        this.adminUsers = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterAuthorizationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<AzureClusterAuthorizationAdminUserGetArgs>> adminUsers;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterAuthorizationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminUsers = defaults.adminUsers;
        }

        public Builder adminUsers(Output<List<AzureClusterAuthorizationAdminUserGetArgs>> adminUsers) {
            this.adminUsers = Objects.requireNonNull(adminUsers);
            return this;
        }

        public Builder adminUsers(List<AzureClusterAuthorizationAdminUserGetArgs> adminUsers) {
            this.adminUsers = Output.of(Objects.requireNonNull(adminUsers));
            return this;
        }
        public AzureClusterAuthorizationGetArgs build() {
            return new AzureClusterAuthorizationGetArgs(adminUsers);
        }
    }
}
