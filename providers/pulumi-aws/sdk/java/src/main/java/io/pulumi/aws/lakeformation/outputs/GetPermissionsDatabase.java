// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetPermissionsDatabase {
    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    private final String catalogId;
    /**
     * Name of the table resource.
     * 
     */
    private final String name;

    @OutputCustomType.Constructor({"catalogId","name"})
    private GetPermissionsDatabase(
        String catalogId,
        String name) {
        this.catalogId = Objects.requireNonNull(catalogId);
        this.name = Objects.requireNonNull(name);
    }

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    public String getCatalogId() {
        return this.catalogId;
    }
    /**
     * Name of the table resource.
     * 
     */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsDatabase defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPermissionsDatabase defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.name = defaults.name;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetPermissionsDatabase build() {
            return new GetPermissionsDatabase(catalogId, name);
        }
    }
}
