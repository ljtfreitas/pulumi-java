// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ClusterAuthenticatorGroupsConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterAuthenticatorGroupsConfigGetArgs Empty = new ClusterAuthenticatorGroupsConfigGetArgs();

    /**
     * The name of the RBAC security group for use with Google security groups in Kubernetes RBAC. Group name must be in format `gke-security-groups@yourdomain.com`.
     * 
     */
    @Import(name="securityGroup", required=true)
      private final Output<String> securityGroup;

    public Output<String> securityGroup() {
        return this.securityGroup;
    }

    public ClusterAuthenticatorGroupsConfigGetArgs(Output<String> securityGroup) {
        this.securityGroup = Objects.requireNonNull(securityGroup, "expected parameter 'securityGroup' to be non-null");
    }

    private ClusterAuthenticatorGroupsConfigGetArgs() {
        this.securityGroup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterAuthenticatorGroupsConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterAuthenticatorGroupsConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder securityGroup(Output<String> securityGroup) {
            this.securityGroup = Objects.requireNonNull(securityGroup);
            return this;
        }
        public Builder securityGroup(String securityGroup) {
            this.securityGroup = Output.of(Objects.requireNonNull(securityGroup));
            return this;
        }        public ClusterAuthenticatorGroupsConfigGetArgs build() {
            return new ClusterAuthenticatorGroupsConfigGetArgs(securityGroup);
        }
    }
}
