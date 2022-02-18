// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.UrlSigningActionParametersArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the url signing action for the delivery rule.
 * 
 */
public final class UrlSigningActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final UrlSigningActionArgs Empty = new UrlSigningActionArgs();

    /**
     * The name of the action for the delivery rule.
     * Expected value is 'UrlSigning'.
     * 
     */
    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @InputImport(name="parameters", required=true)
    private final Input<UrlSigningActionParametersArgs> parameters;

    public Input<UrlSigningActionParametersArgs> getParameters() {
        return this.parameters;
    }

    public UrlSigningActionArgs(
        Input<String> name,
        Input<UrlSigningActionParametersArgs> parameters) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private UrlSigningActionArgs() {
        this.name = Input.empty();
        this.parameters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlSigningActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> name;
        private Input<UrlSigningActionParametersArgs> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlSigningActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setParameters(Input<UrlSigningActionParametersArgs> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder setParameters(UrlSigningActionParametersArgs parameters) {
            this.parameters = Input.of(Objects.requireNonNull(parameters));
            return this;
        }

        public UrlSigningActionArgs build() {
            return new UrlSigningActionArgs(name, parameters);
        }
    }
}
