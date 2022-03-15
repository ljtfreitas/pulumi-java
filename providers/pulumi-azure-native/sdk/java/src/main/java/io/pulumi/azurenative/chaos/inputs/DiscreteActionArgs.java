// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.azurenative.chaos.inputs.KeyValuePairArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Model that represents a discrete action.
 * 
 */
public final class DiscreteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiscreteActionArgs Empty = new DiscreteActionArgs();

    /**
     * String that represents a Capability URN.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * List of key value pairs.
     * 
     */
    @Import(name="parameters", required=true)
      private final Output<List<KeyValuePairArgs>> parameters;

    public Output<List<KeyValuePairArgs>> getParameters() {
        return this.parameters;
    }

    /**
     * String that represents a selector.
     * 
     */
    @Import(name="selectorId", required=true)
      private final Output<String> selectorId;

    public Output<String> getSelectorId() {
        return this.selectorId;
    }

    /**
     * Enum that discriminates between action models.
     * Expected value is 'discrete'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DiscreteActionArgs(
        Output<String> name,
        Output<List<KeyValuePairArgs>> parameters,
        Output<String> selectorId,
        Output<String> type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
        this.selectorId = Objects.requireNonNull(selectorId, "expected parameter 'selectorId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DiscreteActionArgs() {
        this.name = Output.empty();
        this.parameters = Output.empty();
        this.selectorId = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiscreteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private Output<List<KeyValuePairArgs>> parameters;
        private Output<String> selectorId;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DiscreteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.selectorId = defaults.selectorId;
    	      this.type = defaults.type;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder parameters(Output<List<KeyValuePairArgs>> parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }

        public Builder parameters(List<KeyValuePairArgs> parameters) {
            this.parameters = Output.of(Objects.requireNonNull(parameters));
            return this;
        }

        public Builder selectorId(Output<String> selectorId) {
            this.selectorId = Objects.requireNonNull(selectorId);
            return this;
        }

        public Builder selectorId(String selectorId) {
            this.selectorId = Output.of(Objects.requireNonNull(selectorId));
            return this;
        }

        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public DiscreteActionArgs build() {
            return new DiscreteActionArgs(name, parameters, selectorId, type);
        }
    }
}
