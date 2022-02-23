// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamBindingState Empty = new FhirStoreIamBindingState();

    @InputImport(name="condition")
        private final @Nullable Input<FhirStoreIamBindingConditionGetArgs> condition;

    public Input<FhirStoreIamBindingConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the FHIR store's IAM policy.
     * 
     */
    @InputImport(name="etag")
        private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="fhirStoreId")
        private final @Nullable Input<String> fhirStoreId;

    public Input<String> getFhirStoreId() {
        return this.fhirStoreId == null ? Input.empty() : this.fhirStoreId;
    }

    @InputImport(name="members")
        private final @Nullable Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members == null ? Input.empty() : this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
        private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public FhirStoreIamBindingState(
        @Nullable Input<FhirStoreIamBindingConditionGetArgs> condition,
        @Nullable Input<String> etag,
        @Nullable Input<String> fhirStoreId,
        @Nullable Input<List<String>> members,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.fhirStoreId = fhirStoreId;
        this.members = members;
        this.role = role;
    }

    private FhirStoreIamBindingState() {
        this.condition = Input.empty();
        this.etag = Input.empty();
        this.fhirStoreId = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<FhirStoreIamBindingConditionGetArgs> condition;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> fhirStoreId;
        private @Nullable Input<List<String>> members;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<FhirStoreIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable FhirStoreIamBindingConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
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

        public Builder setFhirStoreId(@Nullable Input<String> fhirStoreId) {
            this.fhirStoreId = fhirStoreId;
            return this;
        }

        public Builder setFhirStoreId(@Nullable String fhirStoreId) {
            this.fhirStoreId = Input.ofNullable(fhirStoreId);
            return this;
        }

        public Builder setMembers(@Nullable Input<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder setMembers(@Nullable List<String> members) {
            this.members = Input.ofNullable(members);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }
        public FhirStoreIamBindingState build() {
            return new FhirStoreIamBindingState(condition, etag, fhirStoreId, members, role);
        }
    }
}
