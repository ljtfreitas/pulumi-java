// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recommendationengine_v1beta1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCatalogItemArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCatalogItemArgs Empty = new GetCatalogItemArgs();

    @InputImport(name="catalogId", required=true)
      private final String catalogId;

    public String getCatalogId() {
        return this.catalogId;
    }

    @InputImport(name="catalogItemId", required=true)
      private final String catalogItemId;

    public String getCatalogItemId() {
        return this.catalogItemId;
    }

    @InputImport(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetCatalogItemArgs(
        String catalogId,
        String catalogItemId,
        String location,
        @Nullable String project) {
        this.catalogId = Objects.requireNonNull(catalogId, "expected parameter 'catalogId' to be non-null");
        this.catalogItemId = Objects.requireNonNull(catalogItemId, "expected parameter 'catalogItemId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetCatalogItemArgs() {
        this.catalogId = null;
        this.catalogItemId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCatalogItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String catalogId;
        private String catalogItemId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCatalogItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogId = defaults.catalogId;
    	      this.catalogItemId = defaults.catalogItemId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder setCatalogId(String catalogId) {
            this.catalogId = Objects.requireNonNull(catalogId);
            return this;
        }

        public Builder setCatalogItemId(String catalogItemId) {
            this.catalogItemId = Objects.requireNonNull(catalogItemId);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }
        public GetCatalogItemArgs build() {
            return new GetCatalogItemArgs(catalogId, catalogItemId, location, project);
        }
    }
}
