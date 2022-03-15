// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.MaterialResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SlsaBuilderResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SlsaMetadataResponse;
import io.pulumi.googlenative.containeranalysis_v1alpha1.inputs.SlsaRecipeResponse;
import java.util.List;
import java.util.Objects;


/**
 * SlsaProvenance is the slsa provenance as defined by the slsa spec.
 * 
 */
public final class SlsaProvenanceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SlsaProvenanceResponse Empty = new SlsaProvenanceResponse();

    /**
     * builder is the builder of this provenance
     * 
     */
    @Import(name="builder", required=true)
      private final SlsaBuilderResponse builder;

    public SlsaBuilderResponse getBuilder() {
        return this.builder;
    }

    /**
     * The collection of artifacts that influenced the build including sources, dependencies, build tools, base images, and so on. This is considered to be incomplete unless metadata.completeness.materials is true. Unset or null is equivalent to empty.
     * 
     */
    @Import(name="materials", required=true)
      private final List<MaterialResponse> materials;

    public List<MaterialResponse> getMaterials() {
        return this.materials;
    }

    /**
     * metadata is the metadata of the provenance
     * 
     */
    @Import(name="metadata", required=true)
      private final SlsaMetadataResponse metadata;

    public SlsaMetadataResponse getMetadata() {
        return this.metadata;
    }

    /**
     * Identifies the configuration used for the build. When combined with materials, this SHOULD fully describe the build, such that re-running this recipe results in bit-for-bit identical output (if the build is reproducible).
     * 
     */
    @Import(name="recipe", required=true)
      private final SlsaRecipeResponse recipe;

    public SlsaRecipeResponse getRecipe() {
        return this.recipe;
    }

    public SlsaProvenanceResponse(
        SlsaBuilderResponse builder,
        List<MaterialResponse> materials,
        SlsaMetadataResponse metadata,
        SlsaRecipeResponse recipe) {
        this.builder = Objects.requireNonNull(builder, "expected parameter 'builder' to be non-null");
        this.materials = Objects.requireNonNull(materials, "expected parameter 'materials' to be non-null");
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.recipe = Objects.requireNonNull(recipe, "expected parameter 'recipe' to be non-null");
    }

    private SlsaProvenanceResponse() {
        this.builder = null;
        this.materials = List.of();
        this.metadata = null;
        this.recipe = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SlsaProvenanceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SlsaBuilderResponse builder;
        private List<MaterialResponse> materials;
        private SlsaMetadataResponse metadata;
        private SlsaRecipeResponse recipe;

        public Builder() {
    	      // Empty
        }

        public Builder(SlsaProvenanceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.builder = defaults.builder;
    	      this.materials = defaults.materials;
    	      this.metadata = defaults.metadata;
    	      this.recipe = defaults.recipe;
        }

        public Builder builder(SlsaBuilderResponse builder) {
            this.builder = Objects.requireNonNull(builder);
            return this;
        }

        public Builder materials(List<MaterialResponse> materials) {
            this.materials = Objects.requireNonNull(materials);
            return this;
        }

        public Builder metadata(SlsaMetadataResponse metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }

        public Builder recipe(SlsaRecipeResponse recipe) {
            this.recipe = Objects.requireNonNull(recipe);
            return this;
        }
        public SlsaProvenanceResponse build() {
            return new SlsaProvenanceResponse(builder, materials, metadata, recipe);
        }
    }
}
