// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAFDOriginArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAFDOriginArgs Empty = new GetAFDOriginArgs();

    /**
     * Name of the origin group which is unique within the profile.
     * 
     */
    @Import(name="originGroupName", required=true)
      private final String originGroupName;

    public String getOriginGroupName() {
        return this.originGroupName;
    }

    /**
     * Name of the origin which is unique within the profile.
     * 
     */
    @Import(name="originName", required=true)
      private final String originName;

    public String getOriginName() {
        return this.originName;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @Import(name="profileName", required=true)
      private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAFDOriginArgs(
        String originGroupName,
        String originName,
        String profileName,
        String resourceGroupName) {
        this.originGroupName = Objects.requireNonNull(originGroupName, "expected parameter 'originGroupName' to be non-null");
        this.originName = Objects.requireNonNull(originName, "expected parameter 'originName' to be non-null");
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAFDOriginArgs() {
        this.originGroupName = null;
        this.originName = null;
        this.profileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAFDOriginArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String originGroupName;
        private String originName;
        private String profileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAFDOriginArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.originGroupName = defaults.originGroupName;
    	      this.originName = defaults.originName;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder originGroupName(String originGroupName) {
            this.originGroupName = Objects.requireNonNull(originGroupName);
            return this;
        }

        public Builder originName(String originName) {
            this.originName = Objects.requireNonNull(originName);
            return this;
        }

        public Builder profileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetAFDOriginArgs build() {
            return new GetAFDOriginArgs(originGroupName, originName, profileName, resourceGroupName);
        }
    }
}
