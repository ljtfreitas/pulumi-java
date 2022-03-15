// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataloss.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable {
    /**
     * The dataset ID of the table.
     * 
     */
    private final String datasetId;
    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
     */
    private final String projectId;
    /**
     * The name of the table.
     * 
     */
    private final String tableId;

    @CustomType.Constructor
    private PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable(
        @CustomType.Parameter("datasetId") String datasetId,
        @CustomType.Parameter("projectId") String projectId,
        @CustomType.Parameter("tableId") String tableId) {
        this.datasetId = datasetId;
        this.projectId = projectId;
        this.tableId = tableId;
    }

    /**
     * The dataset ID of the table.
     * 
    */
    public String getDatasetId() {
        return this.datasetId;
    }
    /**
     * The Google Cloud Platform project ID of the project containing the table.
     * 
    */
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * The name of the table.
     * 
    */
    public String getTableId() {
        return this.tableId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;
        private String projectId;
        private String tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.projectId = defaults.projectId;
    	      this.tableId = defaults.tableId;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder tableId(String tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }
        public PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable build() {
            return new PreventionStoredInfoTypeLargeCustomDictionaryBigQueryFieldTable(datasetId, projectId, tableId);
        }
    }
}
