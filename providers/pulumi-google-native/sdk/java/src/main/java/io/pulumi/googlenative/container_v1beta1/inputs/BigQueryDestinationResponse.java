// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Parameters for using BigQuery as the destination of resource usage export.
 * 
 */
public final class BigQueryDestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final BigQueryDestinationResponse Empty = new BigQueryDestinationResponse();

    /**
     * The ID of a BigQuery Dataset.
     * 
     */
    @Import(name="datasetId", required=true)
      private final String datasetId;

    public String getDatasetId() {
        return this.datasetId;
    }

    public BigQueryDestinationResponse(String datasetId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
    }

    private BigQueryDestinationResponse() {
        this.datasetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BigQueryDestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String datasetId;

        public Builder() {
    	      // Empty
        }

        public Builder(BigQueryDestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }
        public BigQueryDestinationResponse build() {
            return new BigQueryDestinationResponse(datasetId);
        }
    }
}
