// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.redhatopenshift.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * NetworkProfile represents a network profile.
 * 
 */
public final class NetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * The CIDR used for OpenShift/Kubernetes Pods (immutable).
     * 
     */
    @InputImport(name="podCidr")
        private final @Nullable Input<String> podCidr;

    public Input<String> getPodCidr() {
        return this.podCidr == null ? Input.empty() : this.podCidr;
    }

    /**
     * The CIDR used for OpenShift/Kubernetes Services (immutable).
     * 
     */
    @InputImport(name="serviceCidr")
        private final @Nullable Input<String> serviceCidr;

    public Input<String> getServiceCidr() {
        return this.serviceCidr == null ? Input.empty() : this.serviceCidr;
    }

    public NetworkProfileArgs(
        @Nullable Input<String> podCidr,
        @Nullable Input<String> serviceCidr) {
        this.podCidr = podCidr;
        this.serviceCidr = serviceCidr;
    }

    private NetworkProfileArgs() {
        this.podCidr = Input.empty();
        this.serviceCidr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> podCidr;
        private @Nullable Input<String> serviceCidr;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.podCidr = defaults.podCidr;
    	      this.serviceCidr = defaults.serviceCidr;
        }

        public Builder setPodCidr(@Nullable Input<String> podCidr) {
            this.podCidr = podCidr;
            return this;
        }

        public Builder setPodCidr(@Nullable String podCidr) {
            this.podCidr = Input.ofNullable(podCidr);
            return this;
        }

        public Builder setServiceCidr(@Nullable Input<String> serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }

        public Builder setServiceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = Input.ofNullable(serviceCidr);
            return this;
        }
        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(podCidr, serviceCidr);
        }
    }
}
