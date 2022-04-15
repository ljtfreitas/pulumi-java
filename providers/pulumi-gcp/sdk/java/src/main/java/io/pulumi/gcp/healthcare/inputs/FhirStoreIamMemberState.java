// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.healthcare.inputs.FhirStoreIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FhirStoreIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final FhirStoreIamMemberState Empty = new FhirStoreIamMemberState();

    @Import(name="condition")
      private final @Nullable Output<FhirStoreIamMemberConditionGetArgs> condition;

    public Output<FhirStoreIamMemberConditionGetArgs> condition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the FHIR store's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * The FHIR store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{fhir_store_name}` or
     * `{location_name}/{dataset_name}/{fhir_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="fhirStoreId")
      private final @Nullable Output<String> fhirStoreId;

    public Output<String> fhirStoreId() {
        return this.fhirStoreId == null ? Codegen.empty() : this.fhirStoreId;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> member() {
        return this.member == null ? Codegen.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.FhirStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> role() {
        return this.role == null ? Codegen.empty() : this.role;
    }

    public FhirStoreIamMemberState(
        @Nullable Output<FhirStoreIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> fhirStoreId,
        @Nullable Output<String> member,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.fhirStoreId = fhirStoreId;
        this.member = member;
        this.role = role;
    }

    private FhirStoreIamMemberState() {
        this.condition = Codegen.empty();
        this.etag = Codegen.empty();
        this.fhirStoreId = Codegen.empty();
        this.member = Codegen.empty();
        this.role = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FhirStoreIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> fhirStoreId;
        private @Nullable Output<String> member;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.fhirStoreId = defaults.fhirStoreId;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<FhirStoreIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable FhirStoreIamMemberConditionGetArgs condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder fhirStoreId(@Nullable Output<String> fhirStoreId) {
            this.fhirStoreId = fhirStoreId;
            return this;
        }
        public Builder fhirStoreId(@Nullable String fhirStoreId) {
            this.fhirStoreId = Codegen.ofNullable(fhirStoreId);
            return this;
        }
        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }
        public Builder member(@Nullable String member) {
            this.member = Codegen.ofNullable(member);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = Codegen.ofNullable(role);
            return this;
        }        public FhirStoreIamMemberState build() {
            return new FhirStoreIamMemberState(condition, etag, fhirStoreId, member, role);
        }
    }
}
