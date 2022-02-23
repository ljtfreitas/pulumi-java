// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DatasetAccessViewArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetAccessViewArgs Empty = new DatasetAccessViewArgs();

    /**
     * The ID of the dataset containing this table.
     * 
     */
    @InputImport(name="datasetId", required=true)
        private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The ID of the project containing this table.
     * 
     */
    @InputImport(name="projectId", required=true)
        private final Input<String> projectId;

    public Input<String> getProjectId() {
        return this.projectId;
    }

    /**
     * The ID of the table. The ID must contain only letters (a-z,
     * A-Z), numbers (0-9), or underscores (_). The maximum length
     * is 1,024 characters.
     * 
     */
    @InputImport(name="tableId", required=true)
        private final Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId;
    }

    public DatasetAccessViewArgs(
        Input<String> datasetId,
        Input<String> projectId,
        Input<String> tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private DatasetAccessViewArgs() {
        this.datasetId = Input.empty();
        this.projectId = Input.empty();
        this.tableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessViewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private Input<String> projectId;
        private Input<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessViewArgs defaults) {
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

        public Builder setTableId(Input<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = Input.of(Objects.requireNonNull(tableId));
            return this;
        }
        public DatasetAccessViewArgs build() {
            return new DatasetAccessViewArgs(datasetId, projectId, tableId);
        }
    }
}
