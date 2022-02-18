// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.SparkMavenPackageResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration for a Spark environment.
 * 
 */
public final class ModelEnvironmentDefinitionResponseResponseSpark extends io.pulumi.resources.InvokeArgs {

    public static final ModelEnvironmentDefinitionResponseResponseSpark Empty = new ModelEnvironmentDefinitionResponseResponseSpark();

    /**
     * The Spark packages to use.
     * 
     */
    @InputImport(name="packages")
    private final @Nullable List<SparkMavenPackageResponse> packages;

    public List<SparkMavenPackageResponse> getPackages() {
        return this.packages == null ? List.of() : this.packages;
    }

    /**
     * Whether to precache the packages.
     * 
     */
    @InputImport(name="precachePackages")
    private final @Nullable Boolean precachePackages;

    public Optional<Boolean> getPrecachePackages() {
        return this.precachePackages == null ? Optional.empty() : Optional.ofNullable(this.precachePackages);
    }

    /**
     * The list of spark repositories.
     * 
     */
    @InputImport(name="repositories")
    private final @Nullable List<String> repositories;

    public List<String> getRepositories() {
        return this.repositories == null ? List.of() : this.repositories;
    }

    public ModelEnvironmentDefinitionResponseResponseSpark(
        @Nullable List<SparkMavenPackageResponse> packages,
        @Nullable Boolean precachePackages,
        @Nullable List<String> repositories) {
        this.packages = packages;
        this.precachePackages = precachePackages;
        this.repositories = repositories;
    }

    private ModelEnvironmentDefinitionResponseResponseSpark() {
        this.packages = List.of();
        this.precachePackages = null;
        this.repositories = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelEnvironmentDefinitionResponseResponseSpark defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<SparkMavenPackageResponse> packages;
        private @Nullable Boolean precachePackages;
        private @Nullable List<String> repositories;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelEnvironmentDefinitionResponseResponseSpark defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.packages = defaults.packages;
    	      this.precachePackages = defaults.precachePackages;
    	      this.repositories = defaults.repositories;
        }

        public Builder setPackages(@Nullable List<SparkMavenPackageResponse> packages) {
            this.packages = packages;
            return this;
        }

        public Builder setPrecachePackages(@Nullable Boolean precachePackages) {
            this.precachePackages = precachePackages;
            return this;
        }

        public Builder setRepositories(@Nullable List<String> repositories) {
            this.repositories = repositories;
            return this;
        }

        public ModelEnvironmentDefinitionResponseResponseSpark build() {
            return new ModelEnvironmentDefinitionResponseResponseSpark(packages, precachePackages, repositories);
        }
    }
}
