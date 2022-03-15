// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lakeformation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPermissionsDatabase extends io.pulumi.resources.InvokeArgs {

    public static final GetPermissionsDatabase Empty = new GetPermissionsDatabase();

    /**
     * Identifier for the Data Catalog. By default, it is the account ID of the caller.
     * 
     */
    @Import(name="catalogId", required=true)
      private final String catalogId;

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * Name of the table resource.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public GetPermissionsDatabase(
        String catalogId,
        String name) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private GetPermissionsDatabase() {
        this.catalogId = null;
        this.name = null;
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

        public Builder catalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetPermissionsDatabase build() {
            return new GetPermissionsDatabase(catalogId, name);
        }
    }
}
