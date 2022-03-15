// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecTableSpecArgs;
import io.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecViewSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryTableSpecArgs Empty = new EntryBigqueryTableSpecArgs();

    @Import(name="tableSourceType")
      private final @Nullable Output<String> tableSourceType;

    public Output<String> getTableSourceType() {
        return this.tableSourceType == null ? Output.empty() : this.tableSourceType;
    }

    @Import(name="tableSpecs")
      private final @Nullable Output<List<EntryBigqueryTableSpecTableSpecArgs>> tableSpecs;

    public Output<List<EntryBigqueryTableSpecTableSpecArgs>> getTableSpecs() {
        return this.tableSpecs == null ? Output.empty() : this.tableSpecs;
    }

    @Import(name="viewSpecs")
      private final @Nullable Output<List<EntryBigqueryTableSpecViewSpecArgs>> viewSpecs;

    public Output<List<EntryBigqueryTableSpecViewSpecArgs>> getViewSpecs() {
        return this.viewSpecs == null ? Output.empty() : this.viewSpecs;
    }

    public EntryBigqueryTableSpecArgs(
        @Nullable Output<String> tableSourceType,
        @Nullable Output<List<EntryBigqueryTableSpecTableSpecArgs>> tableSpecs,
        @Nullable Output<List<EntryBigqueryTableSpecViewSpecArgs>> viewSpecs) {
        this.tableSourceType = tableSourceType;
        this.tableSpecs = tableSpecs;
        this.viewSpecs = viewSpecs;
    }

    private EntryBigqueryTableSpecArgs() {
        this.tableSourceType = Output.empty();
        this.tableSpecs = Output.empty();
        this.viewSpecs = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> tableSourceType;
        private @Nullable Output<List<EntryBigqueryTableSpecTableSpecArgs>> tableSpecs;
        private @Nullable Output<List<EntryBigqueryTableSpecViewSpecArgs>> viewSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableSourceType = defaults.tableSourceType;
    	      this.tableSpecs = defaults.tableSpecs;
    	      this.viewSpecs = defaults.viewSpecs;
        }

        public Builder tableSourceType(@Nullable Output<String> tableSourceType) {
            this.tableSourceType = tableSourceType;
            return this;
        }

        public Builder tableSourceType(@Nullable String tableSourceType) {
            this.tableSourceType = Output.ofNullable(tableSourceType);
            return this;
        }

        public Builder tableSpecs(@Nullable Output<List<EntryBigqueryTableSpecTableSpecArgs>> tableSpecs) {
            this.tableSpecs = tableSpecs;
            return this;
        }

        public Builder tableSpecs(@Nullable List<EntryBigqueryTableSpecTableSpecArgs> tableSpecs) {
            this.tableSpecs = Output.ofNullable(tableSpecs);
            return this;
        }

        public Builder viewSpecs(@Nullable Output<List<EntryBigqueryTableSpecViewSpecArgs>> viewSpecs) {
            this.viewSpecs = viewSpecs;
            return this;
        }

        public Builder viewSpecs(@Nullable List<EntryBigqueryTableSpecViewSpecArgs> viewSpecs) {
            this.viewSpecs = Output.ofNullable(viewSpecs);
            return this;
        }
        public EntryBigqueryTableSpecArgs build() {
            return new EntryBigqueryTableSpecArgs(tableSourceType, tableSpecs, viewSpecs);
        }
    }
}
