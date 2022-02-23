// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecTableSpecGetArgs;
import io.pulumi.gcp.datacatalog.inputs.EntryBigqueryTableSpecViewSpecGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryBigqueryTableSpecGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntryBigqueryTableSpecGetArgs Empty = new EntryBigqueryTableSpecGetArgs();

    @InputImport(name="tableSourceType")
        private final @Nullable Input<String> tableSourceType;

    public Input<String> getTableSourceType() {
        return this.tableSourceType == null ? Input.empty() : this.tableSourceType;
    }

    @InputImport(name="tableSpecs")
        private final @Nullable Input<List<EntryBigqueryTableSpecTableSpecGetArgs>> tableSpecs;

    public Input<List<EntryBigqueryTableSpecTableSpecGetArgs>> getTableSpecs() {
        return this.tableSpecs == null ? Input.empty() : this.tableSpecs;
    }

    @InputImport(name="viewSpecs")
        private final @Nullable Input<List<EntryBigqueryTableSpecViewSpecGetArgs>> viewSpecs;

    public Input<List<EntryBigqueryTableSpecViewSpecGetArgs>> getViewSpecs() {
        return this.viewSpecs == null ? Input.empty() : this.viewSpecs;
    }

    public EntryBigqueryTableSpecGetArgs(
        @Nullable Input<String> tableSourceType,
        @Nullable Input<List<EntryBigqueryTableSpecTableSpecGetArgs>> tableSpecs,
        @Nullable Input<List<EntryBigqueryTableSpecViewSpecGetArgs>> viewSpecs) {
        this.tableSourceType = tableSourceType;
        this.tableSpecs = tableSpecs;
        this.viewSpecs = viewSpecs;
    }

    private EntryBigqueryTableSpecGetArgs() {
        this.tableSourceType = Input.empty();
        this.tableSpecs = Input.empty();
        this.viewSpecs = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryBigqueryTableSpecGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> tableSourceType;
        private @Nullable Input<List<EntryBigqueryTableSpecTableSpecGetArgs>> tableSpecs;
        private @Nullable Input<List<EntryBigqueryTableSpecViewSpecGetArgs>> viewSpecs;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryBigqueryTableSpecGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tableSourceType = defaults.tableSourceType;
    	      this.tableSpecs = defaults.tableSpecs;
    	      this.viewSpecs = defaults.viewSpecs;
        }

        public Builder setTableSourceType(@Nullable Input<String> tableSourceType) {
            this.tableSourceType = tableSourceType;
            return this;
        }

        public Builder setTableSourceType(@Nullable String tableSourceType) {
            this.tableSourceType = Input.ofNullable(tableSourceType);
            return this;
        }

        public Builder setTableSpecs(@Nullable Input<List<EntryBigqueryTableSpecTableSpecGetArgs>> tableSpecs) {
            this.tableSpecs = tableSpecs;
            return this;
        }

        public Builder setTableSpecs(@Nullable List<EntryBigqueryTableSpecTableSpecGetArgs> tableSpecs) {
            this.tableSpecs = Input.ofNullable(tableSpecs);
            return this;
        }

        public Builder setViewSpecs(@Nullable Input<List<EntryBigqueryTableSpecViewSpecGetArgs>> viewSpecs) {
            this.viewSpecs = viewSpecs;
            return this;
        }

        public Builder setViewSpecs(@Nullable List<EntryBigqueryTableSpecViewSpecGetArgs> viewSpecs) {
            this.viewSpecs = Input.ofNullable(viewSpecs);
            return this;
        }
        public EntryBigqueryTableSpecGetArgs build() {
            return new EntryBigqueryTableSpecGetArgs(tableSourceType, tableSpecs, viewSpecs);
        }
    }
}
