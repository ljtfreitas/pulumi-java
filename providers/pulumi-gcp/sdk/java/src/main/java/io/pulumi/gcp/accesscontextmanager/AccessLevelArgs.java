// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelBasicArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessLevelArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelArgs Empty = new AccessLevelArgs();

    /**
     * A set of predefined conditions for the access level and a combining function.
     * Structure is documented below.
     * 
     */
    @Import(name="basic")
      private final @Nullable Output<AccessLevelBasicArgs> basic;

    public Output<AccessLevelBasicArgs> basic() {
        return this.basic == null ? Codegen.empty() : this.basic;
    }

    /**
     * Custom access level conditions are set using the Cloud Common Expression Language to represent the necessary conditions for the level to apply to a request.
     * See CEL spec at: https://github.com/google/cel-spec.
     * Structure is documented below.
     * 
     */
    @Import(name="custom")
      private final @Nullable Output<AccessLevelCustomArgs> custom;

    public Output<AccessLevelCustomArgs> custom() {
        return this.custom == null ? Codegen.empty() : this.custom;
    }

    /**
     * Description of the expression
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Resource name for the Access Level. The short_name component must begin
     * with a letter and only include alphanumeric and '_'.
     * Format: accessPolicies/{policy_id}/accessLevels/{short_name}
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The AccessPolicy this AccessLevel lives in.
     * Format: accessPolicies/{policy_id}
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> parent() {
        return this.parent;
    }

    /**
     * Title for the expression, i.e. a short string describing its purpose.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> title() {
        return this.title;
    }

    public AccessLevelArgs(
        @Nullable Output<AccessLevelBasicArgs> basic,
        @Nullable Output<AccessLevelCustomArgs> custom,
        @Nullable Output<String> description,
        @Nullable Output<String> name,
        Output<String> parent,
        Output<String> title) {
        this.basic = basic;
        this.custom = custom;
        this.description = description;
        this.name = name;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private AccessLevelArgs() {
        this.basic = Codegen.empty();
        this.custom = Codegen.empty();
        this.description = Codegen.empty();
        this.name = Codegen.empty();
        this.parent = Codegen.empty();
        this.title = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AccessLevelBasicArgs> basic;
        private @Nullable Output<AccessLevelCustomArgs> custom;
        private @Nullable Output<String> description;
        private @Nullable Output<String> name;
        private Output<String> parent;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basic = defaults.basic;
    	      this.custom = defaults.custom;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.parent = defaults.parent;
    	      this.title = defaults.title;
        }

        public Builder basic(@Nullable Output<AccessLevelBasicArgs> basic) {
            this.basic = basic;
            return this;
        }
        public Builder basic(@Nullable AccessLevelBasicArgs basic) {
            this.basic = Codegen.ofNullable(basic);
            return this;
        }
        public Builder custom(@Nullable Output<AccessLevelCustomArgs> custom) {
            this.custom = custom;
            return this;
        }
        public Builder custom(@Nullable AccessLevelCustomArgs custom) {
            this.custom = Codegen.ofNullable(custom);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }
        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }        public AccessLevelArgs build() {
            return new AccessLevelArgs(basic, custom, description, name, parent, title);
        }
    }
}
