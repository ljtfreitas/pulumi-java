// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSecurityPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSecurityPolicyArgs Empty = new GetSecurityPolicyArgs();

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @InputImport(name="profileName", required=true)
    private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the security policy under the profile.
     * 
     */
    @InputImport(name="securityPolicyName", required=true)
    private final String securityPolicyName;

    public String getSecurityPolicyName() {
        return this.securityPolicyName;
    }

    public GetSecurityPolicyArgs(
        String profileName,
        String resourceGroupName,
        String securityPolicyName) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.securityPolicyName = Objects.requireNonNull(securityPolicyName, "expected parameter 'securityPolicyName' to be non-null");
    }

    private GetSecurityPolicyArgs() {
        this.profileName = null;
        this.resourceGroupName = null;
        this.securityPolicyName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileName;
        private String resourceGroupName;
        private String securityPolicyName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSecurityPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.securityPolicyName = defaults.securityPolicyName;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSecurityPolicyName(String securityPolicyName) {
            this.securityPolicyName = Objects.requireNonNull(securityPolicyName);
            return this;
        }

        public GetSecurityPolicyArgs build() {
            return new GetSecurityPolicyArgs(profileName, resourceGroupName, securityPolicyName);
        }
    }
}
