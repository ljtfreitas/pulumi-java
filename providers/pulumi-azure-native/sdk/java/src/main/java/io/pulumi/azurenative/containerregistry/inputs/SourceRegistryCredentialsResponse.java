// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the credential parameters for accessing the source registry.
 * 
 */
public final class SourceRegistryCredentialsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SourceRegistryCredentialsResponse Empty = new SourceRegistryCredentialsResponse();

    /**
     * The authentication mode which determines the source registry login scope. The credentials for the source registry
     * will be generated using the given scope. These credentials will be used to login to
     * the source registry during the run.
     * 
     */
    @Import(name="loginMode")
      private final @Nullable String loginMode;

    public Optional<String> getLoginMode() {
        return this.loginMode == null ? Optional.empty() : Optional.ofNullable(this.loginMode);
    }

    public SourceRegistryCredentialsResponse(@Nullable String loginMode) {
        this.loginMode = loginMode;
    }

    private SourceRegistryCredentialsResponse() {
        this.loginMode = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceRegistryCredentialsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String loginMode;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceRegistryCredentialsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.loginMode = defaults.loginMode;
        }

        public Builder loginMode(@Nullable String loginMode) {
            this.loginMode = loginMode;
            return this;
        }
        public SourceRegistryCredentialsResponse build() {
            return new SourceRegistryCredentialsResponse(loginMode);
        }
    }
}
