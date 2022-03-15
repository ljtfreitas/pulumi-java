// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRowAccessPolicyIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRowAccessPolicyIamPolicyArgs Empty = new GetRowAccessPolicyIamPolicyArgs();

    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="rowAccessPolicyId", required=true)
      private final String rowAccessPolicyId;

    public String getRowAccessPolicyId() {
        return this.rowAccessPolicyId;
    }

    @Import(name="tableId", required=true)
      private final String tableId;

    public String getTableId() {
        return this.tableId;
    }

    public GetRowAccessPolicyIamPolicyArgs(
        String datasetId,
        @Nullable String project,
        String rowAccessPolicyId,
        String tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.project = project;
        this.rowAccessPolicyId = Objects.requireNonNull(rowAccessPolicyId, "expected parameter 'rowAccessPolicyId' to be non-null");
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private GetRowAccessPolicyIamPolicyArgs() {
        this.datasetId = null;
        this.project = null;
        this.rowAccessPolicyId = null;
        this.tableId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRowAccessPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private @Nullable String project;
        private String rowAccessPolicyId;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRowAccessPolicyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
    	      this.rowAccessPolicyId = defaults.rowAccessPolicyId;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder rowAccessPolicyId(String rowAccessPolicyId) {
            this.rowAccessPolicyId = Objects.requireNonNull(rowAccessPolicyId);
            return this;
        }

        public Builder tableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public GetRowAccessPolicyIamPolicyArgs build() {
            return new GetRowAccessPolicyIamPolicyArgs(datasetId, project, rowAccessPolicyId, tableId);
        }
    }
}
