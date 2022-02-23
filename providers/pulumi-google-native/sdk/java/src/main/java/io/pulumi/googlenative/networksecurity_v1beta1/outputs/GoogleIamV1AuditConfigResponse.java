// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.networksecurity_v1beta1.outputs.GoogleIamV1AuditLogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GoogleIamV1AuditConfigResponse {
    /**
     * The configuration for logging of each type of permission.
     * 
     */
    private final List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs;
    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    private final String service;

    @OutputCustomType.Constructor({"auditLogConfigs","service"})
    private GoogleIamV1AuditConfigResponse(
        List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs,
        String service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
        this.service = Objects.requireNonNull(service);
    }

    /**
     * The configuration for logging of each type of permission.
     * 
     */
    public List<GoogleIamV1AuditLogConfigResponse> getAuditLogConfigs() {
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

    public static Builder builder(GoogleIamV1AuditConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs;
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleIamV1AuditConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditLogConfigs = defaults.auditLogConfigs;
    	      this.service = defaults.service;
        }

        public Builder setAuditLogConfigs(List<GoogleIamV1AuditLogConfigResponse> auditLogConfigs) {
            this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs);
            return this;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }
        public GoogleIamV1AuditConfigResponse build() {
            return new GoogleIamV1AuditConfigResponse(auditLogConfigs, service);
        }
    }
}
