// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecrpublic;

import io.pulumi.aws.ecrpublic.inputs.RepositoryCatalogDataArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RepositoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final RepositoryArgs Empty = new RepositoryArgs();

    /**
     * Catalog data configuration for the repository. See below for schema.
     * 
     */
    @Import(name="catalogData")
      private final @Nullable Output<RepositoryCatalogDataArgs> catalogData;

    public Output<RepositoryCatalogDataArgs> getCatalogData() {
        return this.catalogData == null ? Output.empty() : this.catalogData;
    }

    @Import(name="forceDestroy")
      private final @Nullable Output<Boolean> forceDestroy;

    public Output<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Output.empty() : this.forceDestroy;
    }

    /**
     * Name of the repository.
     * 
     */
    @Import(name="repositoryName", required=true)
      private final Output<String> repositoryName;

    public Output<String> getRepositoryName() {
        return this.repositoryName;
    }

    public RepositoryArgs(
        @Nullable Output<RepositoryCatalogDataArgs> catalogData,
        @Nullable Output<Boolean> forceDestroy,
        Output<String> repositoryName) {
        this.catalogData = catalogData;
        this.forceDestroy = forceDestroy;
        this.repositoryName = Objects.requireNonNull(repositoryName, "expected parameter 'repositoryName' to be non-null");
    }

    private RepositoryArgs() {
        this.catalogData = Output.empty();
        this.forceDestroy = Output.empty();
        this.repositoryName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RepositoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RepositoryCatalogDataArgs> catalogData;
        private @Nullable Output<Boolean> forceDestroy;
        private Output<String> repositoryName;

        public Builder() {
    	      // Empty
        }

        public Builder(RepositoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogData = defaults.catalogData;
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.repositoryName = defaults.repositoryName;
        }

        public Builder catalogData(@Nullable Output<RepositoryCatalogDataArgs> catalogData) {
            this.catalogData = catalogData;
            return this;
        }

        public Builder catalogData(@Nullable RepositoryCatalogDataArgs catalogData) {
            this.catalogData = Output.ofNullable(catalogData);
            return this;
        }

        public Builder forceDestroy(@Nullable Output<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder forceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Output.ofNullable(forceDestroy);
            return this;
        }

        public Builder repositoryName(Output<String> repositoryName) {
            this.repositoryName = Objects.requireNonNull(repositoryName);
            return this;
        }

        public Builder repositoryName(String repositoryName) {
            this.repositoryName = Output.of(Objects.requireNonNull(repositoryName));
            return this;
        }
        public RepositoryArgs build() {
            return new RepositoryArgs(catalogData, forceDestroy, repositoryName);
        }
    }
}
