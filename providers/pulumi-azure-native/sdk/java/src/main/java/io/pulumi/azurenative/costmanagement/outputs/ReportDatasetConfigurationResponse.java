// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.costmanagement.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ReportDatasetConfigurationResponse {
    /**
     * Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
     * 
     */
    private final @Nullable List<String> columns;

    @CustomType.Constructor
    private ReportDatasetConfigurationResponse(@CustomType.Parameter("columns") @Nullable List<String> columns) {
        this.columns = columns;
    }

    /**
     * Array of column names to be included in the report. Any valid report column name is allowed. If not provided, then report includes all columns.
     * 
    */
    public List<String> getColumns() {
        return this.columns == null ? List.of() : this.columns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ReportDatasetConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(ReportDatasetConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder columns(@Nullable List<String> columns) {
            this.columns = columns;
            return this;
        }
        public ReportDatasetConfigurationResponse build() {
            return new ReportDatasetConfigurationResponse(columns);
        }
    }
}
