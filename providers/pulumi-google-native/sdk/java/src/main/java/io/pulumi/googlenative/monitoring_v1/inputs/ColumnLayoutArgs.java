// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.monitoring_v1.inputs.ColumnArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A simplified layout that divides the available space into vertical columns and arranges a set of widgets vertically in each column.
 * 
 */
public final class ColumnLayoutArgs extends io.pulumi.resources.ResourceArgs {

    public static final ColumnLayoutArgs Empty = new ColumnLayoutArgs();

    /**
     * The columns of content to display.
     * 
     */
    @InputImport(name="columns")
      private final @Nullable Input<List<ColumnArgs>> columns;

    public Input<List<ColumnArgs>> getColumns() {
        return this.columns == null ? Input.empty() : this.columns;
    }

    public ColumnLayoutArgs(@Nullable Input<List<ColumnArgs>> columns) {
        this.columns = columns;
    }

    private ColumnLayoutArgs() {
        this.columns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ColumnLayoutArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ColumnArgs>> columns;

        public Builder() {
    	      // Empty
        }

        public Builder(ColumnLayoutArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columns = defaults.columns;
        }

        public Builder setColumns(@Nullable Input<List<ColumnArgs>> columns) {
            this.columns = columns;
            return this;
        }

        public Builder setColumns(@Nullable List<ColumnArgs> columns) {
            this.columns = Input.ofNullable(columns);
            return this;
        }
        public ColumnLayoutArgs build() {
            return new ColumnLayoutArgs(columns);
        }
    }
}
