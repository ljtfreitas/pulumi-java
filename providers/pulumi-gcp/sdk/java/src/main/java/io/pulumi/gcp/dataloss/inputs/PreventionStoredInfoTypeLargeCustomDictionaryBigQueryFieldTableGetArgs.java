// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs Empty = new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs();

    /**
     * The dataset ID of the table.
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
     * The name of the table.
     * 
     */
    @InputImport(name="tableId", required=true)
        private final Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId;
    }

    public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs(
        Input<String> datasetId,
        Input<String> projectId,
        Input<String> tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.projectId = Objects.requireNonNull(projectId, "expected parameter 'projectId' to be non-null");
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs() {
        this.datasetId = Input.empty();
        this.projectId = Input.empty();
        this.tableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private Input<String> projectId;
        private Input<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs defaults) {
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
        public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs build() {
            return new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTableGetArgs(datasetId, projectId, tableId);
        }
    }
}
