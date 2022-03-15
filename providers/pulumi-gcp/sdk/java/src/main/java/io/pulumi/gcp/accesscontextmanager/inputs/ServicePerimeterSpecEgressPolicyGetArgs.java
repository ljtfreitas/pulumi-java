// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressFromGetArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimeterSpecEgressPolicyEgressToGetArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecEgressPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecEgressPolicyGetArgs Empty = new ServicePerimeterSpecEgressPolicyGetArgs();

    /**
     * Defines conditions on the source of a request causing this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressFrom")
      private final @Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom;

    public Output<ServicePerimeterSpecEgressPolicyEgressFromGetArgs> getEgressFrom() {
        return this.egressFrom == null ? Output.empty() : this.egressFrom;
    }

    /**
     * Defines the conditions on the `ApiOperation` and destination resources that
     * cause this `EgressPolicy` to apply.
     * Structure is documented below.
     * 
     */
    @Import(name="egressTo")
      private final @Nullable Output<ServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo;

    public Output<ServicePerimeterSpecEgressPolicyEgressToGetArgs> getEgressTo() {
        return this.egressTo == null ? Output.empty() : this.egressTo;
    }

    public ServicePerimeterSpecEgressPolicyGetArgs(
        @Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom,
        @Nullable Output<ServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo) {
        this.egressFrom = egressFrom;
        this.egressTo = egressTo;
    }

    private ServicePerimeterSpecEgressPolicyGetArgs() {
        this.egressFrom = Output.empty();
        this.egressTo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecEgressPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom;
        private @Nullable Output<ServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecEgressPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.egressFrom = defaults.egressFrom;
    	      this.egressTo = defaults.egressTo;
        }

        public Builder egressFrom(@Nullable Output<ServicePerimeterSpecEgressPolicyEgressFromGetArgs> egressFrom) {
            this.egressFrom = egressFrom;
            return this;
        }

        public Builder egressFrom(@Nullable ServicePerimeterSpecEgressPolicyEgressFromGetArgs egressFrom) {
            this.egressFrom = Output.ofNullable(egressFrom);
            return this;
        }

        public Builder egressTo(@Nullable Output<ServicePerimeterSpecEgressPolicyEgressToGetArgs> egressTo) {
            this.egressTo = egressTo;
            return this;
        }

        public Builder egressTo(@Nullable ServicePerimeterSpecEgressPolicyEgressToGetArgs egressTo) {
            this.egressTo = Output.ofNullable(egressTo);
            return this;
        }
        public ServicePerimeterSpecEgressPolicyGetArgs build() {
            return new ServicePerimeterSpecEgressPolicyGetArgs(egressFrom, egressTo);
        }
    }
}
