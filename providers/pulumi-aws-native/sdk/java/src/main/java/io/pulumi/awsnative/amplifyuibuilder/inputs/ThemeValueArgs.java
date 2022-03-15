// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.amplifyuibuilder.inputs;

import io.pulumi.awsnative.amplifyuibuilder.inputs.ThemeValuesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThemeValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeValueArgs Empty = new ThemeValueArgs();

    @Import(name="children")
      private final @Nullable Output<List<ThemeValuesArgs>> children;

    public Output<List<ThemeValuesArgs>> getChildren() {
        return this.children == null ? Output.empty() : this.children;
    }

    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public ThemeValueArgs(
        @Nullable Output<List<ThemeValuesArgs>> children,
        @Nullable Output<String> value) {
        this.children = children;
        this.value = value;
    }

    private ThemeValueArgs() {
        this.children = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<ThemeValuesArgs>> children;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.children = defaults.children;
    	      this.value = defaults.value;
        }

        public Builder children(@Nullable Output<List<ThemeValuesArgs>> children) {
            this.children = children;
            return this;
        }

        public Builder children(@Nullable List<ThemeValuesArgs> children) {
            this.children = Output.ofNullable(children);
            return this;
        }

        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }

        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }
        public ThemeValueArgs build() {
            return new ThemeValueArgs(children, value);
        }
    }
}
