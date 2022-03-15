// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterSpecEgressPolicyEgressFrom;
import io.pulumi.gcp.accesscontextmanager.outputs.ServicePerimeterSpecEgressPolicyEgressTo;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterSpecEgressPolicy {
    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterSpecEgressPolicyEgressFrom egressFrom;
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    private final @Nullable ServicePerimeterSpecEgressPolicyEgressTo egressTo;

    @CustomType.Constructor
    private ServicePerimeterSpecEgressPolicy(
        @CustomType.Parameter("egressFrom") @Nullable ServicePerimeterSpecEgressPolicyEgressFrom egressFrom,
        @CustomType.Parameter("egressTo") @Nullable ServicePerimeterSpecEgressPolicyEgressTo egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimeterSpecEgressPolicyEgressFrom> getEgressFrom() {
        return Optional.ofNullable(this.egressFrom);
    }
    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
    */
    public Optional<ServicePerimeterSpecEgressPolicyEgressTo> getEgressTo() {
        return Optional.ofNullable(this.egressTo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServicePerimeterSpecEgressPolicyEgressFrom egressFrom;
        private @Nullable ServicePerimeterSpecEgressPolicyEgressTo egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(@Nullable ServicePerimeterSpecEgressPolicyEgressFrom egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder egressTo(@Nullable ServicePerimeterSpecEgressPolicyEgressTo egressTo) {
            this.egressTo = egressTo;
            return this;
        }
        public ServicePerimeterSpecEgressPolicy build() {
            return new ServicePerimeterSpecEgressPolicy(egressFrom, egressTo);
        }
    }
}
