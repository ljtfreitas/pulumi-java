// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.UrlSigningActionParametersResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the url signing action for the delivery rule.
 * 
 */
public final class UrlSigningActionResponse extends io.pulumi.resources.InvokeArgs {

    public static final UrlSigningActionResponse Empty = new UrlSigningActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'UrlSigning'.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @InputImport(name="parameters", required=true)
    private final UrlSigningActionParametersResponse parameters;

    public UrlSigningActionParametersResponse getParameters() {
        return this.parameters;
    }

    public UrlSigningActionResponse(
        String name,
        UrlSigningActionParametersResponse parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private UrlSigningActionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlSigningActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParameters(UrlSigningActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public UrlSigningActionResponse build() {
            return new UrlSigningActionResponse(name, parameters);
        }
    }
}
