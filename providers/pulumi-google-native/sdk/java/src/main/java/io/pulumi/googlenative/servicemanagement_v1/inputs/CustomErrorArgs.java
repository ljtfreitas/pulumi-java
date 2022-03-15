// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.servicemanagement_v1.inputs.CustomErrorRuleArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Customize service error responses. For example, list any service specific protobuf types that can appear in error detail lists of error responses. Example: custom_error: types: - google.foo.v1.CustomError - google.foo.v1.AnotherError
 * 
 */
public final class CustomErrorArgs extends io.pulumi.resources.ResourceArgs {

    public static final CustomErrorArgs Empty = new CustomErrorArgs();

    /**
     * The list of custom error rules that apply to individual API messages. **NOTE:** All service configuration rules follow "last one wins" order.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<CustomErrorRuleArgs>> rules;

    public Output<List<CustomErrorRuleArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * The list of custom error detail types, e.g. 'google.foo.v1.CustomError'.
     * 
     */
    @Import(name="types")
      private final @Nullable Output<List<String>> types;

    public Output<List<String>> getTypes() {
        return this.types == null ? Output.empty() : this.types;
    }

    public CustomErrorArgs(
        @Nullable Output<List<CustomErrorRuleArgs>> rules,
        @Nullable Output<List<String>> types) {
        this.rules = rules;
        this.types = types;
    }

    private CustomErrorArgs() {
        this.rules = Output.empty();
        this.types = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomErrorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CustomErrorRuleArgs>> rules;
        private @Nullable Output<List<String>> types;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomErrorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rules = defaults.rules;
    	      this.types = defaults.types;
        }

        public Builder rules(@Nullable Output<List<CustomErrorRuleArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder rules(@Nullable List<CustomErrorRuleArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }

        public Builder types(@Nullable Output<List<String>> types) {
            this.types = types;
            return this;
        }

        public Builder types(@Nullable List<String> types) {
            this.types = Output.ofNullable(types);
            return this;
        }
        public CustomErrorArgs build() {
            return new CustomErrorArgs(rules, types);
        }
    }
}
