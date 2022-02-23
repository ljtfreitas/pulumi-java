// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.UrlRedirectActionParametersResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UrlRedirectActionResponse {
    /**
     * The name of the action for the delivery rule.
     * Expected value is 'UrlRedirect'.
     * 
     */
    private final String name;
    /**
     * Defines the parameters for the action.
     * 
     */
    private final UrlRedirectActionParametersResponse parameters;

    @OutputCustomType.Constructor({"name","parameters"})
    private UrlRedirectActionResponse(
        String name,
        UrlRedirectActionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name);
        this.parameters = Objects.requireNonNull(parameters);
    }

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'UrlRedirect'.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Defines the parameters for the action.
     * 
     */
    public UrlRedirectActionParametersResponse getParameters() {
        return this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRedirectActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlRedirectActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRedirectActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(UrlRedirectActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public UrlRedirectActionResponse build() {
            return new UrlRedirectActionResponse(name, parameters);
        }
    }
}
