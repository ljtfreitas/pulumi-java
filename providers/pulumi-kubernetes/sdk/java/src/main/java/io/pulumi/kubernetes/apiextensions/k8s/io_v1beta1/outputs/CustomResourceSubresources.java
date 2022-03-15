// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs;

import com.google.gson.JsonElement;
import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.apiextensions.k8s.io_v1beta1.outputs.CustomResourceSubresourceScale;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CustomResourceSubresources {
    /**
     * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     * 
     */
    private final @Nullable CustomResourceSubresourceScale scale;
    /**
     * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
     * 
     */
    private final @Nullable JsonElement status;

    @CustomType.Constructor
    private CustomResourceSubresources(
        @CustomType.Parameter("scale") @Nullable CustomResourceSubresourceScale scale,
        @CustomType.Parameter("status") @Nullable JsonElement status) {
        this.scale = scale;
        this.status = status;
    }

    /**
     * scale indicates the custom resource should serve a `/scale` subresource that returns an `autoscaling/v1` Scale object.
     * 
    */
    public Optional<CustomResourceSubresourceScale> getScale() {
        return Optional.ofNullable(this.scale);
    }
    /**
     * status indicates the custom resource should serve a `/status` subresource. When enabled: 1. requests to the custom resource primary endpoint ignore changes to the `status` stanza of the object. 2. requests to the custom resource `/status` subresource ignore changes to anything other than the `status` stanza of the object.
     * 
    */
    public Optional<JsonElement> getStatus() {
        return Optional.ofNullable(this.status);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomResourceSubresources defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomResourceSubresourceScale scale;
        private @Nullable JsonElement status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomResourceSubresources defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scale = defaults.scale;
    	      this.status = defaults.status;
        }

        public Builder scale(@Nullable CustomResourceSubresourceScale scale) {
            this.scale = scale;
            return this;
        }

        public Builder status(@Nullable JsonElement status) {
            this.status = status;
            return this;
        }
        public CustomResourceSubresources build() {
            return new CustomResourceSubresources(scale, status);
        }
    }
}
