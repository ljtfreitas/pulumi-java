// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.DatasetFilesLimit;
import io.pulumi.awsnative.databrew.outputs.DatasetFilterExpression;
import io.pulumi.awsnative.databrew.outputs.DatasetPathParameter;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DatasetPathOptions {
    private final @Nullable DatasetFilesLimit filesLimit;
    private final @Nullable DatasetFilterExpression lastModifiedDateCondition;
    private final @Nullable List<DatasetPathParameter> parameters;

    @OutputCustomType.Constructor({"filesLimit","lastModifiedDateCondition","parameters"})
    private DatasetPathOptions(
        @Nullable DatasetFilesLimit filesLimit,
        @Nullable DatasetFilterExpression lastModifiedDateCondition,
        @Nullable List<DatasetPathParameter> parameters) {
        this.filesLimit = filesLimit;
        this.lastModifiedDateCondition = lastModifiedDateCondition;
        this.parameters = parameters;
    }

    public Optional<DatasetFilesLimit> getFilesLimit() {
        return Optional.ofNullable(this.filesLimit);
    }
    public Optional<DatasetFilterExpression> getLastModifiedDateCondition() {
        return Optional.ofNullable(this.lastModifiedDateCondition);
    }
    public List<DatasetPathParameter> getParameters() {
        return this.parameters == null ? List.of() : this.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetPathOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatasetFilesLimit filesLimit;
        private @Nullable DatasetFilterExpression lastModifiedDateCondition;
        private @Nullable List<DatasetPathParameter> parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetPathOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesLimit = defaults.filesLimit;
    	      this.lastModifiedDateCondition = defaults.lastModifiedDateCondition;
    	      this.parameters = defaults.parameters;
        }

        public Builder setFilesLimit(@Nullable DatasetFilesLimit filesLimit) {
            this.filesLimit = filesLimit;
            return this;
        }

        public Builder setLastModifiedDateCondition(@Nullable DatasetFilterExpression lastModifiedDateCondition) {
            this.lastModifiedDateCondition = lastModifiedDateCondition;
            return this;
        }

        public Builder setParameters(@Nullable List<DatasetPathParameter> parameters) {
            this.parameters = parameters;
            return this;
        }
        public DatasetPathOptions build() {
            return new DatasetPathOptions(filesLimit, lastModifiedDateCondition, parameters);
        }
    }
}
