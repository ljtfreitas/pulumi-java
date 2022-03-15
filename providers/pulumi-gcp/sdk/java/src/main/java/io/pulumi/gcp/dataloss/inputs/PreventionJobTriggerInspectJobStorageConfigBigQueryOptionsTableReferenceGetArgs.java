// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs Empty = new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs();

    /**
     * Dataset ID of the table.
     * 
     */
    @Import(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @Import(name="projectId", required=true)
      private final Output<String> projectId;

    public Output<String> getProjectId() {
        return this.projectId;
    }

    /**
     * Name of the table. If is not set a new one will be generated for you with the following format:
     * `dlp_googleapis_yyyy_mm_dd_[dlp_job_id]`. Pacific timezone will be used for generating the date details.
     * 
     */
    @Import(name="tableId", required=true)
      private final Output<String> tableId;

    public Output<String> getTableId() {
        return this.tableId;
    }

    public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs(
        Output<String> datasetId,
        Output<String> projectId,
        Output<String> tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs() {
        this.datasetId = Output.empty();
        this.projectId = Output.empty();
        this.tableId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> datasetId;
        private Output<String> projectId;
        private Output<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder projectId(Output<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder projectId(String projectId) {
            this.projectId = Output.of(Objects.requireNonNull(projectId));
            return this;
        }

        public Builder tableId(Output<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }

        public Builder tableId(String tableId) {
            this.tableId = Output.of(Objects.requireNonNull(tableId));
            return this;
        }
        public PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs build() {
            return new PreventionJobTriggerInspectJobStorageConfigBigQueryOptionsTableReferenceGetArgs(datasetId, projectId, tableId);
        }
    }
}
