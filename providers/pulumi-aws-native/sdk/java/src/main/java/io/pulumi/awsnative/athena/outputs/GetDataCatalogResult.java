// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.athena.outputs;

import io.pulumi.awsnative.athena.enums.DataCatalogType;
import io.pulumi.awsnative.athena.outputs.DataCatalogTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetDataCatalogResult {
    /**
     * A description of the data catalog to be created.
     * 
     */
    private final @Nullable String description;
    /**
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values depend on the catalog type.
     * 
     */
    private final @Nullable Object parameters;
    /**
     * A list of comma separated tags to add to the data catalog that is created.
     * 
     */
    private final @Nullable List<DataCatalogTag> tags;
    /**
     * The type of data catalog to create: LAMBDA for a federated catalog, GLUE for AWS Glue Catalog, or HIVE for an external hive metastore.
     * 
     */
    private final @Nullable DataCatalogType type;

    @OutputCustomType.Constructor
    private GetDataCatalogResult(
        @OutputCustomType.Parameter("description") @Nullable String description,
        @OutputCustomType.Parameter("parameters") @Nullable Object parameters,
        @OutputCustomType.Parameter("tags") @Nullable List<DataCatalogTag> tags,
        @OutputCustomType.Parameter("type") @Nullable DataCatalogType type) {
        this.description = description;
        this.parameters = parameters;
        this.tags = tags;
        this.type = type;
    }

    /**
     * A description of the data catalog to be created.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Specifies the Lambda function or functions to use for creating the data catalog. This is a mapping whose values depend on the catalog type.
     * 
    */
    public Optional<Object> getParameters() {
        return Optional.ofNullable(this.parameters);
    }
    /**
     * A list of comma separated tags to add to the data catalog that is created.
     * 
    */
    public List<DataCatalogTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }
    /**
     * The type of data catalog to create: LAMBDA for a federated catalog, GLUE for AWS Glue Catalog, or HIVE for an external hive metastore.
     * 
    */
    public Optional<DataCatalogType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataCatalogResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Object parameters;
        private @Nullable List<DataCatalogTag> tags;
        private @Nullable DataCatalogType type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataCatalogResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setParameters(@Nullable Object parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setTags(@Nullable List<DataCatalogTag> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(@Nullable DataCatalogType type) {
            this.type = type;
            return this;
        }
        public GetDataCatalogResult build() {
            return new GetDataCatalogResult(description, parameters, tags, type);
        }
    }
}
