// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetClusterAuthenticatorGroupsConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetClusterAuthenticatorGroupsConfig Empty = new GetClusterAuthenticatorGroupsConfig();

    @Import(name="securityGroup", required=true)
      private final String securityGroup;

    public String getSecurityGroup() {
        return this.securityGroup;
    }

    public GetClusterAuthenticatorGroupsConfig(String securityGroup) {
        this.securityGroup = Objects.requireNonNull(securityGroup, "expected parameter 'securityGroup' to be non-null");
    }

    private GetClusterAuthenticatorGroupsConfig() {
        this.securityGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterAuthenticatorGroupsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String securityGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterAuthenticatorGroupsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.securityGroup = defaults.securityGroup;
        }

        public Builder securityGroup(String securityGroup) {
            this.securityGroup = Objects.requireNonNull(securityGroup);
            return this;
        }
        public GetClusterAuthenticatorGroupsConfig build() {
            return new GetClusterAuthenticatorGroupsConfig(securityGroup);
        }
    }
}
