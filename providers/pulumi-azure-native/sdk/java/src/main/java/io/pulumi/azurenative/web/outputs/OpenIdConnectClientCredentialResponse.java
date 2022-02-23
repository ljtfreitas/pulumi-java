// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OpenIdConnectClientCredentialResponse {
    /**
     * The app setting that contains the client secret for the custom Open ID Connect provider.
     * 
     */
    private final @Nullable String clientSecretSettingName;
    /**
     * The method that should be used to authenticate the user.
     * 
     */
    private final @Nullable String method;

    @OutputCustomType.Constructor({"clientSecretSettingName","method"})
    private OpenIdConnectClientCredentialResponse(
        @Nullable String clientSecretSettingName,
        @Nullable String method) {
        this.clientSecretSettingName = clientSecretSettingName;
        this.method = method;
    }

    /**
     * The app setting that contains the client secret for the custom Open ID Connect provider.
     * 
     */
    public Optional<String> getClientSecretSettingName() {
        return Optional.ofNullable(this.clientSecretSettingName);
    }
    /**
     * The method that should be used to authenticate the user.
     * 
     */
    public Optional<String> getMethod() {
        return Optional.ofNullable(this.method);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OpenIdConnectClientCredentialResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientSecretSettingName;
        private @Nullable String method;

        public Builder() {
    	      // Empty
        }

        public Builder(OpenIdConnectClientCredentialResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientSecretSettingName = defaults.clientSecretSettingName;
    	      this.method = defaults.method;
        }

        public Builder setClientSecretSettingName(@Nullable String clientSecretSettingName) {
            this.clientSecretSettingName = clientSecretSettingName;
            return this;
        }

        public Builder setMethod(@Nullable String method) {
            this.method = method;
            return this;
        }
        public OpenIdConnectClientCredentialResponse build() {
            return new OpenIdConnectClientCredentialResponse(clientSecretSettingName, method);
        }
    }
}
