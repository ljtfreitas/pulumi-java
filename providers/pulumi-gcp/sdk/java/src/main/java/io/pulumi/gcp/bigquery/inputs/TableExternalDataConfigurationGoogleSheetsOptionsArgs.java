// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationGoogleSheetsOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationGoogleSheetsOptionsArgs Empty = new TableExternalDataConfigurationGoogleSheetsOptionsArgs();

    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
     */
    @Import(name="range")
      private final @Nullable Output<String> range;

    public Output<String> range() {
        return this.range == null ? Codegen.empty() : this.range;
    }

    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
     */
    @Import(name="skipLeadingRows")
      private final @Nullable Output<Integer> skipLeadingRows;

    public Output<Integer> skipLeadingRows() {
        return this.skipLeadingRows == null ? Codegen.empty() : this.skipLeadingRows;
    }

    public TableExternalDataConfigurationGoogleSheetsOptionsArgs(
        @Nullable Output<String> range,
        @Nullable Output<Integer> skipLeadingRows) {
        this.range = range;
        this.skipLeadingRows = skipLeadingRows;
    }

    private TableExternalDataConfigurationGoogleSheetsOptionsArgs() {
        this.range = Codegen.empty();
        this.skipLeadingRows = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationGoogleSheetsOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> range;
        private @Nullable Output<Integer> skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationGoogleSheetsOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder range(@Nullable Output<String> range) {
            this.range = range;
            return this;
        }
        public Builder range(@Nullable String range) {
            this.range = Codegen.ofNullable(range);
            return this;
        }
        public Builder skipLeadingRows(@Nullable Output<Integer> skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }
        public Builder skipLeadingRows(@Nullable Integer skipLeadingRows) {
            this.skipLeadingRows = Codegen.ofNullable(skipLeadingRows);
            return this;
        }        public TableExternalDataConfigurationGoogleSheetsOptionsArgs build() {
            return new TableExternalDataConfigurationGoogleSheetsOptionsArgs(range, skipLeadingRows);
        }
    }
}
