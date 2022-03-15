// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.healthcare.outputs.FhirStoreStreamConfigBigqueryDestinationSchemaConfig;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class FhirStoreStreamConfigBigqueryDestination {
    /**
     * BigQuery URI to a dataset, up to 2000 characters long, in the format bq://projectId.bqDatasetId
     * 
     */
    private final String datasetUri;
    /**
     * The configuration for the exported BigQuery schema.
     * Structure is documented below.
     * 
     */
    private final FhirStoreStreamConfigBigqueryDestinationSchemaConfig schemaConfig;

    @CustomType.Constructor
    private FhirStoreStreamConfigBigqueryDestination(
        @CustomType.Parameter("datasetUri") String datasetUri,
        @CustomType.Parameter("schemaConfig") FhirStoreStreamConfigBigqueryDestinationSchemaConfig schemaConfig) {
        this.datasetUri = datasetUri;
        this.schemaConfig = schemaConfig;
    }

    /**
     * BigQuery URI to a dataset, up to 2000 characters long, in the format bq://projectId.bqDatasetId
     * 
    */
    public String getDatasetUri() {
        return this.datasetUri;
    }
    /**
     * The configuration for the exported BigQuery schema.
     * Structure is documented below.
     * 
    */
    public FhirStoreStreamConfigBigqueryDestinationSchemaConfig getSchemaConfig() {
        return this.schemaConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreStreamConfigBigqueryDestination defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetUri;
        private FhirStoreStreamConfigBigqueryDestinationSchemaConfig schemaConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreStreamConfigBigqueryDestination defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetUri = defaults.datasetUri;
    	      this.schemaConfig = defaults.schemaConfig;
        }

        public Builder datasetUri(String datasetUri) {
            this.datasetUri = Objects.requireNonNull(datasetUri);
            return this;
        }

        public Builder schemaConfig(FhirStoreStreamConfigBigqueryDestinationSchemaConfig schemaConfig) {
            this.schemaConfig = Objects.requireNonNull(schemaConfig);
            return this;
        }
        public FhirStoreStreamConfigBigqueryDestination build() {
            return new FhirStoreStreamConfigBigqueryDestination(datasetUri, schemaConfig);
        }
    }
}
