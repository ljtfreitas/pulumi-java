// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreIamMemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamMemberArgs Empty = new FhirStoreIamMemberArgs();

    @InputImport(name="condition")
        private final @Nullable Input<FhirStoreIamMemberConditionArgs> condition;

    public Input<FhirStoreIamMemberConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="fhirStoreId", required=true)
        private final Input<String> fhirStoreId;

    public Input<String> getFhirStoreId() {
        return this.fhirStoreId;
    }

    @InputImport(name="member", required=true)
        private final Input<String> member;

    public Input<String> getMember() {
        return this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
        private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public FhirStoreIamMemberArgs(
        @Nullable Input<FhirStoreIamMemberConditionArgs> condition,
        Input<String> fhirStoreId,
        Input<String> member,
        Input<String> role) {
        this.condition = condition;
        this.fhirStoreId = Objects.requireNonNull(fhirStoreId, "expected parameter 'fhirStoreId' to be non-null");
        this.member = Objects.requireNonNull(member, "expected parameter 'member' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private FhirStoreIamMemberArgs() {
        this.condition = Input.empty();
        this.fhirStoreId = Input.empty();
        this.member = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreIamMemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FhirStoreIamMemberConditionArgs> condition;
        private Input<String> fhirStoreId;
        private Input<String> member;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreIamMemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<FhirStoreIamMemberConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable FhirStoreIamMemberConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setFhirStoreId(Input<String> fhirStoreId) {
            this.fhirStoreId = Objects.requireNonNull(fhirStoreId);
            return this;
        }

        public Builder setFhirStoreId(String fhirStoreId) {
            this.fhirStoreId = Input.of(Objects.requireNonNull(fhirStoreId));
            return this;
        }

        public Builder setMember(Input<String> member) {
            this.member = Objects.requireNonNull(member);
            return this;
        }

        public Builder setMember(String member) {
            this.member = Input.of(Objects.requireNonNull(member));
            return this;
        }

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public FhirStoreIamMemberArgs build() {
            return new FhirStoreIamMemberArgs(condition, fhirStoreId, member, role);
        }
    }
}
