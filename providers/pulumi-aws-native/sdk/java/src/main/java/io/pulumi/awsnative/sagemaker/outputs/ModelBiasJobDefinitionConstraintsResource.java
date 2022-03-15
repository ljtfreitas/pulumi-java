// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ModelBiasJobDefinitionConstraintsResource {
    /**
     * The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
     * 
     */
    private final @Nullable String s3Uri;

    @CustomType.Constructor
    private ModelBiasJobDefinitionConstraintsResource(@CustomType.Parameter("s3Uri") @Nullable String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * The Amazon S3 URI for baseline constraint file in Amazon S3 that the current monitoring job should validated against.
     * 
    */
    public Optional<String> getS3Uri() {
        return Optional.ofNullable(this.s3Uri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelBiasJobDefinitionConstraintsResource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String s3Uri;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelBiasJobDefinitionConstraintsResource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.s3Uri = defaults.s3Uri;
        }

        public Builder s3Uri(@Nullable String s3Uri) {
            this.s3Uri = s3Uri;
            return this;
        }
        public ModelBiasJobDefinitionConstraintsResource build() {
            return new ModelBiasJobDefinitionConstraintsResource(s3Uri);
        }
    }
}
