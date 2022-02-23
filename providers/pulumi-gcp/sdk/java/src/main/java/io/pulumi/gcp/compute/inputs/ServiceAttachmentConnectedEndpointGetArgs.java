// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAttachmentConnectedEndpointGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentConnectedEndpointGetArgs Empty = new ServiceAttachmentConnectedEndpointGetArgs();

    @InputImport(name="endpoint")
        private final @Nullable Input<String> endpoint;

    public Input<String> getEndpoint() {
        return this.endpoint == null ? Input.empty() : this.endpoint;
    }

    @InputImport(name="status")
        private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public ServiceAttachmentConnectedEndpointGetArgs(
        @Nullable Input<String> endpoint,
        @Nullable Input<String> status) {
        this.endpoint = endpoint;
        this.status = status;
    }

    private ServiceAttachmentConnectedEndpointGetArgs() {
        this.endpoint = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentConnectedEndpointGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> endpoint;
        private @Nullable Input<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentConnectedEndpointGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpoint = defaults.endpoint;
    	      this.status = defaults.status;
        }

        public Builder setEndpoint(@Nullable Input<String> endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Builder setEndpoint(@Nullable String endpoint) {
            this.endpoint = Input.ofNullable(endpoint);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public ServiceAttachmentConnectedEndpointGetArgs build() {
            return new ServiceAttachmentConnectedEndpointGetArgs(endpoint, status);
        }
    }
}
