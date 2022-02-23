// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudresourcemanager_v3.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.cloudresourcemanager_v3.outputs.AuditConfigResponse;
import io.pulumi.googlenative.cloudresourcemanager_v3.outputs.BindingResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetOrganizationIamPolicyResult {
    /**
     * Specifies cloud audit logging configuration for this policy.
     * 
     */
    private final List<AuditConfigResponse> auditConfigs;
    /**
     * Associates a list of `members`, or principals, with a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one principal. The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to any other principal, then you can add another 1,450 principals to the `bindings` in the `Policy`.
     * 
     */
    private final List<BindingResponse> bindings;
    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
     * 
     */
    private final String etag;
    /**
     * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    private final Integer version;

    @OutputCustomType.Constructor({"auditConfigs","bindings","etag","version"})
    private GetOrganizationIamPolicyResult(
        List<AuditConfigResponse> auditConfigs,
        List<BindingResponse> bindings,
        String etag,
        Integer version) {
        this.auditConfigs = Objects.requireNonNull(auditConfigs);
        this.bindings = Objects.requireNonNull(bindings);
        this.etag = Objects.requireNonNull(etag);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * Specifies cloud audit logging configuration for this policy.
     * 
     */
    public List<AuditConfigResponse> getAuditConfigs() {
        return this.auditConfigs;
    }
    /**
     * Associates a list of `members`, or principals, with a `role`. Optionally, may specify a `condition` that determines how and when the `bindings` are applied. Each of the `bindings` must contain at least one principal. The `bindings` in a `Policy` can refer to up to 1,500 principals; up to 250 of these principals can be Google groups. Each occurrence of a principal counts towards these limits. For example, if the `bindings` grant 50 different roles to `user:alice@example.com`, and not to any other principal, then you can add another 1,450 principals to the `bindings` in the `Policy`.
     * 
     */
    public List<BindingResponse> getBindings() {
        return this.bindings;
    }
    /**
     * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a policy from overwriting each other. It is strongly suggested that systems make use of the `etag` in the read-modify-write cycle to perform policy updates in order to avoid race conditions: An `etag` is returned in the response to `getIamPolicy`, and systems are expected to put that etag in the request to `setIamPolicy` to ensure that their change will be applied to the same version of the policy. **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost.
     * 
     */
    public String getEtag() {
        return this.etag;
    }
    /**
     * Specifies the format of the policy. Valid values are `0`, `1`, and `3`. Requests that specify an invalid value are rejected. Any operation that affects conditional role bindings must specify version `3`. This requirement applies to the following operations: * Getting a policy that includes a conditional role binding * Adding a conditional role binding to a policy * Changing a conditional role binding in a policy * Removing any role binding, with or without a condition, from a policy that includes conditions **Important:** If you use IAM Conditions, you must include the `etag` field whenever you call `setIamPolicy`. If you omit this field, then IAM allows you to overwrite a version `3` policy with a version `1` policy, and all of the conditions in the version `3` policy are lost. If a policy does not include any conditions, operations on that policy may specify any valid version or leave the field unset. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    public Integer getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationIamPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AuditConfigResponse> auditConfigs;
        private List<BindingResponse> bindings;
        private String etag;
        private Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationIamPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditConfigs = defaults.auditConfigs;
    	      this.bindings = defaults.bindings;
    	      this.etag = defaults.etag;
    	      this.version = defaults.version;
        }

        public Builder setAuditConfigs(List<AuditConfigResponse> auditConfigs) {
            this.auditConfigs = Objects.requireNonNull(auditConfigs);
            return this;
        }

        public Builder setBindings(List<BindingResponse> bindings) {
            this.bindings = Objects.requireNonNull(bindings);
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setVersion(Integer version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GetOrganizationIamPolicyResult build() {
            return new GetOrganizationIamPolicyResult(auditConfigs, bindings, etag, version);
        }
    }
}
