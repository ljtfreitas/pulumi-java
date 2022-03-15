// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.organizations.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetIAMPolicyAuditConfigAuditLogConfig {
    /**
     * Specifies the identities that are exempt from these types of logging operations. Follows the same format of the `members` array for `binding`.
     * 
     */
    private final @Nullable List<String> exemptedMembers;
    /**
     * Defines the logging level. `DATA_READ`, `DATA_WRITE` and `ADMIN_READ` capture different types of events. See [the audit configuration documentation](https://cloud.google.com/resource-manager/reference/rest/Shared.Types/AuditConfig) for more details.
     * 
     */
    private final String logType;

    @CustomType.Constructor
    private GetIAMPolicyAuditConfigAuditLogConfig(
        @CustomType.Parameter("exemptedMembers") @Nullable List<String> exemptedMembers,
        @CustomType.Parameter("logType") String logType) {
        this.exemptedMembers = exemptedMembers;
        this.logType = logType;
    }

    /**
     * Specifies the identities that are exempt from these types of logging operations. Follows the same format of the `members` array for `binding`.
     * 
    */
    public List<String> getExemptedMembers() {
        return this.exemptedMembers == null ? List.of() : this.exemptedMembers;
    }
    /**
     * Defines the logging level. `DATA_READ`, `DATA_WRITE` and `ADMIN_READ` capture different types of events. See [the audit configuration documentation](https://cloud.google.com/resource-manager/reference/rest/Shared.Types/AuditConfig) for more details.
     * 
    */
    public String getLogType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIAMPolicyAuditConfigAuditLogConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> exemptedMembers;
        private String logType;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIAMPolicyAuditConfigAuditLogConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exemptedMembers = defaults.exemptedMembers;
    	      this.logType = defaults.logType;
        }

        public Builder exemptedMembers(@Nullable List<String> exemptedMembers) {
            this.exemptedMembers = exemptedMembers;
            return this;
        }

        public Builder logType(String logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }
        public GetIAMPolicyAuditConfigAuditLogConfig build() {
            return new GetIAMPolicyAuditConfigAuditLogConfig(exemptedMembers, logType);
        }
    }
}
