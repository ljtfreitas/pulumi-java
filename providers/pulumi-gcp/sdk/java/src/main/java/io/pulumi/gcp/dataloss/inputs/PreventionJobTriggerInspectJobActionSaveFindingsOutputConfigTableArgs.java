// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs Empty = new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs();

    /**
     * Dataset ID of the table.
     * 
     */
    @InputImport(name="datasetId", required=true)
        private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    @InputImport(name="projectId", required=true)
        private final Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId;
    }

    /**
     * Name of the table. If is not set a new one will be generated for you with the following format:
     * `dlp_googleapis_yyyy_mm_dd_[dlp_job_id]`. Pacific timezone will be used for generating the date details.
     * 
     */
    @InputImport(name="tableId")
        private final @Nullable Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId == null ? Input.empty() : this.tableId;
    }

    public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs(
        Input<String> datasetId,
        Input<String> projectId,
        @Nullable Input<String> tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.tableId = tableId;
    }

    private PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs() {
        this.datasetId = Input.empty();
        this.projectId = Input.empty();
        this.tableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private Input<String> projectId;
        private @Nullable Input<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder setProjectId(Input<String> projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Input.of(Objects.requireNonNull(projectId));
            return this;
        }

        public Builder setTableId(@Nullable Input<String> tableId) {
            this.tableId = tableId;
            return this;
        }

        public Builder setTableId(@Nullable String tableId) {
            this.tableId = Input.ofNullable(tableId);
            return this;
        }
        public PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs build() {
            return new PreventionJobTriggerInspectJobActionSaveFindingsOutputConfigTableArgs(datasetId, projectId, tableId);
        }
    }
}
