// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.changeanalysis;

import io.pulumi.azurenative.changeanalysis.inputs.ConfigurationProfileResourcePropertiesArgs;
import io.pulumi.azurenative.changeanalysis.inputs.ResourceIdentityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfileArgs Empty = new ConfigurationProfileArgs();

    /**
     * The identity block returned by ARM resource that supports managed identity.
     * 
     */
    @InputImport(name="identity")
        private final @Nullable Input<ResourceIdentityArgs> identity;

    public Input<ResourceIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    /**
     * The location where the resource is to be deployed.
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the configuration profile. The profile name should be set to 'default', all other names will be overwritten.
     * 
     */
    @InputImport(name="profileName")
        private final @Nullable Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName == null ? Input.empty() : this.profileName;
    }

    /**
     * The properties of a configuration profile.
     * 
     */
    @InputImport(name="properties")
        private final @Nullable Input<ConfigurationProfileResourcePropertiesArgs> properties;

    public Input<ConfigurationProfileResourcePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    public ConfigurationProfileArgs(
        @Nullable Input<ResourceIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<String> profileName,
        @Nullable Input<ConfigurationProfileResourcePropertiesArgs> properties) {
        this.identity = identity;
        this.location = location;
        this.profileName = profileName;
        this.properties = properties;
    }

    private ConfigurationProfileArgs() {
        this.identity = Input.empty();
        this.location = Input.empty();
        this.profileName = Input.empty();
        this.properties = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<String> profileName;
        private @Nullable Input<ConfigurationProfileResourcePropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.profileName = defaults.profileName;
    	      this.properties = defaults.properties;
        }

        public Builder setIdentity(@Nullable Input<ResourceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable ResourceIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setProfileName(@Nullable Input<String> profileName) {
            this.profileName = profileName;
            return this;
        }

        public Builder setProfileName(@Nullable String profileName) {
            this.profileName = Input.ofNullable(profileName);
            return this;
        }

        public Builder setProperties(@Nullable Input<ConfigurationProfileResourcePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ConfigurationProfileResourcePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }
        public ConfigurationProfileArgs build() {
            return new ConfigurationProfileArgs(identity, location, profileName, properties);
        }
    }
}
