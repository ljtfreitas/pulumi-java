// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersTwitterArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersTwitterArgs Empty = new DataSourceParametersTwitterArgs();

    /**
     * The maximum number of rows to query.
     * 
     */
    @Import(name="maxRows", required=true)
      private final Output<Integer> maxRows;

    public Output<Integer> getMaxRows() {
        return this.maxRows;
    }

    /**
     * The Twitter query to retrieve the data.
     * 
     */
    @Import(name="query", required=true)
      private final Output<String> query;

    public Output<String> getQuery() {
        return this.query;
    }

    public DataSourceParametersTwitterArgs(
        Output<Integer> maxRows,
        Output<String> query) {
        this.maxRows = Objects.requireNonNull(maxRows, "expected parameter 'maxRows' to be non-null");
        this.query = Objects.requireNonNull(query, "expected parameter 'query' to be non-null");
    }

    private DataSourceParametersTwitterArgs() {
        this.maxRows = Output.empty();
        this.query = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersTwitterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxRows;
        private Output<String> query;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersTwitterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRows = defaults.maxRows;
    	      this.query = defaults.query;
        }

        public Builder maxRows(Output<Integer> maxRows) {
            this.maxRows = Objects.requireNonNull(maxRows);
            return this;
        }

        public Builder maxRows(Integer maxRows) {
            this.maxRows = Output.of(Objects.requireNonNull(maxRows));
            return this;
        }

        public Builder query(Output<String> query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }

        public Builder query(String query) {
            this.query = Output.of(Objects.requireNonNull(query));
            return this;
        }
        public DataSourceParametersTwitterArgs build() {
            return new DataSourceParametersTwitterArgs(maxRows, query);
        }
    }
}
