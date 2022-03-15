// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.imagebuilder.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageResult {
    /**
     * The Amazon Resource Name (ARN) of the image.
     * 
     */
    private final @Nullable String arn;
    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * 
     */
    private final @Nullable String containerRecipeArn;
    /**
     * The AMI ID of the EC2 AMI in current region.
     * 
     */
    private final @Nullable String imageId;
    /**
     * The name of the image.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private GetImageResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("containerRecipeArn") @Nullable String containerRecipeArn,
        @CustomType.Parameter("imageId") @Nullable String imageId,
        @CustomType.Parameter("name") @Nullable String name) {
        this.arn = arn;
        this.containerRecipeArn = containerRecipeArn;
        this.imageId = imageId;
        this.name = name;
    }

    /**
     * The Amazon Resource Name (ARN) of the image.
     * 
    */
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * The Amazon Resource Name (ARN) of the container recipe that defines how images are configured and tested.
     * 
    */
    public Optional<String> getContainerRecipeArn() {
        return Optional.ofNullable(this.containerRecipeArn);
    }
    /**
     * The AMI ID of the EC2 AMI in current region.
     * 
    */
    public Optional<String> getImageId() {
        return Optional.ofNullable(this.imageId);
    }
    /**
     * The name of the image.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String containerRecipeArn;
        private @Nullable String imageId;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.containerRecipeArn = defaults.containerRecipeArn;
    	      this.imageId = defaults.imageId;
    	      this.name = defaults.name;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder containerRecipeArn(@Nullable String containerRecipeArn) {
            this.containerRecipeArn = containerRecipeArn;
            return this;
        }

        public Builder imageId(@Nullable String imageId) {
            this.imageId = imageId;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public GetImageResult build() {
            return new GetImageResult(arn, containerRecipeArn, imageId, name);
        }
    }
}
