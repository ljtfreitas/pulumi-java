// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Represents a specific Cloud SQL instance.
 * 
 */
public final class GoogleCloudRunOpV2CloudSqlInstanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRunOpV2CloudSqlInstanceResponse Empty = new GoogleCloudRunOpV2CloudSqlInstanceResponse();

    /**
     * The Cloud SQL instance connection names, as can be found in https://console.cloud.google.com/sql/instances. Visit https://cloud.google.com/sql/docs/mysql/connect-run for more information on how to connect Cloud SQL and Cloud Run. Format: {project}:{location}:{instance}
     * 
     */
    @Import(name="connections", required=true)
      private final List<String> connections;

    public List<String> getConnections() {
        return this.connections;
    }

    public GoogleCloudRunOpV2CloudSqlInstanceResponse(List<String> connections) {
        this.connections = Objects.requireNonNull(connections, "expected parameter 'connections' to be non-null");
    }

    private GoogleCloudRunOpV2CloudSqlInstanceResponse() {
        this.connections = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2CloudSqlInstanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> connections;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2CloudSqlInstanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connections = defaults.connections;
        }

        public Builder connections(List<String> connections) {
            this.connections = Objects.requireNonNull(connections);
            return this;
        }
        public GoogleCloudRunOpV2CloudSqlInstanceResponse build() {
            return new GoogleCloudRunOpV2CloudSqlInstanceResponse(connections);
        }
    }
}
