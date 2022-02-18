// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConfigurationProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConfigurationProfileArgs Empty = new GetConfigurationProfileArgs();

    /**
     * The name of the configuration profile. The profile name should be set to 'default', all other names will be overwritten.
     * 
     */
    @InputImport(name="profileName", required=true)
    private final String profileName;

    public String getProfileName() {
        return this.profileName;
    }

    public GetConfigurationProfileArgs(String profileName) {
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
    }

    private GetConfigurationProfileArgs() {
        this.profileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConfigurationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String profileName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConfigurationProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.profileName = defaults.profileName;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public GetConfigurationProfileArgs build() {
            return new GetConfigurationProfileArgs(profileName);
        }
    }
}
