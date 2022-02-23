// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;


public final class RowLevelSecurityStatisticsResponse extends io.pulumi.resources.InvokeArgs {

    public static final RowLevelSecurityStatisticsResponse Empty = new RowLevelSecurityStatisticsResponse();

    /**
     * [Preview] Whether any accessed data was protected by row access policies.
     * 
     */
    @InputImport(name="rowLevelSecurityApplied", required=true)
      private final Boolean rowLevelSecurityApplied;

    public Boolean getRowLevelSecurityApplied() {
        return this.rowLevelSecurityApplied;
    }

    public RowLevelSecurityStatisticsResponse(Boolean rowLevelSecurityApplied) {
        this.rowLevelSecurityApplied = Objects.requireNonNull(rowLevelSecurityApplied, "expected parameter 'rowLevelSecurityApplied' to be non-null");
    }

    private RowLevelSecurityStatisticsResponse() {
        this.rowLevelSecurityApplied = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RowLevelSecurityStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean rowLevelSecurityApplied;

        public Builder() {
    	      // Empty
        }

        public Builder(RowLevelSecurityStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rowLevelSecurityApplied = defaults.rowLevelSecurityApplied;
        }

        public Builder setRowLevelSecurityApplied(Boolean rowLevelSecurityApplied) {
            this.rowLevelSecurityApplied = Objects.requireNonNull(rowLevelSecurityApplied);
            return this;
        }
        public RowLevelSecurityStatisticsResponse build() {
            return new RowLevelSecurityStatisticsResponse(rowLevelSecurityApplied);
        }
    }
}
