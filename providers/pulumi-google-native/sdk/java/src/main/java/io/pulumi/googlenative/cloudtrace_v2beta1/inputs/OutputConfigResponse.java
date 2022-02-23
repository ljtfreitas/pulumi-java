// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtrace_v2beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * OutputConfig contains a destination for writing trace data.
 * 
 */
public final class OutputConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final OutputConfigResponse Empty = new OutputConfigResponse();

    /**
     * The destination for writing trace data. Currently only BigQuery is supported. E.g.: "bigquery.googleapis.com/projects/[PROJECT_ID]/datasets/[DATASET]"
     * 
     */
    @InputImport(name="destination", required=true)
      private final String destination;

    public String getDestination() {
        return this.destination;
    }

    public OutputConfigResponse(String destination) {
        this.destination = Objects.requireNonNull(destination, "expected parameter 'destination' to be non-null");
    }

    private OutputConfigResponse() {
        this.destination = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OutputConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String destination;

        public Builder() {
    	      // Empty
        }

        public Builder(OutputConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
        }

        public Builder setDestination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        public OutputConfigResponse build() {
            return new OutputConfigResponse(destination);
        }
    }
}
