// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.events.inputs;

import io.pulumi.awsnative.events.inputs.ConnectionApiKeyAuthParameters;
import io.pulumi.awsnative.events.inputs.ConnectionBasicAuthParameters;
import io.pulumi.awsnative.events.inputs.ConnectionHttpParameters;
import io.pulumi.awsnative.events.inputs.ConnectionOAuthParameters;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthParametersProperties extends io.pulumi.resources.InvokeArgs {

    public static final AuthParametersProperties Empty = new AuthParametersProperties();

    @InputImport(name="apiKeyAuthParameters")
        private final @Nullable ConnectionApiKeyAuthParameters apiKeyAuthParameters;

    public Optional<ConnectionApiKeyAuthParameters> getApiKeyAuthParameters() {
        return this.apiKeyAuthParameters == null ? Optional.empty() : Optional.ofNullable(this.apiKeyAuthParameters);
    }

    @InputImport(name="basicAuthParameters")
        private final @Nullable ConnectionBasicAuthParameters basicAuthParameters;

    public Optional<ConnectionBasicAuthParameters> getBasicAuthParameters() {
        return this.basicAuthParameters == null ? Optional.empty() : Optional.ofNullable(this.basicAuthParameters);
    }

    @InputImport(name="invocationHttpParameters")
        private final @Nullable ConnectionHttpParameters invocationHttpParameters;

    public Optional<ConnectionHttpParameters> getInvocationHttpParameters() {
        return this.invocationHttpParameters == null ? Optional.empty() : Optional.ofNullable(this.invocationHttpParameters);
    }

    @InputImport(name="oAuthParameters")
        private final @Nullable ConnectionOAuthParameters oAuthParameters;

    public Optional<ConnectionOAuthParameters> getOAuthParameters() {
        return this.oAuthParameters == null ? Optional.empty() : Optional.ofNullable(this.oAuthParameters);
    }

    public AuthParametersProperties(
        @Nullable ConnectionApiKeyAuthParameters apiKeyAuthParameters,
        @Nullable ConnectionBasicAuthParameters basicAuthParameters,
        @Nullable ConnectionHttpParameters invocationHttpParameters,
        @Nullable ConnectionOAuthParameters oAuthParameters) {
        this.apiKeyAuthParameters = apiKeyAuthParameters;
        this.basicAuthParameters = basicAuthParameters;
        this.invocationHttpParameters = invocationHttpParameters;
        this.oAuthParameters = oAuthParameters;
    }

    private AuthParametersProperties() {
        this.apiKeyAuthParameters = null;
        this.basicAuthParameters = null;
        this.invocationHttpParameters = null;
        this.oAuthParameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthParametersProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ConnectionApiKeyAuthParameters apiKeyAuthParameters;
        private @Nullable ConnectionBasicAuthParameters basicAuthParameters;
        private @Nullable ConnectionHttpParameters invocationHttpParameters;
        private @Nullable ConnectionOAuthParameters oAuthParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthParametersProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKeyAuthParameters = defaults.apiKeyAuthParameters;
    	      this.basicAuthParameters = defaults.basicAuthParameters;
    	      this.invocationHttpParameters = defaults.invocationHttpParameters;
    	      this.oAuthParameters = defaults.oAuthParameters;
        }

        public Builder setApiKeyAuthParameters(@Nullable ConnectionApiKeyAuthParameters apiKeyAuthParameters) {
            this.apiKeyAuthParameters = apiKeyAuthParameters;
            return this;
        }

        public Builder setBasicAuthParameters(@Nullable ConnectionBasicAuthParameters basicAuthParameters) {
            this.basicAuthParameters = basicAuthParameters;
            return this;
        }

        public Builder setInvocationHttpParameters(@Nullable ConnectionHttpParameters invocationHttpParameters) {
            this.invocationHttpParameters = invocationHttpParameters;
            return this;
        }

        public Builder setOAuthParameters(@Nullable ConnectionOAuthParameters oAuthParameters) {
            this.oAuthParameters = oAuthParameters;
            return this;
        }
        public AuthParametersProperties build() {
            return new AuthParametersProperties(apiKeyAuthParameters, basicAuthParameters, invocationHttpParameters, oAuthParameters);
        }
    }
}
