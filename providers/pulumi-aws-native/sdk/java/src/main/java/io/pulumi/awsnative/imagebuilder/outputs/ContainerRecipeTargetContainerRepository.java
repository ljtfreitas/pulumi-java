// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.awsnative.imagebuilder.enums.ContainerRecipeTargetContainerRepositoryService;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerRecipeTargetContainerRepository {
    /**
     * The name of the container repository where the output container image is stored. This name is prefixed by the repository location.
     * 
     */
    private final @Nullable String repositoryName;
    /**
     * Specifies the service in which this image was registered.
     * 
     */
    private final @Nullable ContainerRecipeTargetContainerRepositoryService service;

    @CustomType.Constructor
    private ContainerRecipeTargetContainerRepository(
        @CustomType.Parameter("repositoryName") @Nullable String repositoryName,
        @CustomType.Parameter("service") @Nullable ContainerRecipeTargetContainerRepositoryService service) {
        this.repositoryName = repositoryName;
        this.service = service;
    }

    /**
     * The name of the container repository where the output container image is stored. This name is prefixed by the repository location.
     * 
    */
    public Optional<String> getRepositoryName() {
        return Optional.ofNullable(this.repositoryName);
    }
    /**
     * Specifies the service in which this image was registered.
     * 
    */
    public Optional<ContainerRecipeTargetContainerRepositoryService> getService() {
        return Optional.ofNullable(this.service);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerRecipeTargetContainerRepository defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String repositoryName;
        private @Nullable ContainerRecipeTargetContainerRepositoryService service;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerRecipeTargetContainerRepository defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.repositoryName = defaults.repositoryName;
    	      this.service = defaults.service;
        }

        public Builder repositoryName(@Nullable String repositoryName) {
            this.repositoryName = repositoryName;
            return this;
        }

        public Builder service(@Nullable ContainerRecipeTargetContainerRepositoryService service) {
            this.service = service;
            return this;
        }
        public ContainerRecipeTargetContainerRepository build() {
            return new ContainerRecipeTargetContainerRepository(repositoryName, service);
        }
    }
}
