// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.apigee_v1.inputs.GoogleTypeExprResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Associates `members`, or principals, with a `role`.
 * 
 */
public final class GoogleIamV1BindingResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleIamV1BindingResponse Empty = new GoogleIamV1BindingResponse();

    /**
     * The condition that is associated with this binding. If the condition evaluates to `true`, then this binding applies to the current request. If the condition evaluates to `false`, then this binding does not apply to the current request. However, a different role binding might grant the same role to one or more of the principals in this binding. To learn which resources support conditions in their IAM policies, see the [IAM documentation](https://cloud.google.com/iam/help/conditions/resource-policies).
     * 
     */
    @InputImport(name="condition", required=true)
      private final GoogleTypeExprResponse condition;

    public GoogleTypeExprResponse getCondition() {
        return this.condition;
    }

    /**
     * Specifies the principals requesting access for a Cloud Platform resource. `members` can have the following values: * `allUsers`: A special identifier that represents anyone who is on the internet; with or without a Google account. * `allAuthenticatedUsers`: A special identifier that represents anyone who is authenticated with a Google account or a service account. * `user:{emailid}`: An email address that represents a specific Google account. For example, `alice@example.com` . * `serviceAccount:{emailid}`: An email address that represents a service account. For example, `my-other-app@appspot.gserviceaccount.com`. * `group:{emailid}`: An email address that represents a Google group. For example, `admins@example.com`. * `deleted:user:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a user that has been recently deleted. For example, `alice@example.com?uid=123456789012345678901`. If the user is recovered, this value reverts to `user:{emailid}` and the recovered user retains the role in the binding. * `deleted:serviceAccount:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a service account that has been recently deleted. For example, `my-other-app@appspot.gserviceaccount.com?uid=123456789012345678901`. If the service account is undeleted, this value reverts to `serviceAccount:{emailid}` and the undeleted service account retains the role in the binding. * `deleted:group:{emailid}?uid={uniqueid}`: An email address (plus unique identifier) representing a Google group that has been recently deleted. For example, `admins@example.com?uid=123456789012345678901`. If the group is recovered, this value reverts to `group:{emailid}` and the recovered group retains the role in the binding. * `domain:{domain}`: The G Suite domain (primary) that represents all the users of that domain. For example, `google.com` or `example.com`.
     * 
     */
    @InputImport(name="members", required=true)
      private final List<String> members;

    public List<String> getMembers() {
        return this.members;
    }

    /**
     * Role that is assigned to the list of `members`, or principals. For example, `roles/viewer`, `roles/editor`, or `roles/owner`.
     * 
     */
    @InputImport(name="role", required=true)
      private final String role;

    public String getRole() {
        return this.role;
    }

    public GoogleIamV1BindingResponse(
        GoogleTypeExprResponse condition,
        List<String> members,
        String role) {
        this.condition = Objects.requireNonNull(condition, "expected parameter 'condition' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private GoogleIamV1BindingResponse() {
        this.condition = null;
        this.members = List.of();
        this.role = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleIamV1BindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleTypeExprResponse condition;
        private List<String> members;
        private String role;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleIamV1BindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(GoogleTypeExprResponse condition) {
            this.condition = Objects.requireNonNull(condition);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public GoogleIamV1BindingResponse build() {
            return new GoogleIamV1BindingResponse(condition, members, role);
        }
    }
}
