// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.inputs;

import io.pulumi.azurenative.kubernetesconfiguration.enums.ResourceIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity for the managed cluster.
 * 
 */
public final class ConfigurationIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationIdentityArgs Empty = new ConfigurationIdentityArgs();

    /**
     * The type of identity used for the configuration. Type 'SystemAssigned' will use an implicitly created identity. Type 'None' will not use Managed Identity for the configuration.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<ResourceIdentityType> type;

    public Input<ResourceIdentityType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ConfigurationIdentityArgs(@Nullable Input<ResourceIdentityType> type) {
        this.type = type;
    }

    private ConfigurationIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ResourceIdentityType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ConfigurationIdentityArgs build() {
            return new ConfigurationIdentityArgs(type);
        }
    }
}
