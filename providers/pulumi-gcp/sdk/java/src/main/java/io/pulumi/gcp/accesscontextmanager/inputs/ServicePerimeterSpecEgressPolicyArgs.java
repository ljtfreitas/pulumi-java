// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="egressFrom")
      private final @Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom;

    public Output<ServicePerimeterSpecEgressPolicyEgressFromArgs> getEgressFrom() {
        return this.egressFrom == null ? Output.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
      private final @Nullable Output<ServicePerimeterSpecEgressPolicyEgressToArgs> egressTo;

    public Output<ServicePerimeterSpecEgressPolicyEgressToArgs> getEgressTo() {
        return this.egressTo == null ? Output.empty() : this.egressTo;
    }

    public ServicePerimeterSpecEgressPolicyArgs(
        @Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom,
        @Nullable Output<ServicePerimeterSpecEgressPolicyEgressToArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimeterSpecEgressPolicyArgs() {
        this.egressFrom = Output.empty();
        this.egressTo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom;
        private @Nullable Output<ServicePerimeterSpecEgressPolicyEgressToArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(@Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder egressFrom(@Nullable ServicePerimeterSpecEgressPolicyEgressFromArgs egressFrom) {
            this.egressFrom = Output.ofNullable(egressFrom);
            return this;
        }

        public Builder egressTo(@Nullable Output<ServicePerimeterSpecEgressPolicyEgressToArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder egressTo(@Nullable ServicePerimeterSpecEgressPolicyEgressToArgs egressTo) {
            this.egressTo = Output.ofNullable(egressTo);
            return this;
        }
        public ServicePerimeterSpecEgressPolicyArgs build() {
            return new ServicePerimeterSpecEgressPolicyArgs(egressFrom, egressTo);
        }
    }
}
