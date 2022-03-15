// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class MaterializedViewDefinitionResponse extends io.pulumi.resources.InvokeArgs {

    public static final MaterializedViewDefinitionResponse Empty = new MaterializedViewDefinitionResponse();

    /**
     * [Optional] [TrustedTester] Enable automatic refresh of the materialized view when the base table is updated. The default value is "true".
     * 
     */
    @Import(name="enableRefresh", required=true)
      private final Boolean enableRefresh;

    public Boolean getEnableRefresh() {
        return this.enableRefresh;
    }

    /**
     * [TrustedTester] The time when this materialized view was last modified, in milliseconds since the epoch.
     * 
     */
    @Import(name="lastRefreshTime", required=true)
      private final String lastRefreshTime;

    public String getLastRefreshTime() {
        return this.lastRefreshTime;
    }

    /**
     * [Required] A query whose result is persisted.
     * 
     */
    @Import(name="query", required=true)
      private final String query;

    public String getQuery() {
        return this.query;
    }

    /**
     * [Optional] [TrustedTester] The maximum frequency at which this materialized view will be refreshed. The default value is "1800000" (30 minutes).
     * 
     */
    @Import(name="refreshIntervalMs", required=true)
      private final String refreshIntervalMs;

    public String getRefreshIntervalMs() {
        return this.refreshIntervalMs;
    }

    public MaterializedViewDefinitionResponse(
        Boolean enableRefresh,
        String lastRefreshTime,
        String query,
        String refreshIntervalMs) {
        this.enableRefresh = Objects.requireNonNull(enableRefresh, "expected parameter 'enableRefresh' to be non-null");
        this.lastRefreshTime = Objects.requireNonNull(lastRefreshTime, "expected parameter 'lastRefreshTime' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
        this.refreshIntervalMs = Objects.requireNonNull(refreshIntervalMs, "expected parameter 'refreshIntervalMs' to be non-null");
    }

    private MaterializedViewDefinitionResponse() {
        this.enableRefresh = null;
        this.lastRefreshTime = null;
        this.query = null;
        this.refreshIntervalMs = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaterializedViewDefinitionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enableRefresh;
        private String lastRefreshTime;
        private String query;
        private String refreshIntervalMs;

        public Builder() {
    	      // Empty
        }

        public Builder(MaterializedViewDefinitionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enableRefresh = defaults.enableRefresh;
    	      this.lastRefreshTime = defaults.lastRefreshTime;
    	      this.query = defaults.query;
    	      this.refreshIntervalMs = defaults.refreshIntervalMs;
        }

        public Builder enableRefresh(Boolean enableRefresh) {
            this.enableRefresh = Objects.requireNonNull(enableRefresh);
            return this;
        }

        public Builder lastRefreshTime(String lastRefreshTime) {
            this.lastRefreshTime = Objects.requireNonNull(lastRefreshTime);
            return this;
        }

        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder refreshIntervalMs(String refreshIntervalMs) {
            this.refreshIntervalMs = Objects.requireNonNull(refreshIntervalMs);
            return this;
        }
        public MaterializedViewDefinitionResponse build() {
            return new MaterializedViewDefinitionResponse(enableRefresh, lastRefreshTime, query, refreshIntervalMs);
        }
    }
}
