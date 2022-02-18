// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RetentionPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Part of MultiTenantDiagnosticSettings. Specifies the settings for a particular log.
 * 
 */
public final class LogSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final LogSettingsResponse Empty = new LogSettingsResponse();

    /**
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    @InputImport(name="category")
    private final @Nullable String category;

    public Optional<String> getCategory() {
        return this.category == null ? Optional.empty() : Optional.ofNullable(this.category);
    }

    /**
     * a value indicating whether this log is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * the retention policy for this log.
     * 
     */
    @InputImport(name="retentionPolicy")
    private final @Nullable RetentionPolicyResponse retentionPolicy;

    public Optional<RetentionPolicyResponse> getRetentionPolicy() {
        return this.retentionPolicy == null ? Optional.empty() : Optional.ofNullable(this.retentionPolicy);
    }

    public LogSettingsResponse(
        @Nullable String category,
        Boolean enabled,
        @Nullable RetentionPolicyResponse retentionPolicy) {
        this.category = category;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.retentionPolicy = retentionPolicy;
    }

    private LogSettingsResponse() {
        this.category = null;
        this.enabled = null;
        this.retentionPolicy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private Boolean enabled;
        private @Nullable RetentionPolicyResponse retentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
    	      this.retentionPolicy = defaults.retentionPolicy;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setRetentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public LogSettingsResponse build() {
            return new LogSettingsResponse(category, enabled, retentionPolicy);
        }
    }
}
