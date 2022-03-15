// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.OptInHeaderType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs Empty = new ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs();

    @Import(name="optInHeaders")
      private final @Nullable Output<Either<String,OptInHeaderType>> optInHeaders;

    public Output<Either<String,OptInHeaderType>> getOptInHeaders() {
        return this.optInHeaders == null ? Output.empty() : this.optInHeaders;
    }

    public ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs(@Nullable Output<Either<String,OptInHeaderType>> optInHeaders) {
        this.optInHeaders = optInHeaders;
    }

    private ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs() {
        this.optInHeaders = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,OptInHeaderType>> optInHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optInHeaders = defaults.optInHeaders;
        }

        public Builder optInHeaders(@Nullable Output<Either<String,OptInHeaderType>> optInHeaders) {
            this.optInHeaders = optInHeaders;
            return this;
        }

        public Builder optInHeaders(@Nullable Either<String,OptInHeaderType> optInHeaders) {
            this.optInHeaders = Output.ofNullable(optInHeaders);
            return this;
        }
        public ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs build() {
            return new ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs(optInHeaders);
        }
    }
}
