// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.jobs_v4.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetTenantResult {
    /**
     * Client side tenant identifier, used to uniquely identify the tenant. The maximum number of allowed characters is 255.
     * 
     */
    private final String externalId;
    /**
     * Required during tenant update. The resource name for a tenant. This is generated by the service when a tenant is created. The format is "projects/{project_id}/tenants/{tenant_id}", for example, "projects/foo/tenants/bar".
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetTenantResult(
        @CustomType.Parameter("externalId") String externalId,
        @CustomType.Parameter("name") String name) {
        this.externalId = externalId;
        this.name = name;
    }

    /**
     * Client side tenant identifier, used to uniquely identify the tenant. The maximum number of allowed characters is 255.
     * 
    */
    public String getExternalId() {
        return this.externalId;
    }
    /**
     * Required during tenant update. The resource name for a tenant. This is generated by the service when a tenant is created. The format is "projects/{project_id}/tenants/{tenant_id}", for example, "projects/foo/tenants/bar".
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTenantResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String externalId;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTenantResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.externalId = defaults.externalId;
    	      this.name = defaults.name;
        }

        public Builder externalId(String externalId) {
            this.externalId = Objects.requireNonNull(externalId);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetTenantResult build() {
            return new GetTenantResult(externalId, name);
        }
    }
}
