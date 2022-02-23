// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayHeaderConfigurationResponse;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayUrlConfigurationResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Set of actions in the Rewrite Rule in Application Gateway.
 * 
 */
public final class ApplicationGatewayRewriteRuleActionSetResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayRewriteRuleActionSetResponse Empty = new ApplicationGatewayRewriteRuleActionSetResponse();

    /**
     * Request Header Actions in the Action Set.
     * 
     */
    @InputImport(name="requestHeaderConfigurations")
        private final @Nullable List<ApplicationGatewayHeaderConfigurationResponse> requestHeaderConfigurations;

    public List<ApplicationGatewayHeaderConfigurationResponse> getRequestHeaderConfigurations() {
        return this.requestHeaderConfigurations == null ? List.of() : this.requestHeaderConfigurations;
    }

    /**
     * Response Header Actions in the Action Set.
     * 
     */
    @InputImport(name="responseHeaderConfigurations")
        private final @Nullable List<ApplicationGatewayHeaderConfigurationResponse> responseHeaderConfigurations;

    public List<ApplicationGatewayHeaderConfigurationResponse> getResponseHeaderConfigurations() {
        return this.responseHeaderConfigurations == null ? List.of() : this.responseHeaderConfigurations;
    }

    /**
     * Url Configuration Action in the Action Set.
     * 
     */
    @InputImport(name="urlConfiguration")
        private final @Nullable ApplicationGatewayUrlConfigurationResponse urlConfiguration;

    public Optional<ApplicationGatewayUrlConfigurationResponse> getUrlConfiguration() {
        return this.urlConfiguration == null ? Optional.empty() : Optional.ofNullable(this.urlConfiguration);
    }

    public ApplicationGatewayRewriteRuleActionSetResponse(
        @Nullable List<ApplicationGatewayHeaderConfigurationResponse> requestHeaderConfigurations,
        @Nullable List<ApplicationGatewayHeaderConfigurationResponse> responseHeaderConfigurations,
        @Nullable ApplicationGatewayUrlConfigurationResponse urlConfiguration) {
        this.requestHeaderConfigurations = requestHeaderConfigurations;
        this.responseHeaderConfigurations = responseHeaderConfigurations;
        this.urlConfiguration = urlConfiguration;
    }

    private ApplicationGatewayRewriteRuleActionSetResponse() {
        this.requestHeaderConfigurations = List.of();
        this.responseHeaderConfigurations = List.of();
        this.urlConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayRewriteRuleActionSetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ApplicationGatewayHeaderConfigurationResponse> requestHeaderConfigurations;
        private @Nullable List<ApplicationGatewayHeaderConfigurationResponse> responseHeaderConfigurations;
        private @Nullable ApplicationGatewayUrlConfigurationResponse urlConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayRewriteRuleActionSetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.requestHeaderConfigurations = defaults.requestHeaderConfigurations;
    	      this.responseHeaderConfigurations = defaults.responseHeaderConfigurations;
    	      this.urlConfiguration = defaults.urlConfiguration;
        }

        public Builder setRequestHeaderConfigurations(@Nullable List<ApplicationGatewayHeaderConfigurationResponse> requestHeaderConfigurations) {
            this.requestHeaderConfigurations = requestHeaderConfigurations;
            return this;
        }

        public Builder setResponseHeaderConfigurations(@Nullable List<ApplicationGatewayHeaderConfigurationResponse> responseHeaderConfigurations) {
            this.responseHeaderConfigurations = responseHeaderConfigurations;
            return this;
        }

        public Builder setUrlConfiguration(@Nullable ApplicationGatewayUrlConfigurationResponse urlConfiguration) {
            this.urlConfiguration = urlConfiguration;
            return this;
        }
        public ApplicationGatewayRewriteRuleActionSetResponse build() {
            return new ApplicationGatewayRewriteRuleActionSetResponse(requestHeaderConfigurations, responseHeaderConfigurations, urlConfiguration);
        }
    }
}
