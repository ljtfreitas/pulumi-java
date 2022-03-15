// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.healthcare.inputs.DatasetIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final DatasetIamMemberState Empty = new DatasetIamMemberState();

    @Import(name="condition")
      private final @Nullable Output<DatasetIamMemberConditionGetArgs> condition;

    public Output<DatasetIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * The dataset ID, in the form
     * `{project_id}/{location_name}/{dataset_name}` or
     * `{location_name}/{dataset_name}`. In the second form, the provider's
     * project setting will be used as a fallback.
     * 
     */
    @Import(name="datasetId")
      private final @Nullable Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId == null ? Output.empty() : this.datasetId;
    }

    /**
     * (Computed) The etag of the dataset's IAM policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @Import(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Output.empty() : this.member;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.healthcare.DatasetIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public DatasetIamMemberState(
        @Nullable Output<DatasetIamMemberConditionGetArgs> condition,
        @Nullable Output<String> datasetId,
        @Nullable Output<String> etag,
        @Nullable Output<String> member,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.datasetId = datasetId;
        this.etag = etag;
        this.member = member;
        this.role = role;
    }

    private DatasetIamMemberState() {
        this.condition = Output.empty();
        this.datasetId = Output.empty();
        this.etag = Output.empty();
        this.member = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DatasetIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> datasetId;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> member;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.datasetId = defaults.datasetId;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<DatasetIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable DatasetIamMemberConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder datasetId(@Nullable Output<String> datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        public Builder datasetId(@Nullable String datasetId) {
            this.datasetId = Output.ofNullable(datasetId);
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

        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }

        public Builder member(@Nullable String member) {
            this.member = Output.ofNullable(member);
            return this;
        }

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public DatasetIamMemberState build() {
            return new DatasetIamMemberState(condition, datasetId, etag, member, role);
        }
    }
}
