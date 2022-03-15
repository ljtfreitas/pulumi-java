// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datacatalog_v1beta1.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaxonomyIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaxonomyIamPolicyArgs Empty = new TaxonomyIamPolicyArgs();

    /**
     * Associates a list of `members`, or principals, with a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one principal. The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to any other principal, then you can add another 1,450 principals to the `bindings` in the `Policy`.
     * 
     */
    @Import(name="bindings")
      private final @Nullable Output<List<BindingArgs>> bindings;

    public Output<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Output.empty() : this.bindings;
    }

    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="taxonomyId", required=true)
      private final Output<String> taxonomyId;

    public Output<String> getTaxonomyId() {
        return this.taxonomyId;
    }

    /**
     * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Integer> version;

    public Output<Integer> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public TaxonomyIamPolicyArgs(
        @Nullable Output<List<BindingArgs>> bindings,
        @Nullable Output<String> etag,
        @Nullable Output<String> location,
        @Nullable Output<String> project,
        Output<String> taxonomyId,
        @Nullable Output<Integer> version) {
        this.bindings = bindings;
        this.etag = etag;
        this.location = location;
        this.project = project;
        this.taxonomyId = Objects.requireNonNull(taxonomyId, "expected parameter 'taxonomyId' to be non-null");
        this.version = version;
    }

    private TaxonomyIamPolicyArgs() {
        this.bindings = Output.empty();
        this.etag = Output.empty();
        this.location = Output.empty();
        this.project = Output.empty();
        this.taxonomyId = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaxonomyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<BindingArgs>> bindings;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> location;
        private @Nullable Output<String> project;
        private Output<String> taxonomyId;
        private @Nullable Output<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(TaxonomyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.taxonomyId = defaults.taxonomyId;
    	      this.version = defaults.version;
        }

        public Builder bindings(@Nullable Output<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder bindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Output.ofNullable(bindings);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder taxonomyId(Output<String> taxonomyId) {
            this.taxonomyId = Objects.requireNonNull(taxonomyId);
            return this;
        }

        public Builder taxonomyId(String taxonomyId) {
            this.taxonomyId = Output.of(Objects.requireNonNull(taxonomyId));
            return this;
        }

        public Builder version(@Nullable Output<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder version(@Nullable Integer version) {
            this.version = Output.ofNullable(version);
            return this;
        }
        public TaxonomyIamPolicyArgs build() {
            return new TaxonomyIamPolicyArgs(bindings, etag, location, project, taxonomyId, version);
        }
    }
}
