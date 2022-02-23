// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.servicemanagement_v1.inputs.OptionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Enum value definition.
 * 
 */
public final class EnumValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnumValueArgs Empty = new EnumValueArgs();

    /**
     * Enum value name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Enum value number.
     * 
     */
    @InputImport(name="number")
      private final @Nullable Input<Integer> number;

    public Input<Integer> getNumber() {
        return this.number == null ? Input.empty() : this.number;
    }

    /**
     * Protocol buffer options.
     * 
     */
    @InputImport(name="options")
      private final @Nullable Input<List<OptionArgs>> options;

    public Input<List<OptionArgs>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    public EnumValueArgs(
        @Nullable Input<String> name,
        @Nullable Input<Integer> number,
        @Nullable Input<List<OptionArgs>> options) {
        this.name = name;
        this.number = number;
        this.options = options;
    }

    private EnumValueArgs() {
        this.name = Input.empty();
        this.number = Input.empty();
        this.options = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnumValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> number;
        private @Nullable Input<List<OptionArgs>> options;

        public Builder() {
    	      // Empty
        }

        public Builder(EnumValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.options = defaults.options;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNumber(@Nullable Input<Integer> number) {
            this.number = number;
            return this;
        }

        public Builder setNumber(@Nullable Integer number) {
            this.number = Input.ofNullable(number);
            return this;
        }

        public Builder setOptions(@Nullable Input<List<OptionArgs>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable List<OptionArgs> options) {
            this.options = Input.ofNullable(options);
            return this;
        }
        public EnumValueArgs build() {
            return new EnumValueArgs(name, number, options);
        }
    }
}
