// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagOptionArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagOptionArgs Empty = new TagOptionArgs();

    /**
     * Whether tag option is active. Default is `true`.
     * 
     */
    @Import(name="active")
      private final @Nullable Output<Boolean> active;

    public Output<Boolean> getActive() {
        return this.active == null ? Output.empty() : this.active;
    }

    /**
     * Tag option key.
     * 
     */
    @Import(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    /**
     * Tag option value.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public TagOptionArgs(
        @Nullable Output<Boolean> active,
        Output<String> key,
        Output<String> value) {
        this.active = active;
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private TagOptionArgs() {
        this.active = Output.empty();
        this.key = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> active;
        private Output<String> key;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(TagOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder active(@Nullable Output<Boolean> active) {
            this.active = active;
            return this;
        }

        public Builder active(@Nullable Boolean active) {
            this.active = Output.ofNullable(active);
            return this;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }

        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }
        public TagOptionArgs build() {
            return new TagOptionArgs(active, key, value);
        }
    }
}
