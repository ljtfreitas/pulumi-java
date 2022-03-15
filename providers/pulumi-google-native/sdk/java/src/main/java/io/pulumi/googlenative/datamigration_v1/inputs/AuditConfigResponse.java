// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datamigration_v1.inputs.AuditLogConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies the audit configuration for a service. The configuration determines which permission types are logged, and what identities, if any, are exempted from logging. An AuditConfig must have one or more AuditLogConfigs. If there are AuditConfigs for both `allServices` and a specific service, the union of the two AuditConfigs is used for that service: the log_types specified in each AuditConfig are enabled, and the exempted_members in each AuditLogConfig are exempted. Example Policy with multiple AuditConfigs: { "audit_configs": [ { "service": "allServices", "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose@example.com" ] }, { "log_type": "DATA_WRITE" }, { "log_type": "ADMIN_READ" } ] }, { "service": "sampleservice.googleapis.com", "audit_log_configs": [ { "log_type": "DATA_READ" }, { "log_type": "DATA_WRITE", "exempted_members": [ "user:aliya@example.com" ] } ] } ] } For sampleservice, this policy enables DATA_READ, DATA_WRITE and ADMIN_READ logging. It also exempts jose@example.com from DATA_READ logging, and aliya@example.com from DATA_WRITE logging.
 * 
 */
public final class AuditConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuditConfigResponse Empty = new AuditConfigResponse();

    /**
     * The configuration for logging of each type of permission.
     * 
     */
    @Import(name="auditLogConfigs", required=true)
      private final List<AuditLogConfigResponse> auditLogConfigs;

    public List<AuditLogConfigResponse> getAuditLogConfigs() {
        return this.auditLogConfigs;
    }

    /**
     * Specifies a service that will be enabled for audit logging. For example, `storage.googleapis.com`, `cloudsql.googleapis.com`. `allServices` is a special value that covers all services.
     * 
     */
    @Import(name="service", required=true)
      private final String service;

    public String getService() {
        return this.service;
    }

    public AuditConfigResponse(
        List<AuditLogConfigResponse> auditLogConfigs,
        String service) {
        this.auditLogConfigs = Objects.requireNonNull(auditLogConfigs, "expected parameter 'auditLogConfigs' to be non-null");
        this.service = Objects.requireNonNull(service, "expected parameter 'service' to be non-null");
    }

    private AuditConfigResponse() {
        this.auditLogConfigs = List.of();
        this.service = null;
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
