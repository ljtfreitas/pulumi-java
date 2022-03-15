// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimetersServicePerimeterStatusIngressPolicy {
    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom ingressFrom;
    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo ingressTo;

    @CustomType.Constructor
    private ServicePerimetersServicePerimeterStatusIngressPolicy(
        @CustomType.Parameter("ingressFrom") @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom ingressFrom,
        @CustomType.Parameter("ingressTo") @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo ingressTo) {
        this.ingressFrom = ingressFrom;
        this.ingressTo = ingressTo;
    }

    /**
     * Defines the conditions on the source of a request causing this `IngressPolicy`
     * to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom> getIngressFrom() {
        return Optional.ofNullable(this.ingressFrom);
    }
    /**
     * Defines the conditions on the `ApiOperation` and request destination that cause
     * this `IngressPolicy` to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo> getIngressTo() {
        return Optional.ofNullable(this.ingressTo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom ingressFrom;
        private @Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo ingressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingressFrom = defaults.ingressFrom;
    	      this.ingressTo = defaults.ingressTo;
        }

        public Builder ingressFrom(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressFrom ingressFrom) {
            this.ingressFrom = ingressFrom;
            return this;
        }

        public Builder ingressTo(@Nullable ServicePerimetersServicePerimeterStatusIngressPolicyIngressTo ingressTo) {
            this.ingressTo = ingressTo;
            return this;
        }
        public ServicePerimetersServicePerimeterStatusIngressPolicy build() {
            return new ServicePerimetersServicePerimeterStatusIngressPolicy(ingressFrom, ingressTo);
        }
    }
}
