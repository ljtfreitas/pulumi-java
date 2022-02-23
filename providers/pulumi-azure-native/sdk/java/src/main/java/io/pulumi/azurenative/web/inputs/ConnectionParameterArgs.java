// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.ConnectionParameterType;
import io.pulumi.azurenative.web.inputs.ApiOAuthSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connection provider parameters
 * 
 */
public final class ConnectionParameterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionParameterArgs Empty = new ConnectionParameterArgs();

    /**
     * OAuth settings for the connection provider
     * 
     */
    @InputImport(name="oAuthSettings")
        private final @Nullable Input<ApiOAuthSettingsArgs> oAuthSettings;

    public Input<ApiOAuthSettingsArgs> getOAuthSettings() {
        return this.oAuthSettings == null ? Input.empty() : this.oAuthSettings;
    }

    /**
     * Type of the parameter
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<ConnectionParameterType> type;

    public Input<ConnectionParameterType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ConnectionParameterArgs(
        @Nullable Input<ApiOAuthSettingsArgs> oAuthSettings,
        @Nullable Input<ConnectionParameterType> type) {
        this.oAuthSettings = oAuthSettings;
        this.type = type;
    }

    private ConnectionParameterArgs() {
        this.oAuthSettings = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionParameterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ApiOAuthSettingsArgs> oAuthSettings;
        private @Nullable Input<ConnectionParameterType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionParameterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oAuthSettings = defaults.oAuthSettings;
    	      this.type = defaults.type;
        }

        public Builder setOAuthSettings(@Nullable Input<ApiOAuthSettingsArgs> oAuthSettings) {
            this.oAuthSettings = oAuthSettings;
            return this;
        }

        public Builder setOAuthSettings(@Nullable ApiOAuthSettingsArgs oAuthSettings) {
            this.oAuthSettings = Input.ofNullable(oAuthSettings);
            return this;
        }

        public Builder setType(@Nullable Input<ConnectionParameterType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ConnectionParameterType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ConnectionParameterArgs build() {
            return new ConnectionParameterArgs(oAuthSettings, type);
        }
    }
}
