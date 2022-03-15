// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.deploymentmanager_alpha.outputs.AuditLogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class AuditConfigResponse {
    /**
     * The configuration for logging of each type of permission.
     * 
     */
    private final List<AuditLogConfigResponse> auditLogConfigs;
    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    private final String service;

    @CustomType.Constructor
    private AuditConfigResponse(
        @CustomType.Parameter("auditLogConfigs") List<AuditLogConfigResponse> auditLogConfigs,
        @CustomType.Parameter("service") String service) {
        this.auditLogConfigs = auditLogConfigs;
        this.service = service;
    }

    /**
     * The configuration for logging of each type of permission.
     * 
    */
    public List<AuditLogConfigResponse> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }
    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
    */
    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AuditLogConfigResponse> auditLogConfigs;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(AuditConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder auditLogConfigs(List<AuditLogConfigResponse> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }

        public Builder service(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public AuditConfigResponse build() {
            return new AuditConfigResponse(auditLogConfigs, service);
        }
    }
}
