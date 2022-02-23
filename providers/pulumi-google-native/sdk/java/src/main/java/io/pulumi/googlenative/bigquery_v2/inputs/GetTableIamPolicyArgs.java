// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTableIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTableIamPolicyArgs Empty = new GetTableIamPolicyArgs();

    @InputImport(name="datasetId", required=true)
      private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @InputImport(name="tableId", required=true)
      private final String tableId;

    public String getTableId() {
        return this.tableId;
    }

    public GetTableIamPolicyArgs(
        String datasetId,
        @Nullable String project,
        String tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.project = project;
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private GetTableIamPolicyArgs() {
        this.datasetId = null;
        this.project = null;
        this.tableId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTableIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private @Nullable String project;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTableIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public GetTableIamPolicyArgs build() {
            return new GetTableIamPolicyArgs(datasetId, project, tableId);
        }
    }
}
