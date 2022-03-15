// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources;

import io.pulumi.azurenative.resources.inputs.TagsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class TagAtScopeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagAtScopeArgs Empty = new TagAtScopeArgs();

    /**
     * The set of tags.
     * 
     */
    @Import(name="properties", required=true)
      private final Output<TagsArgs> properties;

    public Output<TagsArgs> getProperties() {
        return this.properties;
    }

    /**
     * The resource scope.
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    public TagAtScopeArgs(
        Output<TagsArgs> properties,
        Output<String> scope) {
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private TagAtScopeArgs() {
        this.properties = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagAtScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<TagsArgs> properties;
        private Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(TagAtScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.scope = defaults.scope;
        }

        public Builder properties(Output<TagsArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder properties(TagsArgs properties) {
            this.properties = Output.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public TagAtScopeArgs build() {
            return new TagAtScopeArgs(properties, scope);
        }
    }
}
