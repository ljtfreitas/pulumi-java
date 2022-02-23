// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.DicomStoreIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DicomStoreIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreIamBindingArgs Empty = new DicomStoreIamBindingArgs();

    @InputImport(name="condition")
        private final @Nullable Input<DicomStoreIamBindingConditionArgs> condition;

    public Input<DicomStoreIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * The DICOM store ID, in the form
     * `{project_id}/{location_name}/{dataset_name}/{dicom_store_name}` or
     * `{location_name}/{dataset_name}/{dicom_store_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @InputImport(name="dicomStoreId", required=true)
        private final Input<String> dicomStoreId;

    public Input<String> getDicomStoreId() {
        return this.dicomStoreId;
    }

    @InputImport(name="members", required=true)
        private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.DicomStoreIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
        private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public DicomStoreIamBindingArgs(
        @Nullable Input<DicomStoreIamBindingConditionArgs> condition,
        Input<String> dicomStoreId,
        Input<List<String>> members,
        Input<String> role) {
        this.condition = condition;
        this.dicomStoreId = Objects.requireNonNull(dicomStoreId, "expected parameter 'dicomStoreId' to be non-null");
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private DicomStoreIamBindingArgs() {
        this.condition = Input.empty();
        this.dicomStoreId = Input.empty();
        this.members = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DicomStoreIamBindingConditionArgs> condition;
        private Input<String> dicomStoreId;
        private Input<List<String>> members;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.dicomStoreId = defaults.dicomStoreId;
    	      this.members = defaults.members;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<DicomStoreIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable DicomStoreIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setDicomStoreId(Input<String> dicomStoreId) {
            this.dicomStoreId = Objects.requireNonNull(dicomStoreId);
            return this;
        }

        public Builder setDicomStoreId(String dicomStoreId) {
            this.dicomStoreId = Input.of(Objects.requireNonNull(dicomStoreId));
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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
        public DicomStoreIamBindingArgs build() {
            return new DicomStoreIamBindingArgs(condition, dicomStoreId, members, role);
        }
    }
}
