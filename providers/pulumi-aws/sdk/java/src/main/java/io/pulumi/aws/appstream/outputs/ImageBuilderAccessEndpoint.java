// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ImageBuilderAccessEndpoint {
    /**
     * Type of interface endpoint.
     * 
     */
    private final String endpointType;
    /**
     * Identifier (ID) of the VPC in which the interface endpoint is used.
     * 
     */
    private final @Nullable String vpceId;

    @OutputCustomType.Constructor({"endpointType","vpceId"})
    private ImageBuilderAccessEndpoint(
        String endpointType,
        @Nullable String vpceId) {
        this.endpointType = Objects.requireNonNull(endpointType);
        this.vpceId = vpceId;
    }

    /**
     * Type of interface endpoint.
     * 
     */
    public String getEndpointType() {
        return this.endpointType;
    }
    /**
     * Identifier (ID) of the VPC in which the interface endpoint is used.
     * 
     */
    public Optional<String> getVpceId() {
        return Optional.ofNullable(this.vpceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageBuilderAccessEndpoint defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endpointType;
        private @Nullable String vpceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageBuilderAccessEndpoint defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.vpceId = defaults.vpceId;
        }

        public Builder setEndpointType(String endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }

        public Builder setVpceId(@Nullable String vpceId) {
            this.vpceId = vpceId;
            return this;
        }
        public ImageBuilderAccessEndpoint build() {
            return new ImageBuilderAccessEndpoint(endpointType, vpceId);
        }
    }
}
