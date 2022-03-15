// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the app registration for providers that have client ids and client secrets
 * 
 */
public final class ClientRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClientRegistrationArgs Empty = new ClientRegistrationArgs();

    /**
     * The Client ID of the app used for login.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * The app setting name that contains the client secret.
     * 
     */
    @Import(name="clientSecretSettingName")
      private final @Nullable Output<String> clientSecretSettingName;

    public Output<String> getClientSecretSettingName() {
        return this.clientSecretSettingName == null ? Output.empty() : this.clientSecretSettingName;
    }

    public ClientRegistrationArgs(
        @Nullable Output<String> clientId,
        @Nullable Output<String> clientSecretSettingName) {
        this.clientId = clientId;
        this.clientSecretSettingName = clientSecretSettingName;
    }

    private ClientRegistrationArgs() {
        this.clientId = Output.empty();
        this.clientSecretSettingName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> clientSecretSettingName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
        }

        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }

        public Builder clientSecretSettingName(@Nullable Output<String> clientSecretSettingName) {
            this.clientSecretSettingName = clientSecretSettingName;
            return this;
        }

        public Builder clientSecretSettingName(@Nullable String clientSecretSettingName) {
            this.clientSecretSettingName = Output.ofNullable(clientSecretSettingName);
            return this;
        }
        public ClientRegistrationArgs build() {
            return new ClientRegistrationArgs(clientId, clientSecretSettingName);
        }
    }
}
