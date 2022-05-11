// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.mysql.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetServerIdentity {
    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    private final String principalId;
    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    private final String tenantId;
    /**
     * @return The identity type of this Managed Service Identity.
     * ---
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetServerIdentity(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * @return The Principal ID associated with this Managed Service Identity.
     * 
     */
    public String principalId() {
        return this.principalId;
    }
    /**
     * @return The Tenant ID associated with this Managed Service Identity.
     * 
     */
    public String tenantId() {
        return this.tenantId;
    }
    /**
     * @return The identity type of this Managed Service Identity.
     * ---
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerIdentity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerIdentity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetServerIdentity build() {
            return new GetServerIdentity(principalId, tenantId, type);
        }
    }
}
