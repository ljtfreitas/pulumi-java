// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.RecipeDataCatalogInputDefinition;
import io.pulumi.awsnative.databrew.outputs.RecipeS3Location;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RecipeParametersInputProperties {
    private final @Nullable RecipeDataCatalogInputDefinition dataCatalogInputDefinition;
    private final @Nullable RecipeS3Location s3InputDefinition;

    @OutputCustomType.Constructor({"dataCatalogInputDefinition","s3InputDefinition"})
    private RecipeParametersInputProperties(
        @Nullable RecipeDataCatalogInputDefinition dataCatalogInputDefinition,
        @Nullable RecipeS3Location s3InputDefinition) {
        this.dataCatalogInputDefinition = dataCatalogInputDefinition;
        this.s3InputDefinition = s3InputDefinition;
    }

    public Optional<RecipeDataCatalogInputDefinition> getDataCatalogInputDefinition() {
        return Optional.ofNullable(this.dataCatalogInputDefinition);
    }
    public Optional<RecipeS3Location> getS3InputDefinition() {
        return Optional.ofNullable(this.s3InputDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecipeParametersInputProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RecipeDataCatalogInputDefinition dataCatalogInputDefinition;
        private @Nullable RecipeS3Location s3InputDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(RecipeParametersInputProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataCatalogInputDefinition = defaults.dataCatalogInputDefinition;
    	      this.s3InputDefinition = defaults.s3InputDefinition;
        }

        public Builder setDataCatalogInputDefinition(@Nullable RecipeDataCatalogInputDefinition dataCatalogInputDefinition) {
            this.dataCatalogInputDefinition = dataCatalogInputDefinition;
            return this;
        }

        public Builder setS3InputDefinition(@Nullable RecipeS3Location s3InputDefinition) {
            this.s3InputDefinition = s3InputDefinition;
            return this;
        }
        public RecipeParametersInputProperties build() {
            return new RecipeParametersInputProperties(dataCatalogInputDefinition, s3InputDefinition);
        }
    }
}
