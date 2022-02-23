// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecEgressPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecEgressPolicyArgs Empty = new ServicePerimeterSpecEgressPolicyArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressFrom")
        private final @Nullable Input<ServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom;

    public Input<ServicePerimeterSpecEgressPolicyEgressFromArgs> getEgressFrom() {
        return this.egressFrom == null ? Input.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @InputImport(name="egressTo")
        private final @Nullable Input<ServicePerimeterSpecEgressPolicyEgressToArgs> egressTo;

    public Input<ServicePerimeterSpecEgressPolicyEgressToArgs> getEgressTo() {
        return this.egressTo == null ? Input.empty() : this.egressTo;
    }

    public ServicePerimeterSpecEgressPolicyArgs(
        @Nullable Input<ServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom,
        @Nullable Input<ServicePerimeterSpecEgressPolicyEgressToArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimeterSpecEgressPolicyArgs() {
        this.egressFrom = Input.empty();
        this.egressTo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom;
        private @Nullable Input<ServicePerimeterSpecEgressPolicyEgressToArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder setEgressFrom(@Nullable Input<ServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder setEgressFrom(@Nullable ServicePerimeterSpecEgressPolicyEgressFromArgs egressFrom) {
            this.egressFrom = Input.ofNullable(egressFrom);
            return this;
        }

        public Builder setEgressTo(@Nullable Input<ServicePerimeterSpecEgressPolicyEgressToArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder setEgressTo(@Nullable ServicePerimeterSpecEgressPolicyEgressToArgs egressTo) {
            this.egressTo = Input.ofNullable(egressTo);
            return this;
        }
        public ServicePerimeterSpecEgressPolicyArgs build() {
            return new ServicePerimeterSpecEgressPolicyArgs(egressFrom, egressTo);
        }
    }
}
