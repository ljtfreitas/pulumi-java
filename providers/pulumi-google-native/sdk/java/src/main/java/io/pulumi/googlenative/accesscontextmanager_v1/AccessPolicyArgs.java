// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AccessPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessPolicyArgs Empty = new AccessPolicyArgs();

    /**
     * The parent of this `AccessPolicy` in the Cloud Resource Hierarchy. Currently immutable once created. Format: `organizations/{organization_id}`
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }

    /**
     * The scopes of a policy define which resources an ACM policy can restrict, and where ACM resources can be referenced. For example, a policy with scopes=["folders/123"] has the following behavior: - vpcsc perimeters can only restrict projects within folders/123 - access levels can only be referenced by resources within folders/123. If empty, there are no limitations on which resources can be restricted by an ACM policy, and there are no limitations on where ACM resources can be referenced. Only one policy can include a given scope (attempting to create a second policy which includes "folders/123" will result in an error). Currently, scopes cannot be modified after a policy is created. Currently, policies can only have a single scope. Format: list of `folders/{folder_number}` or `projects/{project_number}`
     * 
     */
    @Import(name="scopes")
      private final @Nullable Output<List<String>> scopes;

    public Output<List<String>> getScopes() {
        return this.scopes == null ? Output.empty() : this.scopes;
    }

    /**
     * Human readable title. Does not affect behavior.
     * 
     */
    @Import(name="title", required=true)
      private final Output<String> title;

    public Output<String> getTitle() {
        return this.title;
    }

    public AccessPolicyArgs(
        Output<String> parent,
        @Nullable Output<List<String>> scopes,
        Output<String> title) {
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.scopes = scopes;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private AccessPolicyArgs() {
        this.parent = Output.empty();
        this.scopes = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parent;
        private @Nullable Output<List<String>> scopes;
        private Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
    	      this.scopes = defaults.scopes;
    	      this.title = defaults.title;
        }

        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }

        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }

        public Builder scopes(@Nullable Output<List<String>> scopes) {
            this.scopes = scopes;
            return this;
        }

        public Builder scopes(@Nullable List<String> scopes) {
            this.scopes = Output.ofNullable(scopes);
            return this;
        }

        public Builder title(Output<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder title(String title) {
            this.title = Output.of(Objects.requireNonNull(title));
            return this;
        }
        public AccessPolicyArgs build() {
            return new AccessPolicyArgs(parent, scopes, title);
        }
    }
}
