// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v2beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.cloudresourcemanager_v2beta1.inputs.AuditConfigArgs;
import io.pulumi.googlenative.cloudresourcemanager_v2beta1.inputs.BindingArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FolderIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final FolderIamPolicyArgs Empty = new FolderIamPolicyArgs();

    /**
     * Specifies cloud audit logging configuration for this policy.
     * 
     */
    @InputImport(name="auditConfigs")
      private final @Nullable Input<List<AuditConfigArgs>> auditConfigs;

    public Input<List<AuditConfigArgs>> getAuditConfigs() {
        return this.auditConfigs == null ? Input.empty() : this.auditConfigs;
    }

    /**
     * Associates a list of `members`, or principals, with a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one principal. The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to any other principal, then you can add another 1,450 principals to the `bindings` in the `Policy`.
     * 
     */
    @InputImport(name="bindings")
      private final @Nullable Input<List<BindingArgs>> bindings;

    public Input<List<BindingArgs>> getBindings() {
        return this.bindings == null ? Input.empty() : this.bindings;
    }

    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="folderId", required=true)
      private final Input<String> folderId;

    public Input<String> getFolderId() {
        return this.folderId;
    }

    /**
     * OPTIONAL: A FieldMask specifying which fields of the policy to modify. Only the fields in the mask will be modified. If no mask is provided, the following default mask is used: `paths: "bindings, etag"`
     * 
     */
    @InputImport(name="updateMask")
      private final @Nullable Input<String> updateMask;

    public Input<String> getUpdateMask() {
        return this.updateMask == null ? Input.empty() : this.updateMask;
    }

    /**
     * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    @InputImport(name="version")
      private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public FolderIamPolicyArgs(
        @Nullable Input<List<AuditConfigArgs>> auditConfigs,
        @Nullable Input<List<BindingArgs>> bindings,
        @Nullable Input<String> etag,
        Input<String> folderId,
        @Nullable Input<String> updateMask,
        @Nullable Input<Integer> version) {
        this.auditConfigs = auditConfigs;
        this.bindings = bindings;
        this.etag = etag;
        this.folderId = Objects.requireNonNull(folderId, "expected parameter 'folderId' to be non-null");
        this.updateMask = updateMask;
        this.version = version;
    }

    private FolderIamPolicyArgs() {
        this.auditConfigs = Input.empty();
        this.bindings = Input.empty();
        this.etag = Input.empty();
        this.folderId = Input.empty();
        this.updateMask = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FolderIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<AuditConfigArgs>> auditConfigs;
        private @Nullable Input<List<BindingArgs>> bindings;
        private @Nullable Input<String> etag;
        private Input<String> folderId;
        private @Nullable Input<String> updateMask;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FolderIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.folderId = defaults.folderId;
    	      this.updateMask = defaults.updateMask;
    	      this.version = defaults.version;
        }

        public Builder setAuditConfigs(@Nullable Input<List<AuditConfigArgs>> auditConfigs) {
            this.auditConfigs = auditConfigs;
            return this;
        }

        public Builder setAuditConfigs(@Nullable List<AuditConfigArgs> auditConfigs) {
            this.auditConfigs = Input.ofNullable(auditConfigs);
            return this;
        }

        public Builder setBindings(@Nullable Input<List<BindingArgs>> bindings) {
            this.bindings = bindings;
            return this;
        }

        public Builder setBindings(@Nullable List<BindingArgs> bindings) {
            this.bindings = Input.ofNullable(bindings);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setFolderId(Input<String> folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }

        public Builder setFolderId(String folderId) {
            this.folderId = Input.of(Objects.requireNonNull(folderId));
            return this;
        }

        public Builder setUpdateMask(@Nullable Input<String> updateMask) {
            this.updateMask = updateMask;
            return this;
        }

        public Builder setUpdateMask(@Nullable String updateMask) {
            this.updateMask = Input.ofNullable(updateMask);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public FolderIamPolicyArgs build() {
            return new FolderIamPolicyArgs(auditConfigs, bindings, etag, folderId, updateMask, version);
        }
    }
}
