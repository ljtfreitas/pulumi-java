// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final OptionArgs Empty = new OptionArgs();

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="value")
    private final @Nullable Input<Map<String,String>> value;

    public Input<Map<String,String>> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public OptionArgs(
        @Nullable Input<String> name,
        @Nullable Input<Map<String,String>> value) {
        this.name = name;
        this.value = value;
    }

    private OptionArgs() {
        this.name = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> name;
        private @Nullable Input<Map<String,String>> value;

        public Builder() {
    	      // Empty
        }

        public Builder(OptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setValue(@Nullable Input<Map<String,String>> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable Map<String,String> value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public OptionArgs build() {
            return new OptionArgs(name, value);
        }
    }
}