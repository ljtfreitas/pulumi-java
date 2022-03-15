// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetNatAddressArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetNatAddressArgs Empty = new GetNatAddressArgs();

    @Import(name="instanceId", required=true)
      private final String instanceId;

    public String getInstanceId() {
        return this.instanceId;
    }

    @Import(name="natAddressId", required=true)
      private final String natAddressId;

    public String getNatAddressId() {
        return this.natAddressId;
    }

    @Import(name="organizationId", required=true)
      private final String organizationId;

    public String getOrganizationId() {
        return this.organizationId;
    }

    public GetNatAddressArgs(
        String instanceId,
        String natAddressId,
        String organizationId) {
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.natAddressId = Objects.requireNonNull(natAddressId, "expected parameter 'natAddressId' to be non-null");
        this.organizationId = Objects.requireNonNull(organizationId, "expected parameter 'organizationId' to be non-null");
    }

    private GetNatAddressArgs() {
        this.instanceId = null;
        this.natAddressId = null;
        this.organizationId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatAddressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String instanceId;
        private String natAddressId;
        private String organizationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatAddressArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceId = defaults.instanceId;
    	      this.natAddressId = defaults.natAddressId;
    	      this.organizationId = defaults.organizationId;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder natAddressId(String natAddressId) {
            this.natAddressId = Objects.requireNonNull(natAddressId);
            return this;
        }

        public Builder organizationId(String organizationId) {
            this.organizationId = Objects.requireNonNull(organizationId);
            return this;
        }
        public GetNatAddressArgs build() {
            return new GetNatAddressArgs(instanceId, natAddressId, organizationId);
        }
    }
}
