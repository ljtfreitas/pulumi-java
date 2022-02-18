// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automanage;

import io.pulumi.azurenative.automanage.inputs.ConfigurationProfilePreferencePropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationProfilePreferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationProfilePreferenceArgs Empty = new ConfigurationProfilePreferenceArgs();

    /**
     * Name of the configuration profile preference.
     * 
     */
    @InputImport(name="configurationProfilePreferenceName")
    private final @Nullable Input<String> configurationProfilePreferenceName;

    public Input<String> getConfigurationProfilePreferenceName() {
        return this.configurationProfilePreferenceName == null ? Input.empty() : this.configurationProfilePreferenceName;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Properties of the configuration profile preference.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<ConfigurationProfilePreferencePropertiesArgs> properties;

    public Input<ConfigurationProfilePreferencePropertiesArgs> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ConfigurationProfilePreferenceArgs(
        @Nullable Input<String> configurationProfilePreferenceName,
        @Nullable Input<String> location,
        @Nullable Input<ConfigurationProfilePreferencePropertiesArgs> properties,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.configurationProfilePreferenceName = configurationProfilePreferenceName;
        this.location = location;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private ConfigurationProfilePreferenceArgs() {
        this.configurationProfilePreferenceName = Input.empty();
        this.location = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationProfilePreferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> configurationProfilePreferenceName;
        private @Nullable Input<String> location;
        private @Nullable Input<ConfigurationProfilePreferencePropertiesArgs> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationProfilePreferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationProfilePreferenceName = defaults.configurationProfilePreferenceName;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setConfigurationProfilePreferenceName(@Nullable Input<String> configurationProfilePreferenceName) {
            this.configurationProfilePreferenceName = configurationProfilePreferenceName;
            return this;
        }

        public Builder setConfigurationProfilePreferenceName(@Nullable String configurationProfilePreferenceName) {
            this.configurationProfilePreferenceName = Input.ofNullable(configurationProfilePreferenceName);
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

        public Builder setProperties(@Nullable Input<ConfigurationProfilePreferencePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable ConfigurationProfilePreferencePropertiesArgs properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ConfigurationProfilePreferenceArgs build() {
            return new ConfigurationProfilePreferenceArgs(configurationProfilePreferenceName, location, properties, resourceGroupName, tags);
        }
    }
}
