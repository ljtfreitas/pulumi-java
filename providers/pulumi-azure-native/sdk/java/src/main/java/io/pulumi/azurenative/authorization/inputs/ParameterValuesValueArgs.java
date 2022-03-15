// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The value of a parameter.
 * 
 */
public final class ParameterValuesValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ParameterValuesValueArgs Empty = new ParameterValuesValueArgs();

    /**
     * The value of the parameter.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<Object> value;

    public Output<Object> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public ParameterValuesValueArgs(@Nullable Output<Object> value) {
        this.value = value;
    }

    private ParameterValuesValueArgs() {
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ParameterValuesValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Object> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ParameterValuesValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        public Builder value(@Nullable Output<Object> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable Object value) {
            this.value = Output.ofNullable(value);
            return this;
        }
        public ParameterValuesValueArgs build() {
            return new ParameterValuesValueArgs(value);
        }
    }
}
