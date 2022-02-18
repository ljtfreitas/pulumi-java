// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.aadiam.inputs;

import io.pulumi.azurenative.aadiam.enums.Category;
import io.pulumi.azurenative.aadiam.inputs.RetentionPolicyArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Part of MultiTenantDiagnosticSettings. Specifies the settings for a particular log.
 * 
 */
public final class LogSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final LogSettingsArgs Empty = new LogSettingsArgs();

    /**
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    @InputImport(name="category")
    private final @Nullable Input<Either<String,Category>> category;

    public Input<Either<String,Category>> getCategory() {
        return this.category == null ? Input.empty() : this.category;
    }

    /**
     * A value indicating whether this log is enabled.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled;
    }

    /**
     * The retention policy for this log.
     * 
     */
    @InputImport(name="retentionPolicy")
    private final @Nullable Input<RetentionPolicyArgs> retentionPolicy;

    public Input<RetentionPolicyArgs> getRetentionPolicy() {
        return this.retentionPolicy == null ? Input.empty() : this.retentionPolicy;
    }

    public LogSettingsArgs(
        @Nullable Input<Either<String,Category>> category,
        Input<Boolean> enabled,
        @Nullable Input<RetentionPolicyArgs> retentionPolicy) {
        this.category = category;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.retentionPolicy = retentionPolicy;
    }

    private LogSettingsArgs() {
        this.category = Input.empty();
        this.enabled = Input.empty();
        this.retentionPolicy = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,Category>> category;
        private Input<Boolean> enabled;
        private @Nullable Input<RetentionPolicyArgs> retentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
    	      this.retentionPolicy = defaults.retentionPolicy;
        }

        public Builder setCategory(@Nullable Input<Either<String,Category>> category) {
            this.category = category;
            return this;
        }

        public Builder setCategory(@Nullable Either<String,Category> category) {
            this.category = Input.ofNullable(category);
            return this;
        }

        public Builder setEnabled(Input<Boolean> enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Input.of(Objects.requireNonNull(enabled));
            return this;
        }

        public Builder setRetentionPolicy(@Nullable Input<RetentionPolicyArgs> retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }

        public Builder setRetentionPolicy(@Nullable RetentionPolicyArgs retentionPolicy) {
            this.retentionPolicy = Input.ofNullable(retentionPolicy);
            return this;
        }

        public LogSettingsArgs build() {
            return new LogSettingsArgs(category, enabled, retentionPolicy);
        }
    }
}
